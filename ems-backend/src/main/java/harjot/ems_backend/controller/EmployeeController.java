/*
Handle HTTP Requests

*/

package harjot.ems_backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import harjot.ems_backend.dto.EmployeeDto;
import harjot.ems_backend.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Add Employee Rest API
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto saved
    }
    
}
