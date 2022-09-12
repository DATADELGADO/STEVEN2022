-- MOSTRAR EL IDALUMNO, NOMBRE Y AÑO DE NACIMIENTO DE TODOS LOS ALUMNOS

SELECT idAlumno, nombre, EXTRACT(YEAR FROM fecha_nacimiento) FROM Alumno;

-- MOSTRAR LOS ALUMNOS NACIDOS EL 2000

SELECT idAlumno, nombre, EXTRACT(YEAR FROM fecha_nacimiento) FROM Alumno WHERE EXTRACT(YEAR FROM fecha_nacimiento) = 2000;

-- MOSTRAR LOS ALUMNOS NACIDOS EN ENERO

SELECT idAlumno, nombre, EXTRACT(YEAR FROM fecha_nacimiento) FROM Alumno WHERE EXTRACT(MONTH FROM fecha_nacimiento) = 1;   //Da lo mismo poner 01



