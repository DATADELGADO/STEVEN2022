******************
***   TEORIA   ***
******************

- Qué es json

Es un estandar que remplazó a xml en su momento.
Json es un formato para estructurar datos y compartir información entre aplicaciones.
Json no perdona tener errores de sintaxis en el documento.

- Cuál es la estructura básica del formato json

El formato json tiene 2 elementos principales: propiedad y valor

Propiedad: Cualquier cosa que podamos darle un nombre. Por ejemplo: "nombre", "edad", "id", "apellido_materno", "ultimoNumero", "color", "marca", "kilometraje", "esSoltero"

Valor: Es lo que se asigna a la propiedad. Por ejemplo: "Luis", 21, 0001, "Ruiz", 2000, "Rojo", "Toyota", 23.45, false.

Propiedad y valor forman un objeto. Por ejemplo:

{
   "idAlumno": 1,
   "nombre": "Luis"
}

- Sintaxis

Cada par (propiedad,valor) se separan por una coma.
El último par no tiene coma.
Entre llaves definimos los atributos de un objeto en ese ejemplo es un objeto alumno al que podemos poner todos los atributos que queramos.
Los tipos de datos de la propiedad dependen del valor que se asigne a la propiedad pudiendo ser: cadena, número, lógico.
También podemos definir un tipo de dato Arreglo. Por ejemplo: ["Religión","Matemática"]
Un valor también puede ser otro objeto

EJEMPLO 1

{
   "idAlumno": 0001,
   "nombre": "Luis"
}

EJEMPLO 2

{
   "idAlumno": 0001,
   "nombre": "Luis",
   "cursos": ["Religión","Matemática"]
}
{
   "idAlumno": 0002,
   "nombre": "Miguel",
   "cursos": ["Religión","Matemática","Física"]
}

EJEMPLO 3

{
   "idAlumno": 0001,
   "nombre": "Luis",
   "cursos": [{"idCurso": "Rel", "nombre": "Religión"},{"idCurso": "Mat", "nombre":"Matemática"}]
}

{
   "idAlumno": 0001,
   "nombre": "Luis",
   "cursos": {"idCurso": "Rel", "nombre": "Religión"}
}








****************
***   0001   ***
****************

<script>
  var persona = {
	  "nombre": "Luis",
	  "apaterno": "Roncal",
	  "edad": 23,
	  "estatura": 1.73
  };
  console.log(persona.nombre)
</script>


Abrir la consola del navegador para ver el resultado
con F12















