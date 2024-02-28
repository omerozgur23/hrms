package io.kodlama.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {
	boolean existsByTitle(String title);
}
