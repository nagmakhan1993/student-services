package com.xamp.student_services.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class School {
    private Long schoolID;
    String District;
    String Zone;
    String UDISECode;
    String Buildingid;
    String SchoolName;
    String Address;
    String Shift;
    String SchoolLevel;
    String Gender;
    String Phone;
    String HosName;
    String schoolType;
}
