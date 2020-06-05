package com.chahatg.spring_practice2;

import org.springframework.stereotype.Service;

@Service("railways")
public class Railways implements TranspoMode{
	public Railways() {
		super();
		System.out.println("Railways constructor loaded!");
	}
	public void travel(int tickets) {
		System.out.println("Travelling from Railway Train: " + tickets + " passengers");
	}
}
