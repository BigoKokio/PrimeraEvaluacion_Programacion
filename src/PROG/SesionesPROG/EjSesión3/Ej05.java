package sesion03;

import java.util.Scanner;

public class Ej05 {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Introduce el número a: ");
         int a = sc.nextInt();
         System.out.println("Introduce el número b: ");
         int b = sc.nextInt();
         System.out.println("Introduce el número c: ");
         int c = sc.nextInt();

         boolean resultado = a + b == 20 || a + c == 20 || b + c == 20;

         System.out.println(resultado);
     }

}
