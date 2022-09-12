-- 1. BORRAR BASE DE DATOS SI ESTA EXISTE

DROP DATABASE IF EXISTS CAMPUSFP1_P;

-- 2. CREAR BASE DE DATOS

CREATE DATABASE CAMPUSFP1_P WITH ENCODING = 'UTF8';

-- 3. USAR BASE DE DATOS

-- USE CAMPUSFP1_P;

-- 4. CREAR TABLA

DROP TABLE IF EXISTS Alumno;

CREATE TABLE Alumno (
  idAlumno          SERIAL      NOT NULL,
  nombre            VARCHAR(25) NOT NULL,
  apellidos         VARCHAR(50) NOT NULL,
  grupo             VARCHAR(50) NOT NULL,
  fechaNacimiento   DATE        NOT NULL,
                    PRIMARY KEY (idAlumno)
);
					  
-- 5. MOSTRAR LAS TABLAS DE LA BASE DE DATOS

-- SHOW TABLES;

-- 6. MOSTRAR LA ESTRUCTURA DE UNA TABLA

-- DESCRIBE Alumno; 

-- 7. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Carlos','Ledezma Perez','dam','2018.01.15');
INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Miguel','Ruíz Párraga','daw','2018.01.20');
INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Luis','Goycochea Ruíz','dam','2018.01.27');
INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Carmen','Roncal Jauregui','daw','2019.02.15');
INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Lucho','Diez Rodriguez','dam','2019.02.25');
INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Lucia','Rodriguez Jauregui','dam','2019.02.26');
INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Vanessa','Perez Cuba','daw','2020.03.01');
INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Arturo','Ledezma Perez','dam','2020.03.04');
INSERT INTO Alumno (nombre, apellidos, grupo, fechaNacimiento) VALUES ('Miguel','Roncal Ledezma','dam','2020.03.10');

-- 8. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Alumno;