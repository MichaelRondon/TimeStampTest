# TimeStampTest
Servicio Dummy para trabajo de la materia Modelado y Validación de Arquitecturas de la Especialización en Arquitectura Empresarial de Software de la Universidad Javeriana.

Desarrolladores: 
  
	David Camacho
	Diego Sánchez
	Felipe Grisales
	Marcela Vaquiro
	Michael Rondón

Requisitos ejecución:

  - Requere java 8

Requisitos de instalación:

  - Maven https://maven.apache.org/install.html

Uso con Docker: (Si se tiene instalado Docker y Maven)

  - Descargar el repositorio.
  - Descomprimir el contenido.
  - Ejecutar el archivo Ejecutar.bat

Prueba:
  - Ejecutar el comando 
  <code>docker run -p 4000:8080 timestamp-client</code>
  - Mediante un navegador WEB ingresar a la ruta: http://DOCKER_HOST:4000/swagger-ui.html
  - Utilizar una herramienta para consumir servicios REST con los siguientes parámetros:
    -- Método GET
    -- Header con cualquiera de los siguientes valores: {"Accept":"application/json"} ó {"Accept":"application/xml"} ó {"Accept":"text/plain"} ó {"Accept":"text/html"}
    -- Endpoint http://DOCKER_HOST:4000/api/timestamp
