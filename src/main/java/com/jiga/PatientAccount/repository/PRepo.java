package com.jiga.PatientAccount.repository;

import com.jiga.PatientAccount.entity.PatientAcc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PRepo extends JpaRepository<PatientAcc,Long> {
//  public PatientAcc findByName(String patientName);
}
