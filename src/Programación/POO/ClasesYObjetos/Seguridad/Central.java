package Programación.POO.ClasesYObjetos.Seguridad;

import java.util.ArrayList;

public class Central {
    String ciudad;
    ArrayList<Edificio> edificios;

    public Central(String ciudad) {
        this.ciudad = ciudad;
        ArrayList<Edificio> edificios = new ArrayList<>();
        this.edificios = edificios;
    }

    @Override
    public String toString() {
        return "Central{" +
                "ciudad='" + ciudad + '\'' +
                ", edificios=" + edificios +
                '}';
    }

    public void añadirEdificio(Edificio edificio) {
        System.out.println("Edificio " + edificio + " añadido");
        edificios.add(edificio);
    }

    public void quitarEdificio(Edificio edificio) {
        System.out.println("Edificio " + edificio + " eliminado");;
        edificios.remove(edificio);
    }

    public void mostrarEdificios() {
        System.out.println("Edificios de la central de " + ciudad + ":");
        for (int i = 0; i < edificios.size(); i++) {
            System.out.println((i + 1) + " - " + edificios.get(i).dirección + " - " + edificios.get(i).códigoPostal);

        }
    }
}
