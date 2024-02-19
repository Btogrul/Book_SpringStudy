//package com.ltc.book.service;
//
//import com.ltc.book.dto.BookDto;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class BookService {
//    ArrayList<BookDto> library = new ArrayList<>();
//
//    public List<BookDto> getLibrary() {
//        return library;
//    }
//
//    public List<BookDto> getBookById(int id) {
//        return library
//                .stream()
//                .filter(book -> book.getId() == id)
//                .collect(Collectors.toList());
//    }
//
//    public ArrayList<BookDto> addBook(BookDto newBook) {
//        library.add(newBook);
//        return library;
//
//    }
//
//    public ArrayList<BookDto> updateBook(int id, BookDto updatedBook) {
//        for (int i = 0; i < library.size(); i++) {
//            BookDto bookDto = library.get(i);
//            if (bookDto.getId() == id) {
//                bookDto.setId(updatedBook.getId());
//                bookDto.setBookName(updatedBook.getBookName());
//                bookDto.setIsbn(updatedBook.getIsbn());
//                bookDto.setYear(updatedBook.getYear());
//                bookDto.setCountOfPage(updatedBook.getCountOfPage());
//                library.set(i, updatedBook);
//                break;
//            }
//        }
//        return library;
//
//    }
//
//
//    public ResponseEntity<String> deleteBook(int id) {
//        library.removeIf(bookDto -> bookDto.getId() == id);
//        return ResponseEntity.ok("Ugurla silindi");
//    }
//}
