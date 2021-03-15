package io.task.quadratic.equations.service;

import org.springframework.stereotype.Service;

import io.task.quadratic.equations.api.entity.Equantion;
import io.task.quadratic.equations.db.entity.EquantionResult;
import io.task.quadratic.equations.db.repository.EquantionResultRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class EquantionService {
	private final EquantionResultRepository equantionResultRepository;

	public EquantionResult processExpression(Equantion equantion) {
		EquantionResult result = equantionResultRepository.save(calculateResult(equantion));
		log.info("calculated result: {}", result);
		return result;
	}

	private final String MULTIPLE_ROOTS = "Equation roots: x1 = %f%n, x2 = %f%n";
	private final String SINGLE_ROOT = "The equation has a single root: x = %s";
	private final String NO_REAL_ROOTS = "The equation has no real roots!";

	private EquantionResult calculateResult(Equantion equantion) {
		Double x1 = null;
		Double x2 = null;
		Double a = equantion.getA();
		Double b = equantion.getB();
		Double c = equantion.getC();
		Double D;
		String message;
		D = b * b - 4 * a * c;
		if (D > 0) {
			x1 = (-b - Math.sqrt(D)) / (2 * a);
			x2 = (-b + Math.sqrt(D)) / (2 * a);
			message = String.format(MULTIPLE_ROOTS, x1, x2);
		} else if (D == 0) {
			x1 = -b / (2 * a);
			message = String.format(SINGLE_ROOT, x1);
		} else {
			message = NO_REAL_ROOTS;
		}
		return EquantionResult.builder().x1(x1).x2(x2).message(message).equantion(equantion).build();
	}

}
