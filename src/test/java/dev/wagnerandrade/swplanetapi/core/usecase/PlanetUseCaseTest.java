package dev.wagnerandrade.swplanetapi.core.usecase;

import dev.wagnerandrade.swplanetapi.core.domain.PlanetDomain;
import dev.wagnerandrade.swplanetapi.core.gateway.PlanetGateway;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith ( MockitoExtension.class )
class PlanetUseCaseTest {

    @InjectMocks
    private PlanetUseCase planetUseCase;

    @Mock
    private PlanetGateway planetGateway;

    @Test
    void createPlanet_withValidData_ReturnsHttpStatusCreated() {
        planetUseCase.newPlanet(PlanetDomain.builder().build());

        verify(planetGateway).save(any(PlanetDomain.class));
    }
}