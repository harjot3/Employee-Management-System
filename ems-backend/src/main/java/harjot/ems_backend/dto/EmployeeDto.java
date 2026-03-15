/*
This class is to transfer data bween client and server
Dto is data transfer object
*/

package harjot.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long employee_id;
    private String firstName;
    private String lastName;
    private String email;

}
