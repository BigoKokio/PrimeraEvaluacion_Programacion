package PROG.ExámenesPROG.ExamenFinal2EV_PROG;

import java.util.ArrayList;

public class Alumno extends Persona {
    Curso curso;
    ArrayList<Asignatura> asignaturasMatriculadas = new ArrayList<>();

    public Alumno(String dni, String nombre) {
        super(dni, nombre);
    }

    public void matricular(Curso curso) {
        this.curso = curso;
        this.asignaturasMatriculadas = this.curso.asignaturasCurso;
        System.out.println("Se ha matriculado al alumno " + getNombre() + " en " + curso.ciclo + " " + curso.año);
        curso.plazasDisponibles = curso.plazasDisponibles - 1;
    }

    public void convalidarAsignatura(String asignatura) {
        asignaturasMatriculadas.remove(asignatura);
        System.out.println("Se ha convalidado la asignatura " + asignatura + " al alumno " + getNombre());
    }

    public void mostrarAsignaturasMatriculadas() {
        System.out.println("Asignaturas convalidadas por el alumno " + getNombre());
        for (int i = 0; i < asignaturasMatriculadas.size(); i++) {
            System.out.println((i + 1) + " - " + asignaturasMatriculadas.get(i).nombre + " (" + asignaturasMatriculadas.get(i).horasSemanales + ")");

        }
    }

    @Override
    public String toString() {
        return "Alumno " + nombre + " (" + dni + ")";
    }
}
