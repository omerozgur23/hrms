package io.kodlama.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.entities.confirms.EmployeeConfirm;

public interface EmployeeConfirmDao extends JpaRepository<EmployeeConfirm, Integer> {

}
