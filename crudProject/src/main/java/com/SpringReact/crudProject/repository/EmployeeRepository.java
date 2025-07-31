package com.SpringReact.crudProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringReact.crudProject.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
  // all crud database methods for this project
}
