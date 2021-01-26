package Programación.POO.ClasesYObjetos;

public class Ej1RobotPrincipal {
    public static void main(String[] args) {
        Ej1Robot a = new Ej1Robot();
        System.out.println("El primer robot se llama " + a.nombre + " y pertenece al modelo " + a.modelo);

        Ej1Robot b = new Ej1Robot("Wall-E", "DMZ24");
        System.out.println("El segundo robot se llama " + b.nombre + " y pertenece al modelo " + b.modelo);
    }
}
