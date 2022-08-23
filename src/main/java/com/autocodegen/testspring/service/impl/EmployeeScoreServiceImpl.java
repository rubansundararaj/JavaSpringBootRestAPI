package com.autocodegen.testspring.service.impl;

import java.util.List;
import java.util.Optional;

import com.autocodegen.testspring.entity.EmployeeScoreEntity;
import com.autocodegen.testspring.repository.EmployeeScoreRepository;
import com.autocodegen.testspring.service.EmployeeScoreService;

import org.springframework.stereotype.Service;

@Service
public class EmployeeScoreServiceImpl implements EmployeeScoreService{

    private final EmployeeScoreRepository employeeScoreRepository;

    public EmployeeScoreServiceImpl(EmployeeScoreRepository employeeScoreRepository) {
        this.employeeScoreRepository = employeeScoreRepository;
    }

    @Override
    public List<EmployeeScoreEntity> findAllEmployeeScores() {
    
        return employeeScoreRepository.findAll();
    }

    @Override
    public Optional<EmployeeScoreEntity> findById(Long id) {
 
        return employeeScoreRepository.findById(id);
    }

    @Override
    public EmployeeScoreEntity saveEmployeeScores(EmployeeScoreEntity employeeEntity) {

        return employeeScoreRepository.save(employeeEntity);
    }

    @Override
    public EmployeeScoreEntity updateEmployeeScores(EmployeeScoreEntity employeeEntity) {

        return employeeScoreRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployeeScore(Long id) {
        employeeScoreRepository.deleteById(id);
        
    }

    
}
