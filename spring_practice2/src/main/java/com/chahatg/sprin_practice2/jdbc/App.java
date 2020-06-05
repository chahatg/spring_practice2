package com.chahatg.sprin_practice2.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//3.) Create a application using spring JDBC and perform all CRUD operations.

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
		Number id = context.getBean(crudOps.class).addPerson(new Person("parth", "Ahuja", "635 petunia lane, Bangalore, Karnataka"));
		System.out.println("New Person assigned ID = " + id);
		context.getBean(crudOps.class).getPerson();
		context.getBean(crudOps.class).updatePersonAddress("21 Washington Dr., Venice, CA", "parth");
		context.getBean(crudOps.class).deletePersonByFname("ria");
	}
	
}
