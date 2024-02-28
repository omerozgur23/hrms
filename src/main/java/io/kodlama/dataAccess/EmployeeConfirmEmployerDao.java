package io.kodlama.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.entities.confirms.EmployeeConfirmEmployer;

public interface EmployeeConfirmEmployerDao extends JpaRepository<EmployeeConfirmEmployer, Integer> {

}
