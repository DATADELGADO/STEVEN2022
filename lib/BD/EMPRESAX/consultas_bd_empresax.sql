************************
***   SUBCONSULTAS   ***
************************

-- LISTAR LOS EMPLEADOS (DNI,NOMBRE,APELLIDO) DEL PROYECTO DE NOMBRE ZZZZZZZZ

SELECT dni
FROM EmpleadosXproyecto
WHERE numProyecto = 'P01' <--- (SELECT numProyecto FROM Proyecto WHERE nombreProyecto = 'ZZZZZZZZ');

+----------+
| dni      |
+----------+
| 11111111 |
| 33333333 |
+----------+
2 rows in set (0.00 sec)

SUBCONSULTA:

SELECT numProyecto
FROM Proyecto
WHERE nombreProyecto = 'ZZZZZZZZ';

+-------------+
| numProyecto |
+-------------+
| P01         |
+-------------+
1 row in set (0.00 sec)

SOLUCION FINAL:

SELECT e.dni, e.nombre, e.apellido
FROM Empleado e, EmpleadosXproyecto ep
WHERE e.dni=ep.dni AND ep.numProyecto = (SELECT numProyecto FROM Proyecto WHERE nombreProyecto = 'ZZZZZZZZ');

+----------+--------+----------+
| dni      | nombre | apellido |
+----------+--------+----------+
| 11111111 | Arturo | Ruiz     |
| 33333333 | María  | Ledezma  |
+----------+--------+----------+
2 rows in set (0.00 sec)

-- LISTAR LOS EMPLEADOS QUE NO TRABAJEN EN EL PROYECTO ZZZZZZZZ

SELECT e.dni, e.nombre, e.apellido
FROM Empleado e, EmpleadosXproyecto ep
WHERE e.dni=ep.dni AND e.dni NOT IN (SELECT e.dni
FROM Empleado e, EmpleadosXproyecto ep
WHERE e.dni=ep.dni AND ep.numProyecto = (SELECT numProyecto FROM Proyecto WHERE nombreProyecto = 'ZZZZZZZZ'));

************************
***   IN VS NOT IN   ***
************************

-- MOSTRAR LOS EMPLEADOS CON DNI 11111111, 22222222, 33333333

SELECT dni,nombre
FROM Empleado
WHERE dni = 11111111 OR dni = 22222222 OR dni = 33333333;

+----------+--------+
| dni      | nombre |
+----------+--------+
| 11111111 | Arturo |
| 22222222 | José   |
| 33333333 | María  |
+----------+--------+
3 rows in set (0.00 sec)

SELECT dni,nombre
FROM Empleado
WHERE dni IN (11111111,22222222,33333333);

+----------+--------+
| dni      | nombre |
+----------+--------+
| 11111111 | Arturo |
| 22222222 | José   |
| 33333333 | María  |
+----------+--------+
3 rows in set (0.00 sec)

-- MOSTRAR LOS EMPLEADOS QUE NO TENGA EL DNI 11111111, 22222222, 33333333

SELECT dni,nombre
FROM Empleado
WHERE dni NOT IN (11111111,22222222,33333333);

+----------+--------+
| dni      | nombre |
+----------+--------+
| 44444444 | Luis   |
| 55555555 | Carmen |
+----------+--------+
2 rows in set (0.00 sec)

-- EMPLEANDO SUBCONSULTA

SUBCONSULTA QUE DEVUELVE 3 VALORES:

SELECT dni
FROM Empleado
ORDER BY dni
LIMIT 3;

+----------+
| dni      |
+----------+
| 11111111 |
| 22222222 |
| 33333333 |
+----------+

SOLUCION:

SELECT dni,nombre
FROM Empleado
WHERE dni NOT IN (SELECT * FROM (SELECT dni FROM Empleado ORDER BY dni LIMIT 3) TEMPORAL);

+----------+--------+
| dni      | nombre |
+----------+--------+
| 44444444 | Luis   |
| 55555555 | Carmen |
+----------+--------+
2 rows in set (0.00 sec)

********************************
***   PROBLEMAS DE VERSION   ***
********************************

https://www.eversql.com/sql-syntax-check-validator/




