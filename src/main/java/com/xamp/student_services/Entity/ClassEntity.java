package com.xamp.student_services.Entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClassEntity {
    private Long classID;
    private String className;
    private List<Subject> subjects;
}
