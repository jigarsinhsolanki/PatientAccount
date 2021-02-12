package com.jiga.PatientAccount.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PatientAcc {

    @Id
    @GeneratedValue
    private Long id;
    private String patientName;
    @JsonFormat(pattern="MM-dd-yyyy")
    private Date date;
    private String address;
    @JsonFormat(pattern="MM-dd-yyyy")
    private Date bDate;
    private String gender;
    private String maritalStatus;
    private Long phone;
    private String email;


}
