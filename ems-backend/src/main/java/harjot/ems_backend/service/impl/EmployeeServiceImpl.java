package harjot.ems_backend.service.impl;

import org.springframework.stereotype.Service;

import harjot.ems_backend.dto.EmployeeDto;
import harjot.ems_backend.entity.Employee;
import harjot.ems_backend.mapper.EmployeeMapper;
import harjot.ems_backend.repository.EmployeeRepository;
import harjot.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.employeeDtoToJpEntity(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.JpEntityToEmployeeDto(savedEmployee);
    }
    
}
