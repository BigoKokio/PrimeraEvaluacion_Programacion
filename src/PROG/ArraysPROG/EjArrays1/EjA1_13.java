package PROG.ArraysPROG.EjArrays1;

import java.util.Scanner;

public class EjA1_13 {
    public static void main(String[] args) {
        /*
        De una empresa de transporte se quiere guardar el nombre de los conductores que tiene, y
        los kilómetros que conducen cada día de la semana.
        Para guardar esta información se van a utilizar dos arreglos:
            • Nombre: Lista para guardar los nombres de los conductores.
            • kms: Tabla para guardar los kilómetros que realizan cada día de la semana.
        Se quiere generar una nueva lista (“total_kms”) con los kilómetros totales que realiza cada conductor.
        Al finalizar se muestra la lista con los nombres de conductores y los kilómetros que ha
        realizado.
        */
    Scanner sc = new Scanner(System.in);
    int nConductores = 0;
    do {
        System.out.println("Introduce el número de conductores: ");
        nConductores = sc.nextInt();

    } while (nConductores <= 0);
    sc.nextLine(); // Liberar el objeto Scanner para poder meter Strings
    String[] nombre = new String[nConductores];
    for (int i = 0; i < nConductores; i++) {
        System.out.println("Introduce el nombre del " + (i+1) + "º conductor: ");
        nombre[i] = sc.nextLine();
    }
    }
}
