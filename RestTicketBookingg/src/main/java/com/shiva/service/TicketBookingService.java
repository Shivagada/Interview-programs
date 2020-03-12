package com.shiva.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.dao.Repository;
import com.shiva.entity.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	private Repository repository;
	public Ticket createTicket(Ticket ticket) {
		 
		return repository.save(ticket);
	}
	public Ticket getTicketById(Integer id) {
		 
		return repository.getOne(id);
	}

}
