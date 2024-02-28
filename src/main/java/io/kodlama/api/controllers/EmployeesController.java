package io.kodlama.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kodlama.business.abstarcts.EmployeeService;
import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.Result;
import io.kodlama.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employee")
public class EmployeesController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public Result add(@RequestBody Employee employee) {
		return this.employeeService.add(employee);
	}

	@GetMapping
	public DataResult<List<Employee>> getAll() {
		return this.employeeService.getAll();
	}
}
