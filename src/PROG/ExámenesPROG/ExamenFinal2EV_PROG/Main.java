package PROG.ExámenesPROG.ExamenFinal2EV_PROG;

public class Main {
    public static void main(String[] args) {
        // Profesor
        Profesor P1 = new Profesor("52386723M", "Pepito");
        P1.asignarTutoría();
        System.out.println(P1.toString());
        System.out.println("*****************************************");
        // Curso
        Curso C1 = new Curso(CicloFormativo.DAW, 1);
        C1.setTutor(P1);
        C1.mostrarInformaciónCurso();
        System.out.println("*****************************************");
        // Alumno
        Alumno A1 = new Alumno("5784756L", "Adrián");
        A1.matricular(C1);
        System.out.println("*****************************************");
        Alumno A2 = new Alumno("5114756L", "Alberto");
        A2.matricular(C1);
        System.out.println("*****************************************");
        A1.convalidarAsignatura("FOL");
        System.out.println("*****************************************");
        A1.mostrarAsignaturasMatriculadas();
        System.out.println("*****************************************");
        A2.mostrarAsignaturasMatriculadas();
        System.out.println("*****************************************");
        C1.mostrarPlazasDisponibles();
    }
}
