package com.hexaware.patientrestapi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.patientrestapi.dto.PatientDTO;
import com.hexaware.patientrestapi.entity.Patient;
import com.hexaware.patientrestapi.service.IPatientService;
@RestController
@RequestMapping("/api/patients")
public class PatientRestController
{
	@Autowired
	IPatientService service;
	
	@PostMapping("/add")
	public Patient addPatient(@RequestBody PatientDTO patientDTO)
	{
		return service.addPatient(patientDTO);
	}

}
