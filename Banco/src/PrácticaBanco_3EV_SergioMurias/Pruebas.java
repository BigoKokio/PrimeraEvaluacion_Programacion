package PrácticaBanco_3EV_SergioMurias;

import java.io.IOException;

public class Pruebas {
    public static void main(String[] args) throws IOException {
        System.out.println("----------------------------------");
        Sucursal S1 = new Sucursal("1210", "1444");
        System.out.println("----------------------------------");
        S1.crearCuenta("titular1", 100000);
        //S1.crearCuenta("titular2", 10000);
        //S1.crearCuenta("titular3", 1000);
        System.out.println("----------------------------------");
        S1.cuentas.get(0).imprimir();
        //S1.cuentas.get(1).imprimir();
        //S1.cuentas.get(2).imprimir();
        System.out.println("----------------------------------");
        S1.ingresar(S1.cuentas.get(0), 10);
        S1.retirar(S1.cuentas.get(0), 5);
        System.out.println("----------------------------------");
        //S1.generarExtracto(S1.cuentas.get(0));
        //S1.bloquearCuenta(S1.cuentas.get(0));
        //System.out.println("----------------------------------");
        //S1.crearCuenta("PruebaBloqueada", 5000);
        Cuenta C1 = new Cuenta("Pepe", "ES2112101444127854126515");
        //Cuenta C2 = new Cuenta("Alberto", "ES2152694526321547852145");
        //S1.bloquearCuenta(C1);
        //S1.eliminarCuenta(C1);

    }
}
