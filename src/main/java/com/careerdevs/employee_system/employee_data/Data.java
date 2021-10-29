package com.careerdevs.employee_system.employee_data;

import com.careerdevs.employee_system.employee.Employee;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Data {

    private final String[] JOB_TITLE={"Manager","Employee","Human Resource","Shipper"};
    private final String[] DEPARTMENT={"Factory","assembly","HR","Shipping"};

    private List<Employee> employees;
    private final AtomicLong employeeId = new AtomicLong();

    public Data(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> createData(){
        employees.add(new Employee(employeeId.incrementAndGet(),"Joe","Smith",JOB_TITLE[0],DEPARTMENT[0]));
        employees.add(new Employee(employeeId.incrementAndGet(),"Sam","Jones",JOB_TITLE[1],DEPARTMENT[1]));
        employees.add(new Employee(employeeId.incrementAndGet(),"Bob","Walsh",JOB_TITLE[2],DEPARTMENT[2]));
        employees.add(new Employee(employeeId.incrementAndGet(),"Sally","Adams",JOB_TITLE[3],DEPARTMENT[3]));

        return employees;
    }

}
