package com.demo.project.services;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.demo.project.model.BookModel;

@ManagedBean(name = "bookService")
@ApplicationScoped
public class BookService {

	private final static List<String> authors;
	private final static List<String> bookTitles;
	private final static List<String> genres;

	static {
		authors = new ArrayList<>();
		authors.add("George R.R. Martin");
		authors.add("A.G. Riddle");
		authors.add("David Baldacci");
		authors.add("Stephen King");
		authors.add("H.P. Lovecraft");
		authors.add("Clive Barker");
		authors.add("Jules Verne");
		authors.add("Arthur C. Clarke");
		authors.add("John Cheever");
		authors.add("James Baldwin");
		authors.add("Anton Chekhov");
		authors.add("Ginger Strand");
		authors.add("Robert Graysmith");

		bookTitles = new ArrayList<>();
		bookTitles.add("Song of Ice and Fire");
		bookTitles.add("Departure");
		bookTitles.add("Memory Man");
		bookTitles.add("The Shining");
		bookTitles.add("Necronomicon");
		bookTitles.add("Imajica");
		bookTitles.add("Around the world in 80 days");
		bookTitles.add("Childhood's End");
		bookTitles.add("The world of apples");
		bookTitles.add("The evidence of things not seen");
		bookTitles.add("The Lady with the Dog");
		bookTitles.add("Flight");
		bookTitles.add("Zodiac");

		genres = new ArrayList<>();
		genres.add("Action and adventure");
		genres.add("Horror");
		genres.add("Science fiction");
		genres.add("Short story");
		genres.add("Science");
		genres.add("True crime");

	}

	public List<BookModel> createBooks(int numberOfBooks) {
		List<BookModel> listOfBooks = new ArrayList<>();
		for (int i = 0; i <= numberOfBooks; i++) {
			listOfBooks.add(new BookModel(i, authors.get(i), getRandomGenre(), bookTitles.get(i), null, false));
		}
		return listOfBooks;
	}

	private String getRandomGenre() {
		return genres.get((int) (Math.random() * 6));
	}

	public Date getCurrentDate() {
		return new Date(System.currentTimeMillis());
	}
}
