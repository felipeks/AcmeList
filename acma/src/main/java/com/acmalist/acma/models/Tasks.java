package com.acmalist.acma.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Tasks implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private short id;
	
	private boolean status;
	
	private short Scheduling;

	@Column(name = "assignment")
	private String title;

	private String description;

	public long getId() {
		return id;
	}

	public void setId(short id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public short getScheduling() {
		return Scheduling;
	}

	public void setScheduling(short scheduling) {
		Scheduling = scheduling;
	}

	public boolean isStatus() {
		return status;
	}



}
