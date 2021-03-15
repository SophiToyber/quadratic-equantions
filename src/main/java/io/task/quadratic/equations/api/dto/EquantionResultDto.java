package io.task.quadratic.equations.api.dto;

import io.task.quadratic.equations.api.entity.Equantion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EquantionResultDto {
    private String id;
    private Equantion equantion;
    private Double x1;
    private Double x2;
    private String message;
}
