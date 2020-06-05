package com.chahatg.spring_practice2.lazy;

import org.springframework.stereotype.Service;

@Service
public class Bean1 {
	String name;
	
	public Bean1() {
		super();
		System.out.println("Bean1 constructor loaded!");
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
