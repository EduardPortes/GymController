CREATE TABLE entities
(
    entitiesID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name       VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO entities (entitiesID, name)
VALUES (1, 'USER'),
       (2, 'EXERCISE');

CREATE TABLE permissions
(
    permissionsID BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    entitiesID    BIGINT NOT NULL,
    name          VARCHAR(255) NOT NULL,
    description   VARCHAR(255),
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (entitiesID) REFERENCES entities(entitiesID)
);

INSERT INTO permissions ( entitiesID, name, description)
VALUES ((SELECT entitiesID FROM entities WHERE name = 'USER'), 'USER_CREATE', 'Permission to create a user'),
       ((SELECT entitiesID FROM entities WHERE name = 'USER'), 'USER_UPDATE', 'Permission to update a user'),
       ((SELECT entitiesID FROM entities WHERE name = 'USER'), 'USER_LIST', 'Permission to list users'),
       ((SELECT entitiesID FROM entities WHERE name = 'USER'), 'USER_DELETE', 'Permission to delete a user');

INSERT INTO permissions (entitiesID, name, description)
VALUES ((SELECT entitiesID FROM entities WHERE name = 'EXERCISE'), 'EXERCISE_CREATE', 'Permission to create an exercise'),
       ((SELECT entitiesID FROM entities WHERE name = 'EXERCISE'), 'EXERCISE_UPDATE', 'Permission to update an exercise'),
       ((SELECT entitiesID FROM entities WHERE name = 'EXERCISE'), 'EXERCISE_LIST', 'Permission to list exercises'),
       ((SELECT entitiesID FROM entities WHERE name = 'EXERCISE'), 'EXERCISE_DELETE', 'Permission to delete an exercise');