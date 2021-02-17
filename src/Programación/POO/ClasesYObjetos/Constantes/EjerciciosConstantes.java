package Programación.POO.ClasesYObjetos.Constantes;

public class EjerciciosConstantes {
// Constantes (final)
// Crea un paquete constantes y dentro una clase EjerciciosConstantes, en la cual declararmos las siguientes constantes:
//- Días de la semana (valor: 7)
    public static final int DIAS_DE_LA_SEMANA = 7;
//- Meses del año (valor: 12)
    public static final int MESES_DEL_AÑO = 12;
//- Horas del día (valor: 24)
    public static final int HORAS_DEL_DIA = 24;
/* 1. Añade un método calcularHoras,
que recibe un número de días y devuelve las horas que contienen esos días
 */
    public static int calcularHoras(int dias) {
        return dias * HORAS_DEL_DIA;
    }
/* 2. Añade un método calcularSemanas,
que recibe un número de días e imprime las semanas y días restantes que contiene
 */
    public static void calcularSemanas(int dias) {
        int semanas = dias / DIAS_DE_LA_SEMANA;
        int diasRestantes = dias % DIAS_DE_LA_SEMANA;
        System.out.println(dias + " dias contienen " + semanas + " semanas y " + diasRestantes + " días.");
    }
/* 3. Añade un método calcularAños,
que recibe un número de meses e imprime los años y meses restantes que contiene
 */
    public static void calcularAños(int meses) {
        int años = meses / MESES_DEL_AÑO;
        int mesesRestantes = meses % MESES_DEL_AÑO;
        System.out.println(meses + " meses contienen " + años + " años y " + mesesRestantes + " meses.");
    }
/* 4. Añade un método calcularAreaCírculo,
que recibe la longitud del radio (valor con decimales) y devuelve el área del círculo.
 */
    public static double calcularAreaCirculo(double radio) {
    return Math.PI * Math.pow(radio, 2);
}
// 5. Añade un método calcularVolumenEsfera,
// que recibe la longitud del radio (valor con decimales) y devuelve el volumen del círculo.
    public static double calcularVolumenEsfera(double radio) {
    return (4 * Math.PI * Math.pow(radio, 3)) / 3;
}
// En el método main:
// - Haz un menú que pregunte qué método queremos utilizar, y a continuación pida los datos necesarios por teclado y muestre el resultado
    public static void main(String[] args) {
        System.out.println("3 dias contienen " +  calcularHoras(3) + " horas");
        calcularSemanas(10);
        calcularAños(51);
        System.out.printf("Area circulo: %.2f", calcularAreaCirculo(5));
        System.out.println();
        System.out.printf("Volumen esfera: %.2f", calcularVolumenEsfera(5));
    }
}
