package dev.wagnerandrade.swplanetapi.entrypoint.restapi;

import dev.wagnerandrade.swplanetapi.core.usecase.PlanetUseCase;
import dev.wagnerandrade.swplanetapi.dataprovider.dto.PlanetInDTO;
import dev.wagnerandrade.swplanetapi.dataprovider.mapper.PlanetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping ( "v1/planets" )
@RequiredArgsConstructor
public class PlanetControllerImpl implements PlanetController {

    private final PlanetUseCase planetUseCase;
    private final PlanetMapper planetMapper;

    @Override
    @PostMapping
    @ResponseStatus ( HttpStatus.CREATED )
    public void create(@RequestBody @Valid final PlanetInDTO planetInDTO) {
        planetUseCase.newPlanet(planetMapper.toDomain(planetInDTO));
    }
}
