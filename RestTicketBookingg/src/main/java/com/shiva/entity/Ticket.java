package com.shiva.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

 
 
 @Entity
 @Table
 
public class Ticket implements Serializable {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "t_id")
	private int id;
	 @Column(name="pname")
	private String pname;
	 @Column(name = "deatation")
	private String destiation;
	 @Column(name = "resource")
	private String resource;
	 @Column(name = "tdate")
	private Date tdate;
	public Ticket() {
		 
		this.id = id;
		this.pname = pname;
		this.destiation = destiation;
		this.resource = resource;
		this.tdate = tdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDestiation() {
		return destiation;
	}
	public void setDestiation(String destiation) {
		this.destiation = destiation;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	
	 
}
