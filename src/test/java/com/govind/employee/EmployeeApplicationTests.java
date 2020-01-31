package com.govind.employee;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.govind.employee.bean.Employee;
import com.govind.employee.controller.EmployeeController;
import com.govind.employee.service.EmployeeService;

@SpringBootTest
class EmployeeApplicationTests {
	
	@Autowired
	EmployeeService employeeService ;
	
	@Autowired
	EmployeeController employeecontroller ;
 
	
	@Test
	void contextLoads() {
	}
	
	@Test 
	public void getEmployees()
	{
		Employee employee = employeeService.getEmployee(1);
		assertEquals("Amitabh" , employee.getName());
}

}
