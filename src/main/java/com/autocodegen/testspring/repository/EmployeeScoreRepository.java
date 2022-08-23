package com.autocodegen.testspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autocodegen.testspring.entity.EmployeeScoreEntity;

@Repository
public interface EmployeeScoreRepository extends JpaRepository<EmployeeScoreEntity, Long> {
}
