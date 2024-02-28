package io.kodlama.business.abstarcts;

import io.kodlama.entities.concretes.Employee;

public interface EmployeeService extends GenericService<Employee> {
	boolean confirmEmployer(int employerId);
}
