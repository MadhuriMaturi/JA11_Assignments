package com.hexaware.mapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping.entities.Department;
import com.hexaware.mapping.entities.Employee;

public class OneToManyMappingTest {
	public static void main(String args[]) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee e1 = new Employee();
		
		e1.setEid(101);
		e1.setEname("madhuri");
		e1.setSalary(4000);
		
		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("rohi");
		e2.setSalary(5000);
		
		Employee e3 = new Employee();
		e3.setEid(103);
		e3.setEname("lakshmi");
		e3.setSalary(9000);
		
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);

		Department dept = new Department();
		dept.setDepartmentid(10);
		dept.setDepartmentname("develpoment");
		dept.setEmployees(employeeSet);
		session.persist(dept);
		tx.commit();
		sessionFactory.close();

	}
}
