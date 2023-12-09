package com.hexarware.springbootmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexarware.springbootmapping.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer>
{

}
