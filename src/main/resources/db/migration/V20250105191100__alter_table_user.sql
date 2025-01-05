-- Padrão nome
ALTER TABLE user
CHANGE COLUMN userId userID CHAR(36);

-- Ajuste para UUID
ALTER TABLE user
MODIFY COLUMN userID VARCHAR(36);