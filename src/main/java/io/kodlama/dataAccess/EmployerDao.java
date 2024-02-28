package io.kodlama.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	boolean existsByEmail(String email);
}
