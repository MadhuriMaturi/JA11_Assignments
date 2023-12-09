package com.hexaware.productspringsecurity.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.productspringsecurity.dto.Doctor;

public class DoctorService {
	
	List<Doctor> doctorlist=new ArrayList<Doctor>();
	
	
	 public List<Doctor> getProducts() {
	    	
	    	doctorlist.add( new Doctor(1111, "paramahamsa", 20000) );
	    	doctorlist.add( new Doctor(2222, "raju", 90000) );
	    	doctorlist.add( new Doctor(3333, "ramu", 70000) );
	    	doctorlist.add( new Doctor(4444,"lakshmi", 50000) );
	    	
	        return  doctorlist;
	 }
	  public Doctor getDoctor(int id) {
	        return doctorlist.stream()
	                .filter(product -> product.getDoctorid() == id)
	                .findAny()
	                .orElseThrow(() -> new RuntimeException("product " + id + " not found"));
	    }


}
