package io.kodlama.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kodlama.business.abstarcts.JobTitleService;
import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.Result;
import io.kodlama.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitlesController {

	@Autowired
	private JobTitleService jobTitleService;

	@GetMapping
	public DataResult<List<JobTitle>> getAll() {
		return jobTitleService.getAll();
	}

	@PostMapping
	public Result add(@RequestBody JobTitle jobTitle) {
		return jobTitleService.add(jobTitle);
	}
}
