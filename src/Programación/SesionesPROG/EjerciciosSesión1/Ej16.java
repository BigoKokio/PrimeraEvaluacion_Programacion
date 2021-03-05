package sesion01;

import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Escribe  tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Escribe tu nivel educativo: ");
        String nivel = sc.nextLine();
        System.out.println("Escribe los años de experiencia que tienes: ");
        int experiencia = sc.nextInt();
        System.out.println("Escribe tu tipo de cocina preferente: ");
        String cocina = sc.nextLine();
        System.out.println("El formulario para " + nombre +
                " está completo. Nos comunicaremos con usted si necesitamos un chef que cocine " + cocina);
    }
}
