package PROG.POO;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        imprimir("Método 1 a imprimir");
        imprimir("Método 2 a imprimir", 4);
        imprimir(4, "Método 3 a imprimir");
        imprimir(4);
    }
    public static void imprimir(String stringAImprimir) {
        System.out.println(stringAImprimir);
    }
    public static void imprimir(String stringAImprimir, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(stringAImprimir);
        }
    }
    public static void imprimir(int veces, String stringAImprimir) {
        for (int i = 0; i < veces; i++) {
            System.out.println(stringAImprimir);
        }
    }
    public static void imprimir(int val) {
        System.out.println(val);
    }
}
