package com.xamp.student_services.Entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private Long bookID;
    private String bookName;
    private String bookFormat;
    private int noOfChapter;
    private String bookDownloadLink;
    private String numberOfPages;
    private Subject subject;
    private String syllabus;
}
