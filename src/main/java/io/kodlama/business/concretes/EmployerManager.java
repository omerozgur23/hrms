package io.kodlama.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kodlama.business.abstarcts.EmployeeService;
import io.kodlama.business.abstarcts.EmployerService;
import io.kodlama.business.rules.BusinessRulesService;
import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.ErrorResult;
import io.kodlama.core.utilities.result.Result;
import io.kodlama.core.utilities.result.SuccessDataResult;
import io.kodlama.core.utilities.result.SuccessResult;
import io.kodlama.dataAccess.EmployerDao;
import io.kodlama.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	@Autowired
	private EmployerDao employerDao;

	@Autowired
	private BusinessRulesService businessRulesService;

	@Autowired
	private EmployeeService employeeService;

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(Employer employer) {

		if (employerDao.existsByEmail(employer.getEmail()))
			return new ErrorResult("Email already exists!");

		if (!businessRulesService.arePasswordsMatched(employer.getPassword(), employer.getConfirmPassword()))
			return new ErrorResult("Passwords do not match!");

		if (!employer.getWebAdress().equals(businessRulesService.splitDomainName(employer.getEmail())))
			return new ErrorResult("Email with the same domain as the web address is required.");

		if (!employeeService.confirmEmployer(employer.getId()))
			return new SuccessResult("Admin is expected to arrive");

		this.employerDao.save(employer);
		return new SuccessResult("Employer is added");
	}

}
