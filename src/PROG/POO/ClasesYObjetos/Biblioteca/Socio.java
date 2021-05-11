package PROG.POO.ClasesYObjetos.Biblioteca;

import java.util.ArrayList;

public class Socio {
    private String nombre;
    private String dirección;
    private String teléfono;
    public ArrayList<Libro> librosEnPréstamo = new ArrayList<>();

    public Socio(String nombre, String dirección, String teléfono) {
        this.nombre = nombre;
        this.dirección = dirección;
        this.teléfono = teléfono;
    }

   public String getNombre() {
        return nombre;
    }

   public String getDirección() {
       return dirección;
   }
   
   public String getTeléfono(){
       return teléfono;
   }
   
   public void setDirección(String dirección){
       this.dirección = dirección;
   }
   
   public void setTeléfono(String teléfono) {
       this.teléfono = teléfono;
   }   
   
}
