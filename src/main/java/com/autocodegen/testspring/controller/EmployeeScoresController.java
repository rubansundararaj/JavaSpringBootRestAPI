package com.autocodegen.testspring.controller;


import com.autocodegen.testspring.entity.EmployeeScoreEntity;
import com.autocodegen.testspring.service.EmployeeScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee_scores")
public class EmployeeScoresController {
    
    private final EmployeeScoreService employeeScoreService;

    public EmployeeScoresController(EmployeeScoreService employeeScoreService) {
        this.employeeScoreService = employeeScoreService;
    }

    @GetMapping
    public List<EmployeeScoreEntity> findAllEmployee() {
        return employeeScoreService.findAllEmployeeScores();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeScoreEntity> findEmployeeById(@PathVariable("id") Long id) {
        return employeeScoreService.findById(id);
    }

    @PostMapping
    public EmployeeScoreEntity saveEmployeeScores(@RequestBody EmployeeScoreEntity employeeEntity) {
        return employeeScoreService.saveEmployeeScores(employeeEntity);
    }

    @PutMapping
    public EmployeeScoreEntity updateEmployeeScores(@RequestBody EmployeeScoreEntity employeeEntity) {
        return employeeScoreService.updateEmployeeScores(employeeEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployeeScore(@PathVariable("id") Long id) {
        employeeScoreService.deleteEmployeeScore(id);
    }
}
