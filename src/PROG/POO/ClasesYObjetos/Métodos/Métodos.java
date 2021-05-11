package PROG.POO;

public class Métodos {
    public static void main(String[] args) {
        // Modificadores:
        // public: se puede acceder a el desde cualquier parte del programa
        // static: no es necesario crear un objeto para este método
        printSum(123L, 88);
        // printSum() es un objeto
        double resultado = calcularArea(5, 7);
        System.out.println(resultado);
        double a = 10;
        double b = 2;
        System.out.println(Math.pow(a, b));
    }
    public static double calcularArea(double b, double a) {
        return b * a;
    }
    public static void printSum(long val1, int val2) {
        System.out.println(val1 + val2);
    }
}
