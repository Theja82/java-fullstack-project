package org.jsp.fullstack.repository;

import org.jsp.fullstack.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository  extends JpaRepository<Employee, Integer>{

}