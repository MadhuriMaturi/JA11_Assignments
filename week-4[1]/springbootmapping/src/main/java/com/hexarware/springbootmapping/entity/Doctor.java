package com.hexarware.springbootmapping.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Doctor implements Serializable
{
	private static final long serialVersionUID = 1L;
			@Id
	       private int doctorId;
	       private String doctorName;
          private String doctorQualification;
          
          

		public int getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}

		public String getDoctorName() {
			return doctorName;
		}

		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}

		public String getDoctorQualification() {
			return doctorQualification;
		}

		public void setDoctorQualification(String doctorQualification) {
			this.doctorQualification = doctorQualification;
		}

		public Doctor(int doctorId, String doctorName, String doctorQualification) {
			super();
			this.doctorId = doctorId;
			this.doctorName = doctorName;
			this.doctorQualification = doctorQualification;
		}

		public Doctor() {
			super();
		}

		
          
}
