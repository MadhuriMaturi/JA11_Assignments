package com.hexarware.restcruddoctor1.restcontroller;


import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexarware.restcruddoctor1.entity.Doctor;
import com.hexarware.restcruddoctor1.exception.DoctorNotFoundException;
import com.hexarware.restcruddoctor1.service.DoctorServiceImp;
import com.hexarware.restcruddoctor1.service.IDoctorService;
@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/doctors")
public class DoctorRestController
{
	Logger logger=LoggerFactory.getLogger(DoctorRestController.class);
	@Autowired
    IDoctorService service;
	
	@PostMapping(value="/add",consumes="application/json",produces="application/json")
	public Doctor adddoctor(@RequestBody Doctor doctor)
	{
		 boolean isValid=DoctorServiceImp.inputValidation(doctor);
		 Doctor doctor1 = null;
		 if(isValid)
		 {
		       doctor1=service.createDoctor(doctor);
		 }
		 return doctor1;
	}
	@PostMapping(value="/update",consumes="application/json",produces="application/json")
	public Doctor updatedoctor(@Valid @RequestBody Doctor doctor)
	{
		return service.updateDoctor(doctor);
	}
	
	@DeleteMapping("/get/{doctorid}")
	public String deleteById(@PathVariable int doctorid)
	{
		service.deleteDoctor(doctorid);
		
		return "record deleted";
	}
	@GetMapping(value="/getall",produces="application/json")
	public List<Doctor> getAll()
	{
		logger.info(" info getting all the records");
		logger.debug("debug getting all the records");
		logger.warn("warn getting all the records");
		logger.error("error getting all the records");
		logger.trace("trace getting all the records");
		
		return  service.getAll();
	}
	
	/*
	 * @GetMapping("/get/{doctorid}") public ResponseEntity<String>
	 * getById(@PathVariable int doctorid) { ResponseEntity<String> response=null;
	 * 
	 * 
	 * try { Doctor doctor1= service.getDoctorById(doctorid); if(doctor1==null) {
	 * throw new
	 * DoctorNotFoundException(HttpStatus.BAD_REQUEST,"doctor not found with eid"
	 * +doctorid); } else { response=new
	 * ResponseEntity<String>(doctor1.toString(),HttpStatus.FOUND);
	 * 
	 * } } catch(DoctorNotFoundException e) { e.printStackTrace(); response =new
	 * ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST); }
	 * 
	 * 
	 * return response;
	 */
	//}
	
	@GetMapping("get/{doctorid}")
	public Doctor getById(@Valid @Min(1) @PathVariable int doctorid) throws DoctorNotFoundException {

		logger.info("data get by doctor id");
		Doctor doctor=service.getDoctorById(doctorid) ;
		if(doctor.getDoctorid()==0)
		{
			throw new DoctorNotFoundException(HttpStatus.BAD_REQUEST,"doctor not found for doctorid");
		}
		return doctor;
	}
	
	
	@GetMapping("/getbyname/{name}")
	public Doctor getByname(@PathVariable String name)
	{
		return service.getDoctorByname(name);
	}
	@GetMapping("/get/sorted/salary")
	public List<Doctor>  getBySorted(){
		
		return  service.getSorted();
		
	}
	

}

