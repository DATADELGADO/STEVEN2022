**********************
***   ENUNCIADOS   ***
**********************

-- 01. MOSTRAR UNA LISTA DE LOS CLIENTES

SELECT *
FROM Cliente;

+--------+-------------+---------------+
| codigo | nombre      | domicilio     |
+--------+-------------+---------------+
|      1 | Juan Lopez  | Colon 123     |
|      2 | Luis Torres | Sucre 987     |
|      3 | Ana Garcia  | Sarmiento 576 |
+--------+-------------+---------------+
3 rows in set (0.00 sec)

-- 02. MOSTRAR EL PRECIO MAXIMO ENTRE TODOS LOS ARTICULOS

SELECT MAX(precio) AS MAXIMO
FROM Detalle;

FUNCIONES: MAX, MIN, AVG, SUM

+--------+
| MAXIMO |
+--------+
|   4.00 |
+--------+
1 row in set (0.00 sec)

-- 03. MOSTRAR TODOS LOS ARTICULOS CON SU PRECIO DE VENTA

SELECT articulo,precio
FROM Detalle
GROUP BY articulo;

ó

SELECT DISTINCT articulo,precio
FROM Detalle
ORDER BY precio;

+----------+--------+
| articulo | precio |
+----------+--------+
| goma     |   0.50 |
| lapiz    |   1.00 |
| regla    |   1.50 |
| escuadra |   2.00 |
| cuaderno |   4.00 |
+----------+--------+
5 rows in set (0.00 sec)

-- 04. MOSTRAR EL ARTICULO CON EL MAYOR PRECIO

SELECT MAX(precio) AS MAXIMO
FROM Detalle;

+--------+
| MAXIMO |
+--------+
|   4.00 |
+--------+
1 row in set (0.00 sec)

SELECT articulo,precio
FROM Detalle
WHERE precio = (SELECT MAX(precio)
FROM Detalle);

+----------+--------+
| articulo | precio |
+----------+--------+
| cuaderno |   4.00 |
+----------+--------+
1 row in set (0.00 sec)

-- 04.1 MOSTRAR EL ARTICULO CON EL MAXIMO PRECIO Y TAMBIEN EL ARTICULO CON MINIMO PRECIO

SELECT articulo,precio
FROM Detalle
WHERE precio = (SELECT MAX(precio)
FROM Detalle)
UNION
SELECT articulo,precio
FROM Detalle
WHERE precio = (SELECT MIN(precio)
FROM Detalle);

-- 05. MOSTRAR EL PRECIO MEDIO ENTRE TODOS LOS ARTICULOS

SELECT AVG(precio)
FROM (SELECT DISTINCT articulo, precio FROM Detalle) MiTabla;

+----------+--------+
| articulo | precio |
+----------+--------+
| lapiz    |   1.00 |
| goma     |   0.50 |
| regla    |   1.50 |
| cuaderno |   4.00 |
| escuadra |   2.00 |
| folio    |   1.00 |
+----------+--------+

+-------------+
| AVG(precio) |
+-------------+
|    1.666667 |
+-------------+
1 row in set (0.00 sec)

-- PROBANDO

SELECT AVG(MiTabla.precio), AVG(MiTabla2.precio)
FROM (SELECT DISTINCT articulo, precio FROM Detalle) MiTabla, (SELECT * FROM Detalle) MiTabla2;

-- 06. MOSTRAR LOS ARTICULOS CUYO PRECIO SEA MAYOR AL PRECIO MEDIO DE TODOS LOS ARTICULOS

SELECT articulo, precio
FROM Detalle
GROUP BY articulo
HAVING precio > (SELECT AVG(precio)
FROM (SELECT DISTINCT articulo, precio FROM Detalle) MiTabla);

+----------+--------+
| articulo | precio |
+----------+--------+
| cuaderno |   4.00 |
| escuadra |   2.00 |
+----------+--------+
2 rows in set (0.00 sec)

-- 07. MOSTRAR EL MONTO POR ITEM DE CADA FACTURA

SELECT numerofactura, numeroitem, articulo, (precio*cantidad) AS MONTO
FROM Detalle
ORDER BY numerofactura;

