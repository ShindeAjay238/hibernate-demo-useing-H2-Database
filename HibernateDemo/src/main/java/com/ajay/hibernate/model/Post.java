package com.ajay.hibernate.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	private Integer id;
	private LocalDateTime postDate;
	
	@ManyToOne
	private User user;
	
	private String Details;

	public Post() {
		super();
	}

	public Post(Integer id, LocalDateTime postDate, User user, String details) {
		super();
		this.id = id;
		this.postDate = postDate;
		this.user = user;
		Details = details;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDateTime postDate) {
		this.postDate = postDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDetails() {
		return Details;
	}

	public void setDetails(String details) {
		Details = details;
	}

}
