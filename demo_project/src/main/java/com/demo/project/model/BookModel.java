package com.demo.project.model;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class BookModel {

	private int  id;
	private String author;
	private String genre;
	private String title;
	private Date rentedUntil;
	private boolean rented;
 
	public BookModel() {

	}

	public BookModel(int id, String author, String genre, String title, Date rentedUntil, boolean rented) {
		this.id = id;
		this.author = author;
		this.genre = genre;
		this.title = title;
		this.rentedUntil = rentedUntil;
		this.rented = rented;
	}

	public BookModel(int id, String author, String genre, String title, Date rentedUntil) {
		this.id = id;
		this.author = author;
		this.genre = genre;
		this.title = title;
		this.rentedUntil = rentedUntil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getRentedUntil() {
		return rentedUntil;
	}

	public void setRentedUntil(Date rentedUntil) {
		this.rentedUntil = rentedUntil;
	}

	public boolean isRented() {
		return rented;
	}

	public void setRented(boolean rented) {
		this.rented = rented;
	}

	
	public int dueInDays() {
		return 
				(int) ChronoUnit.DAYS.between(getRentedUntil().toInstant(), Instant.now());
	}
}
