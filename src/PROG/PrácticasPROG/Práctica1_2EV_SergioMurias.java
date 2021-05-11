package PROG.PrácticasPROG;

import java.util.Arrays;
import java.util.Random;

public class Práctica1_2EV_SergioMurias {

    public static void main(String[] args) {
    /* Variables:
• baraja1 y baraja2: arrays de 40 enteros */
        int[] baraja1 = new int[40];
        int[] baraja2 = new int[40];

//• puntos jugador1 y puntos jugador 2: contador de tipo entero, se inicializa a 0
        int puntosJugador1 = 0, puntosJugador2 = 0;

//• Empates: entero que acumula el número de jugadas con empate.
        int empates = 0;


        // tras crear las barajas, las rellenamos
        rellenarBaraja(baraja1);
        rellenarBaraja(baraja2);

        // tras rellenar las barajas, las mezclamos
        barajar(baraja1);
        barajar(baraja2);

    /*A continuación, se realiza cada jugada, en la que cada jugador coge una carta de su baraja. Según el
resultado, gana la jugada uno de ellos, o empatan:
     */

        for (int i = 0; i < 40; i++) { // 40 iteraciones = 40 jugadas, en cada una cogemos la carta de cada baraja y comparamos
            System.out.println("Jugada " + (i+1));
            System.out.println("============");
            if (baraja1[i] < baraja2[i]) {
                puntosJugador2++;
                System.out.println(baraja1[i] + " < " + baraja2[i]);
            } else if (baraja1[i] > baraja2[i]) {
                puntosJugador1++;
                System.out.println(baraja1[i] + " > " + baraja2[i]);

            } else {
                System.out.println(baraja1[i] + " = " + baraja2[i]);
                empates++;
            }

            // Imprimimos el balance tras cada jugada
            System.out.println("Puntos jugador 1: " + puntosJugador1);
            System.out.println("Puntos jugador 2: " + puntosJugador2);
            System.out.println("Empates: " + empates);
            System.out.println();
        }

        /*El juego termina cuando los jugadores han cogido todas las cartas, gana el que más partidas haya
                ganado; si han ganado el mismo número de jugadas cada uno, el resultado es empate.
        */
        // Es decir, tras salir del for el juego termina y mostramos los resultados
        if (puntosJugador1 > puntosJugador2) System.out.println("------ El ganador del juego es el jugador 1 ------");
        else if (puntosJugador1 < puntosJugador2) System.out.println("------ El ganador del juego es el jugador 2 ------");
        else System.out.println("----- EMPATE -----");
    }


    //Métodos:
    // rellenarBaraja(int[]: void): recibe una baraja y la rellena 4 veces con números de 1 a 10.
    public static void rellenarBaraja(int[] baraja) {
        for (int i = 0; i < baraja.length; i++) {
            baraja[i] = (i % 10) + 1;    // utilizamos el resto de dividir por 10 más 1 para rellenar de 1 a 10 4 veces
        }
        // System.out.println(Arrays.toString(baraja));
    }

    // barajar(int[]: void): recibe una baraja rellena y la desordena de forma aleatoria.
    public static void barajar(int[] baraja) {
        // adaptado de: https://masqueprogramar.wordpress.com/2019/02/05/desordenar-elementos-array/
        Random r = new Random();
        for (int i=0; i< baraja.length; i++) {
            int posAleatoria = r.nextInt(baraja.length);
            int temp = baraja[i];
            baraja[i] = baraja[posAleatoria];
            baraja[posAleatoria] = temp;
        }
        // System.out.println(Arrays.toString(baraja));
    }


}
