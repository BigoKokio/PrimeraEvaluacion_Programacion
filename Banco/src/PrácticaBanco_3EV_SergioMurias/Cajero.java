package PrácticaBanco_3EV_SergioMurias;

import java.util.Scanner;

public class Cajero {
    public void Cajero(Cuenta cuenta) {
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        do {
            System.out.println("¿De qué cuenta quieres hacer las operaciones?: ");
            System.out.println("--Operaciones--");
            System.out.println("1. Ingresar: ");
            System.out.println("2. Retirar: ");
            System.out.println("3. Consultar: ");
            System.out.println("4. Salir: ");
            int opción = sc.nextInt();
            switch (opción) {
                case 1:
                    System.out.println("¿Cúanto dinero quieres ingresar?: ");
                    double cantidadING = sc.nextDouble();
                    cuenta.setSaldo(cuenta.getSaldo() + cantidadING);
                    System.out.println("¿Quiéres realizar otra operación? (true/false)");
                    seguir = sc.nextBoolean();
                    break;
                case 2:
                    System.out.println("Cuánto dinero quieres retirar?: ");
                    double cantidadRET = sc.nextDouble();
                    cuenta.setSaldo(cuenta.getSaldo() - cantidadRET);
                    System.out.println("¿Quiéres realizar otra operación? (true/false)");
                    seguir = sc.nextBoolean();
                    break;
                case 3:
                    System.out.println("Títular: " + cuenta.getTitular() + ", Nº Cuenta: " + cuenta.getIban() + ", saldo: " + cuenta.getSaldo() + ", bloqueada: " + cuenta.isBloqueada());
                    System.out.println("¿Quiéres realizar otra operación? (true/false)");
                    seguir = sc.nextBoolean();
                    break;
                case 4:
                    seguir = false;
                    break;
            }
        } while (seguir);
    }
}
