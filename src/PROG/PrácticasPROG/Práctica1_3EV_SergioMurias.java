package PROG.PrácticasPROG;

import java.util.Arrays;
import java.util.Scanner;

public class Práctica1_3EV_SergioMurias {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--Momento Inicial--");
        int Momento1 = convertirASegundos(pedirMomento());
        System.out.println("--Momento Final--");
        int Momento2 = convertirASegundos(pedirMomento());
        imprimirCadena(convertirHorario(calcularDiferencia(Momento1, Momento2)));
    }

    public static int[] pedirMomento() {
        System.out.println("Introduce HH:MM:SS: ");
        String cadena = sc.nextLine();
        int HoraInicial = Integer.parseInt(cadena.substring(0,2));
        int MinutosInicial = Integer.parseInt(cadena.substring(3,5));
        int SegundosInicial = Integer.parseInt(cadena.substring(6,8));
        int[] Momento = {HoraInicial,MinutosInicial,SegundosInicial};
        return Momento;
    }

    public static int convertirASegundos(int[] num) {
        int HorasASegundos = num[0] * 3600;
        int MinutosASegundos = num[1] * 60;
        int Segundos = num[2];
        int SegundosTotales = HorasASegundos + MinutosASegundos + Segundos;
        return SegundosTotales;
    }

    public static int calcularDiferencia(int momento1, int momento2) {
        int Diferencia = momento1 - momento2;
        return Diferencia;
    }

    public static String convertirHorario(int segundos) {
        int HoraFinal = (segundos / 3600);
        int MinutosFinal = (segundos % 3600) / 60;
        int SegundosFinal = (segundos % 3600) % 60;
        String HorarioFinal = String.valueOf(HoraFinal) + ":" + String.valueOf(MinutosFinal) + ":" + String.valueOf(SegundosFinal);
        return HorarioFinal;
    }

    public static void imprimirCadena(String cadena) {
        System.out.println(cadena);
    }
}
