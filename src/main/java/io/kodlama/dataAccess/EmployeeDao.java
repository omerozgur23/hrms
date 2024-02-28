package io.kodlama.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	boolean existsByEmail(String email);

}
