package com._ToTanKhai.Lab8_2.repository;

import com._ToTanKhai.Lab8_2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {



}
