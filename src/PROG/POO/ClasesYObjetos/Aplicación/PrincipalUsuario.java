package Programación.POO.ClasesYObjetos.Aplicación;

import java.util.Scanner;

public class PrincipalUsuario {
    // En el paquete aplicación crea también una clase Principal con un método main
    public static void main(String[] args) {
        // Crea un usuario con datos que pedimos por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Introduce el email: ");
        String correo = sc.nextLine();
        System.out.println("Introduce una contraseña: ");
        String contrasña = sc.nextLine();
        Usuario usuario1 = new Usuario(usuario, correo, contrasña);
        // Imprime los datos del usuario creado
        // Con getters
        System.out.println("Datos del usuario creado: \n username: " + usuario1.getUsername() + "\n email: " + usuario1.getEmail() + "\n password: " + usuario1.getPassword());
        // Con toString
        System.out.println(usuario1.toString());
        // Para probar el método mensajeEstado, ve al main y llama al método con el usuario creado.
        usuario1.mensajeEstado();
        // A continuación, cambia el estado del usuario a ACTIVO, y vuelve a llamar al método mensajeEstado.
        usuario1.setEstado(Usuario.Estado.ACTIVO);
        System.out.println("--Estado cambiado--");
        usuario1.mensajeEstado();
    }
}
