package com.ltc.book.controller;

import com.ltc.book.dto.BookDto;
import com.ltc.book.entity.Book;
import com.ltc.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return bookService.getAll();
    }

    @GetMapping("/id")
    public Book getBookById(@RequestParam Long id) {
        return bookService.findById(id);
    }

    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody BookDto newBook) {
        bookService.addBook(newBook);
        return ResponseEntity.ok("Book added successfully");
    }

    @PutMapping
    public void updateBook(@RequestParam Long id, @RequestBody BookDto updatedBook) {
        bookService.update(id, updatedBook);
    }

    @DeleteMapping
    public void deleteBook(@RequestParam Long id) {
        bookService.delete(id);
    }
}
