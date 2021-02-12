package com.jiga.PatientAccount.controller;

import com.jiga.PatientAccount.entity.PatientAcc;
import com.jiga.PatientAccount.service.PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PController {

    @Autowired
    private PService pService;


    @PostMapping("/addPatient")
    public PatientAcc addPatient(@RequestBody PatientAcc patientAcc){

        return pService.savePatient(patientAcc);
    }

    @PostMapping("/addPatients")
    public List<PatientAcc> addPatients(@RequestBody List<PatientAcc> patients){

        return pService.savePatient(patients);
    }

    @GetMapping("/patients")
    public List<PatientAcc> findAllPatients(){

        return pService.getPatients();
    }
    @GetMapping("/patient/{id}")
    public PatientAcc findPatientById(@PathVariable long id){

        return pService.getPatientById(id);
    }

    @PutMapping("/updatePatient")
    public PatientAcc updatePatient(@RequestBody PatientAcc patient){

        return pService.updatePatient(patient);
    }

    @DeleteMapping("/deletePatient/{id}")
    public String deletePatient(@PathVariable long id){

        return pService.deletePatient(id);
    }

}

