package dev.wagnerandrade.swplanetapi.dataprovider.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table ( name = "planet" )
public class PlanetEntity {

    @Id
    @Type ( type = "uuid-char" )
    @GeneratedValue ( generator = " uuid2" )
    @GenericGenerator( name = "uuid2", strategy = "uuid2" )
    private UUID id;

    @Column ( name = "name", nullable = false )
    private String name;

    @Column ( name = "climate", nullable = false )
    private String climate;

    @Column ( name = "terrain", nullable = false )
    private String terrain;

    @Column ( name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}
