package PROG.ArraysPROG.EjArrays1;

import java.util.Arrays;

public class EjA1_10 {
    public static void main(String[] args) {
        /*
        Diseñar el algoritmo correspondiente a un programa, que:
            • Crea una tabla (lista con dos dimensiones) de 5x5 enteros.
            • Carga la tabla con valores numéricos enteros.
            • Suma todos los elementos de cada fila y todos los elementos de cada columna
              visualizando los resultados en pantalla.
        */
        int[][] matriz = new int[5][5];
        int[] sumaFilas = new int[5];
        int[] sumaColumnas = new int[5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                sumaFilas[i] = sumaFilas[i] + matriz[i][j];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                sumaColumnas[i] = sumaColumnas[i] + matriz[j][i];
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(sumaFilas));
        System.out.println(Arrays.toString(sumaColumnas));
    }
}
