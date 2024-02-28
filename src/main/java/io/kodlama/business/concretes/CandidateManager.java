package io.kodlama.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import io.kodlama.business.abstarcts.CandidateService;
import io.kodlama.business.abstarcts.UserCheckService;
import io.kodlama.business.rules.BusinessRulesService;
import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.ErrorResult;
import io.kodlama.core.utilities.result.Result;
import io.kodlama.core.utilities.result.SuccessDataResult;
import io.kodlama.core.utilities.result.SuccessResult;
import io.kodlama.dataAccess.CandidateDao;
import io.kodlama.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {

	@Autowired
	private CandidateDao candidateDao;

	@Autowired
	private BusinessRulesService businessRulesService;

	@Autowired
	@Qualifier("mernisServiceAdapter")
	private UserCheckService userCheckService;

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(Candidate candidate) {
		if (!userCheckService.CheckIfRealPerson(candidate))
			return new ErrorResult("Not a valid person");

		if (candidateDao.existsByEmail(candidate.getEmail()))
			return new ErrorResult("Email already exists!");

		if (!businessRulesService.arePasswordsMatched(candidate.getPassword(), candidate.getConfirmPassword()))
			return new ErrorResult("Passwords do not match!");

		if (candidateDao.existsByNationalityId(candidate.getNationalityId()))
			return new ErrorResult("Identification number already in use!");

		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate is added");
	}

}
