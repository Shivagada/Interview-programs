package com.shiva.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.entity.Ticket;
import com.shiva.service.TicketBookingService;

@RestController
@RequestMapping(value = "/tickets")
public class TicketBookingController {
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping("/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
		
	}
	@GetMapping(value = "/ticket/{id}")
	public Ticket getTicket(@PathVariable("id") Integer id) {
		return ticketBookingService.getTicketById(id);
		
	}
}
