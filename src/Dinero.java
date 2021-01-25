import java.util.Scanner;

public class Dinero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10:");
        int diezEuro = sc.nextInt();
        System.out.println("5:");
        int cincEuro = sc.nextInt();
        System.out.println("2:");
        int dosEuro = sc.nextInt();
        System.out.println("1:");
        int unEuro = sc.nextInt();
        System.out.println("0,50:");
        int cincuentaCent = sc.nextInt();
        System.out.println("0,20:");
        int veinCent = sc.nextInt();
        System.out.println("0,10:");
        int diezCent = sc.nextInt();
        System.out.println("0,05:");
        int cincCent = sc.nextInt();
        System.out.println("0,02:");
        int dosCent = sc.nextInt();
        System.out.println("0,01:");
        int unCent = sc.nextInt();
        double suma = (diezEuro * 10) + (cincEuro * 5) + (dosEuro * 2) + (unEuro * 1) + (cincuentaCent * 0.5) + (veinCent * 0.2) + (diezCent * 0.1) + (cincCent * 0.05) + (dosCent * 0.02) + (unCent * 0.01);
        System.out.println(suma);
    }
}
