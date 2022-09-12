******************
***   TEORIA   ***
******************

* OPERADORES LOGICOS

AND
OR
NOT

* OPERADORES DE COMPARACION

OPERADOR    DESCRIPCION
--------    -----------
=			Igual
<=>			Igual (Compara con seguridad valores NULL)
<>			Diferente
!=			Diferente
>			Mayor Que
>=			Mayor o Igual Que
<			Menor Que
<=			Menor o Igual Que
IN ( )		Valores que Coinciden en una Lista
NOT			Negar una Condición
BETWEEN		Valores en un Rango (incluye los extremos)
IS NULL		Verifica si el Valor es NULL
IS NOT NULL	Verifica si el Valor es diferente de NULL
LIKE		Definir un patrón de búsqueda y utiliza % y _
EXISTS		La condición se cumple si la subconsulta devuelve al menos una fila

* FUNCIONES

COUNT	: CONTAR NUMERO DE FILAS
AVG  	: LA MEDIA DE VALORES
SUM  	: LA SUMA DE VALORES
TRUNCATE :
ROUND    :
MAX      : EL VALOR MAS GRANDE
MIN      : EL VALOR MAS PEQUEÑO

* CRUD

CRUD = OPERACIOBNES BASICAS SOBRE UNA BASE DE DATOS

C = Create (Crear)            
R = Read   (Leer)
U = Update (Actualizar)
D = Delete (Eliminar)


BASES DE DATOS ESTRUCTURADA        BASE DE DATOS NO ESTRUCTURADA
---------------------------        -----------------------------
MODELO ENTIDAD RELACION(SQL)       JSON
SQL SERVER                         MONGODB
ORACLE
POSTGRESQL
SQLITE
MYSQL

MEAN
MONGODB
EXPRESS
ANGULAR (INTERFACES) - TYPESCRIT              (JAVASCRIPT)
NODEJS

*****************
***   INDEX   ***
*****************

0001 : FECHA

	   LOS ANIMALES NACIDOS 2016
       LOS ANIMALES NACIDOS EN EL MES DE ENERO	
       LOS ANIMALES NACIDOS EL 01 DE ENERO
       LOS ANIMALES NACIDOS 2015 O 2018	 
       LOS ANIMALES NACIDOS EL DIA 5 DEL 2016	
       LOS ANIMALES NACIDOS EN CUALQUIER AÑO MENOS EL 2016
	   
0002 : SELECT - WHERE
       
       MOSTRAR TODOS LOS ANIMALES PERTENECIENTES A LA ESPECIE E02
   	   
0003 : OPERADORES LOGICOS

	   MOSTRAR EL NOMBRE VULGAR Y CIENTIFICO DE LA ESPECIE E02
       MOSTRAR TODOS LOS PAISES DE ORIGEN DE DONDE PROCEDE LOS ANIMALES QUE SON LEONES
       MOSTRAR LOS ZOOLOGICOS DONDE PODEMOS ENCONTRAR GUANACOS

0004 : LIKE

       MOSTRAR LOS ZOOLOGICOS CUYA CIUDAD INICIA CON LA LETRA C
       MOSTRAR TODOS LOS NOMBRES VULGAR DE LAS ESPECIES QUE FINALICEN EN "TE"
       MOSTRAR LOS ZOOLOGICOS CUYA CIUDAD TIENE UNA SUBCADENA INTERMERDIA "VI"
       MOSTRAR LA EPECIE QUE INICI CON LA LETRA "L" Y CONTINUE CON SÓLO 3 CARACTERES
       MOSTRAR LA EPECIE QUE INICI CON LA LETRA "L" Y CONTINUE CON AL MENOS 3 CARACTERES
       MOSTRAR LA ESPECIE QUE INICIE CON LA LETRA "L" Y CONTINUE CON SOLO 4 CARARACTERES

0005 : FUNCIONES

       MOSTRAR LA CANTIDAD DE ZOOLOGICOS
       CUANTOS ANIMALES TIENE EL ZOOLOGICO Z01
       CONTAR EL NUMERO DE ANIMALES QUE SON MACHOS
       NUMERO DE PAISES DE ORIGEN DEL ELEFANTE
       MOSTRAR EL PRESUPUESTO MEDIO DE LOS ZOOLOGICOS
       MOSTRAR LA SUMA DEL PRESUPUESTO DE TODOS LOS ZOOLOGICOS

0006 : EXISTS

       MOSTRAR LOS ZOOLOGICOS QUE TENGAN LOS ANIMALES NACIDOS EL 2021
       MOSTRAR LOS ZOOLOGICOS QUE TENGAN LOS ANIMALES NACIDOS EL 2019 O 2020
	   MOSTRAR UNA LISTA DE LAS ESPECIES QUE ESTAN EN LOS ZOOLOGICOS
	   
0007 : GROUP BY

       QUE ESPECIES HAY EN UNA CIUDAD
       CANTIDAD DE ESPECIES EN UNA CIUDAD
       QUE ANIMALES HAY EN UNA CIUDAD
       CANTIDAD DE ANIMALES EN UNA CIUDAD
	   MOSTRAR LA CANTIDAD DE ANIMALES DEL ZOOLOGICO Z01
	   
	   MOSTRAR LA CANTIDAD DE ANIMALES POR PAIS, ORDENADO DE MANERA ASCENTENDE POR LA CANTIDAD DE ANIMALES
	   MOSTRAR LA CANTIDAD DE ANIMALES POR CONTINENTE
	   MOSTRAR LA CANTIDAD DE ANIMALES POR SEXO
	   MOSTRAR LA CANTIDAD DE ANIMALES QUE SON ELEFANTES
	   MOSTRAR LA CANTIDAD DE ANIMALES POR CADA ESPECIE
	   MOSTRAR LA ESPECIE CON LA MAYOR CANTIDAD DE ANIMALES
	   MOSTRAR LA CANTIDAD DE ANIMALES DE CADA SEXO
	   CUANTOS LEONES SON MACHOS Y CUANTOS HEMBRAS
	   
0008 : SUBCONSULTAS

       QUISIERA SABER EL ZOOLOGICO CON EL MAYOR PRESUPUESTO
       QUISIERA SABER QUE ZOOLOGICOS SOBREPASAN LA MEDIA DEL PRESUPUESTO DE TODOS LOS ZOOLOGICOS
       QUISIERA SABER EL ZOOLOGICO CON EL PRESUPUESTO DISTINTO AL MAXIMO DE TODOS LOS ZOOLOGICOS

0009 : LIMIT

       MOSTRAR LOS DOS ULTIMOS PRESUPUESTOS MAS ALTOS

0010 : BETWEEN

       QUISIERA MOSTRAR LOS ZOOLOGICOS CUYO PRESUPUESTO ESTE ENTRE UN RANGO [200000,250000]

0011 : IN

       MOSTRAR EL PRESUPUETO DE LOS ZOOLOGICOS Z01, Z07

0012 : NOT

       MOSTRAR TODOS LOS ANIMALES NO NACIDOS EN EL AÑO 2016

0013 : IS NULL

       MOSTRAR TODOS LOS REGISTROS CUYO CAMPO PRESUPUESTO NO TENGA NINGUN VALOR

0014 : IS NOT NULL

       MOSTRAR TODOS LOS REGISTROS CUYO CAMPO PRESUPUESTO TIENEN UN VALOR
	   
0015 : HAVING

       CUANTOS ANIMALES TIENE EL ZOOLOGICO FAUNIA
       MOSTRAR LA CANTIDAD DE ANIMALES POR PAIS, ORDENADO DE MANERA ASCENTENDE POR LA CANTIDAD DE ANIMALES.    DEBE MOSTRAR AQUELLOS GRUPOS DONDE LA CANTIDAD DE ANIMALES SEA SUPERIOR A 5
       MOSTRAR EL CONTINENTE CON LA MAYOR CANTIDAD DE ANIMALES
       MOSTRAR LA CANTIDAD DE ANIMALES POR FAMILIA	   

****************
***   0001   *** FECHA
****************

-- LOS ANIMALES NACIDOS EN EL AÑO 2016

SELECT * FROM Animal WHERE YEAR(nacimiento) = 2016;

+----------+------------+------------+-------------+------+-------+-----------+
| idAnimal | nacimiento | paisOrigen | continente  | sexo | idZoo | idEspecie |
+----------+------------+------------+-------------+------+-------+-----------+
| A04      | 2016-04-04 | Kenya      | Africa      | H    | Z01   | E02       |
| A12      | 2016-04-04 | Nigeria    | Africa      | H    | Z02   | E03       |
| A19      | 2016-05-05 | Etiopía    | Africa      | M    | Z03   | E03       |
| A25      | 2016-05-05 | Zimbabwe   | Africa      | M    | Z04   | E03       |
| A32      | 2016-08-08 | Italia     | Europa      | H    | Z05   | E04       |
| A41      | 2016-03-03 | Perú       | América Su  | M    | Z07   | E05       |
+----------+------------+------------+-------------+------+-------+-----------+
6 rows in set (0.000 sec)

-- LOS ANIMALES NACIDOS EN EL MES DE ENERO

