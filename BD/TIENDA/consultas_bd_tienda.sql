**********************************
***   FUNCIONES A LOS GRUPOS   ***
**********************************

-- LISTAR TODAS LAS FACTURAS DONDE SE SUME LA CANTIDADES DE CADA UNA

SELECT idFactura, SUM(cantidad) 
FROM Compra
GROUP BY idFactura;

+-----------+---------------+
| idFactura | SUM(cantidad) |
+-----------+---------------+
| F0001     |             6 |
| F0002     |             3 |
| F0003     |             4 |
| F0004     |             6 |
| F0005     |             3 |
| F0007     |             5 |
| F0008     |             6 |
| F0009     |             6 |
| F0010     |             3 |
| F0011     |             2 |
| F0012     |             5 |
| F0013     |             5 |
| F0014     |             4 |
| F0015     |             8 |
| F0016     |             7 |
| F0017     |            10 |
| F0018     |             3 |
| F0019     |             2 |
| F0020     |             1 |
+-----------+---------------+
19 rows in set (0.00 sec)

-- MOSTRAR LA FACTURA CON LA MAYOR CANTIDAD DE UNIDADES COMPRADAS

SELECT idFactura, SUM(cantidad) AS CANTIDAD_A
FROM Compra
GROUP BY idFactura
ORDER BY CANTIDAD_A DESC LIMIT 1;

+-----------+------------+
| idFactura | CANTIDAD_A |
+-----------+------------+
| F0017     |         10 |
+-----------+------------+
1 row in set (0.00 sec)

-- MOSTRAR SOLO LAS FACTURAS QUE TENGAN LA SUMA DE UNIDADES DE PRODUCTOS IGUAL A 3

SELECT idFactura, SUM(cantidad) AS CANTIDAD_A
FROM Compra
GROUP BY idFactura
HAVING CANTIDAD_A = 3;

+-----------+------------+
| idFactura | CANTIDAD_A |
+-----------+------------+
| F0002     |          3 |
| F0005     |          3 |
| F0010     |          3 |
| F0018     |          3 |
+-----------+------------+
4 rows in set (0.00 sec)

-- MOSTRAR POR FACTURA EL PRODUCTO DE MAYOR CANTIDA EN UNIDADES COMPRADAS.

SELECT c.idFactura, MAX(c.cantidad) AS MAXIMA_CANTIDAD
FROM Compra c
GROUP BY c.idFactura
ORDER BY c.idFactura;

+-----------+-----------------+
| idFactura | MAXIMA_CANTIDAD |
+-----------+-----------------+
| F0001     |               3 |
| F0002     |               2 |
| F0003     |               1 |
| F0004     |               2 |
| F0005     |               2 |
| F0007     |               3 |
| F0008     |               2 |
| F0009     |               3 |
| F0010     |               2 |
| F0011     |               1 |
| F0012     |               2 |
| F0013     |               3 |
| F0014     |               2 |
| F0015     |               3 |
| F0016     |               4 |
| F0017     |               3 |
| F0018     |               2 |
| F0019     |               2 |
| F0020     |               1 |
+-----------+-----------------+
19 rows in set (0.00 sec)

-- LISTAR TODAS LAS FACTURAS CON LA CANTIDAD DE ITEMS COMPRADOS

SELECT idFactura, COUNT(*) AS CANTIDAD
FROM Compra
GROUP BY idFactura;


****************************************
***   FUNCIONES PARA LOS REGISTROS   ***
****************************************

-- MOSTRAR CUANTOS PRODUCTOS MANEJO EN MI BASE DE DATOS

SELECT COUNT(*) FROM Producto;

************************
***   SUBCONSULTAS   ***
************************

-- MOSTRAR LA FACTURA QUE TIENE LA MAYOR CANTIDAD DE ITEMS

SELECT idFactura, COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
HAVING CANTIDAD_ITEMS = (SELECT COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 1)
ORDER BY CANTIDAD_ITEMS DESC;

SUBCONSULTA:

SELECT COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 2,1;

-- MOSTRAR LAS FACTURAS CON LAS 2 MAYORES CANTIDADES DE ITEMS 

/*
SELECT idFactura, COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
HAVING CANTIDAD_ITEMS = 4 OR CANTIDAD_ITEMS = 3
ORDER BY CANTIDAD_ITEMS DESC;
*/

SELECT idFactura, COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
HAVING CANTIDAD_ITEMS = (SELECT DISTINCT COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 1) OR CANTIDAD_ITEMS = (SELECT DISTINCT COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 1,1)
ORDER BY CANTIDAD_ITEMS DESC;

+-----------+----------------+
| idFactura | CANTIDAD_ITEMS |
+-----------+----------------+
| F0003     |              4 |
| F0008     |              4 |
| F0017     |              4 |
| F0001     |              3 |
| F0004     |              3 |
| F0009     |              3 |
| F0012     |              3 |
| F0014     |              3 |
| F0015     |              3 |
| F0016     |              3 |
+-----------+----------------+
10 rows in set (0.00 sec)

SUBCONSULTA PARA EL MAYOR = 4

SELECT DISTINCT COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 1;

+----------------+
| CANTIDAD_ITEMS |
+----------------+
|              4 |
+----------------+
1 row in set (0.00 sec)

SUBCONSULTA PARA EL SEGUNDO MAYOR = 3

SELECT DISTINCT COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 1,1;

+----------------+
| CANTIDAD_ITEMS |
+----------------+
|              3 |
+----------------+
1 row in set (0.00 sec)

-- SALTAR LOS 3 PRIMEROS Y MOSTRARME EL SIGUIENTE

SELECT DISTINCT COUNT(*) AS CANTIDAD_ITEMS
FROM Compra
GROUP BY idFactura
ORDER BY CANTIDAD_ITEMS DESC
LIMIT 3,1;

-- LISTAR LOS PRODUCTOS CUYO PRECIO SUPERE A LA MEDIA DE TODOS LOS PRODUCTOS

SUBCONSULTA PARA SACAR LA MEDIA:

SELECT ROUND(AVG(PRECIO),2) AS MEDIA
FROM Producto;

+-------+
| MEDIA |
+-------+
| 24.24 |
+-------+
1 row in set (0.00 sec)

SELECT idProducto,nombre,precio
FROM Producto
WHERE precio > (SELECT ROUND(AVG(PRECIO),2) AS MEDIA FROM Producto);

+------------+-----------------+--------+
| idProducto | nombre          | precio |
+------------+-----------------+--------+
| SC         | Sierra circular |  66.99 |
+------------+-----------------+--------+
1 row in set (0.00 sec)




