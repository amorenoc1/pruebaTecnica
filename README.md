Nombre del aplicativo: Travelo City

Url:https://www.travelocity.com/


## Detalles generales de la implementaci�n

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de p�ginas (user_interface)
definidas en `co.com.dev.certificacion.travelocity`.

La estructura completa del proyecto es la siguiente:

````
+ model
    Clases que usan modelos de conexion para la ruta compartida y ruta base de los servicios
   
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
       
+ user_interface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
    
+ questions
   Esta capa gestiona los Asserts o verificaciones de las pruebas las cuales son el fin ultimo de las mismas
    
+util
    Contiene clases con los m�todos unitarios que pueden ser utilizados libremente por otras clases del proyecto

+ exceptions 
	 Controla los errores ocasionados durante la ejecuci�n de la aplicaci�n


````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versi�n 5.5.1
Se requiere tener instalado el navegador Chrome x64
ChromeDriver: ChromeDriver 89.0.4389.23

## Para correr el proyecto

clean test aggregate es el comando que correr� los tests y generar� el reporte en la carpeta /target/site/serenity/