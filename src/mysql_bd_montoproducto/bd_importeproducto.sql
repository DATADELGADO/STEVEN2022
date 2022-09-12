
-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS importeproducto;
CREATE DATABASE IF NOT EXISTS importeproducto;


-- 2. USAR UNA BASE DE DATOS

USE importeproducto;

-- 3. CREAR UNA TABLA

CREATE TABLE IF NOT EXISTS factura (
    idFactura int not null auto_increment,
    cantidadCajas int not null,
    unidadesxCaja int not null,
    precioxUnidad double not null
                    primary key (idFactura)
)ENGINE = InnoDB;


