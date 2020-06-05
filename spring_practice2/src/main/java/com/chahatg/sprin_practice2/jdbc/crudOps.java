package com.chahatg.sprin_practice2.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Literal;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class crudOps {
	public DataSource datasource;

	@Autowired
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	public Number addPerson(Person person) {
		SimpleJdbcInsert insert = new SimpleJdbcInsert(datasource).withTableName("person").usingGeneratedKeyColumns("id");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("fname", person.getFname());
		parameters.put("lname", person.getLname());
		parameters.put("address", person.getAddress());
		
		Number id =  insert.executeAndReturnKey(parameters);
		
		return id;
	}
	
	//@Autowired
	public void getPerson() {
		JdbcTemplate template = new JdbcTemplate(datasource);
		List<Person> result = template.query("SELECT * from person", new BeanPropertyRowMapper(Person.class));
		Consumer<Person> print = new Consumer<Person>() { 
			public void accept(Person p) {
				System.out.println(p.getId() + ", " + p.getFname() + ", " + p.getLname() 
				+ ", " + p.getAddress());
			}
		};
		result.forEach(print);
	}
	
	public void updatePersonAddress(String addr, String fname) {
		JdbcTemplate template = new JdbcTemplate(datasource);
		int retVal = template.update("update person set address = ? where fname = ?", addr, fname);
		System.out.println("rows updated: " + retVal);
	}
	
	public void deletePersonByFname(String fname) {
		JdbcTemplate template = new JdbcTemplate(datasource);
		int retVal = template.update("delete from person where fname = ?", fname);
		System.out.println("rows updated: " + retVal);
	}
}
