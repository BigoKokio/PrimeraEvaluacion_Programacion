package PROG.ExámenesPROG.ExamenFinal2EV_PROG;

import java.util.ArrayList;

public class Curso {
    Grado grado;
    CicloFormativo ciclo;
    Integer año;
    Horario horario;
    Integer plazasDisponibles;
    ArrayList<Asignatura> asignaturasCurso = new ArrayList<>();
    private Profesor tutor;
    ArrayList<Alumno> alumnosMatriculados = new ArrayList<>();

    public Curso(CicloFormativo ciclo, Integer año) {
        this.ciclo = ciclo;
        this.año = año;
        if (ciclo.equals("SMR")) {
            this.grado = Grado.MEDIO;
            this.horario = Horario.MAÑANA;
            if (año == 1) {
                Asignatura M1A1 = new Asignatura("MME", 7);
                asignaturasCurso.add(M1A1);
                Asignatura M1A2 = new Asignatura("AO", 7);
                asignaturasCurso.add(M1A2);
                Asignatura M1A3 = new Asignatura("SOM", 6);
                asignaturasCurso.add(M1A3);
                Asignatura M1A4 = new Asignatura("RL", 7);
                asignaturasCurso.add(M1A4);
                Asignatura M1A5 = new Asignatura("FOL", 3);
                asignaturasCurso.add(M1A5);
                this.plazasDisponibles = 30;
            } else {
                Asignatura M2A1 = new Asignatura("SR", 6);
                asignaturasCurso.add(M2A1);
                Asignatura M2A2 = new Asignatura("SOR", 6);
                asignaturasCurso.add(M2A2);
                Asignatura M2A3 = new Asignatura("SI", 6);
                asignaturasCurso.add(M2A3);
                Asignatura M2A4 = new Asignatura("AW", 7);
                asignaturasCurso.add(M2A4);
                Asignatura M2A5 = new Asignatura("EIE", 3);
                asignaturasCurso.add(M2A5);
                this.plazasDisponibles = 20;
            }
        } else {
            this.grado = Grado.SUPERIOR;
            this.horario = Horario.TARDE;
            Asignatura M1D1 = new Asignatura("PROG", 8);
            asignaturasCurso.add(M1D1);
            Asignatura M1D2 = new Asignatura("BBDD", 6);
            asignaturasCurso.add(M1D2);
            Asignatura M1D3 = new Asignatura("LM", 4);
            asignaturasCurso.add(M1D3);
            Asignatura M1D4 = new Asignatura("ED", 3);
            asignaturasCurso.add(M1D4);
            Asignatura M1D5 = new Asignatura("FOL", 3);
            asignaturasCurso.add(M1D5);
            this.plazasDisponibles = 30;
        }

    }

    public void setTutor(Profesor tutor) {
        this.tutor = tutor;
    }

    public Profesor getTutor() {
        return tutor;
    }

    public void mostrarPlazasDisponibles() {
        System.out.println("Plazas disponibles en el curso " + ciclo + ": " + plazasDisponibles);
    }

    public void mostrarInformaciónCurso() {
        System.out.println("Año: " + año);
        System.out.println("Ciclo: " + ciclo);
        System.out.println("Horario: " + horario);
        System.out.println("Tutor: " + tutor);
        System.out.println("Asignaturas de que consta y horas semanales: ");
        for (int i = 0; i < asignaturasCurso.size(); i++) {
            System.out.println((i+1) + " - " + asignaturasCurso.get(i).nombre + " (" + asignaturasCurso.get(i).horasSemanales + ")");
        }
        mostrarPlazasDisponibles();
    }
}
