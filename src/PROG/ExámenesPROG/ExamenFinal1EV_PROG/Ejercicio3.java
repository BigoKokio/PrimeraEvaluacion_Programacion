package PROG.ExámenesPROG.ExamenFinal1EV_PROG;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        int suma = 0;
        int multiplos = 0;
        for (int i = 0; multiplos <= numero; i++) {
            if ((i % 3 == 0) && (i % 2 == 0)) {
                //System.out.println(i);
                suma = suma + i;
                multiplos++;
            }
        }
        System.out.println(suma);
    }
}
