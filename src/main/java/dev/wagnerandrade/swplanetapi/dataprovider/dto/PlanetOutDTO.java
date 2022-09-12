package dev.wagnerandrade.swplanetapi.dataprovider.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record PlanetOutDTO(UUID id, String name, String climate, String terrain, LocalDateTime createdAt) {
}
