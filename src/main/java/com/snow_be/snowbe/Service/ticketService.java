package com.snow_be.snowbe.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snow_be.snowbe.Entity.Application;
import com.snow_be.snowbe.Entity.Area;
import com.snow_be.snowbe.Entity.ResolutionGroup;
import com.snow_be.snowbe.Entity.Ticket;
import com.snow_be.snowbe.Entity.User;
import com.snow_be.snowbe.Entity.Ticket.TicketStatus;
import com.snow_be.snowbe.Repo.TicketRepo;

@Service
public class ticketService {

	@Autowired
	private TicketRepo TR;
	
	
	
	public Ticket CreateTicket(Ticket ticket){ 
	   	
    	return TR.save(ticket);  
    //	return IE.findAll();
    }
       
	
	public Iterable<Ticket> FindAllTicket(){ 
	   	
    	return TR.findAll();  
    //	return IE.findAll();
    }
	
	
	
}
