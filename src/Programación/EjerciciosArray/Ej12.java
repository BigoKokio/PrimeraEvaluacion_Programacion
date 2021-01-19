package Programación.EjerciciosArray;

public class Ej12 {
    public static void main(String[] args) {
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
