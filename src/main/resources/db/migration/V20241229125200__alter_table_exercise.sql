-- Limpar data
TRUNCATE TABLE exercise;

ALTER TABLE exercise
MODIFY COLUMN muscle BIGINT;

-- Ajuste para UUID
ALTER TABLE exercise
MODIFY COLUMN exerciseID VARCHAR(36);

ALTER TABLE exercise 
CHANGE COLUMN muscle musclegroupid BIGINT;

ALTER TABLE exercise
ADD CONSTRAINT fk_exercise_musclegroup
FOREIGN KEY (musclegroupid) REFERENCES musclesgroup(musclesgroupid);
