package io.kodlama.business.abstarcts;

import io.kodlama.entities.concretes.Candidate;

public interface UserCheckService {
	boolean CheckIfRealPerson(Candidate candidate);
}
