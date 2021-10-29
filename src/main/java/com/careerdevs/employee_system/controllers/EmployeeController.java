package com.careerdevs.employee_system.controllers;

import com.careerdevs.employee_system.employee.Employee;
import com.careerdevs.employee_system.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class EmployeeController {

    private final EmployeeRepository repository;
    private final AtomicLong employeeId = new AtomicLong();

    public EmployeeController(EmployeeRepository repository){
        this.repository=repository;
    }

    @GetMapping("/")
    public String welcome() {
        return "Employee Info System";
    }

    @GetMapping("/smartEmployee")
    public Employee smartEmployee() {
        return new Employee(3, "Jim", "Doyle", "Developer", "Dev Team");
    }

    @GetMapping("/employee")
    public Employee employee(@RequestParam(value = "firstName") String firstName
                            ,@RequestParam(value = "lastName") String lastName
                            ,@RequestParam(value = "jobTitle") String jobTitle
                            ,@RequestParam(value = "department") String department) {
        return new Employee(employeeId.incrementAndGet(), firstName, lastName, jobTitle, department);
    }

    @GetMapping("/employee/{firstName}/{lastName}/{jobTitle}/{department}")
    public Employee employeePath(@PathVariable String firstName
                                ,@PathVariable String lastName
                                ,@PathVariable String jobTitle
                                ,@PathVariable String department){
        return new Employee(employeeId.incrementAndGet(),firstName,lastName,jobTitle,department);
    }

}
