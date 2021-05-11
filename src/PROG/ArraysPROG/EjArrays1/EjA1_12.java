package PROG.ArraysPROG.EjArrays1;

public class EjA1_12 {
    public static void main(String[] args) {
        /*
        Diseñar el algoritmo correspondiente a un programa, que:
            • Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
            • Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las
              posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras
              que el resto de los elementos contendrán el valor 0.
              111111111111111
              100000000000001
              100000000000001
              100000000000001
              111111111111111
            • Visualiza el contenido de la matriz en pantalla.
        */
        int[][] marco = new int[5][15];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) { // 15 = marco[0].length
                if (i == 0 || i == 4 || j == 0 || j == 14) { // 4 = marco.length - 1
                    marco[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
    }
}
