package com.spring.jpa_pagination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.spring.jpa_pagination.model.entity.Employee;
import com.spring.jpa_pagination.model.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Page<Employee> findByPage( int currentPage){
		PageRequest pageable = PageRequest.of(currentPage-1, 10);
		return employeeRepo.findAll(pageable);
	}
	

}
