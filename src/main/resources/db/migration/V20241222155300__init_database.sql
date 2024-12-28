USE
database_gymapp;

CREATE TABLE user_type
(
    user_typeID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name        VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE user
(
    userId    CHAR(36) PRIMARY KEY,
    name      VARCHAR(255)        NOT NULL,
    email     VARCHAR(255) UNIQUE NOT NULL,
    password  VARCHAR(255)        NOT NULL,
    user_type BIGINT NOT NULL,
    FOREIGN KEY (user_type) REFERENCES user_type (user_typeID)
);

-- Insert roles
INSERT INTO user_type (user_typeID, name)
VALUES (1, 'ADMIN');
INSERT INTO user_type (user_typeID, name)
VALUES (2, 'USER');

-- Insert users
INSERT INTO user (userId, name, email, password, user_type)
VALUES (UUID(), 'John Doe', 'john.doe@example.com', 'password123',
        (SELECT user_typeID FROM user_type WHERE name = 'ADMIN'));
INSERT INTO user (userId, name, email, password, user_type)
VALUES (UUID(), 'Jane Smith', 'jane.smith@example.com', 'password456',
        (SELECT user_typeID FROM user_type WHERE name = 'USER'));
INSERT INTO user (userId, name, email, password, user_type)
VALUES (UUID(), 'Alice Johnson', 'alice.johnson@example.com', 'password789',
        (SELECT user_typeID FROM user_type WHERE name = 'USER'));
INSERT INTO user (userId, name, email, password, user_type)
VALUES (UUID(), 'Bob Brown', 'bob.brown@example.com', 'password101',
        (SELECT user_typeID FROM user_type WHERE name = 'USER'));