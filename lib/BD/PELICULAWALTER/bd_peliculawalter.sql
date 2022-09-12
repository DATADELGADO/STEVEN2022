-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS PELICULAWALTER;
CREATE DATABASE PELICULAWALTER;

-- 2. USAR UNA BASE DE DATOS

USE PELICULAWALTER;

-- 3. CREAR UNA TABLA

CREATE TABLE IF NOT EXISTS PELICULAWALTER.Actor (
  idActor                    VARCHAR(4)  NOT NULL,
  nombre                     VARCHAR(20) NOT NULL,
  apellido                   VARCHAR(30) NOT NULL,
  cantidadPeliculasParticipo INT         NOT NULL,
                             PRIMARY KEY (idActor)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS PELICULAWALTER.Director (
  idDirector VARCHAR(4) NOT NULL,
  idActor    VARCHAR(4) NOT NULL,
             PRIMARY KEY (idDirector),
             FOREIGN KEY (idActor) REFERENCES PELICULAWALTER.Actor (idActor)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS PELICULAWALTER.Pelicula (
  idPelicula      VARCHAR(5)   NOT NULL,
  titulo          VARCHAR(100) NOT NULL,
  cantidadActores INT          NOT NULL,
  idDirector      VARCHAR(4)   NOT NULL,
                  PRIMARY KEY (idPelicula),
                  FOREIGN KEY (idDirector) REFERENCES PELICULAWALTER.Director (idDirector)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS PELICULAWALTER.Productor (
  idProductor VARCHAR(4)  NOT NULL,
  idDirector  VARCHAR(4)     NULL,
  nombre      VARCHAR(20) NOT NULL,
  apellido    VARCHAR(30) NOT NULL,
              PRIMARY KEY (idProductor),
              FOREIGN KEY (idDirector) REFERENCES PELICULAWALTER.Director (idDirector)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS PELICULAWALTER.ActoresXpelicula (
  idPelicula VARCHAR(5) NOT NULL,
  idActor    VARCHAR(4) NOT NULL,
             PRIMARY KEY (idPelicula, idActor),
             FOREIGN KEY (idActor) REFERENCES PELICULAWALTER.Actor (idActor),
             FOREIGN KEY (idPelicula) REFERENCES PELICULAWALTER.Pelicula (idPelicula)
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS PELICULAWALTER.PeliculasXproductor (
  idProductor VARCHAR(4) NOT NULL,
  idPelicula  VARCHAR(5) NOT NULL,
              PRIMARY KEY (idProductor, idPelicula),
              FOREIGN KEY (idPelicula) REFERENCES PELICULAWALTER.Pelicula (idPelicula),
              FOREIGN KEY (idProductor) REFERENCES PELICULAWALTER.Productor (idProductor)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE IF NOT EXISTS PELICULAWALTER.ProtagonistasXpelicula (
  idProtagonista VARCHAR(4) NOT NULL,
  idPelicula     VARCHAR(5) NOT NULL,
                 PRIMARY KEY (idProtagonista, idPelicula),
                 FOREIGN KEY (idProtagonista) REFERENCES PELICULAWALTER.Actor (idActor),
                 FOREIGN KEY (idPelicula) REFERENCES PELICULAWALTER.Pelicula (idPelicula)
)ENGINE = InnoDB DEFAULT CHARSET=utf8mb4;

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE PELICULAWALTER.Actor;
DESCRIBE PELICULAWALTER.Pelicula;
DESCRIBE PELICULAWALTER.Director;
DESCRIBE PELICULAWALTER.PeliculasXproductor;
DESCRIBE PELICULAWALTER.Productor;
DESCRIBE PELICULAWALTER.ActoresXpelicula;
DESCRIBE PELICULAWALTER.ProtagonistasXpelicula;

-- 6. INSERTAR REGISTRO EN UNA TABLA

INSERT INTO Actor(idActor,nombre,apellido,cantidadPeliculasParticipo) VALUES ('A01','Luis','Rabanal',9);
INSERT INTO Actor(idActor,nombre,apellido,cantidadPeliculasParticipo) VALUES ('A02','Miguel','Rodriguez',7);
INSERT INTO Actor(idActor,nombre,apellido,cantidadPeliculasParticipo) VALUES ('A03','Carlos','Ledezma',8);
INSERT INTO Actor(idActor,nombre,apellido,cantidadPeliculasParticipo) VALUES ('A04','Carmen','Lescano',4);
INSERT INTO Actor(idActor,nombre,apellido,cantidadPeliculasParticipo) VALUES ('A05','Marí','Avila',2);
INSERT INTO Actor(idActor,nombre,apellido,cantidadPeliculasParticipo) VALUES ('A06','Gerson','Cuba',3);

INSERT INTO Director(idDirector,idActor) VALUES ('D01','A01');
INSERT INTO Director(idDirector,idActor) VALUES ('D02','A02');
INSERT INTO Director(idDirector,idActor) VALUES ('D03','A03');
INSERT INTO Director(idDirector,idActor) VALUES ('D04','A04');

INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P254','Tarzan',3,'D01');
INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P145','King Kong',4,'D02');
INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P856','Vengadores',3,'D02');
INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P628','Thor',5,'D03');
INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P852','Iron Man',3,'D03');
INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P624','Hombre Arañ',3,'D03');
INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P851','Hulk',3,'D04');
INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P824','Top Gun',4,'D04');
INSERT INTO Pelicula(idPelicula,titulo,cantidadActores,idDirector) VALUES ('P785','Capitan America',5,'D04');

INSERT INTO Productor(idProductor,idDirector,nombre,apellido) VALUES ('P01','D01','Luis','Rabanal');
INSERT INTO Productor(idProductor,idDirector,nombre,apellido) VALUES ('P02',NULL,'Mateo','Roncal');
INSERT INTO Productor(idProductor,idDirector,nombre,apellido) VALUES ('P03','D03','Carlos','Ledezma');
INSERT INTO Productor(idProductor,idDirector,nombre,apellido) VALUES ('P04','D04','Carmen','Lescano');

INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P254','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P254','A02');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P254','A03');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P145','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P145','A02');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P145','A03');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P145','A06');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P856','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P856','A02');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P856','A03');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P628','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P628','A02');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P628','A03');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P628','A04');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P628','A05');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P852','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P852','A03');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P852','A06');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P624','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P624','A02');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P624','A04');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P851','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P851','A03');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P851','A06');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P824','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P824','A02');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P824','A03');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P824','A04');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P785','A01');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P785','A02');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P785','A03');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P785','A04');
INSERT INTO ActoresXpelicula(idPelicula,idActor) VALUES ('P785','A05');

INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P254','A01');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P254','A02');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P145','A01');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P856','A01');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P856','A02');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P628','A01');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P852','A01');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P852','A03');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P624','A01');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P624','A02');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P851','A01');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P851','A03');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P824','A01');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P824','A02');
INSERT INTO ProtagonistasXpelicula(idPelicula,idProtagonista) VALUES ('P785','A01');

INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P01','P254');
INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P01','P145');
INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P02','P856');
INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P02','P628');
INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P03','P852');
INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P03','P624');
INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P03','P851');
INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P04','P824');
INSERT INTO PeliculasXproductor(idProductor,idPelicula) VALUES ('P04','P785');

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM PELICULAWALTER.Actor;
SELECT * FROM PELICULAWALTER.Pelicula;
SELECT * FROM PELICULAWALTER.Director;
SELECT * FROM PELICULAWALTER.PeliculasXproductor;
SELECT * FROM PELICULAWALTER.Productor;
SELECT * FROM PELICULAWALTER.ActoresXpelicula;
SELECT * FROM PELICULAWALTER.ProtagonistasXpelicula;