package com.example.guestbook.Model;

import java.util.Date;

public class User {

	private long id;
	private String name;
	private String content;
	private Date creationDate;


	public User() {
		this.creationDate = new Date();
	}

	public User(long id, String name, String content) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.creationDate = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
