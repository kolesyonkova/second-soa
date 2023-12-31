package com.soa.second.soa_second.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.time.LocalDate;

@Setter
@Getter
@Accessors(chain = true)
public class LabWorkDto {
    @JsonIgnoreProperties
    private Integer id;
    @NotBlank
    private String name;
    @NotNull
    private CoordinatesDto coordinates;
    private Instant creationDate;
    @Min(value = 0)
    private Integer minimalPoint;
    private Difficulty difficulty;
    @NotNull
    private DisciplineDto discipline;
    @JsonIgnoreProperties
    private int stepsCount;
}
