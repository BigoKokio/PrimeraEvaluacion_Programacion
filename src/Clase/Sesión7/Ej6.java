package Clase.Sesión7;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1;
        int suma = 0;
        while (suma <= 125) {
            suma = suma + i;
            i++;
        }
        System.out.println(i);
        //System.out.println(suma);
    }
}
