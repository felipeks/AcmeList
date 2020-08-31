package com.acmalist.acma.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Schedule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private short id;

	private String title;

	public short getId() {
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

	public Schedule(short id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

}
