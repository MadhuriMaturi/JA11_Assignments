package com.hexarware.springbootmapping.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Patient implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int patientId;
	private String patientName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="did")
	private Doctor doctor;
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Patient(int patientId, String patientName, Doctor doctor) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		
		this.doctor = doctor;
	}
	public Patient() {
		super();
	}
	

}