-- VERLO COMO TABLA TEMPORAL

SELECT MONTO
FROM (SELECT numerofactura, numeroitem, articulo, (precio*cantidad) AS MONTO FROM Detalle ORDER BY numerofactura) MiTabla;

-- 08. MOSTRAR EL MONTO TOTAL DE CADA FACTURA

SELECT numerofactura, SUM(precio*cantidad) AS MONTO_FACTURA
FROM Detalle
GROUP BY numerofactura;

+---------------+---------------+
| numerofactura | MONTO_FACTURA |
+---------------+---------------+
|          1200 |        175.00 |
|          1201 |        580.00 |
|          1202 |        400.00 |
|          1300 |        400.00 |
+---------------+---------------+
4 rows in set (0.00 sec)

-- 09. MOSTRAR LA FACTURA QUE TIENE EL MAYOR MONTO VENDIDO

-- PRIMERO SABER EL MONTO MAXIMO VENDIDO

SELECT SUM(precio*cantidad) AS MONTO_FACTURA
FROM Detalle
GROUP BY numerofactura
ORDER BY MONTO_FACTURA DESC
LIMIT 1;

+---------------+
| MONTO_FACTURA |
+---------------+
|        580.00 |
+---------------+
1 row in set (0.00 sec)

-- EMPLEANDO TABLA TEMPORAL

SELECT MAX(MONTO_FACTURA) AS MAXIMO
FROM (SELECT numerofactura, SUM(precio*cantidad) AS MONTO_FACTURA
FROM Detalle
GROUP BY numerofactura) MiTabla;

+--------+
| MAXIMO |
+--------+
| 580.00 |
+--------+
1 row in set (0.00 sec)

-- FINAL

SELECT numerofactura, SUM(precio*cantidad) AS MONTO_FACTURA
FROM Detalle
GROUP BY numerofactura
HAVING MONTO_FACTURA = (SELECT SUM(precio*cantidad) AS MONTO_FACTURA
FROM Detalle
GROUP BY numerofactura
ORDER BY MONTO_FACTURA DESC
LIMIT 1);

+---------------+---------------+
| numerofactura | MONTO_FACTURA |
+---------------+---------------+
|          1201 |        580.00 |
+---------------+---------------+
1 row in set (0.00 sec)

**********************
***   ENUNCIADOS   ***
**********************

-- 01. MOSTRAR TODAS LAS FACTURAS DEL CLIENTE CON NOMBRE "ANA GARCIA"

SELECT f.numero, c.nombre
FROM Cliente c, Factura f
WHERE c.codigo=f.codigocliente AND c.nombre = 'JUAN LOPEZ';

SELECT Factura.numero, Cliente.nombre
FROM Cliente, Factura
WHERE Cliente.codigo=Factura.codigocliente AND Cliente.nombre = 'JUAN LOPEZ';

+--------+------------+
| numero | nombre     |
+--------+------------+
|   1202 | Ana Garcia |
+--------+------------+
1 row in set (0.00 sec)

-- 02. MOSTRAR TODAS LAS FACTURAS POR CADA CLIENTE

SELECT codigocliente, numero
FROM Factura
ORDER BY codigocliente;

+---------------+--------+
| codigocliente | numero |
+---------------+--------+
|             1 |   1200 |
|             1 |   1300 |
|             2 |   1201 |
|             3 |   1202 |
+---------------+--------+

SELECT f.codigocliente, c.nombre, f.numero
FROM Factura f, Cliente c
WHERE c.codigo=f.codigocliente
ORDER BY c.nombre;

+---------------+-------------+--------+
| codigocliente | nombre      | numero |
+---------------+-------------+--------+
|             3 | Ana Garcia  |   1202 |
|             1 | Juan Lopez  |   1200 |
|             1 | Juan Lopez  |   1300 |
|             2 | Luis Torres |   1201 |
+---------------+-------------+--------+
4 rows in set (0.00 sec)

-- 03. MOSTRAR EL CLIENTE CON EL MAYOR MONTO EN DINERO GASTADO


