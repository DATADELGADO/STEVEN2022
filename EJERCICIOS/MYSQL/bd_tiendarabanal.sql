-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS TIENDARABANAL;
CREATE DATABASE TIENDARABANAL;

-- 2. USAR UNA BASE DE DATOS

USE TIENDARABANAL;

-- 3. CREAR UNA TABLA

DROP TABLE IF EXISTS Cliente;
 
CREATE TABLE Cliente(
  codigo    INT          NOT NULL AUTO_INCREMENT,
  nombre    VARCHAR(30)  NOT NULL,
  domicilio VARCHAR(30)  NOT NULL,
            PRIMARY KEY(codigo)
);

DROP TABLE IF EXISTS Factura;

CREATE TABLE Factura(
  numero        INT  NOT NULL,
  fecha         DATE NOT NULL,
  codigocliente INT  NOT NULL,
                PRIMARY KEY(numero)
				-- FOREIGN KEY (codigocliente) REFERENCES Cliente (codigo)
);

DROP TABLE IF EXISTS Detalle;

CREATE TABLE Detalle(
  numerofactura INT           NOT NULL,
  numeroitem    INT           NOT NULL, 
  articulo      VARCHAR(30)   NOT NULL,
  precio        DECIMAL(5,2)  NOT NULL,
  cantidad      INT           NOT NULL,
                PRIMARY KEY(numerofactura,numeroitem)
				-- FOREIGN KEY (numerofactura) REFERENCES Factura (numero) 
);

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE Cliente;
DESCRIBE Factura;
DESCRIBE Detalle;

-- 6. INSERTAR REGISTRO EN UNA TABLA

 INSERT INTO Cliente(nombre,domicilio) VALUES('Juan Lopez','Colon 123');
 INSERT INTO Cliente(nombre,domicilio) VALUES('Luis Torres','Sucre 987');
 INSERT INTO Cliente(nombre,domicilio) VALUES('Ana Garcia','Sarmiento 576');

 INSERT INTO Factura VALUES(1200,'2017-01-15',1);
 INSERT INTO Factura VALUES(1201,'2017-01-15',2);
 INSERT INTO Factura VALUES(1202,'2018-01-15',3);
 INSERT INTO Factura VALUES(1300,'2019-01-20',1);

 INSERT INTO Detalle VALUES(1200,1,'lapiz',1,100);
 INSERT INTO Detalle VALUES(1200,2,'goma',0.5,150);
 INSERT INTO Detalle VALUES(1201,1,'regla',1.5,80);
 INSERT INTO Detalle VALUES(1201,2,'goma',0.5,200);
 INSERT INTO Detalle VALUES(1201,3,'cuaderno',4,90);
 INSERT INTO Detalle VALUES(1202,1,'lapiz',1,200);
 INSERT INTO Detalle VALUES(1202,2,'escuadra',2,100);
 INSERT INTO Detalle VALUES(1300,1,'lapiz',1,300);
 INSERT INTO Detalle VALUES(1300,2,'folio',1,100);

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Cliente;
SELECT * FROM Factura;
SELECT * FROM Detalle;