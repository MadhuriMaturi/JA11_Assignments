package com.hexarware.restcruddoctor1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hexarware.restcruddoctor1.entity.Doctor;
import com.hexarware.restcruddoctor1.repository.DoctorRepository;
@Service
public class DoctorServiceImp implements IDoctorService {

	@Autowired
	DoctorRepository repo;
	public  static boolean inputValidation(Doctor doctor)
	{
		boolean flag=false;
		if(doctor.getDoctorname().length()>3&&doctor.getSalary()>5000)
		{
			flag=true;
		}
		return flag;
	}

	@Override
	public Doctor createDoctor(Doctor doctor) {
		
		return repo.save(doctor);
	}
	@Override
	public Doctor updateDoctor(Doctor doctor) {
		
		return repo.save(doctor);
	}
	@Override
	public void deleteDoctor(int doctorid) {
		repo.deleteById(doctorid);
		
	}
	@Override
	public List<Doctor> getAll() {
		return repo.findAll();
	}
	@Override
	public Doctor getDoctorById(int doctorid) {

		return repo.findById(doctorid).orElse(null);
	}
	@Override
	public Doctor getDoctorByname(String doctorname) {
		
		return repo.findBydoctorname(doctorname);
	}
	@Override
	public List<Doctor> getSorted() {

		return   repo.findAll(Sort.by("salary"));
	}
}