SELECT c.nombre, SUM(d.precio*d.cantidad) AS MONTO
FROM Cliente c, Factura f, Detalle d
WHERE c.codigo=f.codigocliente AND f.numero=d.numerofactura 
GROUP BY c.nombre
HAVING MONTO = (SELECT SUM(precio*cantidad) AS MONTO_FACTURA
FROM Detalle
GROUP BY numerofactura
ORDER BY MONTO_FACTURA DESC
LIMIT 1);

+-------------+--------------------------+
| nombre      | SUM(d.precio*d.cantidad) |
+-------------+--------------------------+
| Juan Lopez  |                   575.00 |
| Luis Torres |                   580.00 |
| Ana Garcia  |                   400.00 |
+-------------+--------------------------+
3 rows in set (0.00 sec)

+-------------+--------+
| nombre      | MONTO  |
+-------------+--------+
| Luis Torres | 580.00 |
+-------------+--------+
1 row in set (0.00 sec)





-- 04. MOSTRAR EL CLIENTE DE LA FACTURA CON NUMERO 1200
-- 05. MOSTRAR EL DOMICILIO DEL CLIENTE DE LA FACTURA CON NUMERO 1202
-- 06. MOSTRAR CUANTOS ITEMS TIENE CADA FACTURA
-- 07. MOSTRAR LA FACTURA QUE TIENE EL MAYOR NUMERO DE ITEMS
-- 08. MOSTRAR LA FACTURA QUE TIENE EL MENOR NUMERO DE ITEMS

-- 01. MOSTRAR LAS FACTURAS DEL DIA 15 ENERO DE 2017
-- 02. MOSTRAR LAS FACTURAS DEL AÑO 2017
-- 03. MOSTRAR LAS FACTURAS DISTINTAS AL AÑO 2017
-- 04. MOSTRAR TODAS LAS FECHAS DISTINTAS DE LAS FACTURAS
-- 05. MOSTRAR LA CANTIDAD DE FACTURAS POR CADA FECHA DISTINTA
-- 06. MOSTRAR TODAS LAS FECHAS DISTINTAS DE LAS FACTRUAS
-- 07. MOSTRAR LA CANTIDAD DE FACTURAS POR AÑO
-- 08. MOSTRAR EL MONTO TOTAL EN VENTA POR CADA AÑO
-- 09. MOSTRAR LAS FACTURAS QUE TIENEN COMO ITEM EL ARTICULO "GOMA"
-- 10. MOSTRAR LA CANTIDAD DE FACTURAS EN DONDE ESTA PRESENTE CADA ARTICULO
-- 11. MOSTRAR EL MONTO TOTAL VENDIDO POR CADA ARTICULO
-- 12. MOSTRAR EL ARTICULO QUE MAS DINERO EN VENTA REPORTE
-- 13. MOSTRAR LA CANTIDAD DE UNIDADES VENDIDAS EN TOTAL POR CADA ARTICULO
-- 14. MOSTRAR CUAL ES EL ARTICULO CON MAYOR CANTIDAD DE UNIDADES VENDIDAS EN TOTAL

********************
***   SOLUCION   *** 1
********************

-- 01. MOSTRAR UNA LISTA DE LOS CLIENTES

SELECT *
FROM Cliente;

+--------+-------------+---------------+
| codigo | nombre      | domicilio     |
+--------+-------------+---------------+
|      1 | Juan Lopez  | Colon 123     |
|      2 | Luis Torres | Sucre 987     |
|      3 | Ana Garcia  | Sarmiento 576 |
+--------+-------------+---------------+
3 rows in set (0.00 sec)

-- 02. MOSTRAR EL PRECIO MAXIMO ENTRE TODOS LOS ARTICULOS

SELECT MAX(precio)
FROM Detalle;

+-------------+
| MAX(precio) |
+-------------+
|        4.00 |
+-------------+
1 row in set (0.00 sec)

-- 03. MOSTRAR TODOS LOS ARTICULOS CON SU PRECIO DE VENTA

SELECT DISTINCT articulo, precio
FROM Detalle;

+----------+--------+
| articulo | precio |
+----------+--------+
| lapiz    |   1.00 |
| goma     |   0.50 |
| regla    |   1.50 |
| cuaderno |   4.00 |
| escuadra |   2.00 |
+----------+--------+
5 rows in set (0.00 sec)

