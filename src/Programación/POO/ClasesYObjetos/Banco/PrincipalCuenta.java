package Programación.POO.ClasesYObjetos.Banco;

public class PrincipalCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Z.Zamorano", 1);
        System.out.println("Saldo de " + c1.getTitular() + ": " + c1.getSaldo());
        Cuenta c2 = new Cuenta("Y.Yubero", 2, 1000);
        System.out.println("Saldo de " + c2.getTitular() + ": " + c2.getSaldo());
        System.out.println("-----------------------");
        c1.ingresar(500);
        System.out.println("Saldo de " + c1.getTitular() + ": " + c1.getSaldo());
        c2.ingresar(6000);
        System.out.println("Saldo de " + c2.getTitular() + ": " + c2.getSaldo());
        System.out.println("-----------------------");
        c1.retirar(200);
        c2.retirar(8000);
        System.out.println("-----------------------");
        c1.imprimir();
    }
}
