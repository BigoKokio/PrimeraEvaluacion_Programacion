package Programación.POO.ClasesYObjetos.Empresa;

public class Herencia {
// EMPRESA - CLASES, OBJETOS, MÉTODOS y HERENCIA
// Crea un paquete empresa; dentro de él las clases siguientes:

    /* Clase Persona, con los atributos nombre y edad (con los modificadores de acceso adecuados teniendo en cuenta
    que va a ser la clase padre de una jerarquía de clases),
    y un método mostrar() que muestre sus valores al ser invocado.
    Su constructor recibe todos los atributos como parámetros */

    /* Clase Empleado, que hereda de Persona y tiene el atributo propio double sueldoBruto;
    sobreescribe el método mostrar para que muestre los valores del atributo propio y de los heredados;
    tiene el método calcularSalarioNeto():double, que descuenta un 15% al salario bruto y devuelve el valor resultante.
    Su constructor recibe todos los atributos como parámetros */

    /* Clase Cliente, que hereda también de Persona y tiene el atributo propio String telefonoDeContacto.
    De esta clase no hereda ninguna otra. También sobreescribe el método mostrar de la misma forma que la clase anterior.
    Su constructor recibe todos los atributos como parámetros */

    /* Clase Directivo, que hereda de Empleado. Tiene el atributo categoría, que es un tipo enumerado cuyos valores obtendremos
    de la siguiente URL: https://economipedia.com/definiciones/directivo.html
    También sobreescribe el método mostrar con los valores de todos los atributos heredados más el atributo categoría.
    Su constructor recibe todos los atributos como parámetros*/

    /* Clase Empresa; tiene el atributo nombre y además empleados y clientes, que representaremos con sendos ArrayList
    que añadiremos también como atributos. Su constructor recibe todos los atributos como parámetros. Añade un método mostrar(),
    que mostrará el resultado del método toString() */

    /* Clase Principal; contiene el método main, crea tres empleados (uno de ellos es un directivo de la categoría que quieras)
    y dos clientes y con todos ellos crea una empresa. */

    /* NOTA: solo llevarán getters y setters aquellas clases que tengan atributos declarados como privados */
}
