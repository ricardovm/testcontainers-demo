CREATE SEQUENCE hibernate_sequence;

CREATE TABLE people (
    id BIGINT NOT NULL,
    name VARCHAR NOT NULL,
    age INTEGER NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE cars (
    id BIGINT NOT NULL,
    model VARCHAR NOT NULL,
    PRIMARY KEY (id)
);