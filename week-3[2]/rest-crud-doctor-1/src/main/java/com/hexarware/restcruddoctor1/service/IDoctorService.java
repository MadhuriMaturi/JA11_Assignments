package com.hexarware.restcruddoctor1.service;

import java.util.List;

import com.hexarware.restcruddoctor1.entity.Doctor;

public interface IDoctorService {
	public Doctor createDoctor(Doctor doctor) ;
	public Doctor updateDoctor(Doctor doctor);
	public void deleteDoctor(int doctorid);
	public Doctor getDoctorById(int doctorid);
	public Doctor getDoctorByname(String doctorname);
	public List<Doctor> getAll();
	public  List<Doctor>   getSorted();
	
	

}
