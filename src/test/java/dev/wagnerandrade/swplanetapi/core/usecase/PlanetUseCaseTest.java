package dev.wagnerandrade.swplanetapi.core.usecase;

import dev.wagnerandrade.swplanetapi.core.domain.PlanetDomain;
import dev.wagnerandrade.swplanetapi.core.gateway.PlanetGateway;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.UUID;

import static org.mockito.Mockito.*;

@ExtendWith ( MockitoExtension.class )
class PlanetUseCaseTest {

    @InjectMocks
    private PlanetUseCase planetUseCase;

    @Mock
    private PlanetGateway planetGateway;

    @Test
    void createPlanet_withValidData_ReturnsHttpStatusCreated() {
        final PlanetDomain planet = createPlanetDomain();
        when(planetGateway.save(Mockito.any())).thenReturn(planet);

        PlanetDomain sut = planetUseCase.newPlanet(planet);

        Assertions.assertThat(sut.getName())
                .isEqualTo(planet.getName());
    }

    private PlanetDomain createPlanetDomain() {
        return PlanetDomain.builder()
                .id(UUID.randomUUID())
                .climate("Chuvoso")
                .terrain("Arenoso")
                .build();
    }
}