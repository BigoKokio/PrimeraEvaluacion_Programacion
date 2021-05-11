package Programación.POO.ClasesYObjetos;

public class Ej1Robot {
    String nombre;
    String modelo;

    public Ej1Robot() {
        this.nombre = "Anónimo";
        this.modelo = "Desconocido";
    }

    public Ej1Robot(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Ej1Robot a = new Ej1Robot();
        System.out.println("El primer robot se llama " + a.nombre + " y pertenece al modelo " + a.modelo);

        Ej1Robot b = new Ej1Robot("Wall-E", "DMZ24");
        System.out.println("El segundo robot se llama " + b.nombre + " y pertenece al modelo " + b.modelo);
    }
}
