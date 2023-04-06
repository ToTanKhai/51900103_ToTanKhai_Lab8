package com._ToTanKhai.Lab8_2.service;

import com._ToTanKhai.Lab8_2.model.Employee;
import com._ToTanKhai.Lab8_2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> getAllEmployees(){ return employeeRepository.findAll();}

    @Override
    public Employee getEmployee(long id) throws Exception{
        return employeeRepository.findById(id).orElseThrow(() -> new Exception("Student not found"));
    }

    @Override
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public void removeById(Long id) {employeeRepository.deleteById(id);}
}
