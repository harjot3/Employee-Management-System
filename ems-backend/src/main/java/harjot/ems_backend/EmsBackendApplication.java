/*
With JpaRepository, you don’t need to write SQL queries for common operations like:

Saving data
Updating data
Deleting data
Fetching data
*/
package harjot.ems_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmsBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmsBackendApplication.class, args);
	}

}
