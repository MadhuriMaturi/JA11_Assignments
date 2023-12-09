package com.hexaware.doctor.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.doctor.DoctorUtil;
import com.hexaware.doctor.entity.Doctor;

public class DoctorDAOImp implements IDoctorDAO {
	SessionFactory sessionFactory = DoctorUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tr = session.beginTransaction();
	

	@Override
	public boolean createDoctor(Doctor doctor) {
		session.save(doctor);
		tr.commit();
		return false;
	}

	@Override
	public boolean updateDoctor(Doctor doctor) {
		session.saveOrUpdate(doctor);
		return false;
	}

	@Override
	public boolean deleteDoctor(int doctorid) {
		session.delete(doctorid);
		return false;
	}

	@Override
	public Doctor getDoctor(String doctorname) {
		TypedQuery<Doctor> query1 = session.getNamedQuery("getDoctorByName");
		query1.setParameter(1,name);
		Doctor s1 = query1.getSingleResult();
		tr.commit();
		return s1;
		return null;
	}

	@Override
	public List<Doctor> getAllDoctor() {
			javax.persistence.Query query3 = session.createNamedQuery("getDoctordetails");
			List <Doctor> list = query3.getResultList();

			tr.commit();
			
			
			return list;
		
	}

}
