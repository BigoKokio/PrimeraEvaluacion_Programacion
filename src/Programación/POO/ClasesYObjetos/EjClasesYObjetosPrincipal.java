package Programación.POO.ClasesYObjetos;

public class EjClasesYObjetosPrincipal {
    public static void main(String[] args) {
        // Paciente con constructor sin parámetros
        EjClasesYObjetos p = new EjClasesYObjetos(); // Creamos un objeto de la clase EjClasesYObjetos
        p.nombre = "A. Álvarez";
        p.edad = 20;
        p.altura = 170;
        String[] sintomas = {"Tos", "Fiebre", "Cansancio"};
        p.sintomas = sintomas;
        System.out.println("El paciente " + p.nombre + " tiene " + p.edad +
                " años, mide " + p.altura + " cm y presenta los siguientes sintomas: ");
        for (int i = 0; i < p.sintomas.length; i++) {
            System.out.println(" * " + p.sintomas[i]);
        }

        // Paciente con constructor vacio
        EjClasesYObjetos j = new EjClasesYObjetos();
        j.sintomas = sintomas;
        System.out.println("El paciente " + j.nombre + " tiene " + j.edad +
                " años, mide " + j.altura + " cm y presenta los siguientes sintomas: ");
        for (int i = 0; i < j.sintomas.length; i++) {
            System.out.println(" * " + j.sintomas[i]);
        }

        // Paciente con constructor en la clase EjClasesYObjetos
        String[] s = {"Dolor en el brazo", "Sensación de ahogo"};
        EjClasesYObjetos h = new EjClasesYObjetos("H. Hidalgo", 35, 160, s);
        System.out.println("El paciente " + h.nombre + " tiene " + h.edad +
                " años, mide " + h.altura + " cm y presenta los siguientes sintomas: ");
        for (int i = 0; i < h.sintomas.length; i++) {
            System.out.println(" * " + h.sintomas[i]);
        }
    }
}
