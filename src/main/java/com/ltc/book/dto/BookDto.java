package com.ltc.book.dto;

import com.ltc.book.entity.Author;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BookDto {
   private String bookName;
   private String isbn;
   private Integer year;
   private Integer countOfPage;
   private Author author;
}
