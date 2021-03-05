package Programación.POO.ClasesYObjetos.Enumerados;

import java.util.Arrays;

public class Enumerados {
// Crea un paquete enumerados y dentro de él una clase Enumerados, y en esta clase
// crea estos enumerados:
// a) Las estaciones del año
    public enum Estaciones {PRIMAVERA, VERANO, OTOÑO, INVIERNO};
// b) Las partes del día (mañana, mediodía, tarde, noche)
    public enum partesDelDía {MAÑANA, MEDIODÍA, TARDE, NOCHE};
// c) Las comidas del día (desayuno, almuerzo, merienda, cena)
    public enum comidasDelDía {DESAYUNO, ALMUERZO, MERIENDA, CENA};
// Añade un método main donde:
    public static void main(String[] args) {
    // a) creas una variable de cada uno de estos tipos y le asignas un valor determinado.
        Estaciones estaciónActual = Estaciones.INVIERNO;
        partesDelDía momentoActual = partesDelDía.TARDE;
        comidasDelDía comidaActual = comidasDelDía.MERIENDA;
        System.out.println("Estamos en " + estaciónActual);
        System.out.println("En turno de " + momentoActual);
        System.out.println("Vamos a " + comidaActual);
    // b) guardas en un array todas las constantes que contiene cada uno de los enumerados
    //    y muestras su contenido
        Estaciones[] arrayEstaciones = Estaciones.values();
        System.out.println(Arrays.toString(arrayEstaciones));
    }
}
