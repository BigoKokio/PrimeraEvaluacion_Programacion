package Programación.EjerciciosArray2;

public class Ej07POO {
    public static void main(String[] args) {
        /*
        Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los
        números están ordenados de forma creciente, decreciente, o si están desordenados.
        */
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // ascendente
        int[] B = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; // descendente
        int[] C = {10, 9, 8, 6, 7, 5, 4, 3, 2, 1, 0}; // desordenado
        int resultadoA = comprobarOrden(A);
        int resultadoB = comprobarOrden(B);
        int resultadoC = comprobarOrden(C);

        imprimirResultado(resultadoA);
        imprimirResultado(resultadoB);
        imprimirResultado(resultadoC);
    }
    public static int comprobarOrden(int[] array) {
        int resultado = 0; // ascendente -> 1; descendente -1; desordenado 0
        if (array[0] < array[1]) {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] < array[i+1]) {
                    resultado = 1;
                    continue;
                } else {
                    resultado = 0;
                    break;
                }
            }
        } else {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    resultado = -1;
                    continue;
                } else {
                    resultado = 0;
                    break;
                }
            }
        }
        return resultado;
    }
    public static void imprimirResultado(int resultado) {
        if (resultado == 1) {
            System.out.println("El array está ordenado de forma ascendente.");
        } else if (resultado == -1) {
            System.out.println("El array está ordenado de forma descendente");
        } else {
            System.out.println("El array está desordenado");
        }
    }
}