-- 04. MOSTRAR EL ARTICULO CON EL MAYOR PRECIO

SELECT MAX(precio)
FROM Detalle;

SELECT articulo, MAX(precio) AS MAXIMO
FROM Detalle
GROUP BY articulo
ORDER BY MAXIMO DESC
LIMIT 1;

+----------+--------+
| articulo | MAXIMO |
+----------+--------+
| cuaderno |   4.00 |
+----------+--------+
1 row in set (0.00 sec)

SELECT articulo, precio
FROM Detalle
WHERE precio = (SELECT MAX(precio) FROM Detalle);

+----------+--------+
| articulo | precio |
+----------+--------+
| cuaderno |   4.00 |
+----------+--------+
1 row in set (0.00 sec)

-- 05. MOSTRAR EL PRECIO MEDIO ENTRE TODOS LOS ARTICULOS

SELECT AVG(DISTINCT (precio)) FROM Detalle;
+------------------------+
| AVG(DISTINCT (precio)) |
+------------------------+
|               1.800000 |
+------------------------+
1 row in set (0.00 sec)

-- 06. MOSTRAR LOS ARTICULOS CUYO PRECIO SEA MAYOR AL PRECIO MEDIO DE TODOS LOS ARTICULOS

SELECT DISTINCT articulo, precio
FROM Detalle
WHERE precio > (SELECT AVG(DISTINCT (precio)) FROM Detalle);

+----------+--------+
| articulo | precio |
+----------+--------+
| cuaderno |   4.00 |
| escuadra |   2.00 |
+----------+--------+
2 rows in set (0.00 sec)

-- 07. MOSTRAR EL MONTO POR ITEM DE CADA FACTURA

SELECT numeroFactura, numeroitem, articulo, precio*cantidad AS MONTO
FROM Detalle;

+---------------+------------+----------+--------+
| numeroFactura | numeroitem | articulo | MONTO  |
+---------------+------------+----------+--------+
|          1200 |          1 | lapiz    | 100.00 |
|          1200 |          2 | goma     |  75.00 |
|          1201 |          1 | regla    | 120.00 |
|          1201 |          2 | goma     | 100.00 |
|          1201 |          3 | cuaderno | 360.00 |
|          1202 |          1 | lapiz    | 200.00 |
|          1202 |          2 | escuadra | 200.00 |
|          1300 |          1 | lapiz    | 300.00 |
+---------------+------------+----------+--------+
8 rows in set (0.00 sec)

-- 08. MOSTRAR EL MONTO TOTAL DE CADA FACTURA

SELECT numeroFactura, SUM(precio*cantidad)
FROM Detalle
GROUP BY numeroFactura;

+---------------+----------------------+
| numeroFactura | SUM(precio*cantidad) |
+---------------+----------------------+
|          1200 |               175.00 |
|          1201 |               580.00 |
|          1202 |               400.00 |
|          1300 |               300.00 |
+---------------+----------------------+
4 rows in set (0.00 sec)

-- 09. MOSTRAR LA FACTURA QUE TIENE EL MAYOR MONTO VENDIDO

SELECT SUM(precio*cantidad) AS MONTO
FROM Detalle
GROUP BY numeroFactura
ORDER BY MONTO DESC
LIMIT 1;

+--------+
| MONTO  |
+--------+
| 580.00 |
+--------+
1 row in set (0.00 sec)

SELECT numeroFactura, SUM(precio*cantidad) AS MONTO
FROM Detalle
GROUP BY numeroFactura
HAVING MONTO = (SELECT SUM(precio*cantidad) AS MONTO
FROM Detalle
GROUP BY numeroFactura
ORDER BY MONTO DESC
LIMIT 1);

+---------------+--------+
| numeroFactura | MONTO  |
+---------------+--------+
|          1201 | 580.00 |
+---------------+--------+
1 row in set (0.00 sec)

************************
***   BIBLIOGRAFIA   ***
************************

https://www.tutorialesprogramacionya.com/postgresqlya/temarios/descripcion.php?cod=223&punto=65&inicio=

https://guru99.es/functions/

https://parzibyte.me/blog/2018/02/06/ejercicios-resueltos-consultas-sql-mysql/





