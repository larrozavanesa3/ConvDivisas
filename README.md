# Conversor de Monedas en Java
Este documento describe un conversor de monedas desarrollado en Java que facilita la conversión entre diversas divisas 
utilizando una API externa para obtener tasas de cambio en tiempo real.

# Funcionalidades
El conversor proporciona las siguientes funcionalidades:

Conversiones predefinidas: Ofrece conversiones directas entre:
Dólar Estadounidense (USD)
Peso Argentino (ARS)
Real Brasileño (BRL)
Peso Colombiano (COP)
El usuario selecciona la conversión deseada mediante un menú intuitivo.
Conversiones personalizadas: Permite al usuario realizar conversiones entre otras monedas, siempre que la API externa las soporte. Se solicita al usuario que ingrese los códigos ISO de las monedas de origen y destino.
Actualización de tasas en tiempo real: Las tasas de cambio se recuperan de una API externa (ej. exchangerate-api.com), garantizando la precisión de las conversiones.
Interfaz de línea de comandos: Utiliza una interfaz de línea de comandos para una interacción sencilla y directa.

# Arquitectura
La aplicación se compone de tres clases principales:

Principal.java: Gestiona el flujo principal del programa, presenta el menú al usuario y procesa sus entradas. Orquesta la interacción entre las otras clases.
ConvertirMoneda.java: Contiene la lógica para realizar las conversiones. Recibe la cantidad a convertir, las monedas de origen y destino y la tasa de cambio para calcular el resultado.
ConsultarMoneda.java: Se comunica con la API externa para obtener las tasas de cambio. Maneja las solicitudes HTTP y el procesamiento de la respuesta JSON utilizando la librería Gson.

![Diagrama de Clases](/img/clases.JPG)

(Este diagrama se renderizará como una imagen en GitHub si se instala la extensión de PlantUML).


# Uso
Para utilizar el conversor:

Requisitos: Java Development Kit (JDK) versión 11 o superior y la librería Gson (incluirla en el classpath).
Compilación: Compilar el código fuente: javac *.java
Ejecución: Ejecutar la clase Principal: java Principal
Interacción: Seguir las instrucciones en la consola.
Código de Ejemplo (Fragmentos)
Para mejorar la legibilidad, se muestran fragmentos de código relevantes:

Principal.java (fragmento):

![Clase Principal.java](/img/fragmento.JPG)


ConsultarMoneda.java (fragmento):

![Clase ConsultarMoneda.java](/img/fragmento1.JPG)

# Consideraciones
El conversor utiliza una API externa (ej. exchangerate-api.com). Reemplaza el placeholder de la URL con la URL correcta de tu API en la clase ConsultarMoneda. 
Indica si requiere una clave de API.
Se debe mejorar el manejo de errores y la validación de entrada de usuario.

# Mejoras Futuras
Implementar una interfaz gráfica de usuario (GUI).
Incluir un mayor número de monedas soportadas.
Implementar un mecanismo de caché para mejorar el rendimiento.

# Licencia
Este proyecto está licenciado bajo la MIT License.

Este README está optimizado para una mejor visualización en GitHub. 
Recuerda que la renderización de PlantUML requiere una extensión en GitHub o un renderizador externo. 
También puedes usar imágenes para diagramas más complejos. Se ha utilizado un formato más conciso para mantener la legibilidad.
