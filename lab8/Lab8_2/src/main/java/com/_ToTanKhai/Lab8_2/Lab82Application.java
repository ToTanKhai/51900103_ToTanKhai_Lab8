package com._ToTanKhai.Lab8_2;

import com._ToTanKhai.Lab8_2.model.Employee;
import com._ToTanKhai.Lab8_2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab82Application implements CommandLineRunner {

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(Lab82Application.class, args);
	}


	@Override
	public void run(String... args) throws  Exception{
		employeeService.save(new Employee("Tan Khai",
				"tankhai@gmail.com",
				" 25 Nguyen Thi Thap",
				"123456789"));
		employeeService.save(new Employee("Mai Ngoc",
				"maingoc@gmail.com",
				"110 Huynh Tan Phat",
				"012345678"));
	}
}
