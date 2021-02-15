package Programación.POO.ClasesYObjetos.Banco;

public class Cuenta {
    private String titular;
    private long número;
    private long saldo;
    private boolean bloqueada;
    public Cuenta(String titular, long número) {
        this.titular = titular;
        this.número = número;
        // this.bloqueada = false;
        // no es necesario porque el valor por defecto de un boolean es false
    }
    public Cuenta(String titular, long número, long saldo) {
        this.titular = titular;
        this.número = número;
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    // No se crea un setter para el titular
    // porque no se puede cambiar el titular de una cuenta
    public long getNúmero() {
        return número;
    }
    // No se crea un setter para el número
    // porque no se puede cambiar el número de una cuenta
    public long getSaldo() {
        return saldo;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public boolean isBloqueada() {
        return bloqueada;
    }
    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }
    public long ingresar(long cantidad) {
        if (bloqueada == false) {
            this.saldo = this.saldo + cantidad;
        } else {
            System.out.println("Operación rechazada: esta cuenta está bloqueada");
        }
        return saldo;
    }
    public long retirar(long cantidad) {
        if (bloqueada == false && cantidad < saldo) {
            this.saldo = this.saldo - cantidad;
        } else {
            System.out.println("Operación rechazada: no dispone de esa cantidad");
        }
        return saldo;
    }
}
