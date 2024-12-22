USE database_gymapp;

CREATE TABLE role (
                      roleId INT PRIMARY KEY AUTO_INCREMENT,
                      roleName VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE user (
                      userId INT PRIMARY KEY AUTO_INCREMENT,
                      name VARCHAR(255) NOT NULL,
                      email VARCHAR(255) UNIQUE NOT NULL,
                      password VARCHAR(255) NOT NULL,
                      roleId INT,
                      FOREIGN KEY (roleId) REFERENCES role(roleId)
);

-- Insert roles
INSERT INTO role (roleId, roleName) VALUES (1, 'ADMIN');
INSERT INTO role (roleId, roleName) VALUES (2, 'USER');

-- Insert users
INSERT INTO user (name, email, password, roleId) VALUES ('John Doe', 'john.doe@example.com', 'password123', 1);
INSERT INTO user (name, email, password, roleId) VALUES ('Jane Smith', 'jane.smith@example.com', 'password456', 2);
INSERT INTO user (name, email, password, roleId) VALUES ('Alice Johnson', 'alice.johnson@example.com', 'password789', 2);
INSERT INTO user (name, email, password, roleId) VALUES ('Bob Brown', 'bob.brown@example.com', 'password101', 2);