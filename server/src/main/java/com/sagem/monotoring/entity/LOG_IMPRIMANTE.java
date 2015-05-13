package com.sagem.monotoring.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOG_OF_PRINTJOB")
public class LOG_IMPRIMANTE implements Serializable,logsInterface{
	
	
	
    private int id;


	private String Name;
	private String Description;
	private String Degree;
	private Date Date;
	
	
	
	
	public LOG_IMPRIMANTE(String name, String description, String degree,
			java.util.Date date) {
		super();
		Name = name;
		Description = description;
		Degree = degree;
		Date = date;
		
	}
	
	

	
	//**********default constructor***********
	public LOG_IMPRIMANTE() {
		super();
		// TODO Auto-generated constructor stub
	}
	//*****************************constructor using fields**************

	//*********Getter and Setter*************

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getDegree() {
		return Degree;
	}

	public void setDegree(String degree) {
		Degree = degree;
	}

	public Date getDate() {
		return Date;
	}
 
	public void setDate(Date date) {
		Date = date;
	}

	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	



}
