-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS EMPRESAX;
CREATE DATABASE EMPRESAX;

-- 2. USAR UNA BASE DE DATOS

USE EMPRESAX;

-- 3. CREAR UNA TABLA

DROP TABLE IF EXISTS EMPRESAX.Departamento;

CREATE TABLE IF NOT EXISTS EMPRESAX.Departamento (
  numDepartamento VARCHAR(4)  NOT NULL,
  nombre          VARCHAR(20) NOT NULL,
  administrador   INT         NOT NULL,
  fechaInicio     DATE        NOT NULL,
                  PRIMARY KEY (numDepartamento)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS EMPRESAX.Empleado;

CREATE TABLE IF NOT EXISTS EMPRESAX.Empleado (
  dni             INT          NOT NULL,
  nombre          VARCHAR(20)  NOT NULL,
  apellido        VARCHAR(30)  NOT NULL,
  telefono        INT          NOT NULL,
  direccion       VARCHAR(100) NOT NULL,
  sueldo          DOUBLE       NOT NULL,
  sexo            VARCHAR(3)   NOT NULL,
  nacimiento      DATE         NOT NULL,
  numDepartamento VARCHAR(4)   NOT NULL,
                  PRIMARY KEY (dni),
                  FOREIGN KEY (numDepartamento) REFERENCES EMPRESAX.Departamento (numDepartamento)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS EMPRESAX.Proyecto;

CREATE TABLE IF NOT EXISTS EMPRESAX.Proyecto (
  numProyecto     VARCHAR(4)  NOT NULL,
  nombreProyecto  VARCHAR(20) NOT NULL,
  idUbicacion     VARCHAR(4)  NOT NULL,
  numDepartamento VARCHAR(4)  NOT NULL,
                  PRIMARY KEY (numProyecto),
                  FOREIGN KEY (numDepartamento) REFERENCES EMPRESAX.Departamento (numDepartamento)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS EMPRESAX.Subordinado;

CREATE TABLE IF NOT EXISTS EMPRESAX.Subordinado (
  dniJefe               INT         NOT NULL,
  dniSubordinado        INT         NOT NULL,
  nombrePilaSubordinado VARCHAR(20) NOT NULL,
  relacion              VARCHAR(20) NOT NULL,
                        PRIMARY KEY (dniJefe, dniSubordinado),
                        FOREIGN KEY (dniSubordinado) REFERENCES EMPRESAX.Empleado (dni)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS EMPRESAX.Ubicacion;

CREATE TABLE IF NOT EXISTS EMPRESAX.Ubicacion (
  idUbicacion     VARCHAR(4)  NOT NULL,
  via             VARCHAR(10) NOT NULL,
  descripcion     VARCHAR(45) NOT NULL,
  numero          INT         NOT NULL,
  codigoPostal    INT         NOT NULL,
  numDepartamento VARCHAR(4)  NOT NULL,
                  PRIMARY KEY (idUbicacion),
                  FOREIGN KEY (numDepartamento) REFERENCES EMPRESAX.Departamento (numDepartamento)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS EMPRESAX.EmpleadosXproyecto;

CREATE TABLE IF NOT EXISTS EMPRESAX.EmpleadosXproyecto (
  numProyecto       VARCHAR(4) NOT NULL,
  dni               INT        NOT NULL,
  numeroHorasSemana INT        NOT NULL,
                    PRIMARY KEY (numProyecto, dni),
                    FOREIGN KEY (dni) REFERENCES EMPRESAX.Empleado (dni),
                    FOREIGN KEY (numProyecto) REFERENCES EMPRESAX.Proyecto (numProyecto)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE EMPRESAX.Departamento;
DESCRIBE EMPRESAX.Empleado;
DESCRIBE EMPRESAX.Proyecto;
DESCRIBE EMPRESAX.Subordinado;
DESCRIBE EMPRESAX.Ubicacion;
DESCRIBE EMPRESAX.EmpleadosXproyecto;

-- 6. INSERTAR REGISTRO EN UNA TABLA

INSERT INTO Departamento(numDepartamento,nombre,administrador,fechaInicio) VALUES
('D01','Venta',11111111,'2010-01-01'),
('D02','Comercio',22222222,'2011-10-15');

INSERT INTO Empleado(dni,nombre,apellido,telefono,direccion,sueldo,sexo,nacimiento,numDepartamento) VALUES
(11111111,'Arturo','Ruiz',654555432,'C/San Fernando 67',3000,'H','1970-01-10','D01'),
(22222222,'José','Roncal',654994322,'Av/Congosto 134',3000,'H','1975-04-10','D02'),
(33333333,'María','Ledezma',678902344,'C/Cuba 456',1200,'M','1980-09-10','D01'),
(44444444,'Luis','Rabanal',643332453,'Jr/Santa 234',1500,'H','1979-10-11','D01'),
(55555555,'Carmen','Jauregui',645903888,'Av/Ejercito 334',1500,'M','1978-11-12','D02');

INSERT INTO Proyecto(numProyecto,nombreProyecto,idUbicacion,numDepartamento) VALUES
('P01','ZZZZZZZZ','U01','D01'),
('P02','MMMMMMMM','U02','D01'),
('P03','FFFFFFFF','U03','D02'),
('P04','NNNNNNNN','U03','D02');

INSERT INTO Subordinado(dniJefe,dniSubordinado,nombrePilaSubordinado,relacion) VALUES
(11111111,33333333,'María','Asistente'),
(11111111,44444444,'Luis','Soporte'),
(22222222,55555555,'Carmen','Secretaria');

INSERT INTO Ubicacion(idUbicacion,via,descripcion,numero,codigoPostal,numDepartamento) VALUES
('U01','Calle','Guillermo Marconi',123,29023,'D01'),
('U02','Avenida','Ejercito',234,30234,'D01'),
('U03','Calle','América',456,31023,'D02');

INSERT INTO EmpleadosXproyecto(numProyecto,dni,numeroHorasSemana) VALUES
('P01',11111111,25),
('P01',33333333,15),
('P02',33333333,20),
('P02',44444444,25),
('P03',11111111,30),
('P03',55555555,25),
('P04',22222222,30),
('P04',33333333,25);