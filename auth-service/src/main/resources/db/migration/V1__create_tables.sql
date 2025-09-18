CREATE TABLE auths_passengers
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(100),
    phone      VARCHAR(20) UNIQUE,
    password   VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE auths_drivers
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(100),
    phone      VARCHAR(20) UNIQUE,
    car_model VARCHAR(100),
    car_number VARCHAR(100),
    password   VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);