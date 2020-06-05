package com.chahatg.sprin_practice2.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Service;

@Service
public class PersonRowMapper implements  RowMapper<Person>{
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setId(Optional.of(Integer.parseInt(rs.getString("id"))));
		person.setFname(rs.getString("fname"));
		person.setLname(rs.getString("lname"));
		person.setAddress(rs.getString("address"));
		return person;
	}
		
}
