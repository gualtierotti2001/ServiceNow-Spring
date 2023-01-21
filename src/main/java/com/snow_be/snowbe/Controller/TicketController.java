package com.snow_be.snowbe.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.snow_be.snowbe.Entity.Application;
import com.snow_be.snowbe.Entity.Area;
import com.snow_be.snowbe.Entity.ResolutionGroup;
import com.snow_be.snowbe.Entity.Ticket;
import com.snow_be.snowbe.Entity.User;
import com.snow_be.snowbe.Service.ticketService;
import com.snow_be.snowbe.Entity.Ticket.TicketStatus;

@CrossOrigin
@RestController
public class TicketController {
	
	@Autowired
	ticketService TS;

	@GetMapping(value = "hello world")
	public String helloWorld(String hello) {	
		return hello;		
	}
	
	@GetMapping(value = "create")
	public Ticket createTicketController(Ticket T ) {
		
		return TS.CreateTicket(T);
		
	}
	
	@GetMapping(value = "find_all")
	public Iterable<Ticket> FindAllTickerController() {
		
		return TS.FindAllTicket();
		
	}
	
}
