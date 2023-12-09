package com.hexaware.doctor.service;

import java.util.List;

import com.hexaware.doctor.entity.Doctor;

public interface IDoctorService {
	public int createDoctor(Doctor doctor);
	public int  updateDoctor(Doctor doctor);
	public int deleteDoctor(int doctorid);
	public Doctor getDoctor(String doctorname);
	public List<Doctor>getAllDoctor();

}
