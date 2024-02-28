package io.kodlama.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kodlama.business.abstarcts.EmployerService;
import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.Result;
import io.kodlama.entities.concretes.Employer;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employer")
public class EmployersController {

	@Autowired
	private EmployerService employerService;

	@GetMapping
	public DataResult<List<Employer>> getAll() {
		return this.employerService.getAll();
	}

	@Valid
	@PostMapping
	public Result add(@RequestBody Employer employer) {
		return this.employerService.add(employer);
	}
}
