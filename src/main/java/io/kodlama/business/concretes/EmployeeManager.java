package io.kodlama.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kodlama.business.abstarcts.EmployeeService;
import io.kodlama.business.rules.BusinessRulesService;
import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.ErrorResult;
import io.kodlama.core.utilities.result.Result;
import io.kodlama.core.utilities.result.SuccessDataResult;
import io.kodlama.core.utilities.result.SuccessResult;
import io.kodlama.dataAccess.EmployeeDao;
import io.kodlama.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Autowired
	private BusinessRulesService businessRulesService;

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(employeeDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(Employee employee) {
		if (employeeDao.existsByEmail(employee.getEmail()))
			return new ErrorResult("Email already exists!");

		if (!businessRulesService.arePasswordsMatched(employee.getPassword(), employee.getConfirmPassword()))
			return new ErrorResult("Passwords do not match!");

		this.employeeDao.save(employee);
		return new SuccessResult("Employee is added");
	}

	@Override
	public boolean confirmEmployer(int employerId) {
		// TODO Auto-generated method stub
		return true;
	}
}
