package dev.wagnerandrade.swplanetapi.core.gateway;

import dev.wagnerandrade.swplanetapi.core.domain.PlanetDomain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface PlanetGateway {

    PlanetDomain save(PlanetDomain planetDomain);

    Page<PlanetDomain> findAll(Pageable pageable);

    Optional<PlanetDomain> findById(UUID id);
}
