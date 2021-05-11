package Programación.POO.ClasesYObjetos.Seguridad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Sensores
        Sensor S1 = new Sensor(TipoAlerta.INCENDIO);
        System.out.println("Estado del sensor: " + S1.mostrarEstado());
        // Activar el sensor
        S1.activar();
        System.out.println("Estado del sensor: " + S1.mostrarEstado());
        // Ubicar el sensor
        S1.ubicar("Entrada");
        // Ver donde está ubicado
        System.out.println(S1.toString());
        System.out.println("Ubicación del sensor: " + S1.ubicación);
        */

        /* Alarma
        Alarma A1 = new Alarma(TipoAlerta.ROBO);
        System.out.println(A1.toString());
        // Añadir dos sensores
        A1.añadirSensor(TipoAlerta.ROBO);
        A1.añadirSensor(TipoAlerta.INCENDIO);
        System.out.println(A1.toString());
        // Hacer sonar el primer sensor de la alarma con un sensor creado en el MAIN
        // A1.sonar(S1);
        // Activar sensor
        A1.sensores.get(0).activar();
        System.out.println(A1.sensores.get(0).mostrarEstado());
        // Hacer sonar el primer sensor de la alarma
        A1.sonar(A1.sensores.get(0)); // Sacar el primer sensor del arraylist de alarma
        A1.mostrarSensores();
        // Quitar un sensor
        A1.quitarSesnsor(0);
        A1.mostrarSensores();
        // Activar un sensor
        A1.sensores.get(0).activar();
        A1.mostrarSensores();
        // Hacer sonar el sensor
        A1.sonar(A1.sensores.get(0));
        */

        /* Edificio
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Dirección del edificio a crear: ");
        // String D1 = sc.nextLine();
        // System.out.println("Código postal del edificio a crear: ");
        // Integer CP1 = sc.nextInt();
        // Edificio E1 = new Edificio(D1, CP1);
        Edificio E1 = new Edificio("Alcalá, 33", 28017);
        Edificio E2 = new Edificio("Zurbano, 31", 28033);
        System.out.println(E1.toString());
        System.out.println(E2.toString());
        Alarma alarmaEdificio = E1.crearAlarma(TipoAlerta.INCENDIO);
        // E1.añadirAlarma(A1);
        // E1.añadirAlarma(alarmaEdificio);
        // E1.añadirAlarma(A1);
        E1.añadirAlarma(E2.crearAlarma(TipoAlerta.INCENDIO));
        E1.mostrarAlarmas();
        */

        /* Central
        Central C1 = new Central("Madrid");
        System.out.println(C1.toString());
        C1.añadirEdificio(E1);
        C1.añadirEdificio(E2);
        C1.mostrarEdificios();
        C1.quitarEdificio(E2);
        C1.mostrarEdificios();
        */
    }
}
