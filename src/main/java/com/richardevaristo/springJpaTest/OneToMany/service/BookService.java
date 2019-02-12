package com.richardevaristo.springJpaTest.OneToMany.service;

import com.richardevaristo.springJpaTest.OneToMany.dao.BookRepository;
import com.richardevaristo.springJpaTest.OneToMany.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return null;
    }

    public Book getBookById(int id) {
        return null;
    }

}
