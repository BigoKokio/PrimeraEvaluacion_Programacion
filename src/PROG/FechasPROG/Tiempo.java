package PROG.FechasPROG;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Tiempo {
    public static void main(String[] args) {
        //Clases para trabajar con tiempo
        //LocalDate:
        //métodos: now() --> obtiene la fecha actual
        System.out.println("**** LocalDate ****");
        LocalDate hoy = LocalDate.now();
        System.out.println("Fecha actual: " + hoy);
        //métodos: LocalDate.getXXX --> obtiene una parte de la fecha
        System.out.println("Año actual: " + hoy.getYear());
        System.out.println("Mes actual: " + hoy.getMonth());
        System.out.println("Día actual: " + hoy.getDayOfMonth());
        System.out.println();
        //LocalTime:
        System.out.println("**** LocalTime ****");
        LocalTime ahora = LocalTime.now();
        //método: now() --> obtiene la hora actual en HH:MM:SS.NS
        System.out.println("Ahora: " + ahora);
        System.out.println("Horas: " + ahora.getHour());
        System.out.println("Minutos: " + ahora.getMinute());
        System.out.println("Segundos: " + ahora.getSecond());
        System.out.println("Nanosegundos: " + ahora.getNano());
        System.out.println();
        //LocalDateTime
        System.out.println("**** LocalDateTime ****");
        LocalDateTime momentoActual = LocalDateTime.now();
        //método: now() --> día y hora actuales
        System.out.println("Momento: " + momentoActual);
        System.out.println();
        //este también tiene los métodos getXXX para extraer sus partes
        //cómo construir fechas y/o momentos
        //método: of(), pasándole como parámetros: LocalDate.of(int año, int mes, int día)
        System.out.println("**** Cómo construir fechas y/o momentos ****");
        LocalDate examen = LocalDate.of(2021, 5, 18);
        System.out.println("Fecha del examen: " + examen.getDayOfMonth() + "/" + examen.getMonthValue() + "/" + examen.getYear());
        LocalDateTime horaExamenB; // 15:30
        LocalDateTime horaExamenA; // 18:00
        System.out.println("Fecha y hora de examen: ");
        System.out.println("  * Grupo B: ");
        System.out.println("  * Grupo A: ");
    }
}
