package com.autocodegen.testspring.service;

import java.util.List;
import java.util.Optional;

import com.autocodegen.testspring.entity.EmployeeScoreEntity;


public interface EmployeeScoreService {
    List<EmployeeScoreEntity> findAllEmployeeScores();
    Optional<EmployeeScoreEntity> findById(Long id);
    EmployeeScoreEntity saveEmployeeScores(EmployeeScoreEntity employeeEntity);
    EmployeeScoreEntity updateEmployeeScores(EmployeeScoreEntity employeeEntity);
    void deleteEmployeeScore(Long id);

//    Using Request for Save and Update Employee
    // EmployeeResponse saveEmployee(EmployeeRequest employeeRequest);
    // EmployeeResponse updateEmployee(EmployeeRequest employeeRequest, Long id);


}