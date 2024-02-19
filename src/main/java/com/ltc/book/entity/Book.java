package com.ltc.book.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Book {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String bookName;
        private String isbn;
        private Integer bookYear;
        private Integer countOfPage;


}