SELECT * FROM Animal WHERE MONTH(nacimiento) = 01;

+----------+------------+------------+------------+------+-------+-----------+
| idAnimal | nacimiento | paisOrigen | continente | sexo | idZoo | idEspecie |
+----------+------------+------------+------------+------+-------+-----------+
| A01      | 2013-01-01 | Kenya      | Africa     | M    | Z01   | E01       |
| A09      | 2013-01-01 | Angola     | Africa     | M    | Z02   | E02       |
| A15      | 2012-01-01 | Bostswana  | Africa     | M    | Z03   | E01       |
| A21      | 2012-01-01 | Zimbabwe   | Africa     | M    | Z04   | E01       |
| A33      | 2017-01-01 | Zimbabwe   | Africa     | M    | Z06   | E01       |
| A39      | 2014-01-01 | Zimbabwe   | Africa     | M    | Z07   | E01       |
+----------+------------+------------+------------+------+-------+-----------+
6 rows in set (0.000 sec)

-- LOS ANIMALES NACIDOS EL DIA 01 DE ENERO

SELECT * FROM Animal WHERE DAY(nacimiento) = 01 AND MONTH(nacimiento) = 01;

+----------+------------+------------+------------+------+-------+-----------+
| idAnimal | nacimiento | paisOrigen | continente | sexo | idZoo | idEspecie |
+----------+------------+------------+------------+------+-------+-----------+
| A01      | 2013-01-01 | Kenya      | Africa     | M    | Z01   | E01       |
| A09      | 2013-01-01 | Angola     | Africa     | M    | Z02   | E02       |
| A15      | 2012-01-01 | Bostswana  | Africa     | M    | Z03   | E01       |
| A21      | 2012-01-01 | Zimbabwe   | Africa     | M    | Z04   | E01       |
| A33      | 2017-01-01 | Zimbabwe   | Africa     | M    | Z06   | E01       |
| A39      | 2014-01-01 | Zimbabwe   | Africa     | M    | Z07   | E01       |
+----------+------------+------------+------------+------+-------+-----------+
6 rows in set (0.000 sec)

-- LOS ANIMALES NACIDOS 2015 O 2018

SELECT * FROM Animal WHERE YEAR(nacimiento)=2015 OR YEAR(nacimiento)=2018;

+----------+------------+------------+-------------+------+-------+-----------+
| idAnimal | nacimiento | paisOrigen | continente  | sexo | idZoo | idEspecie |
+----------+------------+------------+-------------+------+-------+-----------+
| A03      | 2015-03-03 | Angola     | Africa      | M    | Z01   | E02       |
| A06      | 2018-06-06 | Somalía    | Africa      | H    | Z01   | E03       |
| A11      | 2015-03-03 | Etiopía    | Africa      | M    | Z02   | E03       |
| A18      | 2015-04-04 | Kenya      | Africa      | H    | Z03   | E02       |
| A24      | 2015-04-04 | Kenya      | Africa      | H    | Z04   | E02       |
| A27      | 2018-07-07 | España     | Europa      | M    | Z04   | E04       |
| A31      | 2015-07-07 | Italia     | Europa      | M    | Z05   | E04       |
| A35      | 2018-03-03 | Perú       | América Su  | M    | Z06   | E05       |
| A36      | 2018-04-04 | Bolivia    | América Su  | H    | Z06   | E05       |
| A40      | 2015-02-01 | Bostswana  | Africa      | H    | Z07   | E01       |
| A43      | 2018-05-01 | Perú       | América Su  | M    | Z07   | E06       |
+----------+------------+------------+-------------+------+-------+-----------+
11 rows in set (0.000 sec)

-- LOS ANIMALES NACIDOS EL DIA 5 DEL 2016

SELECT * FROM Animal WHERE DAY(nacimiento)=5 AND YEAR(nacimiento)=2016;

+----------+------------+------------+------------+------+-------+-----------+
| idAnimal | nacimiento | paisOrigen | continente | sexo | idZoo | idEspecie |
+----------+------------+------------+------------+------+-------+-----------+
| A19      | 2016-05-05 | Etiopía    | Africa     | M    | Z03   | E03       |
| A25      | 2016-05-05 | Zimbabwe   | Africa     | M    | Z04   | E03       |
+----------+------------+------------+------------+------+-------+-----------+
2 rows in set (0.000 sec)

-- LOS ANIMALES NACIDOS EN CUALQUIER AÑO MENOS EL 2016

SELECT * FROM Animal WHERE NOT YEAR(nacimiento)= 2016;

+----------+------------+------------+-------------+------+-------+-----------+
| idAnimal | nacimiento | paisOrigen | continente  | sexo | idZoo | idEspecie |
+----------+------------+------------+-------------+------+-------+-----------+
| A01      | 2013-01-01 | Kenya      | Africa      | M    | Z01   | E01       |
| A02      | 2014-02-02 | Zimbabwe   | Africa      | H    | Z01   | E01       |
| A03      | 2015-03-03 | Angola     | Africa      | M    | Z01   | E02       |
| A05      | 2017-05-05 | Etiopía    | Africa      | M    | Z01   | E03       |
| A06      | 2018-06-06 | Somalía    | Africa      | H    | Z01   | E03       |
| A07      | 2019-07-07 | Italia     | Europa      | M    | Z01   | E04       |
| A08      | 2020-08-08 | Irlanda    | Europa      | H    | Z01   | E04       |
| A09      | 2013-01-01 | Angola     | Africa      | M    | Z02   | E02       |
| A10      | 2014-02-02 | Camerún    | Africa      | H    | Z02   | E02       |
| A11      | 2015-03-03 | Etiopía    | Africa      | M    | Z02   | E03       |
| A13      | 2017-05-05 | Italia     | Europa      | M    | Z02   | E04       |
| A14      | 2028-06-06 | Inglaterra | Europa      | H    | Z02   | E04       |
| A15      | 2012-01-01 | Bostswana  | Africa      | M    | Z03   | E01       |
| A16      | 2013-02-02 | Kenya      | Africa      | H    | Z03   | E01       |
| A17      | 2014-03-03 | Camerún    | Africa      | M    | Z03   | E02       |
| A18      | 2015-04-04 | Kenya      | Africa      | H    | Z03   | E02       |
| A20      | 2017-06-06 | Mozambique | Africa      | H    | Z03   | E03       |
| A21      | 2012-01-01 | Zimbabwe   | Africa      | M    | Z04   | E01       |
| A22      | 2013-02-02 | Bostswana  | Africa      | H    | Z04   | E01       |
| A23      | 2014-03-03 | Camerún    | Africa      | M    | Z04   | E02       |
| A24      | 2015-04-04 | Kenya      | Africa      | H    | Z04   | E02       |
| A26      | 2017-06-06 | Mozambique | Africa      | H    | Z04   | E03       |
| A27      | 2018-07-07 | España     | Europa      | M    | Z04   | E04       |
| A28      | 2019-08-08 | Italia     | Europa      | H    | Z04   | E04       |
| A29      | 2013-05-05 | Somalía    | Africa      | M    | Z05   | E03       |
| A30      | 2014-06-06 | Somalía    | Africa      | H    | Z05   | E03       |
| A31      | 2015-07-07 | Italia     | Europa      | M    | Z05   | E04       |
| A33      | 2017-01-01 | Zimbabwe   | Africa      | M    | Z06   | E01       |
| A34      | 2017-02-02 | Bostswana  | Africa      | H    | Z06   | E01       |
| A35      | 2018-03-03 | Perú       | América Su  | M    | Z06   | E05       |
| A36      | 2018-04-04 | Bolivia    | América Su  | H    | Z06   | E05       |
| A37      | 2019-05-05 | Perú       | América Su  | M    | Z06   | E06       |
| A38      | 2020-06-06 | Perú       | América Su  | H    | Z06   | E06       |
| A39      | 2014-01-01 | Zimbabwe   | Africa      | M    | Z07   | E01       |
| A40      | 2015-02-01 | Bostswana  | Africa      | H    | Z07   | E01       |
| A42      | 2017-04-01 | Bolivia    | América Su  | H    | Z07   | E05       |
| A43      | 2018-05-01 | Perú       | América Su  | M    | Z07   | E06       |
| A44      | 2019-06-01 | Perú       | América Su  | H    | Z07   | E06       |
| A45      | 2020-07-01 | China      | Asia        | M    | Z07   | E07       |
| A46      | 2021-08-01 | China      | Asia        | H    | Z07   | E07       |
+----------+------------+------------+-------------+------+-------+-----------+
40 rows in set (0.000 sec)

****************
***   0002   *** SELECT - WHERE
****************

* SELECT : Indica las columnas a mostrarse
* WHERE  : Indica las filas a mostrarse

-- MOSTRAR TODOS LOS ANIMALES PERTENECIENTES A LA ESPECIE E02

SELECT * FROM Animal WHERE idEspecie = 'E02';

