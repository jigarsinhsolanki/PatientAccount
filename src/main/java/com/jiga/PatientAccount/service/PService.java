package com.jiga.PatientAccount.service;

import com.jiga.PatientAccount.entity.PatientAcc;
import com.jiga.PatientAccount.repository.PRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PService {

    @Autowired
    private PRepo pRepo;

    public PatientAcc savePatient(PatientAcc patientAcc) {

        return pRepo.save(patientAcc);
    }

    public List<PatientAcc> savePatient(List<PatientAcc> patients) {

        return pRepo.saveAll(patients);
    }

    public List<PatientAcc> getPatients() {

        return pRepo.findAll();
    }

    public PatientAcc getPatientById(long id) {
        return pRepo.findById(id).orElse(null);
    }


    public PatientAcc updatePatient(PatientAcc patient) {

        PatientAcc existingPatient=pRepo.findById(patient.getId()).orElse(null);
        existingPatient.setPatientName(patient.getPatientName());
        existingPatient.setDate(patient.getDate());
        existingPatient.setAddress(patient.getAddress());
        existingPatient.setBDate(patient.getBDate());
        existingPatient.setGender(patient.getGender());
        existingPatient.setMaritalStatus(patient.getMaritalStatus());
        existingPatient.setPhone(patient.getPhone());
        existingPatient.setEmail(patient.getEmail());
        return pRepo.save(existingPatient);

    }


    public String deletePatient(long id) {
        pRepo.deleteById(id);
        return "patient removed!! " +id;

    }

}
