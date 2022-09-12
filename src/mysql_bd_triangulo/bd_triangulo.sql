
-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS TRIANGULO;
CREATE DATABASE IF NOT EXISTS TRIANGULO;


-- 2. USAR UNA BASE DE DATOS

USE TRIANGULO;

-- 3. CREAR UNA TABLA

CREATE TABLE IF NOT EXISTS Triangulo (
  idTriangulo INT     NOT NULL AUTO_INCREMENT,
  cateto1     DOUBLE  NOT NULL,
  cateto2     DOUBLE  NOT NULL,
              PRIMARY KEY (idTriangulo)
)ENGINE = InnoDB;

-- 4. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SHOW TABLES;

-- 5. DESCRBIR UNA TABLE

DESCRIBE Triangulo;

-- 6. INSERTAR REGISTRO EN UNA TABLA

-- 7. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Triangulo;
