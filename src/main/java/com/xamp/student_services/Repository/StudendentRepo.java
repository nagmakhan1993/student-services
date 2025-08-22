package com.xamp.student_services.Repository;

import com.xamp.student_services.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudendentRepo extends JpaRepository<Student, Long> {

    Optional<Student> findByAadhaarNo(Long aadhaarNo);
    Optional<Student> findByEmailID(String emailID);

}
