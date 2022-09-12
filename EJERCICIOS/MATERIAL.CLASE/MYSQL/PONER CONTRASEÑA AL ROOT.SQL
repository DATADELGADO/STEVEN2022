-- PONER UNA CONTRASEÑA AL USURIO ROOT DEL SISTEMA

Hay que darle todos los privilegios al usuario root
Luego decirle que clave es.

GRANT ALL PRIVILEGES ON *.* TO root@'localhost' IDENTIFIED BY '12345678' WITH GRANT OPTION;

-- QUITAR LA CONTRASEÑA

GRANT ALL PRIVILEGES ON *.* TO root@'localhost' IDENTIFIED BY '' WITH GRANT OPTION;

-- CREAR UN USUARIO Y DARLE TODOS LOS PRIVILEGIOS SOBRE UNA BASE DE DATOS.

CREATE USER 'walter'@'localhost' IDENTIFIED via mysql_native_password;
SET password FOR 'walter'@'localhost' = password('12345678');

CREATE USER 'arturo'@'localhost' IDENTIFIED via mysql_native_password;
SET password FOR 'arturo'@'localhost' = password('12345678');

-- CREAR UNA BASE DE DATOS

CREATE DATABASE TIENDA;

-- DARLE TODOS LOS PRIVILEGIOS A WALTER SOBRE LA BASE DE DATOS TIENDA

GRANT ALL PRIVILEGES ON TIENDA.* TO 'walter'@'localhost';


SELECT user FROM mysql.user;

drop user 'arturo'@'localhost';

REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'arturo'@'localhost';

grant insert on BaseDeDatos.Tabla to 'usuario'@'localhost';
revoke insert on BaseDeDatos.Tabla from 'usuario'@'localhost';

CRUD
----
INSERT
UPDATE
DELETE
select


