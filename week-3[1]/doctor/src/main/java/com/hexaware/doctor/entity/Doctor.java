package com.hexaware.doctor.entity;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="doctor_table")
@NamedQueries({
	 @NamedQuery(name="getDoctorByName",query = "select d from Doctor d") ,
	 @NamedQuery(name="selectByName",query = "select d from Doctor d where d.doctorname =  :name ") 	
})
public class Doctor 
{
	private int doctorid;
	private String doctorname;
	private String speciality;
	private int experience;
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Doctor() {
		super();
	}
	public Doctor(int doctorid, String doctorname, String speciality, int experience) {
		super();
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.speciality = speciality;
		this.experience = experience;
	}
	
	
	

}
