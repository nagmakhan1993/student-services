package com.xamp.student_services.Service;

import com.xamp.student_services.Entity.Student;
import com.xamp.student_services.Repository.StudendentRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService {

    private final StudendentRepo studentRepo;

    @Autowired
    public studentService(StudendentRepo studendentRepo) {
        this.studentRepo = studendentRepo;
    }

    public List<Student> findAllStudents() {
        return studentRepo.findAll();
    }

    public Optional<Student> getStudentByID(Long id) {
        return studentRepo.findById(id);
    }

    public Optional<Student> addStudent(Student student) {
        boolean aadhaarExists = studentRepo.findByAadhaarNo(student.getAadhaarNo()).isPresent();
        boolean emailExists = studentRepo.findByEmailID(student.getEmailID()).isPresent();

        if (!aadhaarExists && !emailExists) {
            Student saved = studentRepo.save(student);
            return Optional.of(saved);
        } else {
            return Optional.empty(); // duplicate
        }
    }


    public Student updateStudentByID(Long id, Student student) {
        return studentRepo.findById(id).map(std -> {
            if (student.getStudentName() != null) std.setStudentName(student.getStudentName());
            if (student.getFatherName() != null) std.setFatherName(student.getFatherName());
            if (student.getMotherName() != null) std.setMotherName(student.getMotherName());
            if (student.getPhoneNO() != null) std.setPhoneNO(student.getPhoneNO());
            if (student.getEmailID() != null) std.setEmailID(student.getEmailID());
            if (student.getClassName() != null) std.setClassName(student.getClassName());
            if (student.getSecID() != null) std.setSecID(student.getSecID());
            if (student.getSchoolID() != null) std.setSchoolID(student.getSchoolID());
            studentRepo.save(std);
            return std;
        }).orElseThrow(() -> new EntityNotFoundException("Student not found with ID: " + id));
    }

    public String deleteStudentByID(Long id) {
        if (!studentRepo.findById(id).isEmpty()) {
            studentRepo.deleteById(id);
            return "Deleted";
        } else {
            return "Student Not found!!! Kindly check ID";
        }
    }
}
