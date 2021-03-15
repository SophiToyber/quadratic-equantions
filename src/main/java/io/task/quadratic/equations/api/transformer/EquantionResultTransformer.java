package io.task.quadratic.equations.api.transformer;

import io.task.quadratic.equations.api.dto.EquantionResultDto;
import io.task.quadratic.equations.db.entity.EquantionResult;

public class EquantionResultTransformer {
	public static EquantionResultDto transform(EquantionResult equantionResult) {
		return EquantionResultDto.builder()
				.id(equantionResult.getId())
				.equantion(equantionResult.getEquantion())
				.x1(equantionResult.getX1())
				.x2(equantionResult.getX2())
				.message(equantionResult.getMessage())
				.build();
	}
}
