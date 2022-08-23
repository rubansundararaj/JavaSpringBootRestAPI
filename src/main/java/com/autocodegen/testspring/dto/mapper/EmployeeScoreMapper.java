package com.autocodegen.testspring.dto.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.autocodegen.testspring.dto.request.EmployeeScoreRequest;
import com.autocodegen.testspring.dto.response.EmployeeScoreResponse;
import com.autocodegen.testspring.entity.EmployeeScoreEntity;



@Mapper
public interface EmployeeScoreMapper {
    
    EmployeeScoreMapper MAPPER = Mappers.getMapper(EmployeeScoreMapper.class);
    EmployeeScoreEntity fromRequestToEntity(EmployeeScoreRequest employeeRequest);
    EmployeeScoreResponse fromEntityToResponse(EmployeeScoreEntity employeeEntity);
}
