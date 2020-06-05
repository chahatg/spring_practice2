package com.chahatg.spring_practice2;

import org.springframework.stereotype.Service;

@Service("airways")
public class Airways implements TranspoMode {
	public Airways() {
		super();
		System.out.println("Airways constructor loaded!");
	}
	public void travel(int tickets) {
		System.out.println("Travelling from AirPlane: " + tickets + " passengers");
	}
}
