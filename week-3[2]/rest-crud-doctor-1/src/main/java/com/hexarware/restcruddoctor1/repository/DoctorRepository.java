package com.hexarware.restcruddoctor1.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hexarware.restcruddoctor1.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer>
{
	public Doctor findBydoctorname(String doctorname);
	
}
