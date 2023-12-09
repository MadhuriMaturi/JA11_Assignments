package com.hexaware.patientrestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_details")
public class Patient {

	@Id
	private int patientId;
	private String patientName;
    private int customerId;
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
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Patient(int patientId, String patientName, int customerId) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.customerId = customerId;
	}
	public Patient() {
		super();
	}
    
	
	
	
}
