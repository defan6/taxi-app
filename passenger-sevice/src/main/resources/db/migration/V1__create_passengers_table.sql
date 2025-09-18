CREATE TABLE passengers
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(100),
    phone      VARCHAR(20) UNIQUE,
    rating     DECIMAL(2, 1),
    created_at TIMESTAMP
);