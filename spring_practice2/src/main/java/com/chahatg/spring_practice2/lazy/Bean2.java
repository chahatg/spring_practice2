package com.chahatg.spring_practice2.lazy;

import org.springframework.stereotype.Service;

@Service
public class Bean2 {
	String name;
	public Bean2() {
		super();
		System.out.println("Bean2 constructor loaded!");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
//	public void announceBean(String msg) {
//		System.out.println("Bean 2 called: "+ msg);
//	}
}
