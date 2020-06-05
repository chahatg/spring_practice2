package com.chahatg.spring_practice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*****uncomment comment out parts for different implementations 
 *          - also uncomment in AppConfiguration.java for Java-based implementation*/
public class App {
    public static void main( String[] args ){
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
       //ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
       TixCounterInterface tixCounter = context.getBean(TicketCounter.class);
       tixCounter.buyTickets(3);
    } 
}
