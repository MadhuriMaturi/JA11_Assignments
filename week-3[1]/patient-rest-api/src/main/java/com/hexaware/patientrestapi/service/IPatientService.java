package com.hexaware.patientrestapi.service;

import java.util.List;

import com.hexaware.patientrestapi.dto.PatientDTO;
import com.hexaware.patientrestapi.entity.Patient;

public interface IPatientService {
	public Patient addPatient( PatientDTO patientDTO);
	public Patient getPatientById(int patientid);
	public List<Patient> getAll();
	

}
