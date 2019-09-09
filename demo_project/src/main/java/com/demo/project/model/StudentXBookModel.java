package com.demo.project.model;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class StudentXBookModel {

	private StudentModel studentRenting;
	private BookModel rentedBook;
	private Date bookRentedUntill;

	public StudentXBookModel(StudentModel studentRenting, BookModel rentedBook, Date bookRentedUntill) {
		this.studentRenting = studentRenting;
		this.rentedBook = rentedBook;
		this.bookRentedUntill = bookRentedUntill;
	}

	public StudentModel getStudentRenting() {
		return studentRenting;
	}

	public void setStudentRenting(StudentModel studentRenting) {
		this.studentRenting = studentRenting;
	}

	public BookModel getRentedBook() {
		return rentedBook;
	}

	public void setRentedBook(BookModel rentedBook) {
		this.rentedBook = rentedBook;
	}

	public Date getBookRentedUntill() {
		return bookRentedUntill;
	}

	public void setBookRentedUntill(Date bookRentedUntill) {
		this.bookRentedUntill = bookRentedUntill;
	}

	public boolean isBookRented() {
		return rentedBook.isRented();
	}

	public int dueInDays() {
		return (int) ChronoUnit.DAYS.between(rentedBook.getRentedUntil().toInstant(), Instant.now());
	}

}
