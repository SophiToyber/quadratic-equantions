package io.task.quadratic.equations.db.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.task.quadratic.equations.api.entity.Equantion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "equantion_result")
public class EquantionResult {
    @Id
    private String id;
    private Equantion equantion;
    private Double x1;
    private Double x2;
    private String message;
}
