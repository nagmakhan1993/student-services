package com.xamp.student_services.Entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Subject {
    private Long subject_id;
    private String studentName;
    private List<Book> bookList;
    private int noOfBooks;
}
