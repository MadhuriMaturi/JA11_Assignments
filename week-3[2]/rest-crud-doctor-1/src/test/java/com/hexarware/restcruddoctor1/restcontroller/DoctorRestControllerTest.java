package com.hexarware.restcruddoctor1.restcontroller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.hexarware.restcruddoctor1.entity.Doctor;

@SpringBootTest
class DoctorRestControllerTest {
	@Autowired
	RestTemplate restTemplate;
	Logger logger = LoggerFactory.getLogger(DoctorRestControllerTest.class);

	@Test
	void testAdddoctor() 
	{
		Doctor doctor=new Doctor();
		doctor.setDoctorid(67);
		doctor.setDoctorname("honey");
		doctor.setSalary(900);
		
		restTemplate.postForObject("http://localhost:8181/api/doctors/add/", doctor, Doctor.class);

		logger.info("product added"+doctor);
		assertNotNull(doctor);
	}

	@Test
	void testGetAll()
	{
		List<Doctor> list=restTemplate.getForObject("http://localhost:8181/api/doctors/getall",List.class);
          logger.info("list pf doctors" +list);
            assertNotNull(list);
	}

	@Test
	void testGetById() {
		
		int doctorid=3;
		  Doctor doctor1=restTemplate.getForObject("http://localhost:8181/api/doctors/get/"+ doctorid,Doctor.class);;
		  
		 assertNotNull(doctor1);
		  
		 logger.info(doctor1.toString());
		 
		 

	}

}
