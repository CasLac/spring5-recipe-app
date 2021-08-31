package com.cmassystems.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cmassystems.spring5webapp.domain.Author;
import com.cmassystems.spring5webapp.domain.Book;
import com.cmassystems.spring5webapp.domain.Publisher;
import com.cmassystems.spring5webapp.repositories.AuthorRepository;
import com.cmassystems.spring5webapp.repositories.BookRepository;
import com.cmassystems.spring5webapp.repositories.PublishRepository;

@Component
public class BootStrapData implements CommandLineRunner{

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublishRepository publishRepository;

	public BootStrapData(AuthorRepository authorRepository, 
			BookRepository bookRepository,
			PublishRepository publishRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publishRepository = publishRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Started in Bootstrap");

		Publisher publisher = new Publisher();
		publisher.setName("SFG Publishing");
		publisher.setCity("St Petersburg");
		publisher.setState("FL");
		
		publishRepository.save(publisher);
		
		System.out.println("Publisher count: " + publishRepository.count());
		
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driver Designd","321654321");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		ddd.setPublisher(publisher);
		publisher.getBooks().add(ddd);
		
		authorRepository.save(eric);
		bookRepository.save(ddd);
		publishRepository.save(publisher);
		
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Devellopement without EJB","321654321");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);
		
		noEJB.setPublisher(publisher);
		publisher.getBooks().add(noEJB);
		
		authorRepository.save(rod);
		bookRepository.save(noEJB);
		publishRepository.save(publisher);

		System.out.println("Number of books: " + bookRepository.count());
		System.out.println("Publisher number of books: " + publisher.getBooks().size());
	}
}