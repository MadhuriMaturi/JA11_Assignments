package com.hexaware.productspringsecurity.dto;

public class Doctor {
	 private int doctorid;
	    private String doctorname;
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
