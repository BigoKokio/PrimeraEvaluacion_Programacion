package PrácticasEntornos;

public class Alumno{
    private String nombre;
    private int[] notas;
    private File foto;

    public Alumno(){
        notas = new int[6];
    }

    public Alumno(String nombre, String rutaFoto){
        this.nombre = nombre;
        notas = new int[6];
        foto = new File(rutaFoto);
    }
}