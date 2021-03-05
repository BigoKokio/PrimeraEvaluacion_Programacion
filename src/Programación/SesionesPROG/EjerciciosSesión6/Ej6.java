package Programación.EjerciciosSesión6;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int suma = 0;
        int mult = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            cont = cont + 1;
            suma = suma + cont;
            mult = mult * cont;
        }
        System.out.println(suma);
        System.out.println(mult);
    }
}
