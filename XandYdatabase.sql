DROP TABLE IF EXISTS grades;
CREATE TABLE grades (
	id INT(11) AUTO_INCREMENT PRIMARY KEY,
	subject VARCHAR(255) NOT NULL,
	grade INT(11) NOT NULL
);
INSERT INTO grades (subject, grade) VALUES ('Math', 95), ('Science', 90), ('MAPEH', 85), ('ENGLISH', 88), ('Social Science', 87);
