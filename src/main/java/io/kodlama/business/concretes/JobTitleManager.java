package io.kodlama.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.kodlama.business.abstarcts.JobTitleService;
import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.ErrorResult;
import io.kodlama.core.utilities.result.Result;
import io.kodlama.core.utilities.result.SuccessDataResult;
import io.kodlama.core.utilities.result.SuccessResult;
import io.kodlama.dataAccess.JobTitleDao;
import io.kodlama.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	@Autowired
	private JobTitleDao jobTitleDao;

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(), "Data listelendi");
	}

	@Override
	public Result add(JobTitle jobTitle) {
		if (jobTitleDao.existsByTitle(jobTitle.getTitle()))
			return new ErrorResult("Title already exists!");

		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Job Title is Added");
	}

}
