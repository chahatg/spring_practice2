package com.chahatg.spring_practice2.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan("com.chahatg.spring_practice2.lazy")
public class AppConfiguration {
	
	@Bean(name="bean1")
	@Scope("prototype")
	public Bean1 bean1() {
		return new Bean1();
	}
	@Lazy
	@Bean(name="bean2")
	public Bean2 bean2() {
		return new Bean2();
	}
}
