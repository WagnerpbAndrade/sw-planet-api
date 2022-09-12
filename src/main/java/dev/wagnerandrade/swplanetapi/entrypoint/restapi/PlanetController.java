package dev.wagnerandrade.swplanetapi.entrypoint.restapi;

import dev.wagnerandrade.swplanetapi.dataprovider.dto.PlanetInDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag( name = "Planetas")
public interface PlanetController {

    @Operation( summary = "creates a new planet")
    @ApiResponse( responseCode = "201", description = "Created" )
    void create(PlanetInDTO planetInDTO);
}
