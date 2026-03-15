package harjot.ems_backend.entity;

// JPA (Java Persistence API) uses Java to adds tables, fields, etcetera in MySQL
// lombok library automatically adds setter/getter methods for JPA 
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")

public class Employee {

    @Id                             
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_id",nullable = false, unique = true)
    private String email;

    /*
        If you accidentally add column, to remove it, run the following SQL script:
        ALTER TABLE `ems`.`employees` DROP COLUMN `column_name`;
    */
}   
