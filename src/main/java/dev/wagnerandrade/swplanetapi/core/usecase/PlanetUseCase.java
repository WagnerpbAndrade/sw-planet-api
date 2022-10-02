package dev.wagnerandrade.swplanetapi.core.usecase;

import dev.wagnerandrade.swplanetapi.core.domain.PlanetDomain;
import dev.wagnerandrade.swplanetapi.core.gateway.PlanetGateway;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
@Slf4j
public class PlanetUseCase {
    private final PlanetGateway planetGateway;
    public PlanetDomain newPlanet(final PlanetDomain planetDomain) {
        log.info("Creating new planet");
        return planetGateway.save(planetDomain.toBuilder()
                .createdAt(LocalDateTime.now())
                .build());
    }
}
