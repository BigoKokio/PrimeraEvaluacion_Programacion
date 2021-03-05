package Programación.POO.ClasesYObjetos.Aplicación;

public class Usuario {
// Crea un paquete aplicacion y dentro de él una clase Usuario
// La clase Usuario debe contener
    // Atributos: username, email, password
    private String username;
    private String email;
    private String password;
    // Constructor con tres parámetros para inicializar las instancias de la clase
    public Usuario(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
        // Modifica el constructor para que cuando se crea un usuario se le asigne el estado pendiente.
        this.estado = Estado.PENDIENTE; // El estado por defecto de un nuevo usuario es pendiente
    }
    // Getters y setters para los atributos, teniendo en cuenta que una vez creado un usuario no podemos cambiar su nombre
    public String getUsername() {
        return username;
    }
    /* public void setUsername(String username) {
        this.username = username;
    } */
    // No se pueden cambiar los nombres de usuario.
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    // Añade métodos para poder ver y cambiar el estado de un usuario.
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    // Añade el método toString
    @Override
    public String toString() {
        return "Datos del usuario creado: {" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
// En la clase Usuario:
    // Añade un tipo enumerado de nombre Estado con los siguientes valores: pendiente, activo, bloqueado
    public enum Estado {PENDIENTE, ACTIVO, BLOQUEADO};
    // Añade a la clase Usuario un atributo estado de tipo Estado;
    private Estado estado;
// En la clase Usuario crea un método mensajeEstado():void
    public void mensajeEstado() {
// El método hace lo siguiente:
    // Si el estado es PENDIENTE, imprime "Tienes que esperar un poco".
    // Si el estado es ACTIVO, imprime "Todo ok, vía libre".
    // Si el estado es BLOQUEADO, imprime "Usuario bloqueado. Algo habrás hecho".
    // Si no es ninguno de estos estados, imprime "Estado desconocido".
        switch (estado) {
            case ACTIVO:
                System.out.println("Todo OK. Vía libre");
                break;
            case BLOQUEADO:
                System.out.println("Usuario bloqueado. Algo habrás hecho");
                break;
            case PENDIENTE:
                System.out.println("Tienes que esperar un poco");
                break;
            default:
                System.out.println("Estado desconocido");
                break;
        }
    }
}
