package com.org.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
    @RequestMapping("/")
    public List<Employee> getEmployees() 
    {
       List<Employee> employeesList = new ArrayList<Employee>();
       employeesList.add(new Employee(10,"Kumindu","Ranawaka","kirlogapanet@gmail.com"));
       return employeesList;
    }

}
