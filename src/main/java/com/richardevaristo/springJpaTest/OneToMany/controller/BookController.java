package com.richardevaristo.springJpaTest.OneToMany.controller;

import com.richardevaristo.springJpaTest.OneToMany.message.request.BookRequest;
import com.richardevaristo.springJpaTest.OneToMany.model.Book;
import com.richardevaristo.springJpaTest.OneToMany.model.Category;
import com.richardevaristo.springJpaTest.OneToMany.service.BookService;
import com.richardevaristo.springJpaTest.OneToMany.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/categories")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/categories/{id}")
    public Category getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/books/add")
    public Book createBook(@RequestBody BookRequest request) {
        return null;
    }

}
