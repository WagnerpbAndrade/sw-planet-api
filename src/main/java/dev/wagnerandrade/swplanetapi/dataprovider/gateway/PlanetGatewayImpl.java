package dev.wagnerandrade.swplanetapi.dataprovider.gateway;

import dev.wagnerandrade.swplanetapi.core.domain.PlanetDomain;
import dev.wagnerandrade.swplanetapi.core.gateway.PlanetGateway;
import dev.wagnerandrade.swplanetapi.dataprovider.mapper.PlanetMapper;
import dev.wagnerandrade.swplanetapi.dataprovider.repository.PlanetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class PlanetGatewayImpl implements PlanetGateway {
    private final PlanetRepository planetRepository;
    private final PlanetMapper planetMapper;
    @Override
    public PlanetDomain save(PlanetDomain planetDomain) {
        return planetMapper.toDomain(planetRepository.save(planetMapper.toEntity(planetDomain)));
    }

    @Override
    public Page<PlanetDomain> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<PlanetDomain> findById(UUID id) {
        return Optional.empty();
    }
}
