package com.chahatg.spring_practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("TicketCounter")
public class TicketCounter implements TixCounterInterface{
	private TranspoMode transpo;
	
	@Autowired
	@Qualifier("airways")
	public void setTranspo(TranspoMode transpo) {
		this.transpo = transpo;
	}
	
	public void buyTickets(int tix) {
		transpo.travel(tix);
	}
}
