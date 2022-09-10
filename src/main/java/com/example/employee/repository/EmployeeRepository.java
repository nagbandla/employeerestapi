package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	///update
	//@Modifying
	//@Query("update Employee e set e.first_name = ?2 where e.emp_id = ?1")
	//int updateEmployeeName(Long empId, String firstname); 
}
