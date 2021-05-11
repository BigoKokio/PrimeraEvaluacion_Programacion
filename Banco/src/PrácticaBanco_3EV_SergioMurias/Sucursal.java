package PrácticaBanco_3EV_SergioMurias;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sucursal {
    String entidad;
    String oficina;
    static ArrayList<Cuenta> cuentas = new ArrayList<>();
    static String raíz = "D:\\DAW\\PROG\\IntelliJ\\Banco\\src\\";

    public Sucursal(String entidad, String oficina) {
        this.entidad = entidad;
        this.oficina = oficina;
        File carpeta = new File(raíz);
        boolean creada = carpeta.mkdir();
        //System.out.println(creada);
    }

    public String generarCC() {
        int c1 = (int) (Math.random() * 10);
        int c2 = (int) (Math.random() * 10);
        String cc = String.valueOf(c1) + String.valueOf(c2);
        return cc;
    }

    public String generarNúmeroCuenta() {
        String numCuenta = "";
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 10);
            numCuenta = numCuenta + String.valueOf(num);
            //System.out.println(numCuenta);
        }
        return numCuenta;
    }

    public String generarIban() {
        return "ES" + generarCC() + this.entidad + this.oficina + generarCC() + generarNúmeroCuenta();
    }

    public void crearCuenta(String titular, double saldo) throws IOException {
        String iban = generarIban();
        Cuenta C = new Cuenta(titular, iban, saldo);
        C.imprimir();
        cuentas.add(C);
    }

    public double ingresar(Cuenta cuenta, double cantidad) {
        if (cuenta.isBloqueada() == false) {
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
            System.out.println("Saldo: " + cuenta.getSaldo());
        } else {
            System.out.println("Operación rechazada: esta cuenta está bloqueada");
        }
        String ruta = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24) + "\\movimientos.txt";
        File F = new File(ruta);
        try (FileWriter FW = new FileWriter(F, true)) {
            FW.write(String.valueOf(cantidad) + "\n");
        } catch (IOException e) { System.out.println("Excepción al añadir movimiento al fichero: " + e.getMessage());
        e.printStackTrace();
        }
        return cuenta.getSaldo();
    }

    public double retirar(Cuenta cuenta, double cantidad) {
        if (cuenta.isBloqueada() == false) {
            if (cuenta.getSaldo() >= cantidad) {
                cuenta.setSaldo(cuenta.getSaldo() - cantidad);
                System.out.println("Saldo: " + cuenta.getSaldo());
                String ruta = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24) + "\\movimientos.txt";
                File F = new File(ruta);
                try (FileWriter FW = new FileWriter(F, true)) { // "append" significa que si el fichero tiene algo escrito añada el nuevo contenido al final
                    FW.write(String.valueOf("-" + cantidad) + "\n");
                } catch (IOException e) { System.out.println("Excepción al añadir movimiento al fichero: " + e.getMessage());
                    e.printStackTrace();
                }
            } else {
                System.out.println("Operación rechazada: cantidad insuficiente");
            }
        } else {
            System.out.println("Operación rechazada: esta cuenta está bloqueada");
        }
        return cuenta.getSaldo();
    }

    public void generarExtracto(Cuenta cuenta) {
        double sumaIngresos = 0;
        double sumaReintegros = 0;
        String ruta = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24) + "\\movimientos.txt";
        File f = new File(ruta);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNextLine()) {
                String línea = sc.nextLine();
                if (línea.startsWith("-")) {
                    sumaReintegros = sumaReintegros + Double.parseDouble(línea);
                } else {
                    sumaIngresos = sumaIngresos + Double.parseDouble(línea);
                }
            }
            ruta = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24) + "\\extracto.txt";
            File extracto = new File(ruta);
            boolean creado = extracto.createNewFile();
            if (creado) System.out.println("El extracto de tu cuenta ha sido creado con éxito");
            try (FileWriter FW = new FileWriter(extracto, false)) {
                FW.write("Titular: " + cuenta.getTitular() + "\n");
                FW.write("IBAN: " + cuenta.getIban() + "\n");
                FW.write("Total de ingresos: " + sumaIngresos + "\n");
                FW.write("Total de reintegros: " + sumaReintegros + "\n");
                FW.write("Saldo: " + cuenta.getSaldo());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Extracto de E/S: " + e.getMessage());
        }
        double saldo = cuenta.getSaldo();
    }

    public void bloquearCuenta (Cuenta cuenta) {
        if (!cuenta.isBloqueada()) {
            cuenta.setBloqueada(true);
            System.out.println("La cuenta ha sido bloqueada con éxito");
        }
        String ruta = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\Bloqueadas";
        File bloqueadas = new File(ruta);
        boolean creada = bloqueadas.mkdirs();
        if (creada) System.out.println("La carpeta de cuentas bloqueadas de la sucursal " + oficina + " ha sido creada con éxito");
        String rutaOrigen = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\" + cuenta.getIban().substring(14,24);
        String rutaDestino = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\Bloqueadas\\" + cuenta.getIban().substring(14,24);
        File cuentaBloqueada = new File(rutaOrigen);
        boolean movida = cuentaBloqueada.renameTo(new File(rutaDestino));
        if (movida) System.out.println("La cuenta ha sido movida a la carpeta de cuentas bloqueadas con éxito");
    }

    public void eliminarCuenta (Cuenta cuenta) {
        if (!cuenta.isBloqueada()) {
            bloquearCuenta(cuenta);
        }
        String ruta = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\Bloqueadas\\" + cuenta.getIban().substring(14, 24);
        File F = new File(ruta);
        boolean borrada = F.delete();
        if (borrada == false) borrarRecursivamente(F);
        String rutaCuentasEliminadas = "IntelliJ\\..\\Banco\\" + entidad + "\\" + oficina + "\\cuentas_eliminadas.txt";
        File cuentasEliminadas = new File(rutaCuentasEliminadas);
        try {
            boolean creada = cuentasEliminadas.createNewFile();
            if (creada) System.out.println("El fichero cuentas_eliminadas ha sido creado con éxito");
            try (FileWriter FW = new FileWriter(cuentasEliminadas, true)) {
                FW.write(cuenta.getIban() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Excepción de E/S: "); e.printStackTrace();
        }
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getIban().equals(cuenta.getIban())) {
                cuentas.remove(i);
            }
        }
    }

    public void borrarRecursivamente (File dir) {
        File[] elementos = dir.listFiles();
        for (File unElemento : elementos) {
            if (unElemento.isDirectory()) {
                borrarRecursivamente(unElemento);
            } else {
                unElemento.delete();
            }
        }
        boolean borrada = dir.delete();
        if (borrada) System.out.println("La carpeta ha sido borrada con éxito");
    }

}
