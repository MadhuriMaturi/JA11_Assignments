package com.hexaware.doctor.dao;

import java.util.List;

import com.hexaware.doctor.entity.Doctor;

public interface IDoctorDAO {
	public boolean createDoctor(Doctor doctor);
	public boolean  updateDoctor(Doctor doctor);
	public boolean deleteDoctor(int doctorid);
	public Doctor getDoctor(String doctorname);
	public List<Doctor>getAllDoctor();

}
