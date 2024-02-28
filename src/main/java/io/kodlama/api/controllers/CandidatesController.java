package io.kodlama.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.kodlama.business.abstarcts.CandidateService;
import io.kodlama.core.utilities.result.DataResult;
import io.kodlama.core.utilities.result.Result;
import io.kodlama.entities.concretes.Candidate;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/candidate")
public class CandidatesController {

	@Autowired
	private CandidateService candidateService;

	@GetMapping
	public DataResult<List<Candidate>> getAll() {
		return this.candidateService.getAll();
	}

	@Valid
	@PostMapping
	public Result add(@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}
}
