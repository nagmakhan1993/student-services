package com.xamp.student_services.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "student")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;

    @NotBlank(message = "Student Name is required")
    @Column(name = "student_name", nullable = false, length = 50)
    private String studentName;

    @NotBlank(message = "Father Name is required")
    @Column(name = "father_name", nullable = false, length = 50)
    private String fatherName;

    @NotBlank(message = "Mother Name is required")
    @Column(name = "mother_name", nullable = false, length = 50)
    private String motherName;

    @NotNull(message = "Phone Number must not be null")
    @Column(name = "phoneNO", nullable = false, precision = 10)
    private Long phoneNO;

    @NotNull(message = "Aadhaar number must not be null")
    @Column(name = "aadhaar_NO", nullable = false, precision = 12, unique = true)
    private Long aadhaarNo;

    @NotBlank(message = "Email ID is required")
    @Email(message = "Email ID is not valid")
    @Column(name = "email_id", nullable = false, length = 50, unique = true)
    private String emailID;

    @NotBlank(message = "Class Name is required")
    @Column(name = "className", nullable = false)
    private String className;

    @Column(name = "sec_id")
    private String secID;

    @NotNull(message = "School ID must not be null")
    @Column(name = "school_ID", nullable = false)
    private Long schoolID;

    @Column(name = "class_ID")
    private Long classID;

    @Column(name = "subjectList")
    private List<Long> subjects;
}
