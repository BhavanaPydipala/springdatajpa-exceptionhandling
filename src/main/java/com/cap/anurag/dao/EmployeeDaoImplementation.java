package com.cap.anurag.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cap.anurag.entity.Employee;

public interface EmployeeDaoImplementation extends JpaRepository<Employee,Integer>{

	Employee findById(Integer empId);
	
	}


