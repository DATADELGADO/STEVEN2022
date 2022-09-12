**********************************
***   USAR UNA BASE DE DATOS   ***
**********************************

-- USAR UNA BASE DE DATOS. TAMBIEN SE PUEDE USAR PARA CREAR UNA BASE DE DATOS

.open musica.db

-- MOSTRAR LA BASE DE DATOS ACTIVA

.database

**********************************
***   BASE DE DATOS COMPLETA   *** 
**********************************

-- 1. CREAR UNA TABLA

DROP TABLE IF EXISTS Artista;

CREATE TABLE Artista (
  idArtista VARCHAR(4)  NOT NULL,
  nombre    VARCHAR(30) NOT NULL,
            PRIMARY KEY (idArtista)
);

DROP TABLE IF EXISTS Cancion;

CREATE TABLE Cancion (
   idCancion VARCHAR(4)  NOT NULL,
   titulo    VARCHAR(30) NOT NULL,
   idArtista VARCHAR(4)  NOT NULL,
             PRIMARY KEY (idCancion),
			 FOREIGN KEY (idArtista) REFERENCES Cancion (idArtista) ON DELETE CASCADE ON UPDATE CASCADE
);

-- 2. MOSTRAR LAS TABLAS DE UNA BASE DE DATOS

SELECT * FROM sqlite_master WHERE type = "table";

-- 3. MOSTRAR LA ESTRUCTURA DE UNA TABLA

PRAGMA table_info(Cancion);
PRAGMA table_info(Artista);

-- 4. INSERTAR REGISTROS A UNA TABLA

INSERT INTO Artista (idArtista,nombre) VALUES("A1","Mike Oldfield");
INSERT INTO Artista (idArtista,nombre) VALUES("A2","The Beatles");

INSERT INTO Cancion (idCancion,titulo,idArtista) VALUES("C1","Tubular Bells","A1");
INSERT INTO Cancion (idCancion,titulo,idArtista) VALUES("C2","Yellow Submarine","A2");
INSERT INTO Cancion (idCancion,titulo,idArtista) VALUES("C3","Get Back","A2");
INSERT INTO Cancion (idCancion,titulo,idArtista) VALUES("C4","Yesterday","A2");
INSERT INTO Cancion (idCancion,titulo,idArtista) VALUES("C5","Moonlight Shadow","A1");

-- 5. MOSTRAR TODOS LOS REGISTROS DE UNA TABLA

SELECT * FROM Artista;
SELECT * FROM Cancion;

-- 6. PRODUCTO CARTESIANO

SELECT * FROM Artista,Cancion;

-- 7. LIMITAR FILAS DE COMPOSICIONES

SELECT * FROM Artista A,Cancion C WHERE A.idArtista = C.idArtista;

-- 8. MOSTRAR LAS CANCIONES DEL ARTISTA A1

SELECT a.idArtista, a.nombre, c.titulo
FROM Artista a, Cancion c
WHERE a.idArtista=c.idArtista AND c.idArtista='A1';

****************************************
***   CAMBIAR EL FORMATO DE SALIDA   ***
****************************************

-- BOX

sqlite> .mode box
sqlite> select * from cancion;
┌───────────┬──────────────────┬───────────┐
│ idCancion │      titulo      │ idArtista │
├───────────┼──────────────────┼───────────┤
│ C1        │ Tubular Bells    │ A1        │
│ C2        │ Yellow Submarine │ A2        │
│ C3        │ Get Back         │ A2        │
│ C4        │ Yesterday        │ A2        │
│ C5        │ Moonlight Shadow │ A1        │
└───────────┴──────────────────┴───────────┘

-- LIST

sqlite> .mode list
sqlite> select * from cancion;
C1|Tubular Bells|A1
C2|Yellow Submarine|A2
C3|Get Back|A2
C4|Yesterday|A2
C5|Moonlight Shadow|A1

-- JSON

sqlite> .mode json
sqlite> select * from cancion;
[{"idCancion":"C1","titulo":"Tubular Bells","idArtista":"A1"},
{"idCancion":"C2","titulo":"Yellow Submarine","idArtista":"A2"},
{"idCancion":"C3","titulo":"Get Back","idArtista":"A2"},
{"idCancion":"C4","titulo":"Yesterday","idArtista":"A2"},
{"idCancion":"C5","titulo":"Moonlight Shadow","idArtista":"A1"}]

-- CSV

(1)

sqlite> .mode csv
sqlite> select * from cancion;
C1,"Tubular Bells",A1
C2,"Yellow Submarine",A2
C3,"Get Back",A2
C4,Yesterday,A2
C5,"Moonlight Shadow",A1

(2)

sqlite> .mode csv
sqlite> .separator ";"
sqlite> select * from cancion;
C1;"Tubular Bells";A1
C2;"Yellow Submarine";A2
C3;"Get Back";A2
C4;Yesterday;A2
C5;"Moonlight Shadow";A1

-- COLUMN

sqlite> .mode column
sqlite> select * from cancion;
idCancion  titulo            idArtista
---------  ----------------  ---------
C1         Tubular Bells     A1
C2         Yellow Submarine  A2
C3         Get Back          A2
C4         Yesterday         A2
C5         Moonlight Shadow  A1

-- TABLE

sqlite> .mode table
sqlite> select * from cancion;
+-----------+------------------+-----------+
| idCancion |      titulo      | idArtista |
+-----------+------------------+-----------+
| C1        | Tubular Bells    | A1        |
| C2        | Yellow Submarine | A2        |
| C3        | Get Back         | A2        |
| C4        | Yesterday        | A2        |
| C5        | Moonlight Shadow | A1        |
+-----------+------------------+-----------+

