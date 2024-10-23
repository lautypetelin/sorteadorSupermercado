# Sorteador

Sorteador es una aplicación de escritorio desarrollada en Java que permite realizar sorteos mensuales de números en un supermercado. La aplicación utiliza una interfaz gráfica que muestra los ganadores en tiempo real, gestionando el sorteo de forma eficiente y visual.

![preview](https://github.com/user-attachments/assets/aae65bee-243e-440e-a66c-27ea0325ac52)

## Características

- Permite al encargado del supermercado ingresar el mes del sorteo y la cantidad de ganadores.
- Visualización acumulativa de los números ganadores en una tabla gráfica.
- Un botón para cerrar/finalizar el sorteo, que limpia todos los campos y reinicia la interfaz.
- Rango de números de sorteo ajustado automáticamente según el mes.
- Uso de FlatLaf para un diseño visual moderno y atractivo.

## Requisitos

- **Java**: 17.0.6
- **FlatLaf**: 3.5.2

## Instalación

1. Clonar este repositorio:
   ```bash
   git clone https://github.com/lautypetelin/sorteadorSupermercado
   ```
2. Descargar e instalar [Java 17.0.6](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) si no lo tienes instalado.

## Uso

1. Ejecuta la aplicación desde tu entorno de desarrollo favorito o desde la línea de comandos:
   ```bash
   java -jar sorteador.jar
   ```
   
2. Ingresa el número de mes y la cantidad de ganadores en la interfaz.

3. Presiona el botón para iniciar el sorteo y visualizar los ganadores en tiempo real.

4. Para finalizar el sorteo, haz clic en el botón "Cerrar Sorteo", lo que vaciará la tabla y reiniciará la interfaz.

## Créditos

- **Desarrollado por**: Lautaro Tomás Israel Petelin
- **Tecnologías utilizadas**: Java 17.0.6, FlatLaf 3.5.2
- **IDE**: Netbeans 17
- **Autor del ejercicio**: Luisina de Paula / TodoCode
