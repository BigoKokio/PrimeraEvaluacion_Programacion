package PROG.ExcepcionesPROG;

public class ExcepcionesMúltiples {
    public static void main(String[] args) {

        try {
            // ArithmeticException
            // int a = 10;
            // int b = 0;
            // System.out.println(a / b);

            // NumberFormatException
            // int num = Integer.parseInt("M");

            // NullPointerException
            // String cadena = null;
            // int longitud = cadena.length();

            // NegativeArraySizeException
            // int[] array = new int[-1];

            // ArrayIndexOutOfBoundsException
            // int[] array = {1, 2, 3, 4};
            // int num = array[4];

        } catch (ArithmeticException ae) {
            System.out.println("Excepción aritmética: " + ae.getMessage());

        } catch (NumberFormatException nfe) {
            System.out.println("Excepción de formato de número: " + nfe.getMessage());

        } catch (NullPointerException npe) {
            System.out.println("Excepción de objeto apuntado no inicializado: " + npe.getMessage());

        } catch (NegativeArraySizeException nase) {
            System.out.println("Excepción de array de tamaño negativo: " + nase.getMessage());

        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println("Excepción de array fuera de los límites: " + aiob.getMessage());

        } catch (Exception e) {
            System.out.println("Excepción no prevista: " + e.getMessage());
            // e.printStackTrace();
        }
    }
}
