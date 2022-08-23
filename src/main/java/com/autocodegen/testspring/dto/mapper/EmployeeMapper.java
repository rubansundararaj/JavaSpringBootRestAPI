package com.autocodegen.testspring.dto.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.autocodegen.testspring.dto.request.EmployeeRequest;
import com.autocodegen.testspring.dto.response.EmployeeResponse;
import com.autocodegen.testspring.entity.EmployeeEntity;

@Mapper
public interface EmployeeMapper {
    
    EmployeeMapper MAPPER = Mappers.getMapper(EmployeeMapper.class);
    EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest);
    EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity);
}
