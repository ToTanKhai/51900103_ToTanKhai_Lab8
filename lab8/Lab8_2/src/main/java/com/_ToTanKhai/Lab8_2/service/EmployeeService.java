package com._ToTanKhai.Lab8_2.service;

import com._ToTanKhai.Lab8_2.model.Employee;

public interface EmployeeService {
    public Iterable<Employee> getAllEmployees();

    public Employee getEmployee(long id) throws Exception;

    public Employee save(Employee employee);

    public void removeById(Long id);

}