+----------+------------+------------+------------+------+-------+-----------+
| idAnimal | nacimiento | paisOrigen | continente | sexo | idZoo | idEspecie |
+----------+------------+------------+------------+------+-------+-----------+
| A03      | 2015-03-03 | Angola     | Africa     | M    | Z01   | E02       |
| A04      | 2016-04-04 | Kenya      | Africa     | H    | Z01   | E02       |
| A09      | 2013-01-01 | Angola     | Africa     | M    | Z02   | E02       |
| A10      | 2014-02-02 | Camerún    | Africa     | H    | Z02   | E02       |
| A17      | 2014-03-03 | Camerún    | Africa     | M    | Z03   | E02       |
| A18      | 2015-04-04 | Kenya      | Africa     | H    | Z03   | E02       |
| A23      | 2014-03-03 | Camerún    | Africa     | M    | Z04   | E02       |
| A24      | 2015-04-04 | Kenya      | Africa     | H    | Z04   | E02       |
+----------+------------+------------+------------+------+-------+-----------+
8 rows in set (0.000 sec)

****************
***   0003   *** OPERADORES LOGICOS
****************

-- MOSTRAR EL NOMBRE VULGAR Y CIENTIFICO DE LA ESPECIE E02

SELECT a.idAnimal,e.nombreVulgar,e.nombreCientifico FROM Animal a,Especie e WHERE a.idEspecie = e.idEspecie AND a.idEspecie = 'E02';

+----------+--------------+------------------+
| idAnimal | nombreVulgar | nombreCientifico |
+----------+--------------+------------------+
| A03      | Leon         | Panthera leo     |
| A04      | Leon         | Panthera leo     |
| A09      | Leon         | Panthera leo     |
| A10      | Leon         | Panthera leo     |
| A17      | Leon         | Panthera leo     |
| A18      | Leon         | Panthera leo     |
| A23      | Leon         | Panthera leo     |
| A24      | Leon         | Panthera leo     |
+----------+--------------+------------------+
8 rows in set (0.000 sec)

-- MOSTRAR TODOS LOS PAISES DE ORIGEN DE DONDE PROCEDE LOS ANIMALES QUE SON LEONES

SELECT DISTINCT a.paisOrigen FROM Especie e, Animal a WHERE a.idEspecie=e.idEspecie AND nombreVulgar='Leon';

+------------+
| paisOrigen |
+------------+
| Angola     |
| Kenya      |
| Camerún    |
+------------+
3 rows in set (0.000 sec)

-- MOSTRAR LOS ZOOLOGICOS DONDE PODEMOS ENCONTRAR GUANACOS

SELECT DISTINCT z.idZoo, z.descripcion
FROM Especie e, Animal a, Zoologico z
WHERE e.idEspecie=a.idEspecie AND z.idZoo=a.idZoo AND e.nombreVulgar='Guanaco';

+-------+---------------------------+
| idZoo | descripcion               |
+-------+---------------------------+
| Z06   | El Pinar                  |
| Z07   | Parque Zoologico Huachipa |
+-------+---------------------------+
2 rows in set (0.000 sec)

****************
***   0004   *** LIKE
****************

-- MOSTRAR LOS ZOOLOGICOS CUYA CIUDAD INICIA CON LA LETRA "C"

SELECT idZoo, descripcion, ciudad
FROM Zoologico
WHERE ciudad LIKE 'C%';

+-------+----------------+---------+
| idZoo | descripcion    | ciudad  |
+-------+----------------+---------+
| Z05   | Zoologico Cali | Cali    |
| Z06   | El Pinar       | Caracas |
+-------+----------------+---------+
2 rows in set (0.000 sec)

-- MOSTRAR TODOS LOS NOMBRES VULGAR DE LAS ESPECIES QUE FINALICEN EN "TE"

SELECT idEspecie, nombreVulgar
FROM Especie
WHERE nombreVulgar LIKE '%te';

+-----------+--------------+
| idEspecie | nombreVulgar |
+-----------+--------------+
| E01       | Elefante     |
+-----------+--------------+
1 row in set (0.000 sec)

-- MOSTRAR LOS ZOOLOGICOS CUYA CIUDAD TIENE UNA SUBCADENA INTERMERDIA "VI"

SELECT idZoo, descripcion, ciudad
FROM Zoologico
WHERE ciudad LIKE '%vi%';

+-------+-------------+---------+
| idZoo | descripcion | ciudad  |
+-------+-------------+---------+
| Z04   | MundoParc   | Sevilla |
+-------+-------------+---------+
1 row in set (0.000 sec)

-- MOSTRAR LA EPECIE QUE INICI CON LA LETRA "L" Y CONTINUE CON SÓLO 3 CARACTERES

SELECT nombreVulgar 
FROM Especie
WHERE nombreVulgar LIKE 'L___';

+-----------+--------------+
| idEspecie | nombreVulgar |
+-----------+--------------+
| E02       | Leon         |
+-----------+--------------+
1 row in set (0.000 sec)

-- MOSTRAR LA EPECIE QUE INICI CON LA LETRA "L" Y CONTINUE CON AL MENOS 3 CARACTERES

SELECT nombreVulgar 
FROM Especie
WHERE nombreVulgar LIKE 'L___%';

+--------------+
| nombreVulgar |
+--------------+
| Leon         |
| Llama        |
+--------------+
2 rows in set (0.000 sec)

-- MOSTRAR LA ESPECIE QUE INICIE CON LA LETRA "L" Y CONTINUE CON SOLO 4 CARARACTERES

SELECT nombreVulgar 
FROM Especie
WHERE nombreVulgar LIKE 'L____';

+--------------+
| nombreVulgar |
+--------------+
| Llama        |
+--------------+
1 row in set (0.000 sec)

****************
***   0005   *** FUNCIONES
****************

-- MOSTRAR LA CANTIDAD DE ZOOLOGICOS

SELECT COUNT(*) FROM Zoologico;
SELECT COUNT(idZoo) FROM Zoologico;

+----------+
| COUNT(*) |
+----------+
|        7 |
+----------+
1 row in set (0.000 sec)

SELECT COUNT(*) AS NUMERO_ZOOLOGICOS FROM Zoologico;

+-------------------+
| NUMERO_ZOOLOGICOS |
+-------------------+
|                 7 |
+-------------------+
1 row in set (0.001 sec)

-- CUANTOS ANIMALES TIENE EL ZOOLOGICO Z01

SELECT * FROM Animal  WHERE idZoo='Z01';

SELECT COUNT(*) FROM Animal  WHERE idZoo='Z01';

-- CONTAR EL NUMERO DE ANIMALES QUE SON MACHOS

(1)

SELECT * FROM Animal WHERE sexo='M';

SELECT COUNT(*) FROM Animal WHERE sexo='M';

(2)

SELECT idAnimal FROM Animal WHERE sexo='M';

SELECT COUNT(idAnimal) FROM Animal WHERE sexo='M';
   
-- NUMERO DE PAISES DE ORIGEN DEL ELEFANTE

SELECT DISTINCT a.paisOrigen FROM Animal a, Especie e WHERE a.idEspecie=e.idEspecie AND nombreVulgar='Elefante';

SELECT COUNT(DISTINCT a.paisOrigen) AS NUMERO_PAISES FROM Animal a, Especie e WHERE a.idEspecie=e.idEspecie AND nombreVulgar='Elefante';

+---------------+
| NUMERO_PAISES |
+---------------+
|             3 |
+---------------+
1 row in set (0.001 sec)

-- MOSTRAR EL PRESUPUESTO MEDIO DE LOS ZOOLOGICOS

SELECT idZoo,presupuesto FROM Zoologico;

SELECT AVG(presupuesto) AS MEDIA_PRESUPUESTO FROM Zoologico;

+--------------------+
| MEDIA_PRESUPUESTO  |
+--------------------+
| 178571.42857142858 |
+--------------------+
1 row in set (0.002 sec)

SELECT TRUNCATE(AVG(presupuesto),2) AS MEDIA_PRESUPUESTO FROM Zoologico;

+-------------------+
| MEDIA_PRESUPUESTO |
+-------------------+
|         178571.42 |
+-------------------+
1 row in set (0.002 sec)

SELECT ROUND(AVG(presupuesto),2) AS MEDIA_PRESUPUESTO FROM Zoologico;

+-------------------+
| MEDIA_PRESUPUESTO |
+-------------------+
|         178571.43 |
+-------------------+
1 row in set (0.002 sec)

-- MOSTRAR LA SUMA DEL PRESUPUESTO DE TODOS LOS ZOOLOGICOS

SELECT presupuesto FROM Zoologico;

SELECT SUM(presupuesto) AS SUMA_PRESUPUESTO FROM Zoologico;

+------------------+
| SUMA_PRESUPUESTO |
+------------------+
|          1250000 |
+------------------+
1 row in set (0.002 sec)

****************
***   0006   *** EXISTS
****************

-- MOSTRAR LOS ZOOLOGICOS QUE TENGAN LOS ANIMALES NACIDOS EL 2021

SELECT idZoo, descripcion
FROM Zoologico z
WHERE EXISTS (SELECT *
FROM Animal a
WHERE z.idZoo=a.idZoo AND YEAR(a.nacimiento) = 2021);

