package io.task.quadratic.equations.api.controller;

import static io.task.quadratic.equations.api.transformer.EquantionResultTransformer.transform;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.task.quadratic.equations.api.dto.EquantionResultDto;
import io.task.quadratic.equations.api.entity.Equantion;
import io.task.quadratic.equations.service.EquantionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/expression")
@RequiredArgsConstructor
public class QuadraticEquantionController {

	private final EquantionService equantionService;

	@PostMapping
	public EquantionResultDto post(@RequestBody Equantion equantion) {
		log.info("Service will accept request: {}", equantion);
		return transform(equantionService.processExpression(equantion));
	}

}
