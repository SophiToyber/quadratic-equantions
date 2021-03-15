package io.task.quadratic.equations.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Equantion {
	private Double a;
	private Double b;
	private Double c;
}
