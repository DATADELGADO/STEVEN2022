-- QUE ACTORES HAN SIDO DIRECTORES Y PRODUCTORES.

SELECT DISTINCT d.idDirector, d.idActor, a.Nombre, p.idProductor
FROM Director d, Actor a, Productor p
WHERE d.idActor=a.idActor AND d.idDirector=p.idDirector;

+------------+---------+--------+-------------+
| idDirector | idActor | Nombre | idProductor |
+------------+---------+--------+-------------+
| D01        | A01     | Luis   | P01         |
| D03        | A03     | Carlos | P03         |
| D04        | A04     | Carmen | P04         |
+------------+---------+--------+-------------+
3 rows in set (0.00 sec)

- QUE ACTORES HAN SIDO DIRECTORES O PRODUCTORES (PENDIENTE)

SELECT DISTINCT d.idDirector, d.idActor, p.idProductor
FROM Director d, Actor a, Productor p
WHERE (d.idActor=a.idActor AND d.idDirector=p.idDirector)
UNION
SELECT DISTINCT d.idDirector, d.idActor, p.idProductor
FROM Director d, Actor a, Productor p
WHERE d.idActor=a.idActor AND d.idDirector=p.idDirector AND d.idDirector=d.idActor;

- MOSTRAR TODOS LOS DIRECTORES. SE DEBE MOSTRAR LOS CAMPOS IDDIRECTOR,NOMBRE

SELECT d.idDirector, a.nombre
FROM Actor a, Director d
WHERE a.idActor=d.idActor;

+------------+--------+
| idDirector | nombre |
+------------+--------+
| D01        | Luis   |
| D02        | Miguel |
| D03        | Carlos |
| D04        | Carmen |
+------------+--------+
4 rows in set (0.00 sec)

- QUE PELICULA HA PROTAGONIZADO EL DIRECTOR D01.

SELECT d.idDirector, p.idProtagonista, d.idActor, p.idPelicula, q.titulo
FROM Actor a, Director d, ProtagonistasXpelicula p, Pelicula q
WHERE d.idActor=a.idActor AND a.idActor=p.idProtagonista AND q.idPelicula=p.idPelicula AND d.idDirector = 'D01';

+------------+----------------+---------+------------+-----------------+
| idDirector | idProtagonista | idActor | idPelicula | titulo          |
+------------+----------------+---------+------------+-----------------+
| D01        | A01            | A01     | P145       | King Kong       |
| D01        | A01            | A01     | P254       | Tarzan          |
| D01        | A01            | A01     | P624       | Hombre Arañ     |
| D01        | A01            | A01     | P628       | Thor            |
| D01        | A01            | A01     | P785       | Capitan America |
| D01        | A01            | A01     | P824       | Top Gun         |
| D01        | A01            | A01     | P851       | Hulk            |
| D01        | A01            | A01     | P852       | Iron Man        |
| D01        | A01            | A01     | P856       | Vengadores      |
+------------+----------------+---------+------------+-----------------+
9 rows in set (0.00 sec)

- EN BASE A LAL PREGUNTA ANTERIOR QUE ME CUENTE EN CUANTAS PELICULAS HA SIDO PROTAGONISTA

SELECT d.idDirector, a.nombre, COUNT(*) AS CANTIDAD_PELICULAS
FROM Actor a, Director d, ProtagonistasXpelicula p, Pelicula q
WHERE d.idActor=a.idActor AND a.idActor=p.idProtagonista AND q.idPelicula=p.idPelicula AND d.idDirector = 'D01';

+--------------------+
| CANTIDAD_PELICULAS |
+--------------------+
|                  9 |
+--------------------+
1 row in set (0.00 sec)

+------------+--------+--------------------+
| idDirector | nombre | CANTIDAD_PELICULAS |
+------------+--------+--------------------+
| D01        | Luis   |                  9 |
+------------+--------+--------------------+
1 row in set (0.00 sec)

- MOSTRAR LOS PROTAGONISTAS DE LA PELICULA CON TITULO "KING KONG". SE DEBE MOSTRAR IDPROTAGONISTA,NOMBRE,APELLIDO

SELECT p.idProtagonista, a.nombre, a.apellido
FROM actor a, protagonistasXpelicula p, pelicula q
WHERE a.idActor=p.idProtagonista AND p.idPelicula=q.idPelicula AND q.titulo='king kong';

- MOSTRAR LA CANTIDAD DE ACTORES POR CADA PELICULA.

SELECT p.titulo, a.idPelicula, COUNT(a.idActor) AS CANTIDAD_ACTORES
FROM actoresXpelicula a, pelicula p
WHERE a.idPelicula=p.idPelicula
group by p.titulo, a.idPelicula
order by p.titulo;

+-----------------+------------+------------------+
| titulo          | idPelicula | CANTIDAD_ACTORES |
+-----------------+------------+------------------+
| Capitan America | P785       |                5 |
| Hombre Arañ     | P624       |                3 |
| Hulk            | P851       |                3 |
| Iron Man        | P852       |                3 |
| King Kong       | P145       |                4 |
| Tarzan          | P254       |                3 |
| Thor            | P628       |                5 |
| Top Gun         | P824       |                4 |
| Vengadores      | P856       |                3 |
+-----------------+------------+------------------+
9 rows in set (0.00 sec)

QUIERO MOSTRAR LAS PELICULAS CON MAS DE 4 ACTORES.

GROUP BY
HAVING


SELECT p.titulo, a.idPelicula, COUNT(a.idActor) AS CANTIDAD_ACTORES
FROM actoresXpelicula a, pelicula p
WHERE a.idPelicula=p.idPelicula
group by p.titulo, a.idPelicula
HAVING CANTIDAD_ACTORES > 4
order by p.titulo;

+-----------------+------------+------------------+
| titulo          | idPelicula | CANTIDAD_ACTORES |
+-----------------+------------+------------------+
| Capitan America | P785       |                5 |
| Thor            | P628       |                5 |
+-----------------+------------+------------------+
2 rows in set (0.00 sec)

SELECT p.titulo, a.idPelicula, COUNT(a.idActor) AS CANTIDAD_ACTORES
FROM actoresXpelicula a, pelicula p
WHERE a.idPelicula=p.idPelicula
group by p.titulo, a.idPelicula
HAVING COUNT(a.idActor) > 4
order by p.titulo;

+-----------------+------------+------------------+
| titulo          | idPelicula | CANTIDAD_ACTORES |
+-----------------+------------+------------------+
| Capitan America | P785       |                5 |
| Thor            | P628       |                5 |
+-----------------+------------+------------------+
2 rows in set (0.00 sec)

- MOSTRAR LAS PELICULAS PRODUCIDAS POR CADA PRODUCTOR. MOSTRAR EL NOMBRE DEL PRODUCTOR Y EL NOMBRE DE SUS PELICULAS.

SELECT pr.nombre, q.titulo
FROM pelicula q, peliculasXproductor p, productor pr
WHERE q.idPelicula=p.idPelicula AND pr.idProductor=p.idProductor;

+--------+-----------------+
| nombre | titulo          |
+--------+-----------------+
| Luis   | King Kong       |
| Luis   | Tarzan          |
| Mateo  | Thor            |
| Mateo  | Vengadores      |
| Carlos | Hombre Arañ     |
| Carlos | Hulk            |
| Carlos | Iron Man        |
| Carmen | Capitan America |
| Carmen | Top Gun         |
+--------+-----------------+
9 rows in set (0.00 sec)

