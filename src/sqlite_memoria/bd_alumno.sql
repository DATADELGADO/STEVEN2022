CREATE TABLE IF NOT EXISTS Alumno(
  idAlumno INTEGER      NOT NULL PRIMARY KEY AUTOINCREMENT,
  nombre   VARCHAR(20)  NOT NULL,
  edad     INTEGER      NOT NULL
);


INSERT INTO Alumno(nombre,edad) VALUES('LUIS',21);
INSERT INTO Alumno(nombre,edad) VALUES('MIGUEL',23);
INSERT INTO Alumno(nombre,edad) VALUES('CARLOS',22);
INSERT INTO Alumno(nombre,edad) VALUES('MARIA',19);
INSERT INTO Alumno(nombre,edad) VALUES('ARTURO',23);

SELECT * FROM alumno;