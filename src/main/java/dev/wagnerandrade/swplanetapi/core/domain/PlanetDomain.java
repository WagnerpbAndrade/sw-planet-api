package dev.wagnerandrade.swplanetapi.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder( toBuilder = true )
public class PlanetDomain {
    private UUID id;
    private String name;
    private String climate;
    private String terrain;
}
