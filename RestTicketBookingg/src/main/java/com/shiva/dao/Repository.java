package com.shiva.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.entity.Ticket;

public interface Repository extends JpaRepository<Ticket, Integer>{

}
