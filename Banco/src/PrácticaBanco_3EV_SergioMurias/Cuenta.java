package PrácticaBanco_3EV_SergioMurias;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cuenta {
    private String titular;
    private String iban;
    private double saldo;
    private boolean bloqueada;
    static String raiz = "D:\\DAW\\PROG\\IntelliJ\\Banco\\";

    public Cuenta(String titular, String iban) throws IOException {
        this.titular = titular;
        this.iban = iban;
        this.saldo = 1;
        // this.bloqueada = false; no es necesario porque el valor por defecto de un boolean es false
        File carpeta = new File(raiz + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24));
        boolean creada = carpeta.mkdirs();
        if (creada) System.out.println("La cuenta ha sido creada con éxito");
        else System.out.println("Ha habido un error en la creación de la cuenta");
        String raízMovimientos = raiz + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24);
        File movimientos = new File(raízMovimientos + "\\movimientos.txt");
        boolean creado = movimientos.createNewFile();
        if (creado) System.out.println("El fichero movimientos ha sido creado con éxito");
        else System.out.println("Ha habido un error en la creación de la cuenta");
        try (FileWriter FW = new FileWriter(movimientos, true)) {
            FW.write(String.valueOf(saldo) + "\n");
        } catch (IOException e) { System.out.println("Excepción al añadir movimiento al fichero: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Cuenta(String titular, String iban, double saldo) throws IOException {
        this.titular = titular;
        this.iban = iban;
        this.saldo = saldo;
        // this.bloqueada = false; no es necesario porque el valor por defecto de un boolean es false
        File carpeta = new File(raiz + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24));
        boolean creada = carpeta.mkdirs();
        if (creada) System.out.println("La cuenta ha sido creada con éxito");
        else System.out.println("Ha habido un error en la creación de la cuenta");
        String raízMovimientos = raiz + iban.substring(4,8) + "\\" + iban.substring(8,12) + "\\" + iban.substring(14,24);
        File movimientos = new File(raízMovimientos + "\\movimientos.txt");
        boolean creado = movimientos.createNewFile();
        if (creado) System.out.println("El fichero movimientos ha sido creado con éxito");
        else System.out.println("Ha habido un error en la creación de la cuenta");
    }

    public String getTitular() {
        return titular;
    }
    /* No se crea un setter para el titular
    porque no se puede cambiar el titular de una cuenta */

    public String getIban() {
        return iban;
    }
    /* No se crea un setter para el iban
    porque no se puede cambiar el número de una cuenta */

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    public void imprimir() {
        System.out.println("El titular " + this.titular + " con número de cuenta " + this.iban + " tiene un saldo de " + this.saldo + " euros.");
    }

}
