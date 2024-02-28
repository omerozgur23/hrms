package io.kodlama.business.concretes;

import org.springframework.stereotype.Service;

import io.kodlama.business.abstarcts.UserCheckService;
import io.kodlama.entities.concretes.Candidate;

@Service
public class UserCheckManager implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(Candidate candidate) {

		return true;
	}

}
