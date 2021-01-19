package sesion02;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de ardillas: ");
        int n = sc.nextInt(); // recojo el número de ardillas introducido por teclado en una variable llamada n
        System.out.println("Introduce el número de nueces: ");
        int k = sc.nextInt(); //recojo el número de nueces en la variable k
        int cociente = k / n; // calculo cuántas nueces corresponden a cada ardilla
        int resto = k % n; // el resto de dividir las nueces entre las ardillas son las que sobran
        System.out.println("A cada ardilla le corresponden " + cociente + " nueces, y sobran " + resto);

    }
}
