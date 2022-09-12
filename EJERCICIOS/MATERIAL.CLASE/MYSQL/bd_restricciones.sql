****************
***   0001   *** DEFAULT
****************

DROP DATABASE IF EXISTS RESTRICCION;
CREATE DATABASE RESTRICCION;

USE RESTRICCION;

CREATE TABLE Tabla (
  idTabla VARCHAR(4)                  NOT NULL,
  campo1  VARCHAR(10)  DEFAULT ''     NOT NULL,
  campo2  DOUBLE(16,2) DEFAULT 0.00   NOT NULL,
  campo3  INT          DEFAULT 0      NOT NULL,
  PRIMARY KEY (idTabla)
);

INSERT INTO Tabla(idTabla) VALUES
('T01'),
('T02'),
('T03'),
('T04'),
('T05');

SELECT * FROM Tabla;

+---------+--------+--------+--------+
| idTabla | campo1 | campo2 | campo3 |
+---------+--------+--------+--------+
| T01     |        |   0.00 |      0 |
| T02     |        |   0.00 |      0 |
| T03     |        |   0.00 |      0 |
| T04     |        |   0.00 |      0 |
| T05     |        |   0.00 |      0 |
+---------+--------+--------+--------+
5 rows in set (0.000 sec)

****************
***   0002   *** CHECK
****************

DROP DATABASE IF EXISTS RESTRICCION;
CREATE DATABASE RESTRICCION;

USE RESTRICCION;

CREATE TABLE Tabla (
  idTabla VARCHAR(4)                  NOT NULL PRIMARY KEY,
  campo1  VARCHAR(10)  DEFAULT ''     NOT NULL,
  campo2  DOUBLE(16,2) DEFAULT 0.00   NOT NULL CHECK (campo2 > 0),
  campo3  INT          DEFAULT 0      NOT NULL CHECK (campo3>=0 AND campo3<=10)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO Tabla(idTabla,campo1,campo2,campo3) VALUES
('T01','Luis',5.1,8),     /*OK*/
('T02','Miugel',5.1,11),  /*ERROR*/
('T01','Luis',-1,8);      /*ERROR*/

SELECT * FROM Tabla;

****************
***   0003   *** UNIQUE
****************

A veces, desea asegurarse de que los valores de una columna o un grupo de columnas sean únicos. Por ejemplo, las direcciones de correo electrónico de los usuarios de la userstabla o los números de teléfono de los clientes de la customerstabla deben ser únicos. Para hacer cumplir esta regla, utiliza una UNIQUErestricción.

Una UNIQUErestricción es una restricción de integridad que garantiza que los valores de una columna o grupo de columnas sean únicos. Una UNIQUErestricción puede ser una restricción de columna o una restricción de tabla.

(1)

DROP DATABASE IF EXISTS RESTRICCION;
CREATE DATABASE RESTRICCION;

USE RESTRICCION;

CREATE TABLE Tabla (
  idTabla VARCHAR(4)                  NOT NULL,
  campo1  VARCHAR(10)  DEFAULT ''     NOT NULL,
  campo2  DOUBLE(16,2) DEFAULT 0.00   NOT NULL,
  campo3  INT          DEFAULT 0      NOT NULL UNIQUE,
  PRIMARY KEY (idTabla)
);

INSERT INTO Tabla(idTabla,campo1,campo2,campo3) VALUES
('T01','Luis',5.1,8),
('T02','Miguel',4.3,8); /*ERROR VALOR DUPLICADO DEBE SER UNICA*/

SELECT * FROM Tabla;

(2)

DROP DATABASE IF EXISTS RESTRICCION;
CREATE DATABASE RESTRICCION;

USE RESTRICCION;

CREATE TABLE Tabla (
  idTabla VARCHAR(4)                  NOT NULL,
  campo1  VARCHAR(10)  DEFAULT ''     NOT NULL,
  campo2  DOUBLE(16,2) DEFAULT 0.00   NOT NULL,
  campo3  INT          DEFAULT 0      NOT NULL UNIQUE,
  PRIMARY KEY (idTabla),
  CONSTRAINT uc_campo1_campo3 UNIQUE (campo1, campo3)
);

INSERT INTO Tabla(idTabla,campo1,campo2,campo3) VALUES
('T01','Luis',5.1,8),
('T02','Luis',4.3,8); /*ERROR VALOR DUPLICADO DEBE SER UNICA*/

INSERT INTO Tabla(idTabla,campo1,campo2,campo3) VALUES
('T01','Luis',5.1,8),
('T02','Luis',4.3,5); /*OK*/

SELECT * FROM Tabla;



