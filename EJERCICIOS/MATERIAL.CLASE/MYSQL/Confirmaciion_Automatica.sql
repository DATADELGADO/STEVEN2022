***********************************
***   CONFIRMACION AUTOMATICA   ***
***********************************

La instrucción COMMIT guarda todas las modificaciones realizadas hasta ese punto donde se pone.
De forma predeterminada, la base de datos MySQL confirma/guarda los cambios realizados automáticamente.
Puede desactivar/activar la confirmación automática mediente la instrucción "SET autoconmmit". Si ponemos "SET autocommit=1" activo la confirmación automática y si pongo "SET autocommit=0" desactivo la confirmación automática y yo con COMMIT digo en que momento se debe guardar los cambios.
La instrucción ROLLBACK revierte los cambios después de la última confirmación.

***********************************
***   CONFIRMACION AUTOMATICA   ***
***********************************

SYSTEM CLS;
DROP DATABASE IF EXISTS CONFIRMACION;
CREATE DATABASE CONFIRMACION DEFAULT CHARACTER SET utf8mb4;
USE CONFIRMACION;

SET autocommit=0;

CREATE TABLE Empleado (
   idEmpleado INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
   nombre     VARCHAR(20) NOT NULL,
   apellido   VARCHAR(30) NOT NULL,
   edad       INT         NOT NULL,
   sexo       VARCHAR(1)  NOT NULL,
   ingreso    FLOAT       NOT NULL
);

-- COMMIT;

INSERT INTO Empleado VALUES
(1,'Luis','Roncal',21,'H',1788.3),
(2,'Miguel','Ledezma',22,'H',1223.5),
(3,'Carlos','Jauregui',23,'H',1934.3),
(4,'María','Alva',24,'M',2023.4);

SELECT * FROM Empleado;

COMMIT;

UPDATE Empleado SET edad = edad + 1;

SELECT * FROM Empleado;

ROLLBACK;

SELECT * FROM Empleado;

************************
***   BIBLIOGRAFIA   ***
************************

https://www.tutorialspoint.com/mysql/mysql_set_autocommit.htm