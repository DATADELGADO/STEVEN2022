-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS ZOOLOGICO;
CREATE DATABASE ZOOLOGICO;

-- 2. USAR UNA BASE DE DATOS

USE ZOOLOGICO;

-- 3. CREAR UNA TABLA

DROP TABLE IF EXISTS Zoologico;

CREATE TABLE Zoologico (
     idZoo       VARCHAR(4)  NOT NULL,
     descripcion VARCHAR(30) NOT NULL,	
     ciudad      VARCHAR(10) NOT NULL,
	 superficie  DOUBLE      NOT NULL,
	 presupuesto DOUBLE      NOT NULL,
	 pais        VARCHAR(10) NOT NULL,
	             PRIMARY KEY(idZoo)
);

DROP TABLE IF EXISTS Especie;

CREATE TABLE Especie (
     idEspecie        VARCHAR(4)  NOT NULL,
     nombreVulgar     VARCHAR(100) NOT NULL,	
     nombreCientifico VARCHAR(100) NOT NULL,
	 familia          VARCHAR(20) NOT NULL,
	 peligroExtinsion BIT         NOT NULL,
	  	              PRIMARY KEY(idEspecie)
);

DROP TABLE IF EXISTS Animal;

CREATE TABLE Animal (
     idAnimal    VARCHAR(4)  NOT NULL,
     nacimiento  DATE        NOT NULL,	
     paisOrigen  VARCHAR(10) NOT NULL,
	 continente  VARCHAR(20) NOT NULL,
	 sexo        CHAR(1)     NOT NULL,
	 idZoo       VARCHAR(4)  NOT NULL,
	 idEspecie   VARCHAR(4)  NOT NULL,
	  	         PRIMARY KEY(idAnimal),
				 FOREIGN KEY (idZoo) REFERENCES Zoologico (idZoo),
                 FOREIGN KEY (idEspecie) REFERENCES Especie (idEspecie)
);

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE Zoologico;
DESCRIBE Especie;
DESCRIBE Animal;

-- 6. INSERTAR REGISTRO EN UNA TABLA

-- Elefante: Kenya, Zimbabwe, Bostswana, Kenya
-- Leon: Angola, Camerún, Kenya
-- Jirafa: Nigeria, Somalia, Etiopía, Zimbabwe, Mozambique
-- Ardilla roja: Italia, Gran Bretaña, Irlanda, España
-- Llama: Perú, Bolivia, Argentina, Chile
-- Guanaco: Perú, Bolivia, Argentina, Chile
-- Oso Panda: China

INSERT INTO Zoologico(idZoo,descripcion,ciudad,superficie,presupuesto,pais) VALUES
('Z01','Faunia','Madrid',10,200000,'España'),
('Z02','Safari Madrid','Madrid',20,300000,'España'),
('Z03','Bioparc','Valencia',30,100000,'España'),
('Z04','MundoParc','Sevilla',20,50000,'España'),
('Z05','Zoologico Cali','Cali',10,200000,'Colombia'),
('Z06','El Pinar','Caracas',40,250000,'Venezuela'),
('Z07','Parque Zoologico Huachipa','Lima',60,150000,'Perú');

INSERT INTO Especie(idEspecie,nombreVulgar,nombreCientifico,familia,peligroExtinsion) VALUES
('E01','Elefante','Elphas maximus','Elephantidae',1),
('E02','Leon','Panthera leo','Felidae',1),
('E03','Jirafa','Giraffa camelopardalis','Giraffidae',1),
('E04','Ardilla roja','Sciurus vulgaris','Sciuridae',0),
('E05','Llama','Lama glama','Camelidae',0),
('E06','Guanaco','Lama guanicoe','Camelidae',0),
('E07','Oso Panda','Ailuropoda melanoleuca','Ursidae',1);

INSERT INTO Animal(idAnimal,nacimiento,paisOrigen,continente,sexo,idZoo,idEspecie) VALUES
('A01','2013-01-01','Kenya','Africa','M','Z01','E01'),
('A02','2014-02-02','Zimbabwe','Africa','H','Z01','E01'),
('A03','2015-03-03','Angola','Africa','M','Z01','E02'),
('A04','2016-04-04','Kenya','Africa','H','Z01','E02'),
('A05','2017-05-05','Etiopía','Africa','M','Z01','E03'),
('A06','2018-06-06','Somalía','Africa','H','Z01','E03'),
('A07','2019-07-07','Italia','Europa','M','Z01','E04'),
('A08','2020-08-08','Irlanda','Europa','H','Z01','E04'),

('A09','2013-01-01','Angola','Africa','M','Z02','E02'),
('A10','2014-02-02','Camerún','Africa','H','Z02','E02'),
('A11','2015-03-03','Etiopía','Africa','M','Z02','E03'),
('A12','2016-04-04','Nigeria','Africa','H','Z02','E03'),
('A13','2017-05-05','Italia','Europa','M','Z02','E04'),
('A14','2018-06-06','Inglaterra','Europa','H','Z02','E04'),

('A15','2012-01-01','Bostswana','Africa','M','Z03','E01'),
('A16','2013-02-02','Kenya','Africa','H','Z03','E01'),
('A17','2014-03-03','Camerún','Africa','M','Z03','E02'),
('A18','2015-04-04','Kenya','Africa','H','Z03','E02'),
('A19','2016-05-05','Etiopía','Africa','M','Z03','E03'),
('A20','2017-06-06','Mozambique','Africa','H','Z03','E03'),

('A21','2012-01-01','Zimbabwe','Africa','M','Z04','E01'),
('A22','2013-02-02','Bostswana','Africa','H','Z04','E01'),
('A23','2014-03-03','Camerún','Africa','M','Z04','E02'),
('A24','2015-04-04','Kenya','Africa','H','Z04','E02'),
('A25','2016-05-05','Zimbabwe','Africa','M','Z04','E03'),
('A26','2017-06-06','Mozambique','Africa','H','Z04','E03'),
('A27','2018-07-07','España','Europa','M','Z04','E04'),
('A28','2019-08-08','Italia','Europa','H','Z04','E04'),

('A29','2013-05-05','Somalía','Africa','M','Z05','E03'),
('A30','2014-06-06','Somalía','Africa','H','Z05','E03'),
('A31','2015-07-07','Italia','Europa','M','Z05','E04'),
('A32','2016-08-08','Italia','Europa','H','Z05','E04'),

('A33','2017-01-01','Zimbabwe','Africa','M','Z06','E01'),
('A34','2017-02-02','Bostswana','Africa','H','Z06','E01'),
('A35','2018-03-03','Perú','América Sur','M','Z06','E05'),
('A36','2018-04-04','Bolivia','América Sur','H','Z06','E05'),
('A37','2019-05-05','Perú','América Sur','M','Z06','E06'),
('A38','2020-06-06','Perú','América Sur','H','Z06','E06'),

('A39','2014-01-01','Zimbabwe','Africa','M','Z07','E01'),
('A40','2015-02-01','Bostswana','Africa','H','Z07','E01'),
('A41','2016-03-01','Perú','América Sur','M','Z07','E05'),
('A42','2017-04-01','Bolivia','América Sur','H','Z07','E05'),
('A43','2018-05-01','Perú','América Sur','M','Z07','E06'),
('A44','2019-06-01','Perú','América Sur','H','Z07','E06'),
('A45','2020-07-01','China','Asia','M','Z07','E07'),
('A46','2021-08-01','China','Asia','H','Z07','E07');

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Zoologico;
SELECT * FROM Especie;
SELECT * FROM Animal;

