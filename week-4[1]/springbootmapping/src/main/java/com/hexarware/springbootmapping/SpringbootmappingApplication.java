package com.hexarware.springbootmapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hexarware.springbootmapping.entity.Doctor;
import com.hexarware.springbootmapping.entity.Patient;
import com.hexarware.springbootmapping.repository.PatientRepository;


@SpringBootApplication
public class SpringbootmappingApplication implements CommandLineRunner
{
	@Autowired
	PatientRepository patientrepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmappingApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception
	{
		Doctor doctor=new Doctor(2,"lucky","mbbs");
		Patient patient=new Patient(1,"raju",doctor);
		patientrepo.save(patient);
		
	}

}
