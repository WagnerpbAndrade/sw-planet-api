package dev.wagnerandrade.swplanetapi.dataprovider.dto;

import javax.validation.constraints.NotBlank;

public record PlanetInDTO(@NotBlank String name, @NotBlank String climate, @NotBlank String terrain) {
}
