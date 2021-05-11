package PROG.ExámenesPROG.ExamenFinal2EV_PROG;

public class Profesor extends Persona {
    private boolean esTutor;

    public Profesor(String dni, String nombre) {
        super(dni, nombre);
    }

    public void asignarTutoría() {
        esTutor = true;
    }

    @Override
    public String toString() {
        return "Profesor " + nombre + " (" + dni + ")";
    }
}
