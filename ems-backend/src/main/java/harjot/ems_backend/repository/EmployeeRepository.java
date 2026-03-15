/*
JpaRepository is an interface in Spring Data JPA that makes working with databases much easier.
 It is built on top of the JPA (Java Persistence API) and provides all the basic methods you need for handling data.

With JpaRepository, you don’t need to write SQL queries for common operations like:

Saving data
Updating data
Deleting data
Fetching data

the EmployeeRepository interface will get CRUD operations that it
*/
package harjot.ems_backend.repository;

import harjot.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
