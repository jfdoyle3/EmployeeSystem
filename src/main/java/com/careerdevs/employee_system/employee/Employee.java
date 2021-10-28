package com.careerdevs.employee_system.employee;


public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String department;

    public Employee(long id, String firstName, String lastName, String jobTitle, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
