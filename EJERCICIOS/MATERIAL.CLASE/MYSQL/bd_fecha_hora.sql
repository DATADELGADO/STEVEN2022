************************
***   FECHA Y HORA   ***
************************

(1) El tipo DATETIME se utiliza para valores que contienen partes de fecha y hora. DATETIME
    tiene un rango admitido de   'YYYY-MM-DD hh:mm:ss''1000-01-01 00:00:00''9999-12-31 23:59:59'

(2) El tipo TIMESTAMP de datos se utiliza para valores que contienen partes de fecha y hora. TIMESTAMP
    tiene un rango admitido de 'YYYY-MM-DD hh:mm:ss''1970-01-01 00:00:01'UTC a '2038-01-19 03:14:07'UTC.

(3) El tipo YEAR(2) y YEAR(4): un año. Su formato es "YYYY" o "YY". Permite valores desde 1901 a 2155
    (en formato de 4 dígitos) y desde 1970 a 2069 (en formato de 2 dígitos).

(4) Si ingresamos los valores como cadenas, un valor entre "00" y "69" es convertido a valores "year"
    en el rango de 2000 a 2069; si el valor está entre "70" y "99", se convierten a valores "year" en el rango 1970 a 1999.

(5) Si ingresamos un valor numérico 0, se convierte en "0000"; entre 1 y 69, se convierte a valores "year"
    entre 2001 a 2069; entre 70 y 99, es convertido a valores "year" de 1970 a 1999.

(6) TIPO    BYTES ALMACENAMIENTO
    DATE		3
    DATETIME	8
    TIME		3
    YEAR		1
	
*************************
***   BASE DE DATOS   ***
*************************

-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS FECHA_HORA_BD;
CREATE DATABASE FECHA_HORA_BD;

-- 2. USAR UNA BASE DE DATOS

USE FECHA_HORA_BD;

-- 3. CREAR UNA TABLA

-- DROP TABLE IF EXISTS Tabla;

CREATE TABLE Tabla (
     idTabla VARCHAR(4)  NOT NULL,
     campo1  DATE        NOT NULL,	-- Parte fecha pero sin parte hora
     campo2  DATETIME    NOT NULL,  -- Parte fecha y hora
	 campo3  TIME        NOT NULL,  -- Parte hora
	 campo4  YEAR(4)     NOT NULL,  -- Parte año YYYY
	 campo5  YEAR(2)     NOT NULL,  -- Parte año YY
	 pais    VARCHAR(10) NOT NULL,
	 PRIMARY KEY(idTabla)
);

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE Tabla;

-- 6. INSERTAR REGISTRO EN UNA TABLA

INSERT INTO Tabla(idTabla,campo1,campo2,campo3,campo4,campo5,pais) VALUES
('T01','2020-03-05','2020-03-05 21:45:30','21:45:30','2020','20','España'),
('T02','20061231','20061231153021','153021','2006','06','España'),
('T03','20061231','20061231153021','8:30','2006','06','España'),
('T04',CURDATE(),'20061231153021','8:30','2006','06','España');

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Tabla;

+---------+------------+---------------------+----------+--------+--------+---------+
| idTabla | campo1     | campo2              | campo3   | campo4 | campo5 | pais    |
+---------+------------+---------------------+----------+--------+--------+---------+
| T01     | 2020-03-05 | 2020-03-05 21:45:30 | 21:45:30 |   2020 |     20 | España  |
| T02     | 2006-12-31 | 2006-12-31 15:30:21 | 15:30:21 |   2006 |     06 | España  |
| T03     | 2006-12-31 | 2006-12-31 15:30:21 | 08:30:00 |   2006 |     06 | España  |
| T04     | 2022-06-22 | 2006-12-31 15:30:21 | 08:30:00 |   2006 |     06 | España  |
+---------+------------+---------------------+----------+--------+--------+---------+
4 rows in set (0.000 sec)

*********************
***   FUNCIONES   ***
*********************

SELECT CURDATE();

+------------+
| CURDATE()  |
+------------+
| 2022-06-22 |
+------------+
1 row in set (0.000 sec)

SELECT DATE_FORMAT(CURDATE(),'%d/%m/%y');

+-----------------------------------+
| DATE_FORMAT(CURDATE(),'%d/%m/%y') |
+-----------------------------------+
| 22/06/22                          |
+-----------------------------------+
1 row in set (0.000 sec)

SELECT DATE_FORMAT(campo1,'%d/%m/%y')
FROM Tabla;

+--------------------------------+
| DATE_FORMAT(campo1,'%d/%m/%y') |
+--------------------------------+
| 05/03/20                       |
| 31/12/06                       |
| 31/12/06                       |
| 22/06/22                       |
+--------------------------------+
4 rows in set (0.000 sec)

SELECT DATE_FORMAT(campo1,'%d/%m/%Y')
FROM Tabla;

+--------------------------------+
| DATE_FORMAT(campo1,'%d/%m/%Y') |
+--------------------------------+
| 05/03/2020                     |
| 31/12/2006                     |
| 31/12/2006                     |
| 22/06/2022                     |
+--------------------------------+
4 rows in set (0.000 sec)

-- DIA DE LA SEMANA

SELECT DAYNAME(CURDATE());

+--------------------+
| DAYNAME(CURDATE()) |
+--------------------+
| Wednesday          |
+--------------------+
1 row in set (0.000 sec)

SELECT DAYNAME(campo1) FROM Tabla;

+-----------------+
| DAYNAME(campo1) |
+-----------------+
| Thursday        |
| Sunday          |
| Sunday          |
| Wednesday       |
+-----------------+
4 rows in set (0.000 sec)

-- DIA DE LA SEMANA EN NUMERO DONDE DOMINGO ES 1

SELECT DAYOFWEEK(CURDATE());

+----------------------+
| DAYOFWEEK(CURDATE()) |
+----------------------+
|                    4 |
+----------------------+
1 row in set (0.000 sec)

SELECT DAYOFWEEK(campo1) FROM Tabla;

+-------------------+
| DAYOFWEEK(campo1) |
+-------------------+
|                 5 |
|                 1 |
|                 1 |
|                 4 |
+-------------------+
4 rows in set (0.000 sec)

-- CUAL ES LA FECHA DENTRO DE 15 DIAS

SELECT DATE_ADD(CURDATE(), INTERVAL 15 DAY);

+--------------------------------------+
| DATE_ADD(CURDATE(), INTERVAL 15 DAY) |
+--------------------------------------+
| 2022-07-07                           |
+--------------------------------------+
1 row in set (0.000 sec)

-- CUAL ES LA FECHA DENTRO DE 2 DIAS

SELECT DATE_ADD(campo1, INTERVAL 2 DAY) FROM Tabla;

+----------------------------------+
| DATE_ADD(campo1, INTERVAL 2 DAY) |
+----------------------------------+
| 2020-03-07                       |
| 2007-01-02                       |
| 2007-01-02                       |
| 2022-06-24                       |
+----------------------------------+
4 rows in set (0.000 sec)

SELECT DATE_FORMAT(DATE_ADD(campo1,INTERVAL 2 DAY) ,'%d/%m/%Y') FROM Tabla;

+----------------------------------------------------------+
| DATE_FORMAT(DATE_ADD(campo1,INTERVAL 2 DAY) ,'%d/%m/%Y') |
+----------------------------------------------------------+
| 07/03/2020                                               |
| 02/01/2007                                               |
| 02/01/2007                                               |
| 24/06/2022                                               |
+----------------------------------------------------------+
4 rows in set (0.000 sec)

