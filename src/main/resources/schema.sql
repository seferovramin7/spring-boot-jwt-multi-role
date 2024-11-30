CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    role VARCHAR(50) NOT NULL
);

INSERT INTO USERS (username, password, role) VALUES ('user1', '$2a$10$3xBI.S5tzRPGLwUAbgUhqeHpRtKdlH7VIsYC06Meti5KRZDtNWb9O', 'USER');
INSERT INTO USERS (username, password, role) VALUES ('admin', '$2a$10$3xBI.S5tzRPGLwUAbgUhqeHpRtKdlH7VIsYC06Meti5KRZDtNWb9O', 'ADMIN');