SELECT idZoo, descripcion
FROM Zoologico z
WHERE EXISTS (SELECT a.idZoo
FROM Animal a
WHERE z.idZoo=a.idZoo AND YEAR(a.nacimiento) = 2021);

SELECT a.idZoo, z.descripcion
FROM Animal a, Zoologico z
WHERE z.idZoo=a.idZoo AND YEAR(a.nacimiento) = 2021;

+-------+---------------------------+
| idZoo | descripcion               |
+-------+---------------------------+
| Z07   | Parque Zoologico Huachipa |
+-------+---------------------------+
1 row in set (0.000 sec)

-- MOSTRAR LOS ZOOLOGICOS QUE TENGAN LOS ANIMALES NACIDOS EL 2019 O 2020

SELECT idZoo, descripcion
FROM Zoologico z
WHERE EXISTS (SELECT a.idZoo
FROM Animal a
WHERE z.idZoo=a.idZoo AND (YEAR(a.nacimiento) = 2019 OR YEAR(a.nacimiento) = 2020));

* En la subconsulta obtengo los animales nacidos el 2019 o 2020
* Luego con exists saco la idZoo y descripción de los que encuentro en la subconsulta

+-------+---------------------------+
| idZoo | descripcion               |
+-------+---------------------------+
| Z01   | Faunia                    |
| Z04   | MundoParc                 |
| Z06   | El Pinar                  |
| Z07   | Parque Zoologico Huachipa |
+-------+---------------------------+
4 rows in set (0.002 sec)

-- MOSTRAR UNA LISTA DE LAS ESPECIES QUE ESTAN EN LOS ZOOLOGICOS

SELECT DISTINCT e.idEspecie, e.nombreVulgar
FROM Especie e
WHERE EXISTS (SELECT a.idEspecie, a.idAnimal FROM Animal a WHERE a.idEspecie=e.idEspecie );

+-----------+--------------+
| idEspecie | nombreVulgar |
+-----------+--------------+
| E01       | Elefante     |
| E02       | Leon         |
| E03       | Jirafa       |
| E04       | Ardilla roja |
| E05       | Llama        |
| E06       | Guanaco      |
| E07       | Oso Panda    |
+-----------+--------------+
7 rows in set (0.001 sec)

****************
***   0007   *** GROUP BY
****************

-- QUE ESPECIES HAY EN UNA CIUDAD

SELECT z.ciudad,a.idEspecie
FROM Zoologico z, Animal a
WHERE z.idZoo=a.idZoo
GROUP BY z.ciudad,a.idEspecie;

+----------+-----------+
| ciudad   | idEspecie |
+----------+-----------+
| Cali     | E03       |
| Cali     | E04       |
| Caracas  | E01       |
| Caracas  | E05       |
| Caracas  | E06       |
| Lima     | E01       |
| Lima     | E05       |
| Lima     | E06       |
| Lima     | E07       |
| Madrid   | E01       |
| Madrid   | E02       |
| Madrid   | E03       |
| Madrid   | E04       |
| Sevilla  | E01       |
| Sevilla  | E02       |
| Sevilla  | E03       |
| Sevilla  | E04       |
| Valencia | E01       |
| Valencia | E02       |
| Valencia | E03       |
+----------+-----------+
20 rows in set (0.001 sec)

SELECT z.ciudad,a.idEspecie,e.nombreVulgar
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND e.idEspecie=a.idEspecie
GROUP BY z.ciudad,a.idEspecie;

+----------+-----------+--------------+
| ciudad   | idEspecie | nombreVulgar |
+----------+-----------+--------------+
| Cali     | E03       | Jirafa       |
| Cali     | E04       | Ardilla roja |
| Caracas  | E01       | Elefante     |
| Caracas  | E05       | Llama        |
| Caracas  | E06       | Guanaco      |
| Lima     | E01       | Elefante     |
| Lima     | E05       | Llama        |
| Lima     | E06       | Guanaco      |
| Lima     | E07       | Oso Panda    |
| Madrid   | E01       | Elefante     |
| Madrid   | E02       | Leon         |
| Madrid   | E03       | Jirafa       |
| Madrid   | E04       | Ardilla roja |
| Sevilla  | E01       | Elefante     |
| Sevilla  | E02       | Leon         |
| Sevilla  | E03       | Jirafa       |
| Sevilla  | E04       | Ardilla roja |
| Valencia | E01       | Elefante     |
| Valencia | E02       | Leon         |
| Valencia | E03       | Jirafa       |
+----------+-----------+--------------+
20 rows in set (0.009 sec)

-- CANTIDAD DE ESPECIES EN UNA CIUDAD

SELECT z.ciudad,COUNT(DISTINCT z.ciudad, a.idEspecie)
FROM Zoologico z, Animal a
WHERE z.idZoo=a.idZoo
GROUP BY z.ciudad;

+----------+---------------------------------------+
| ciudad   | COUNT(DISTINCT z.ciudad, a.idEspecie) |
+----------+---------------------------------------+
| Cali     |                                     2 |
| Caracas  |                                     3 |
| Lima     |                                     4 |
| Madrid   |                                     4 |
| Sevilla  |                                     4 |
| Valencia |                                     3 |
+----------+---------------------------------------+
6 rows in set (0.001 sec)

-- QUE ANIMALES HAY EN UNA CIUDAD

SELECT z.ciudad,a.idAnimal
FROM Zoologico z, Animal a
WHERE z.idZoo=a.idZoo
GROUP BY z.ciudad,a.idAnimal;

+----------+----------+
| ciudad   | idAnimal |
+----------+----------+
| Cali     | A29      |
| Cali     | A30      |
| Cali     | A31      |
| Cali     | A32      |
| Caracas  | A33      |
| Caracas  | A34      |
| Caracas  | A35      |
| Caracas  | A36      |
| Caracas  | A37      |
| Caracas  | A38      |
| Lima     | A39      |
| Lima     | A40      |
| Lima     | A41      |
| Lima     | A42      |
| Lima     | A43      |
| Lima     | A44      |
| Lima     | A45      |
| Lima     | A46      |
| Madrid   | A01      |
| Madrid   | A02      |
| Madrid   | A03      |
| Madrid   | A04      |
| Madrid   | A05      |
| Madrid   | A06      |
| Madrid   | A07      |
| Madrid   | A08      |
| Madrid   | A09      |
| Madrid   | A10      |
| Madrid   | A11      |
| Madrid   | A12      |
| Madrid   | A13      |
| Madrid   | A14      |
| Sevilla  | A21      |
| Sevilla  | A22      |
| Sevilla  | A23      |
| Sevilla  | A24      |
| Sevilla  | A25      |
| Sevilla  | A26      |
| Sevilla  | A27      |
| Sevilla  | A28      |
| Valencia | A15      |
| Valencia | A16      |
| Valencia | A17      |
| Valencia | A18      |
| Valencia | A19      |
| Valencia | A20      |
+----------+----------+
46 rows in set (0.001 sec)

SELECT z.ciudad,a.idAnimal, e.nombreVulgar
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND e.idEspecie=a.idEspecie
GROUP BY z.ciudad,a.idAnimal;

+----------+----------+--------------+
| ciudad   | idAnimal | nombreVulgar |
+----------+----------+--------------+
| Cali     | A29      | Jirafa       |
| Cali     | A30      | Jirafa       |
| Cali     | A31      | Ardilla roja |
| Cali     | A32      | Ardilla roja |
| Caracas  | A33      | Elefante     |
| Caracas  | A34      | Elefante     |
| Caracas  | A35      | Llama        |
| Caracas  | A36      | Llama        |
| Caracas  | A37      | Guanaco      |
| Caracas  | A38      | Guanaco      |
| Lima     | A39      | Elefante     |
| Lima     | A40      | Elefante     |
| Lima     | A41      | Llama        |
| Lima     | A42      | Llama        |
| Lima     | A43      | Guanaco      |
| Lima     | A44      | Guanaco      |
| Lima     | A45      | Oso Panda    |
| Lima     | A46      | Oso Panda    |
| Madrid   | A01      | Elefante     |
| Madrid   | A02      | Elefante     |
| Madrid   | A03      | Leon         |
| Madrid   | A04      | Leon         |
| Madrid   | A05      | Jirafa       |
| Madrid   | A06      | Jirafa       |
| Madrid   | A07      | Ardilla roja |
| Madrid   | A08      | Ardilla roja |
| Madrid   | A09      | Leon         |
| Madrid   | A10      | Leon         |
| Madrid   | A11      | Jirafa       |
| Madrid   | A12      | Jirafa       |
| Madrid   | A13      | Ardilla roja |
| Madrid   | A14      | Ardilla roja |
| Sevilla  | A21      | Elefante     |
| Sevilla  | A22      | Elefante     |
| Sevilla  | A23      | Leon         |
| Sevilla  | A24      | Leon         |
| Sevilla  | A25      | Jirafa       |
| Sevilla  | A26      | Jirafa       |
| Sevilla  | A27      | Ardilla roja |
| Sevilla  | A28      | Ardilla roja |
| Valencia | A15      | Elefante     |
| Valencia | A16      | Elefante     |
| Valencia | A17      | Leon         |
| Valencia | A18      | Leon         |
| Valencia | A19      | Jirafa       |
| Valencia | A20      | Jirafa       |
+----------+----------+--------------+
46 rows in set (0.001 sec)

