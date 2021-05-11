package PROG.ExcepcionesPROG;

public class EjemploPorSeparado {
    public static void main(String[] args) {
        try {   // envolvemos el código en un try-catch para recoger una excepción que no estuviera recogida en los casos contemplados

            try {
                // Provocamos una ArithmeticException
                int a = 15;
                int b = 0;
                System.out.println(a / b);
            } catch (ArithmeticException ae) {
                System.out.println("Excepción aritmética. Mensaje: " + ae.getMessage());
            }

            try {
                // Provocamos una NumberFormatException
                int num = Integer.parseInt("AA");
            } catch (NumberFormatException nfe) {
                System.out.println("Excepción de formato (NumberFormatException). Mensaje: " + nfe.getMessage());
            }

            try {
                // NullPointerException
                String cadena = null;
                int longitud = cadena.length();
            } catch (NullPointerException npe) {
                System.out.println("Excepción de objeto inexistente (NullPointerException). Mensaje: " + npe.getMessage());
            }

            int[] array;
            try {
                // NegativeArraySizeException
                array = new int[-5];
            } catch (NegativeArraySizeException nase) {
                System.out.println("Tamaño de array negativo. " + nase.getMessage());
            }

            try {
                // ArrayIndexOutOfBoundsException
                array = new int[]{1, 2, 3, 4};
                System.out.println(array[4]);
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Te has salido del array." + aioobe.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Excepción no prevista: " + e.getMessage());
            //e.printStackTrace();
        } finally {
            System.out.println("Aquí ya hemos terminado el bloque try-catch.");
        }
        System.out.println("Y aquí seguimos con nuestra vida.");
    }
}