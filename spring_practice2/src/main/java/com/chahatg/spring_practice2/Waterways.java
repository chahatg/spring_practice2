package com.chahatg.spring_practice2;

import org.springframework.stereotype.Service;

@Service("waterways")
public class Waterways implements TranspoMode{
	public Waterways() {
		super();
		System.out.println("Waterways constructor loaded!");
	}
	public void travel(int tickets) {
		System.out.println("Travelling from Waterways Boat: " + tickets + " passengers");
	}
}
