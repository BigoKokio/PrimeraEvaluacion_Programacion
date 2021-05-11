package PROG.ExámenesPROG.ExamenFinal2EV_PROG;

public class Persona {
    String dni;
    String nombre;

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona " + nombre + " (" + dni + ")";
    }
}
