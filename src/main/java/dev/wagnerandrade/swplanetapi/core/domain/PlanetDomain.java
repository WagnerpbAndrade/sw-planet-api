package dev.wagnerandrade.swplanetapi.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder( toBuilder = true )
public class PlanetDomain {

    private UUID id;

    private String name;

    private String climate;

    private String terrain;

    private LocalDateTime createdAt;
}
