package org.example.employee.service;

import org.example.employee.model.dto.request.EmployeeRequestDTO;
import org.example.employee.model.dto.response.EmployeeResponseDTO;

import java.util.List;

public interface EmployeeService {

    EmployeeResponseDTO getEmployeeById(Long id);

    List<EmployeeResponseDTO> getEmployees();

    EmployeeResponseDTO createEmployee(EmployeeRequestDTO request);

    EmployeeResponseDTO updateEmployee(EmployeeRequestDTO request);

    void deleteEmployee(Long id);
}
