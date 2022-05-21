DROP TABLE IF EXISTS springboot_demo;

CREATE TABLE employees (
  id            SERIAL PRIMARY KEY,
  name          VARCHAR(15),
  surname       VARCHAR(25),
  department    VARCHAR(20),
  salary        INTEGER
);

INSERT INTO employees (name, surname, department, salary)
VALUES
	('Alex', 'Main', 'IT', 500),
	('Oleg', 'Ivanov', 'Sales', 700),
	('Nina', 'Sidorova', 'HR', 850);