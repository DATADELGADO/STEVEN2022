-- 1. BORRAR UNA BASE DE DATOS SI ESTA EXISTE (NO SE PUEDE BORRAR LA BASE DE DATOS SI ESTA ACTIVA COMO EN ESTE CASO)

-- DROP DATABASE IF EXISTS CAMPUSFP;

-- 2. CREAR UNA BASE DE DATOS (NO SE PUEDE CREAR PORQUE YA EXISTE)

-- CREATE DATABASE CAMPUSFP;

-- 3. CREAR UNA TABLA

DROP TABLE IF EXISTS Alumno;

CREATE TABLE Alumno (
  idAlumno          SERIAL      NOT NULL,
  nombre            VARCHAR(25) NOT NULL,
  apellidos         VARCHAR(50) NOT NULL,
  grupo             VARCHAR(50) NOT NULL,
  fecha_nacimiento  DATE        NOT NULL,
                    PRIMARY KEY (idAlumno)
);
					  
-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SELECT * FROM pg_catalog.pg_tables;

-- 5. MOSTRAR LA ESTRUCTURA DE UNA TABLA

SELECT column_name, data_type, character_maximum_length FROM INFORMATION_SCHEMA.COLUMNS WHERE table_name = 'Alumno';

-- 6. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Alumno (nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Carlos','Ledezma Perez','dam','2000.01.15');
INSERT INTO Alumno (nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Miguel','Ruíz Párraga','daw','2001.02.13');
INSERT INTO Alumno (nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Luis','Goycochea Ruíz','dam','2002.03.18');
INSERT INTO Alumno (nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Carmen','Roncal Jauregui','daw','2000.04.15');
INSERT INTO Alumno (nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Lucho','Diez Rodriguez','dam','2001.10.31');
INSERT INTO Alumno (nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Lucia','Rodriguez Jauregui','dam','2002.03.25');
INSERT INTO Alumno (nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Vanessa','Perez Cuba','daw','2000.12.17');
INSERT INTO Alumno (nombre, apellidos, grupo, fecha_nacimiento) VALUES ('Arturo','Ledezma Perez','dam','2000.10.16');

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Alumno;