-- CANTIDAD DE ANIMALES EN UNA CIUDAD

SELECT z.ciudad,COUNT(a.idAnimal)
FROM Zoologico z, Animal a
WHERE z.idZoo=a.idZoo
GROUP BY z.ciudad;

+----------+-------------------+
| ciudad   | COUNT(a.idAnimal) |
+----------+-------------------+
| Cali     |                 4 |
| Caracas  |                 6 |
| Lima     |                 8 |
| Madrid   |                14 |
| Sevilla  |                 8 |
| Valencia |                 6 |
+----------+-------------------+
6 rows in set (0.001 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES DEL ZOOLOGICO Z01

SELECT idZoo, COUNT(*)
FROM Animal
WHERE idZoo='Z01'
GROUP BY idZoo;

+-------+----------+
| idZoo | COUNT(*) |
+-------+----------+
| Z01   |        8 |
+-------+----------+
1 row in set (0.000 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES POR PAIS, ORDENADO DE MANERA ASCENTENDE POR LA CANTIDAD DE ANIMALES.

SELECT paisOrigen, COUNT(*)
FROM Animal
GROUP BY paisOrigen

+------------+----------+
| paisOrigen | COUNT(*) |
+------------+----------+
| Angola     |        2 |
| Bolivia    |        2 |
| Bostswana  |        4 |
| Camerún    |        3 |
| China      |        2 |
| España     |        1 |
| Etiopía    |        3 |
| Inglaterra |        1 |
| Irlanda    |        1 |
| Italia     |        5 |
| Kenya      |        5 |
| Mozambique |        2 |
| Nigeria    |        1 |
| Perú       |        6 |
| Somalía    |        3 |
| Zimbabwe   |        5 |
+------------+----------+
16 rows in set (0.001 sec)

SELECT paisOrigen, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal
GROUP BY paisOrigen
ORDER BY CANTIDAD_ANIMALES ASC;

+------------+-------------------+
| paisOrigen | CANTIDAD_ANIMALES |
+------------+-------------------+
| Inglaterra |                 1 |
| Irlanda    |                 1 |
| España     |                 1 |
| Nigeria    |                 1 |
| Bolivia    |                 2 |
| China      |                 2 |
| Mozambique |                 2 |
| Angola     |                 2 |
| Somalía    |                 3 |
| Camerún    |                 3 |
| Etiopía    |                 3 |
| Bostswana  |                 4 |
| Kenya      |                 5 |
| Italia     |                 5 |
| Zimbabwe   |                 5 |
| Perú       |                 6 |
+------------+-------------------+
16 rows in set (0.000 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES POR CONTINENTE

SELECT continente, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal
GROUP BY continente;

+-------------+-------------------+
| continente  | CANTIDAD_ANIMALES |
+-------------+-------------------+
| Africa      |                28 |
| América Su  |                 8 |
| Asia        |                 2 |
| Europa      |                 8 |
+-------------+-------------------+
4 rows in set (0.000 sec)

SELECT COUNT(continente) AS CANTIDAD FROM Animal GROUP BY continente ORDER BY CANTIDAD DESC LIMIT 1;

+----------+
| CANTIDAD |
+----------+
|       28 |
+----------+
1 row in set (0.000 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES POR SEXO

SELECT SEXO, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal
GROUP BY sexo;

+------+-------------------+
| SEXO | CANTIDAD_ANIMALES |
+------+-------------------+
| H    |                23 |
| M    |                23 |
+------+-------------------+
2 rows in set (0.048 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES QUE SON ELEFANTES

SELECT e.nombreVulgar, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal a, Especie e
WHERE a.idEspecie=e.idEspecie AND e.nombreVulgar='Elefante'
GROUP BY e.nombreVulgar;

+--------------+-------------------+
| nombreVulgar | CANTIDAD_ANIMALES |
+--------------+-------------------+
| Elefante     |                10 |
+--------------+-------------------+
1 row in set (0.009 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES POR CADA ESPECIE

SELECT e.nombreVulgar, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal a, Especie e
WHERE a.idEspecie=e.idEspecie
GROUP BY e.nombreVulgar;

+--------------+-------------------+
| nombreVulgar | CANTIDAD_ANIMALES |
+--------------+-------------------+
| Ardilla roja |                 8 |
| Elefante     |                10 |
| Guanaco      |                 4 |
| Jirafa       |                10 |
| Leon         |                 8 |
| Llama        |                 4 |
| Oso Panda    |                 2 |
+--------------+-------------------+
7 rows in set (0.001 sec)

-- MOSTRAR LA ESPECIE CON LA MAYOR CANTIDAD DE ANIMALES

SELECT e.nombreVulgar, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal a, Especie e
WHERE a.idEspecie=e.idEspecie
GROUP BY e.nombreVulgar
ORDER BY CANTIDAD_ANIMALES DESC
LIMIT 1;

+--------------+-------------------+
| nombreVulgar | CANTIDAD_ANIMALES |
+--------------+-------------------+
| Jirafa       |                10 |
+--------------+-------------------+
1 row in set (0.001 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES DE CADA SEXO

SELECT sexo AS SEXO, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal
GROUP BY sexo;

+------+-------------------+
| SEXO | CANTIDAD_ANIMALES |
+------+-------------------+
| H    |                23 |
| M    |                23 |
+------+-------------------+
2 rows in set (0.000 sec)

-- CUANTOS LEONES SON MACHOS Y CUANTOS HEMBRAS

SELECT a.sexo AS SEXO, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal a, Especie e
WHERE a.idEspecie=e.idEspecie AND e.nombreVulgar='Leon'
GROUP BY a.sexo;

+------+-------------------+
| SEXO | CANTIDAD_ANIMALES |
+------+-------------------+
| H    |                 4 |
| M    |                 4 |
+------+-------------------+
2 rows in set (0.001 sec)

****************
***   0008   *** SUBCONSULTAS
****************

-- QUISIERA SABER EL ZOOLOGICO CON EL MAYOR PRESUPUESTO
                                                             300 000
SELECT idZoo,presupuesto FROM Zoologico WHERE presupuesto = (SELECT MAX(presupuesto) FROM Zoologico);

+-------+-------------+
| idZoo | presupuesto |
+-------+-------------+
| Z02   |      300000 |
+-------+-------------+
1 row in set (0.000 sec)

-- QUISIERA SABER QUE ZOOLOGICOS SOBREPASAN LA MEDIA DEL PRESUPUESTO DE TODOS LOS ZOOLOGICOS

SELECT idZoo,presupuesto FROM Zoologico WHERE presupuesto >= (SELECT AVG(presupuesto) FROM Zoologico);

-- QUISIERA SABER EL ZOOLOGICO CON EL PRESUPUESTO DISTINTO AL MAXIMO DE TODOS LOS ZOOLOGICOS

SELECT idZoo,presupuesto FROM Zoologico WHERE presupuesto != (SELECT MAX(presupuesto) FROM Zoologico);

+-------+-------------+
| idZoo | presupuesto |
+-------+-------------+
| Z01   |      200000 |
| Z03   |      100000 |
| Z04   |       50000 |
| Z05   |      200000 |
| Z06   |      250000 |
| Z07   |      150000 |
+-------+-------------+
6 rows in set (0.002 sec)

****************
***   0009   *** LIMIT
****************

* ORDER BY: CLAUSULA PARA ORDENAR 

-- MOSTRAR LOS DOS ULTIMOS PRESUPUESTOS MAS ALTOS

SELECT idZoo, presupuesto FROM Zoologico;

SELECT idZoo, presupuesto FROM Zoologico ORDER BY presupuesto DESC LIMIT 2;

+-------+-------------+
| idZoo | presupuesto |
+-------+-------------+
| Z02   |      300000 |
| Z06   |      250000 |
+-------+-------------+
2 rows in set (0.000 sec)

****************
***   0010   *** BETWEEN
****************

-- QUISIERA MOSTRAR LOS ZOOLOGICOS CUYO PRESUPUESTO ESTE ENTRE UN RANGO [200000,250000]

SELECT idZoo,presupuesto FROM Zoologico WHERE presupuesto BETWEEN 200000 AND 250000;

+-------+-------------+
| idZoo | presupuesto |
+-------+-------------+
| Z01   |      200000 |
| Z05   |      200000 |
| Z06   |      250000 |
+-------+-------------+
3 rows in set (0.002 sec)

****************
***   0011   *** IN
****************

-- MOSTRAR EL PRESUPUETO DE LOS ZOOLOGICOS Z01, Z07

SELECT * FROM Zoologico WHERE idZoo IN ('Z01','Z07');

SELECT * FROM Zoologico WHERE idZoo='Z01' OR  idZoo='Z07';

+-------+---------------------------+--------+------------+-------------+---------+
| idZoo | descripcion               | ciudad | superficie | presupuesto | pais    |
+-------+---------------------------+--------+------------+-------------+---------+
| Z01   | Faunia                    | Madrid |         10 |      200000 | España  |
| Z07   | Parque Zoologico Huachipa | Lima   |         60 |      150000 | Perú    |
+-------+---------------------------+--------+------------+-------------+---------+
2 rows in set (0.002 sec)

****************
***   0012   *** NOT
****************

-- MOSTRAR TODOS LOS ANIMALES NO NACIDOS EN EL AÑO 2016

SELECT * FROM Animal WHERE NOT YEAR(nacimiento) = 2016 ORDER BY nacimiento ASC;

SELECT * FROM Animal WHERE YEAR(nacimiento) != 2016 ORDER BY nacimiento ASC;

+----------+------------+------------+-------------+------+-------+-----------+
| idAnimal | nacimiento | paisOrigen | continente  | sexo | idZoo | idEspecie |
+----------+------------+------------+-------------+------+-------+-----------+
| A21      | 2012-01-01 | Zimbabwe   | Africa      | M    | Z04   | E01       |
| A15      | 2012-01-01 | Bostswana  | Africa      | M    | Z03   | E01       |
| A01      | 2013-01-01 | Kenya      | Africa      | M    | Z01   | E01       |
| A09      | 2013-01-01 | Angola     | Africa      | M    | Z02   | E02       |
| A22      | 2013-02-02 | Bostswana  | Africa      | H    | Z04   | E01       |
| A16      | 2013-02-02 | Kenya      | Africa      | H    | Z03   | E01       |
| A29      | 2013-05-05 | Somalía    | Africa      | M    | Z05   | E03       |
| A39      | 2014-01-01 | Zimbabwe   | Africa      | M    | Z07   | E01       |
| A02      | 2014-02-02 | Zimbabwe   | Africa      | H    | Z01   | E01       |
| A10      | 2014-02-02 | Camerún    | Africa      | H    | Z02   | E02       |
| A23      | 2014-03-03 | Camerún    | Africa      | M    | Z04   | E02       |
| A17      | 2014-03-03 | Camerún    | Africa      | M    | Z03   | E02       |
| A30      | 2014-06-06 | Somalía    | Africa      | H    | Z05   | E03       |
| A40      | 2015-02-01 | Bostswana  | Africa      | H    | Z07   | E01       |
| A11      | 2015-03-03 | Etiopía    | Africa      | M    | Z02   | E03       |
| A03      | 2015-03-03 | Angola     | Africa      | M    | Z01   | E02       |
| A24      | 2015-04-04 | Kenya      | Africa      | H    | Z04   | E02       |
| A18      | 2015-04-04 | Kenya      | Africa      | H    | Z03   | E02       |
| A31      | 2015-07-07 | Italia     | Europa      | M    | Z05   | E04       |
| A33      | 2017-01-01 | Zimbabwe   | Africa      | M    | Z06   | E01       |
| A34      | 2017-02-02 | Bostswana  | Africa      | H    | Z06   | E01       |
| A42      | 2017-04-01 | Bolivia    | América Su  | H    | Z07   | E05       |
| A13      | 2017-05-05 | Italia     | Europa      | M    | Z02   | E04       |
| A05      | 2017-05-05 | Etiopía    | Africa      | M    | Z01   | E03       |
| A20      | 2017-06-06 | Mozambique | Africa      | H    | Z03   | E03       |
| A26      | 2017-06-06 | Mozambique | Africa      | H    | Z04   | E03       |
| A35      | 2018-03-03 | Perú       | América Su  | M    | Z06   | E05       |
| A36      | 2018-04-04 | Bolivia    | América Su  | H    | Z06   | E05       |
| A43      | 2018-05-01 | Perú       | América Su  | M    | Z07   | E06       |
| A06      | 2018-06-06 | Somalía    | Africa      | H    | Z01   | E03       |
| A14      | 2018-06-06 | Inglaterra | Europa      | H    | Z02   | E04       |
| A27      | 2018-07-07 | España     | Europa      | M    | Z04   | E04       |
| A37      | 2019-05-05 | Perú       | América Su  | M    | Z06   | E06       |
| A44      | 2019-06-01 | Perú       | América Su  | H    | Z07   | E06       |
| A07      | 2019-07-07 | Italia     | Europa      | M    | Z01   | E04       |
| A28      | 2019-08-08 | Italia     | Europa      | H    | Z04   | E04       |
| A38      | 2020-06-06 | Perú       | América Su  | H    | Z06   | E06       |
| A45      | 2020-07-01 | China      | Asia        | M    | Z07   | E07       |
| A08      | 2020-08-08 | Irlanda    | Europa      | H    | Z01   | E04       |
| A46      | 2021-08-01 | China      | Asia        | H    | Z07   | E07       |
+----------+------------+------------+-------------+------+-------+-----------+
40 rows in set (0.000 sec)

SELECT nacimiento,idAnimal FROM Animal WHERE YEAR(nacimiento) != 2016 ORDER BY YEAR(nacimiento) ASC,idAnimal DESC;

+------------+----------+
| nacimiento | idAnimal |
+------------+----------+
| 2012-01-01 | A21      |
| 2012-01-01 | A15      |
| 2013-05-05 | A29      |
| 2013-02-02 | A22      |
| 2013-02-02 | A16      |
| 2013-01-01 | A09      |
| 2013-01-01 | A01      |
| 2014-01-01 | A39      |
| 2014-06-06 | A30      |
| 2014-03-03 | A23      |
| 2014-03-03 | A17      |
| 2014-02-02 | A10      |
| 2014-02-02 | A02      |
| 2015-02-01 | A40      |
| 2015-07-07 | A31      |
| 2015-04-04 | A24      |
| 2015-04-04 | A18      |
| 2015-03-03 | A11      |
| 2015-03-03 | A03      |
| 2017-04-01 | A42      |
| 2017-02-02 | A34      |
| 2017-01-01 | A33      |
| 2017-06-06 | A26      |
| 2017-06-06 | A20      |
| 2017-05-05 | A13      |
| 2017-05-05 | A05      |
| 2018-05-01 | A43      |
| 2018-04-04 | A36      |
| 2018-03-03 | A35      |
| 2018-07-07 | A27      |
| 2018-06-06 | A14      |
| 2018-06-06 | A06      |
| 2019-06-01 | A44      |
| 2019-05-05 | A37      |
| 2019-08-08 | A28      |
| 2019-07-07 | A07      |
| 2020-07-01 | A45      |
| 2020-06-06 | A38      |
| 2020-08-08 | A08      |
| 2021-08-01 | A46      |
+------------+----------+
40 rows in set (0.001 sec)

****************
***   0013   *** IS NULL
****************

-- MOSTRAR TODOS LOS REGISTROS CUYO CAMPO PRESUPUESTO NO TENGA NINGUN VALOR

SELECT * FROM Zoologico WHERE presupuesto IS NULL;

****************
***   0014   *** IS NOT NULL
****************

-- MOSTRAR TODOS LOS REGISTROS CUYO CAMPO PRESUPUESTO TIENEN UN VALOR

SELECT * FROM Zoologico WHERE presupuesto IS NOT NULL;

+-------+---------------------------+----------+------------+-------------+-----------+
| idZoo | descripcion               | ciudad   | superficie | presupuesto | pais      |
+-------+---------------------------+----------+------------+-------------+-----------+
| Z01   | Faunia                    | Madrid   |         10 |      200000 | España    |
| Z02   | Safari Madrid             | Madrid   |         20 |      300000 | España    |
| Z03   | Bioparc                   | Valencia |         30 |      100000 | España    |
| Z04   | MundoParc                 | Sevilla  |         20 |       50000 | España    |
| Z05   | Zoologico Cali            | Cali     |         10 |      200000 | Colombia  |
| Z06   | El Pinar                  | Caracas  |         40 |      250000 | Venezuela |
| Z07   | Parque Zoologico Huachipa | Lima     |         60 |      150000 | Perú      |
+-------+---------------------------+----------+------------+-------------+-----------+
7 rows in set (0.000 sec)

****************
***   0015   *** HAVING
****************

-- CUANTOS ANIMALES TIENE EL ZOOLOGICO FAUNIA

SELECT z.idZoo, z.descripcion, COUNT(z.idZoo)
FROM Zoologico z, Animal a
WHERE z.idZoo=a.idZoo AND z.descripcion='Faunia'
GROUP BY z.idZoo
HAVING COUNT(z.idZoo);

+-------+-------------+----------------+
| idZoo | descripcion | COUNT(z.idZoo) |
+-------+-------------+----------------+
| Z01   | Faunia      |              8 |
+-------+-------------+----------------+
1 row in set (0.002 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES POR PAIS, ORDENADO DE MANERA ASCENTENDE POR LA CANTIDAD DE ANIMALES.
   DEBE MOSTRAR AQUELLOS GRUPOS DONDE LA CANTIDAD DE ANIMALES SEA SUPERIOR A 5

SELECT paisOrigen, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal
GROUP BY paisOrigen
HAVING COUNT(*) > 5
ORDER BY CANTIDAD_ANIMALES ASC;

+------------+-------------------+
| paisOrigen | CANTIDAD_ANIMALES |
+------------+-------------------+
| Perú       |                 6 |
+------------+-------------------+
1 row in set (0.001 sec)

-- MOSTRAR EL CONTINENTE CON LA MAYOR CANTIDAD DE ANIMALES

SELECT continente, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal
GROUP BY continente
HAVING COUNT(*) = (SELECT COUNT(continente) FROM Animal GROUP BY continente LIMIT 1);

SELECT continente, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal
GROUP BY continente
HAVING COUNT(*) = (SELECT COUNT(continente) AS CANTIDAD FROM Animal GROUP BY continente ORDER BY CANTIDAD DESC LIMIT 1);

+------------+-------------------+
| continente | CANTIDAD_ANIMALES |
+------------+-------------------+
| Africa     |                28 |
+------------+-------------------+
1 row in set (0.001 sec)

-- MOSTRAR LOS ANIMALES QUE TIENE MAYOR CANTIDAD DE EJEMPLARES

SELECT e.nombreVulgar, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal a, Especie e
WHERE a.idEspecie=e.idEspecie
GROUP BY e.nombreVulgar
HAVING CANTIDAD_ANIMALES = (SELECT COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal a, Especie e
WHERE a.idEspecie=e.idEspecie
GROUP BY e.nombreVulgar
ORDER BY CANTIDAD_ANIMALES DESC
LIMIT 1);

+--------------+-------------------+
| nombreVulgar | CANTIDAD_ANIMALES |
+--------------+-------------------+
| Elefante     |                10 |
| Jirafa       |                10 |
+--------------+-------------------+
2 rows in set (0.003 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES POR FAMILIA

SELECT e.familia, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal a, Especie e
WHERE a.idEspecie=e.idEspecie
GROUP BY e.familia;

-- MOSTRAR LA CANTIDAD DE ESPECIES POR FAMILIA

SELECT familia, COUNT(*) AS CANTIDAD_ESPECIES
FROM Especie
GROUP BY familia;

+--------------+-------------------+
| familia      | CANTIDAD_ESPECIES |
+--------------+-------------------+
| Camelidae    |                 2 |
| Elephantidae |                 1 |
| Felidae      |                 1 |
| Giraffidae   |                 1 |
| Sciuridae    |                 1 |
| Ursidae      |                 1 |
| XXXXX        |                 1 |
+--------------+-------------------+
7 rows in set (0.000 sec)

-- MOSTRAR LA FAMILIA QUE TIENE MAS ESPECIES

SELECT familia, COUNT(*) AS CANTIDAD_ESPECIES
FROM Especie
GROUP BY familia
HAVING CANTIDAD_ESPECIES = (SELECT COUNT(*) AS CANTIDAD_ESPECIES
FROM Especie
GROUP BY familia
ORDER BY CANTIDAD_ESPECIES DESC
LIMIT 1);

+-----------+-------------------+
| familia   | CANTIDAD_ESPECIES |
+-----------+-------------------+
| Camelidae |                 2 |
+-----------+-------------------+
1 row in set (0.001 sec)

-- MOSTRAR LOS ZOOLOGICOS CUYA SUPERFICIE SEA SUPERIOR A LA MEDIA DE TODOS LOS ZOOLOGICOS.

SELECT *
FROM Zoologico
WHERE superficie > (SELECT AVG(superficie) AS MEDIA FROM Zoologico);

****************************
***   PREGUNTAS VARIAS   ***
****************************

-- MOSTRAR LOS ZOOLOGICOS DONDE PODEMOS ENCONTRAR GUANACOS

SELECT DISTINCT z.idZoo, z.descripcion,z.ciudad,z.pais
FROM Animal a, Especie e, Zoologico z
WHERE a.idEspecie=e.idEspecie AND z.idZoo=a.idZoo AND e.nombreVulgar='Guanaco';

+-------+---------------------------+---------+-----------+
| idZoo | descripcion               | ciudad  | pais      |
+-------+---------------------------+---------+-----------+
| Z06   | El Pinar                  | Caracas | Venezuela |
| Z07   | Parque Zoologico Huachipa | Lima    | Perú      |
+-------+---------------------------+---------+-----------+
2 rows in set (0.001 sec)

-- MOSTRAR LOS ZOOLOGICOS DONDE PODEMOS ENCONTRAR LA ESPECIE OSO PANDA

SELECT DISTINCT z.idZoo, z.descripcion,z.ciudad,z.pais
FROM Animal a, Especie e, Zoologico z
WHERE a.idEspecie=e.idEspecie AND z.idZoo=a.idZoo AND e.nombreVulgar='Oso Panda';

+-------+---------------------------+--------+-------+
| idZoo | descripcion               | ciudad | pais  |
+-------+---------------------------+--------+-------+
| Z07   | Parque Zoologico Huachipa | Lima   | Perú  |
+-------+---------------------------+--------+-------+
1 row in set (0.001 sec)

NOTA

SELECT DISTINCT z.idZoo, z.descripcion,z.ciudad,z.pais,a.sexo
FROM Animal a, Especie e, Zoologico z
WHERE a.idEspecie=e.idEspecie AND z.idZoo=a.idZoo AND e.nombreVulgar='Oso Panda';

+-------+---------------------------+--------+-------+------+
| idZoo | descripcion               | ciudad | pais  | sexo |
+-------+---------------------------+--------+-------+------+
| Z07   | Parque Zoologico Huachipa | Lima   | Perú  | M    |
| Z07   | Parque Zoologico Huachipa | Lima   | Perú  | H    |
+-------+---------------------------+--------+-------+------+
2 rows in set (0.001 sec)

-- EN BASE A LA PREGUNTA ANTERIIOR, QUIERO SABER EN CUANTOS ZOOLOGICOS SE ENCUENTRA LA ESPECIE OSO PANDA.

SELECT COUNT(DISTINCT z.idZoo) AS NUMEROS_ZOOLOGICOS
FROM Animal a, Especie e, Zoologico z
WHERE a.idEspecie=e.idEspecie AND z.idZoo=a.idZoo AND e.nombreVulgar='Oso Panda';

SELECT COUNT(z.idZoo) AS NUMEROS_ZOOLOGICOS
FROM Animal a, Especie e, Zoologico z
WHERE a.idEspecie=e.idEspecie AND z.idZoo=a.idZoo AND e.nombreVulgar='Oso Panda' AND a.sexo = 'M';

+--------------------+
| NUMEROS_ZOOLOGICOS |
+--------------------+
|                  1 |
+--------------------+
1 row in set (0.001 sec)

-- CUANTOS ANIMALES TIENE EL ZOOLOGICO FAUNIA

SELECT z.idZoo, z.descripcion, COUNT(idAnimal) AS CANTIDAD_ANIMALES
FROM Zoologico z, animal a
WHERE z.idZoo=a.idZoo AND z.descripcion='FAUNIA';

+-------+-------------+-------------------+
| idZoo | descripcion | CANTIDAD_ANIMALES |
+-------+-------------+-------------------+
| Z01   | Faunia      |                 8 |
+-------+-------------+-------------------+
1 row in set (0.000 sec)

-- MOSTRAR LOS PAISES DE ORIGEN DEL GUANACO

SELECT DISTINCT a.paisOrigen
FROM Especie e, Animal a
WHERE a.idEspecie=e.idEspecie AND e.nombreVulgar='Guanaco';

+------------+
| paisOrigen |
+------------+
| Perú       |
+------------+
1 row in set (0.000 sec)

-- MOSTRAR EL NOMBRE DEL ZOOLOGICO QUE TENGAN MAYOR CANTIDAD DE ANIMALES EN PELIGRO DE EXTINSION.

SELECT a.idZoo, z.descripcion, COUNT(*) AS CANTIDAD_ANIMALES
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo = a.idZoo AND a.idEspecie = e.idEspecie AND e.peligroExtinsion = 1
GROUP BY a.idZoo
HAVING CANTIDAD_ANIMALES = (SELECT COUNT(*) AS CANTIDAD_ANIMALES
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo = a.idZoo AND a.idEspecie = e.idEspecie AND e.peligroExtinsion = 1
GROUP BY a.idZoo
ORDER BY CANTIDAD_ANIMALES DESC
LIMIT 1);

-- MOSTRAR LA CANTIDAD DE ANIMALES QUE SEAN MAYOR A 7, POR ID DE ZOOLOGICO

SELECT idZoo, COUNT(*) AS CANTIDAD_ANIMALES
FROM Animal
GROUP BY idZoo
HAVING COUNT(*) > 7;

-- MOSTRAR LOS NOMBRES DE ESPECIES POR CADA FAMILIA.

SELECT familia, nombreVulgar
FROM Especie;

-- EN BASE A LA PREGUNTA ANTERIOR QUIERO SABER CUANTAS ESPECIES TIENE CADA FAMILIA.

SELECT familia, COUNT(*)
FROM Especie
GROUP BY familia;

-- CUAL ES LA FAMILIA QUE TIENE MAYOR CANTIDAD DE ESPECIES

SELECT familia, COUNT(*) AS CANTIDAD_ESPECIES
FROM Especie
GROUP BY familia
HAVING COUNT(*) = (SELECT COUNT(*)
FROM Especie
GROUP BY familia
LIMIT 1);

+-----------+-------------------+
| familia   | CANTIDAD_ESPECIES |
+-----------+-------------------+
| Camelidae |                 2 |
+-----------+-------------------+
1 row in set (0.001 sec)

SELECT familia
FROM Especie
GROUP BY familia
HAVING COUNT(*) = (SELECT COUNT(*)
FROM Especie
GROUP BY familia
LIMIT 1);

+-----------+
| familia   |
+-----------+
| Camelidae |
+-----------+
1 row in set (0.001 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES EN PELIGRO DE EXTINSION.

SELECT COUNT(*) AS "CANTIDAD ANIMALES PELIGO EXTINSION"
FROM Animal a, Especie e
WHERE a.idEspecie=e.idEspecie AND e.peligroExtinsion=1
GROUP BY e.peligroExtinsion;

+------------------------------------+
| CANTIDAD ANIMALES PELIGO EXTINSION |
+------------------------------------+
|                                 30 |
+------------------------------------+
1 row in set (0.000 sec)

-- MOSTRAR LOS ZOOLOGICOS CUYA SUPERFICIE SEA SUPERIOR A LA MEDIA DE TODOS LOS ZOOLOGICOS.


(1) MEDIA DE LA SUPERFICIE DE TODOS LOS ZOOLOGICOS

SELECT AVG(superficie) AS MEDIA_SUPERFICIE
FROM Zoologico;

+--------------------+
| MEDIA_SUPERFICIE   |
+--------------------+
| 27.142857142857142 |
+--------------------+
1 row in set (0.000 sec)

(2) QUE ZOOLOGICOS SUPERAN ESA MEDIA

SELECT idZoo,descripcion,superficie
FROM Zoologico
WHERE superficie > (SELECT AVG(superficie) AS MEDIA_SUPERFICIE FROM Zoologico)
ORDER BY superficie DESC;

+-------+---------------------------+------------+
| idZoo | descripcion               | superficie |
+-------+---------------------------+------------+
| Z07   | Parque Zoologico Huachipa |         60 |
| Z06   | El Pinar                  |         40 |
| Z03   | Bioparc                   |         30 |
+-------+---------------------------+------------+
3 rows in set (0.000 sec)

SELECT idZoo,descripcion,superficie
FROM Zoologico
WHERE superficie > 27.14
ORDER BY superficie DESC;

-- MOSTRAR LOS ANIMALES EN PELIGRO DE EXTINSION. DEBE MOSTRARSE EL IDANIMAL-IDZOO-DESCRIPCION(DEL ZOOLOGICO)

SELECT a.idAnimal,z.idZoo, z.descripcion
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND a.idEspecie=e.idEspecie AND e.peligroExtinsion = 1;

+----------+-------+---------------------------+
| idAnimal | idZoo | descripcion               |
+----------+-------+---------------------------+
| A01      | Z01   | Faunia                    |
| A02      | Z01   | Faunia                    |
| A03      | Z01   | Faunia                    |
| A04      | Z01   | Faunia                    |
| A05      | Z01   | Faunia                    |
| A06      | Z01   | Faunia                    |
| A09      | Z02   | Safari Madrid             |
| A10      | Z02   | Safari Madrid             |
| A11      | Z02   | Safari Madrid             |
| A12      | Z02   | Safari Madrid             |
| A15      | Z03   | Bioparc                   |
| A16      | Z03   | Bioparc                   |
| A17      | Z03   | Bioparc                   |
| A18      | Z03   | Bioparc                   |
| A19      | Z03   | Bioparc                   |
| A20      | Z03   | Bioparc                   |
| A21      | Z04   | MundoParc                 |
| A22      | Z04   | MundoParc                 |
| A23      | Z04   | MundoParc                 |
| A24      | Z04   | MundoParc                 |
| A25      | Z04   | MundoParc                 |
| A26      | Z04   | MundoParc                 |
| A29      | Z05   | Zoologico Cali            |
| A30      | Z05   | Zoologico Cali            |
| A33      | Z06   | El Pinar                  |
| A34      | Z06   | El Pinar                  |
| A39      | Z07   | Parque Zoologico Huachipa |
| A40      | Z07   | Parque Zoologico Huachipa |
| A45      | Z07   | Parque Zoologico Huachipa |
| A46      | Z07   | Parque Zoologico Huachipa |
+----------+-------+---------------------------+
30 rows in set (0.001 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES EN PELIGRO DE EXTINSION POR ZOOLOGICO

SELECT z.idZoo, COUNT(*) AS CANTIDAD_ANIMALES_EN_EXTINSION
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND a.idEspecie=e.idEspecie AND e.peligroExtinsion = 1
GROUP BY z.idZoo;

+-------+--------------------------------+
| idZoo | CANTIDAD_ANIMALES_EN_EXTINSION |
+-------+--------------------------------+
| Z01   |                              6 |
| Z02   |                              4 |
| Z03   |                              6 |
| Z04   |                              6 |
| Z05   |                              2 |
| Z06   |                              2 |
| Z07   |                              4 |
+-------+--------------------------------+
7 rows in set (0.003 sec)

-- MOSTRAR LA CANTIDAD DE ANIMALES EN PELIGRO DE EXTINSION POR ZOOLOGICO ORDENADOS DE MANERA DESCENDENTE POR CANTIDAD, PERO SOLO MOSTRAR LOS 3 PRIMEROS

SELECT z.idZoo, COUNT(*) AS CANTIDAD_ANIMALES_EN_EXTINSION
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND a.idEspecie=e.idEspecie AND e.peligroExtinsion = 1
GROUP BY z.idZoo
ORDER BY CANTIDAD_ANIMALES_EN_EXTINSION DESC
LIMIT 3;

SELECT z.idZoo, COUNT(z.idZoo) AS CANTIDAD
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND a.idEspecie=e.idEspecie AND e.peligroExtinsion = 1
GROUP BY z.idZoo
HAVING COUNT(z.idZoo) = 6;

+-------+--------------------------------+
| idZoo | CANTIDAD_ANIMALES_EN_EXTINSION |
+-------+--------------------------------+
| Z01   |                              6 |
| Z03   |                              6 |
| Z04   |                              6 |
+-------+--------------------------------+
3 rows in set (0.001 sec)

-- OBTENER LA MAYOR CANTIDAD DE ANIMALES EN PELIGRO DE EXTINSION QUE TIENE UN ZOOLOGICO PERO NO SE QUE ZOOLOGIO PERO ME SIRVE PARA LA SIGUIENTE PREGUNTA
   QUE SE QUIERE SABER QUE ZOOLOGICO TIENE LA MAYOR CANTIDAD DE ANIMALES EN PELIGRO DE EXTINSION

SELECT COUNT(*) AS CANTIDAD_ANIMALES_EN_EXTINSION
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND a.idEspecie=e.idEspecie AND e.peligroExtinsion = 1
GROUP BY z.idZoo
ORDER BY CANTIDAD_ANIMALES_EN_EXTINSION DESC
LIMIT 1;

+--------------------------------+
| CANTIDAD_ANIMALES_EN_EXTINSION |
+--------------------------------+
|                              6 |
+--------------------------------+
1 row in set (0.001 sec)

SELECT z.idZoo, COUNT(z.idZoo) AS CANTIDAD
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND a.idEspecie=e.idEspecie AND e.peligroExtinsion = 1
GROUP BY z.idZoo
HAVING COUNT(z.idZoo) = (SELECT COUNT(*) AS CANTIDAD_ANIMALES_EN_EXTINSION
FROM Zoologico z, Animal a, Especie e
WHERE z.idZoo=a.idZoo AND a.idEspecie=e.idEspecie AND e.peligroExtinsion = 1
GROUP BY z.idZoo
ORDER BY CANTIDAD_ANIMALES_EN_EXTINSION DESC
LIMIT 1);

+-------+----------+
| idZoo | CANTIDAD |
+-------+----------+
| Z01   |        6 |
| Z03   |        6 |
| Z04   |        6 |
+-------+----------+
3 rows in set (0.004 sec)

******************
***   UPDATE   *** ACTUALIZAR
******************

-- MODIFICAR EL PAIS DE ORIGEN DEL ANIMAL A44 POR 'BOLIVIA'

SELECT idAnimal, paisOrigen
FROM Animal
WHERE idAnimal = 'A44';

UPDATE Animal
SET paisOrigen = 'Perú'
WHERE idAnimal = 'A44';

SELECT idAnimal, paisOrigen
FROM Animal
WHERE idAnimal = 'A44';

-- MODIFICAR EL PAIS DE ORIGEN PERU EN TODOS LOS ANIMALES POR BOLIVIA

UPDATE Animal
SET paisOrigen = 'Chile'
WHERE paisOrigen = 'Perú';

******************
***   DELETE   *** ELIMINAR
******************

-- ELIMINAR TODOS LOS REGISTROS DE ANIMALES CON EL PAIS DE ORIGEN CHILE

DELETE FROM table_name WHERE condition;

DELETE FROM Animal WHERE paisOrigen = 'Chile';
















































