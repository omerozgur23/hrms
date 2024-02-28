package io.kodlama.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kodlama.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	boolean existsByEmail(String email);

	boolean existsByNationalityId(String nationalityId);
}
