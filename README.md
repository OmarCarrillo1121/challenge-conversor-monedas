# Conversor de Monedas con Java

¡Hola! Mi nombre es Omar Carrillo, soy estudiante de programación en Java dentro del programa Oracle Next Education, en esta ocasión he realizado este reto que consiste en el desarrollo de una aplicación que convierte divisas o monedas. El sistema usa datos reales de la API ExchangeRate (https://www.exchangerate-api.com/)
¡Hola! Soy un estudiante de programación y este es uno de mis primeros retos reales. Se trata de una aplicación sencilla pero poderosa que hice en Java para convertir dinero entre diferentes monedas (pesos mexicanos, dólares y pesos argentinos) usando datos reales de internet.

## Funciones principales del conversor de monedas

El programa funciona mediante consola, al iniciar se muestra un menú con varias opciones. Las monedas que pueden consultarse son: pesos mexicanos´(MXN), dólares estadounidenses (USD) y pesos argentinos (ARS). El programa se conecta a la API de ExchangeRate para traer el valor actualizado de las divisas, se procede a hacer la conversión y se muestra el resultado en pantalla

## Tecnologias utilizadas

Se usaron las siguientes herramientas para el desarrollo de la aplicación:
* **Java**: Lenguaje principal de toda la aplicación.
* **Gson**: Libreria que nos ayuda a convertir JSON a clases de Java.
* **HttpClient**: Usado para hacer peticiones HTTP a la web de ExchangeRate-API.
* **Scanner**: Captura la información ingresada por el usuario.

## Descargar y ejecutar

Para descargar y probar el programa, sigue estos pasos:

1. **Clona el código**: Descarga este proyecto a tu computadora.
2. **Consigue tu llave**: Necesitas una "API Key" gratuita de [ExchangeRate-API](https://www.exchangerate-api.com/). Es como la contraseña para que el sitio te deje pedirle datos.
3. **Pega tu llave**: Busca en el archivo `ConsultaAPI.java` donde dice `TU-API-KEY` y cámbialo por la tuya.
4. **Dale a Play**: Ejecuta el archivo `Principal.java` y ¡diviértete convirtiendo!

## Lo que aprendí
Este reto me ayudó a comprender el uso real y consumo de APIs externas dentro de un proyecto real, y como manipular esa información para después mostrarla al usuario, es un proyecto sencillo pero del cual aprendí mucho, agradezco a mis compañeros y asesores que me apoyaron durante el desarrollo del proyecto.

---
Si tienes algún comentario o consejo, me sería de gran ayuda para continuar mi formación como programador. 
¡Gracias por pasar a ver mi proyecto! 