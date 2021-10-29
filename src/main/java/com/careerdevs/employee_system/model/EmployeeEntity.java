package com.careerdevs.employee_system.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {

    private @Id @GeneratedValue long id;
    private String name;
    private String role;
    private Integer age;



    public EmployeeEntity(long id, String name, String role, Integer age) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", age=" + age +
                '}';
    }
}
