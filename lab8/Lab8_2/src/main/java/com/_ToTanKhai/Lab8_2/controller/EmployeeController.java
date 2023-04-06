package com._ToTanKhai.Lab8_2.controller;

import com._ToTanKhai.Lab8_2.model.Employee;
import com._ToTanKhai.Lab8_2.service.EmployeeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employees")
    String getEmployees(Model model){
        List<Employee> employees = (List<Employee>) employeeService.getAllEmployees();
        model.addAttribute("employees",employees);
        return "index";
    }

    @GetMapping(value = "/employees/add")
    String addEmployee(){return "add";}

    @GetMapping("/employees/add")
    String add(HttpServletRequest request){
        Employee employee = new Employee(request.getParameter("name"),
                request.getParameter("email"),
                request.getParameter("address"),
                request.getParameter("phone"));
        return "index";
    }
}