-- INSERT

sqlite> .mode insert
sqlite> select * from cancion;
INSERT INTO "table" VALUES('C1','Tubular Bells','A1');
INSERT INTO "table" VALUES('C2','Yellow Submarine','A2');
INSERT INTO "table" VALUES('C3','Get Back','A2');
INSERT INTO "table" VALUES('C4','Yesterday','A2');
INSERT INTO "table" VALUES('C5','Moonlight Shadow','A1');

-- HTML

sqlite> .mode html
sqlite> select * from cancion;
<TR><TD>C1</TD>
<TD>Tubular Bells</TD>
<TD>A1</TD>
</TR>
<TR><TD>C2</TD>
<TD>Yellow Submarine</TD>
<TD>A2</TD>
</TR>
<TR><TD>C3</TD>
<TD>Get Back</TD>
<TD>A2</TD>
</TR>
<TR><TD>C4</TD>
<TD>Yesterday</TD>
<TD>A2</TD>
</TR>
<TR><TD>C5</TD>
<TD>Moonlight Shadow</TD>
<TD>A1</TD>
</TR>

**********************************************************************
***   REDIRECCIONAR LA SALIDA DE LOS MODE HACIA UN ARCHIVO TEXTO   ***
**********************************************************************

sqlite> .mode csv
sqlite> .separator ";"
sqlite> .output musica.csv
sqlite> select * from cancion;

-- SALIDA EN EL ARCHIVO MUSICA.CSV

C1;"Tubular Bells";A1
C2;"Yellow Submarine";A2
C3;"Get Back";A2
C4;Yesterday;A2
C5;"Moonlight Shadow";A1

-- SALIDA EN EL ARCHIVO MUSICA.JSON

sqlite> .mode json
sqlite> .output musica.json
sqlite> select * from cancion;

[{
        "idCancion": "C1",
        "titulo": "Tubular Bells",
        "idArtista": "A1"
    },
    {
        "idCancion": "C2",
        "titulo": "Yellow Submarine",
        "idArtista": "A2"
    },
    {
        "idCancion": "C3",
        "titulo": "Get Back",
        "idArtista": "A2"
    },
    {
        "idCancion": "C4",
        "titulo": "Yesterday",
        "idArtista": "A2"
    },
    {
        "idCancion": "C5",
        "titulo": "Moonlight Shadow",
        "idArtista": "A1"
    }]
	
-- CONVERTIR LA TABLA CONSULTA EN UN JSON

sqlite> .mode json
sqlite> .output consulta.json
sqlite> select * from consulta;

***************************
***   EXPORTAR TO CSV   ***
***************************

sqlite> .headers on
sqlite> .mode csv
sqlite> .separator ";"
sqlite> .once c:/work/musica.csv
sqlite> select * from cancion;
sqlite> .system c:/work/musica.csv (Abre excel con el archivo csv)

-- SALIDA EN EL ARCHIVO MUSICA.CSV

idCancion,titulo,idArtista
C1,"Tubular Bells",A1
C2,"Yellow Submarine",A2
C3,"Get Back",A2
C4,Yesterday,A2
C5,"Moonlight Shadow",A1

**************************
***   ELIMINAR TABLA   ***
**************************

DROP TABLE Artista;
DROP TABLE IF EXISTS Artista;

**********************************
***   USAR UNA BASE DE DATOS   ***
**********************************

sqlite> .open hospital.db
sqlite> .tables
consulta
sqlite> .schema consulta
CREATE TABLE IF NOT EXISTS "consulta" (
  "numeroConsulta" text(10),
  "fecha" text,
  "nombreMedico" text(50),
  "deinpr" text(20),
  "procedencia" text(20)
);
sqlite> .databases
main: C:\sqlite3\hospital.db r/w
sqlite> SELECT * FROM Consulta;

**********************************
***   EJECUTAR UN SCRIPT SQL   ***
**********************************

.read bd_hospital.sql

*********************
***   CONSULTAS   ***
*********************

CRUD

-- MOSTRAR EL NUMERO DE CONSULTAS REALIZADAS POR EL MEDICO 'ANA DURAN VILA'

SELECT COUNT(*) FROM Consulta WHERE nombreMedico = 'ANA DURAN VILA';

-- MOSTRAR EL NUMERO DE CONSULTAS DE CADA MEDICO

SELECT nombreMedico, COUNT(*) AS CONSULTAS
FROM Consulta
GROUP BY nombreMedico;

-- ELIMINAR TODAS LAS CONSULTAS DEL MEDICO 'ANA DURAN VILA'

DELETE FROM Consulta WHERE nombreMedico = 'ANA DURAN VILA';

-- CAMBIAR EL NOMBRE DEL MEDICO 'MARIA CARMEN VIÑUELA BENEITEZ' POR BENITEZ

UPDATE Consulta SET nombreMedico = ? WHERE nombreMedico = 'MARIA CARMEN VIÑUELA BENEITEZ'





************************
***   BIBLIOGRAFIA   ***
************************

-- DISTINTOS FORMATOS DE SALIDA
https://www.sqlite.org/cli.html
https://www.tutorialesprogramacionya.com/sqliteya/detalleconcepto.php?punto=68&codigo=68&inicio=60


https://www.imaginanet.com/blog/primeros-pasos-con-sqlite3-comandos-basicos.html


