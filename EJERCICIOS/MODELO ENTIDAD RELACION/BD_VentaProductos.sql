-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS VENTAPRODUCTOS;
CREATE DATABASE VENTAPRODUCTOS;

-- 2. USAR UNA BASE DE DATOS

USE VENTAPRODUCTOS;

-- 3. CREAR UNA TABLA

CREATE TABLE IF NOT EXISTS Proveedor (
  idProveedor INT          NOT NULL AUTO_INCREMENT,
  nombre      VARCHAR(20)  NOT NULL,
  nif         VARCHAR(20)  NOT NULL,
  direccion   VARCHAR(100) NOT NULL,
              PRIMARY KEY (idProveedor),
			  UNIQUE (nif)
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS Producto (
  idProducto      INT          NOT NULL AUTO_INCREMENT,
  idProveedor     INT          NOT NULL,
  nombre          VARCHAR(20)  NOT NULL,
  precio_unitario DOUBLE       NOT NULL,
                  PRIMARY KEY (idProducto)
	              -- FOREIGN KEY (idProveedor) REFERENCES Proveedor (idProveedor)
)ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS Cliente (
  idCliente        INT          NOT NULL AUTO_INCREMENT,
  nombre           VARCHAR(20)  NOT NULL,
  apellidos        VARCHAR(45)  NOT NULL,
  dni              VARCHAR(20)  NOT NULL,
  direccion        VARCHAR(100) NOT NULL,
  fecha_nacimiento DATE NOT NULL,
                   PRIMARY KEY (idCliente),
                   UNIQUE (dni)
)ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS Clientes_x_Producto (
  idProducto  INT  NOT NULL,
  idCliente   INT  NOT NULL,
  fecha       DATE NOT NULL,
              PRIMARY KEY (idProducto, idCliente)
              -- FOREIGN KEY (idProducto) REFERENCES Producto (idProducto),
	          -- FOREIGN KEY (idCliente)  REFERENCES Cliente (idCliente)
)ENGINE = InnoDB;

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE Cliente;
DESCRIBE Factura;
DESCRIBE Detalle;

-- 6. INSERTAR REGISTRO EN UNA TABLA

INSERT INTO Proveedor(nombre,nif,direccion) VALUES('Luis','111111111A','Direccion 1');
INSERT INTO Proveedor(nombre,nif,direccion) VALUES('Marcos','22222222A','Direccion 2');

INSERT INTO Producto(idProveedor,nombre,precio_unitario) VALUES(1,'Lapiz',1.5);
INSERT INTO Producto(idProveedor,nombre,precio_unitario) VALUES(1,'Tajador',1.1);
INSERT INTO Producto(idProveedor,nombre,precio_unitario) VALUES(2,'Cuaderno',1.4);
INSERT INTO Producto(idProveedor,nombre,precio_unitario) VALUES(2,'Borrador',1.2);

INSERT INTO Cliente(nombre,apellidos,dni,direccion,fecha_nacimiento) VALUES('Carlos','Roncal Nuñez','44444444C','Direccion 3','2000-01-10');
INSERT INTO Cliente(nombre,apellidos,dni,direccion,fecha_nacimiento) VALUES('Sandra','Ledezma Ruiz','55555555D','Direccion 4','2001-08-13');
INSERT INTO Cliente(nombre,apellidos,dni,direccion,fecha_nacimiento) VALUES('Miguel','Alva Jauregui','66666666E','Direccion 5','1999-02-21');
 
INSERT INTO Clientes_x_Producto(idProducto,idCliente,fecha) VALUES(1,1,'2021-01-01');
INSERT INTO Clientes_x_Producto(idProducto,idCliente,fecha) VALUES(2,1,'2021-02-02');
INSERT INTO Clientes_x_Producto(idProducto,idCliente,fecha) VALUES(3,1,'2021-03-02');

INSERT INTO Clientes_x_Producto(idProducto,idCliente,fecha) VALUES(3,2,'2021-01-01');
INSERT INTO Clientes_x_Producto(idProducto,idCliente,fecha) VALUES(4,2,'2021-01-01');

INSERT INTO Clientes_x_Producto(idProducto,idCliente,fecha) VALUES(1,3,'2021-01-01');
INSERT INTO Clientes_x_Producto(idProducto,idCliente,fecha) VALUES(4,3,'2021-02-02');

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Proveedor;
SELECT * FROM Producto;
SELECT * FROM Cliente;
SELECT * FROM Clientes_x_Producto;

ALTER TABLE Producto
ADD FOREIGN KEY (idProveedor) REFERENCES Proveedor (idProveedor) ON DELETE CASCADE;

-- FOREIGN KEY (idProveedor) REFERENCES Proveedor (idProveedor)

ALTER TABLE Clientes_x_Producto
ADD FOREIGN KEY (idProducto) REFERENCES Producto (idProducto) ON DELETE CASCADE,
ADD FOREIGN KEY (idCliente)  REFERENCES Cliente (idCliente) ON DELETE CASCADE;

-- FOREIGN KEY (idProducto) REFERENCES Producto (idProducto)
-- FOREIGN KEY (idCliente)  REFERENCES Cliente (idCliente)