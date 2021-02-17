package Programación.POO.ClasesYObjetos.Ejército;

public class Principal {
    public static void main(String[] args) {
        crearEjercito();
        System.out.println("Unidades: " + Unidad.contadorUnidades);
        System.out.println("Caballerías: " + Caballería.contadorCaballería);
        System.out.println("Generales: " + General.contadorGenerales);
        System.out.println("Médicos: " + Médico.contadorMédicos);
    }
    public static void crearEjercito() {
        Unidad U1 = new Unidad("Infantería 1");
        System.out.println(U1.toString());
        Unidad U2 = new Unidad("Infantería 2");
        Unidad U3 = new Unidad("Infantería 3");
        Unidad U4 = new Unidad("Infantería 4");
        Caballería C1 = new Caballería("Caballería 1");
        Caballería C2 = new Caballería("Caballería 2");
        General G1 = new General("General");
        Médico M1 = new Médico("Médico");
    }
}
