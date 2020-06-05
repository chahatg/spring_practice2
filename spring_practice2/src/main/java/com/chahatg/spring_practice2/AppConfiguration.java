//1.) Create a spring application for Transportation interface where customer
//choose the mode of transport  like airways,  railway,  waterways and inject 
//dependency using 3 different variants 
package com.chahatg.spring_practice2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.chahatg.spring_practice2")
public class AppConfiguration {
	
	/*@Bean(name="airways")
	public TranspoMode airway() {
		return new Airways();
	}

	@Bean(name="railways")
	public TranspoMode railway() {
		return new Railways();
	}
	
	@Bean(name="waterways")
	public TranspoMode waterway() {
		return new Waterways();
	}
	
	@Bean(name="TicketCounter")
	public TixCounterInterface ticketcounter() {
		return new TicketCounter();
	}*/
	
}
