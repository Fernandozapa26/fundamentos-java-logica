# Fundamentos de Java

Este repositorio contiene varios ejemplos básicos de programación en **Java**.  
La idea es mostrar cómo funcionan algunos de los conceptos fundamentales del lenguaje usando ejemplos simples y fáciles de entender.

Todos los archivos están dentro del paquete:

main.java.com.example

Cada clase explica un tema diferente.

---

# TiposDeDatosPrimitivos

En esta clase se muestran los **tipos de datos primitivos de Java**.

Se incluyen ejemplos de:

- byte
- short
- int
- long
- float
- double
- char
- boolean

Ejemplo:

```java
byte b = 100;
short s = 1000;
int i = 100000;
long l = 10000000000L;
```

También se muestran números decimales y valores booleanos.

---

# VariablesYConstantes

Aquí se explica cómo **declarar variables y constantes**.

Primero se muestran variables normales:

```java
int edad = 18;
double altura = 1.62;
char inicial = 'J';
boolean esEstudiante = true;
String nombre = "Juan";
```

Después se muestran **constantes usando `final`**:

```java
final double PI = 3.1416;
final int DIAS_SEMANA = 7;
```

---

# Operadores

En esta clase se muestran diferentes tipos de **operadores en Java**.

Incluye ejemplos de:

- operadores aritméticos
- incremento y decremento
- operadores relacionales
- operadores lógicos
- asignación compuesta
- operador ternario

Ejemplo:

```java
int a = 10;
int b = 3;

System.out.println("Suma: " + (a + b));
System.out.println("Multiplicación: " + (a * b));
System.out.println("Módulo: " + (a % b));
```

---

# MetodosEstaticosSimples

Aquí se explica cómo funcionan los **métodos estáticos**.

Se muestran ejemplos de:

- declaración de métodos
- paso de parámetros
- retorno de valores
- sobrecarga de métodos

Ejemplo:

```java
public static int ejemploRetornoValores(int a, int b) {
    return a + b;
}
```

También se muestra cómo llamar los métodos desde `main`.

---

# EstructurasCondicionales

En esta clase se muestran las **estructuras condicionales**.

Incluye ejemplos de:

- if
- if else
- if else if
- switch
- switch moderno (switch expression)

Ejemplo:

```java
if (edad >= 18) {
    System.out.println("Puedes pasar al club.");
}
```

---

# EstructurasDeRepeticion

Aquí se muestran los **bucles o estructuras repetitivas**.

Incluye ejemplos de:

- while
- do while
- for
- for anidado
- uso de break
- uso de continue
- etiquetas en bucles

Ejemplo:

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Contando: " + i);
}
```

---

# ManipulacionCadenas

En esta clase se explica cómo trabajar con **Strings en Java**.

Incluye:

- concatenación de texto
- métodos útiles de String
- comparación de cadenas
- uso de StringBuilder

Ejemplo:

```java
String hola = "Hola";
String mundo = " Mundo";

System.out.println(hola + mundo);
System.out.println(hola.concat(mundo));
```

También se explica que **los String son inmutables**, es decir, que no se pueden modificar directamente.

---

# EntradaDeDatos

Aquí se muestra cómo **leer datos desde la consola usando Scanner**.

Se pueden leer diferentes tipos de datos como:

- enteros
- decimales
- palabras
- líneas completas

Ejemplo:

```java
Scanner sc = new Scanner(System.in);

int numero = sc.nextInt();
double decimal = sc.nextDouble();
String palabra = sc.next();
```

También se muestra cómo manejar el **salto de línea pendiente** cuando se usa `nextInt()` y luego `nextLine()`.

---

# Requisitos

Para ejecutar el proyecto necesitas:

- Java JDK
- un IDE como:
    - IntelliJ IDEA
    - Eclipse
    - Visual Studio Code

---

# Autor

Fernando Sapa  
Estudiante de desarrollo de software.