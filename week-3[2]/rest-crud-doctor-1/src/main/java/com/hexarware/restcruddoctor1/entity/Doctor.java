package com.hexarware.restcruddoctor1.entity;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
	@Entity
	@Table(name="Doctor_Details")
	public class Doctor implements Serializable
	{
		@Id
	    private int doctorid;
		@NotNull
		@Pattern(regexp = "[A-Z][a-z]{3,6}")
	    private String doctorname;
		@Min(1000)
		@Max(99000)
	    private double salary;
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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Doctor() {
			super();
		}
		public Doctor(int doctorid, String doctorname, double salary) {
			super();
			this.doctorid = doctorid;
			this.doctorname = doctorname;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Doctor [doctorid=" + doctorid + ", doctorname=" + doctorname + ", salary=" + salary + "]";
		}
	    
		
		
	}



