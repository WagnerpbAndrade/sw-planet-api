package dev.wagnerandrade.swplanetapi.dataprovider.repository;

import dev.wagnerandrade.swplanetapi.dataprovider.entity.PlanetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PlanetRepository extends JpaRepository<PlanetEntity, Long> {
    Optional<PlanetEntity> findById(UUID id);
}
