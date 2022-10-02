package dev.wagnerandrade.swplanetapi.dataprovider.mapper;

import dev.wagnerandrade.swplanetapi.core.domain.PlanetDomain;
import dev.wagnerandrade.swplanetapi.dataprovider.dto.PlanetInDTO;
import dev.wagnerandrade.swplanetapi.dataprovider.dto.PlanetOutDTO;
import dev.wagnerandrade.swplanetapi.dataprovider.entity.PlanetEntity;
import org.mapstruct.Mapper;

@Mapper ( componentModel = "spring")
public interface PlanetMapper {
    PlanetDomain toDomain(PlanetInDTO planetInDTO);

    PlanetOutDTO toDTO(PlanetDomain planetDomain);

    PlanetEntity toEntity(PlanetDomain planetDomain);

    PlanetDomain toDomain(PlanetEntity planetEntity);
}
