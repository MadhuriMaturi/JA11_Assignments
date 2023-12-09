package com.hexaware.patientrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.patientrestapi.dto.PatientDTO;
import com.hexaware.patientrestapi.entity.Patient;
import com.hexaware.patientrestapi.repository.PatientRepository;

public class PatientServiceImp implements IPatientService 
{
	@Autowired
	PatientRepository patientRepo;

	@Override
	public Patient addPatient(PatientDTO patientDTO) {
		Patient patient=new Patient();
		patient.setPatientId(patientDTO.getPatientId());
		patient.setPatientName(patientDTO.getPatientName());
		patient.setCustomerId(patientDTO.getCustomerId());
		return patientRepo.save(patient);
	}

	@Override
	public Patient getPatientById(int patientid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
