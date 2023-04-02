# Reto ScreenPlay Web - Supermercados La Vaquita

### ¿Cómo correr el proyecto?
1. Posterior a clonar este repositorio en su ordenador, ingrese a la siguiente ruta ➜ src\test\java\com\sofkau\runners.
2. Presionar clic derecho en el archivo "CompraTest". 
3. Seleccionar la opción Run 'CompraTest'.

### Estructura de las carpetas
**main/java/com/sofkau** 
> - **questions**: Podemos ubicar clases que contengan preguntas claves para cada test case, por ejemplo, casos o valores esperados al realizar determinada acción (Presionar un botón).
> - **tasks**: Podemos ubicar clases con métodos que realicen tareas específicas dentro del sistema (por ejemplo, el registro, realizar una compra), con esto nos aseguramos de poder reutilizar esta logica de así necesitarlo.
> - **ui**: Podemos ubicar clases con métodos que nos permitan seleccionar elementos de la interfaz de usuario. 
> - **util**: Podemos encontrar clases con métodos que nos realicen procesos que son comunes pero utiles (enums por ejemplo).  

**test/java/com/sofkau**
> - **runners**: Clases para correr los test cases.
> - **setup**: Clases para configuraciones.
> - **stepdefinitions**: Clases con la ejecución de los pasos definidos en los feature .

**resources/java/com/sofkau**
> - **features**: Gherkins con la definición de los casos de prueba en un lenguaje natural.

### Condiciones del reto
- Elegir correctamente los localizadores
- Prohibido usar ``` Thread.sleep(); ```
- Stepdefinitions con poca lógica.
- Utilizar ``` Try/catch ```
- No deben de incluir contraseñas en el repositorio.
- La página debe incluir inicio de sesión

### Valor agregado
- Escenario que permite comprar más de 1 producto.
- Escenario Outline.

⏯ [Clic aquí para visualizar evidencia - Proceso de compra](https://youtu.be/W7UNKycUzws)