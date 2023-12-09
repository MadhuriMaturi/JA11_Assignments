package com.hexaware.patientrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.patientrestapi.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>
{
	
	

}
