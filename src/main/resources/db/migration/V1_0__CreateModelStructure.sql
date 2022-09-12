CREATE TABLE planet (
    id CHAR(36) NOT NULL,
    name VARCHAR(100) NOT NULL,
    climate VARCHAR(100) NOT NULL,
    terrain varchar(100) NOT NULL,
    created_at datetime NOT NULL,
    CONSTRAINT pk_planet PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=latin1;