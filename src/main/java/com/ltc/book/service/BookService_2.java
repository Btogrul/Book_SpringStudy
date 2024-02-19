package com.ltc.book.service;

import com.ltc.book.dto.BookDto;
import com.ltc.book.entity.Book;
import com.ltc.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService_2 {
    private final BookRepository bookRepository;
    ArrayList<BookDto> library = new ArrayList<>();

    public List<Book> getAll(){
        List<Book> all = bookRepository.findAll();
        return all;
    }


    public Book findById(Long id) {
        Book byId = bookRepository.findById(id).orElseThrow();
        return byId;
    }


    public ArrayList<BookDto> addBook (BookDto newBook) {
        Book person = Book.builder()
                .bookName(newBook.getBookName())
                .bookYear(newBook.getYear())
                .isbn(newBook.getIsbn())
                .countOfPage(newBook.getCountOfPage())
                .build();
        bookRepository.save(person);

        return library;
    }
    
    public void delete(Long id){
        Book book = bookRepository.findById(id).orElseThrow();
        bookRepository.delete(book);
    }



    public void update(Long id, BookDto dto){
        Book book = bookRepository.findById(id).orElseThrow();
        book.setBookName(dto.getBookName());
        book.setBookYear(dto.getYear());
        book.setIsbn(dto.getIsbn());
        book.setCountOfPage(dto.getCountOfPage());
        bookRepository.save(book);
    }
}
