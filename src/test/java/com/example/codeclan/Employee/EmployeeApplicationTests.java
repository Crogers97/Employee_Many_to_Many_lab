package com.example.codeclan.Employee;

import com.example.codeclan.Employee.models.Department;
import com.example.codeclan.Employee.models.Employee;
import com.example.codeclan.Employee.models.Project;
import com.example.codeclan.Employee.repositories.DepartmentRepository;
import com.example.codeclan.Employee.repositories.EmployeeRepository;
import com.example.codeclan.Employee.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeApplicationTests {



	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;


	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee(){
		Department department1= new Department("CodeClan");
		departmentRepository.save(department1);
		Employee employee1 = new Employee("Calum", "Rogers", "ajsdgkjada", department1);
		employeeRepository.save(employee1);
		Project project1 = new Project("Code",3);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);

	}



}
