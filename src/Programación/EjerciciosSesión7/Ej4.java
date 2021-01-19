package Programación.EjerciciosSesión7;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int multiplos = 5;
        int contMultiplos = 0;
        while (contMultiplos < 20) {
            if (multiplos % 5 == 0) {
                System.out.print(multiplos + "\t");
                contMultiplos++;
            }
            multiplos++;
        }
    }
}
