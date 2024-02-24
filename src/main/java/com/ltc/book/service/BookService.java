package com.ltc.book.service;

import com.ltc.book.dto.BookDto;
import com.ltc.book.entity.Book;
import com.ltc.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow();
    }

    public void addBook(BookDto newBook) {
        Book book = modelMapper.map(newBook, Book.class);
        bookRepository.save(book);
    }

    public void delete(Long id) {
        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(book);
    }

    public void update(Long id, BookDto dto) {
        Book book = bookRepository.findById(id).orElseThrow();
        modelMapper.map(dto, book);
        bookRepository.save(book);
    }
}
