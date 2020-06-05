package com.chahatg.sprin_practice2.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@Component("com.chahatg.sprin_practice2.jdbc")
public class jdbcConfig {
	//configuration
	@Bean
	public DataSource mySqlDatasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/mydatabase?useSSL=false");
		datasource.setUsername("root");
		datasource.setPassword("L@vemus1c");
		
		return datasource;
	}
	
	@Bean
	public crudOps crudops() {
		return new crudOps();//return JdbcTemplate.update("INSERT INTO PERSON VALUES (?,?,?,?)", id, "Bill", "Smith", "2 house ln, city, MO");
	}
	
	@Bean
	public PersonRowMapper mapper() {
		return new PersonRowMapper();
	}
}
