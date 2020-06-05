package com.chahatg.spring_practice2.lazy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/*2.) Create a spring application which uses lazy bean instantiation
 *    with prototype bean scope using init and destroy methods
*/

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		Bean1 bean1A = context.getBean(Bean1.class);
		bean1A.setName("prototype instance 1");
		System.out.println(bean1A.getName());
	
		Bean1 bean1B = context.getBean(Bean1.class);
		//bean1B.setName("prototype instance 2");
		System.out.println(bean1B.getName());
		
		//Bean2 constructor is not loaded because bean2 is not called and therefore will be 
		//lazy loaded when it is indeed called
	}
}
