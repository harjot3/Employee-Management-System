/*
EmployeeMapper is meant to connect the EmployeeDto and JPAEntity Employee class
*/

package harjot.ems_backend.mapper;

import harjot.ems_backend.dto.EmployeeDto;
import harjot.ems_backend.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto JpEntityToEmployeeDto(Employee employee) {
        return new EmployeeDto( 
            employee.getEmployee_id(),
            employee.getFirstName(),
            employee.getLastName(),
            employee.getEmail()
        );
    }

    public static Employee employeeDtoToJpEntity (EmployeeDto employeeDto) {
        return new Employee(
            employeeDto.getEmployee_id(),
            employeeDto.getFirstName(),
            employeeDto.getLastName(),
            employeeDto.getEmail()
        );
    }
}
