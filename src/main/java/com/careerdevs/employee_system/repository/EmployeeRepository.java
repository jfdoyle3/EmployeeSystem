package com.careerdevs.employee_system.repository;

import com.careerdevs.employee_system.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
