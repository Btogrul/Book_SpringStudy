package com.ltc.book.dto;

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
}
