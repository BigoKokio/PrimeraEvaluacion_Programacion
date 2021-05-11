package PROG.ExámenesPROG.ExamenParcial2EV_PROG;

public class ExamenParcial2A_2EV_PROG {
    public static void main(String[] args) {

    /*
    1. (0,25 puntos) Un array llamado nombreArtístico, de tamaño 15,
    que guardará el nombre de cada alumno. Utiliza el tipo de dato que considres más conveniente.
    Deberá contener los siguientes elementos, en este orden:
    "Ariana Grande", "Taylor Swift", "Justin Bieber", "Nicki Minaj", "Jennifer López",
    "Miley Cyrus", "Katy Perry", "Justin Timberlake", "Marilyn Manson", "Ed Sheeran",
    "Olivia Rodrigo", "Dave Grohl", "Amy Winehouse", "Robe Iniesta", "Rosendo Mercado"
    */

        String[] nombreArtísico = {"Ariana Grande", "Taylor Swift", "Justin Bieber", "Nicki Minaj", "Jennifer López", "Miley Cyrus",
                "Katy Perry", "Justin Timberlake", "Marilyn Manson", "Ed Sheeran", "Olivia Rodrigo", "Dave Grohl", "Amy Winehouse", "Robe Iniesta", "Rosendo Mercado"};

    /*
    2. (0,25 puntos) Un array llamado añoNacimiento, del mismo tamaño que los anteriores,
    con los siguientes datos: 1993, 1989, 1994, 1982, 1969, 1992, 1984, 1981, 1969, 1991,
    2003, 1969, 1983, 1962, 1954
    */

        int[] añoNacimiento = {1993, 1989, 1994, 1982, 1969, 1992, 1984, 1981, 1969, 1991, 2003, 1969, 1983, 1962, 1954};

    /*
    3. (0,25 puntos) Un array llamado estatura, con los siguientes datos:
    1.53, 1.78, 1.75, 1.57, 1.64, 1.65, 1.7, 1.85, 1.85, 1.73, 1.65,
    1.83, 1.59, 1.82, 1.85
     */

        double[] estatura = {1.53, 1.78, 1.75, 1.57, 1.64, 1.65, 1.7, 1.85, 1.85, 1.73, 1.65, 1.83, 1.59, 1.82, 1.85};

    /*
    4. (0,25 puntos) Un array llamado esMujer, con los siguientes datos:
    true, true, false, true, true, true, true, false, false, false,
    true, false, true, false, false
    */

        boolean[] esMujer = {true, true, false, true, true, true, true, false, false, false,
                true, false, true, false, false};

    // prueba 5. calcularEdad2021

        System.out.println("************* Prueba ejercicio 5 *************");
        System.out.println("Habiendo nacido en " + añoNacimiento[4] + ", este año se cumplen " + calcularEdad2021(añoNacimiento[4]));
        System.out.println();

    // prueba 6. devolverGénero

        System.out.println("************* Prueba ejercicio 6 *************");
        System.out.println(nombreArtísico[3] + " es " + devolverGénero(esMujer[3]).toLowerCase());
        System.out.println();

    // prueba 7. imprimirArtistaAlAzar

        System.out.println("************* Prueba ejercicio 7 *************");
        imprimirArtistaAlAzar(nombreArtísico, añoNacimiento, estatura, esMujer);
        System.out.println();

    // prueba 8. calcularEstaturaMedia

        System.out.println("************* Prueba ejercicio 8 *************");
        double[] estaturas = calcularEstaturaMedia(estatura, esMujer);
        System.out.printf("La estatura media general es de %.2f", estaturas[0]);
        System.out.printf(", siendo %.2f la de los hombres", estaturas[2]);
        System.out.printf(" y %.2f la de las mujeres.", estaturas[1]);

    }

/*
5. (1 punto) calcularEdad2021, que recibe un año de nacimiento
y devuelve la edad que se cumple en 2021 suponiendo que se ha nacido en el año recibido por parámetro.
Prueba su funcionamiento haciendo la llamada en el método main de forma que si,
por ejemplo, introduciendo el año de nacimiento del quinto cantante (añoNacimiento[4])
se imprima lo siguiente:
*/

    public static int calcularEdad2021(int año) {
        return 2021 - año;
    }

/*
6. (1 punto) devolverGénero, que recibe un boolean (true si es mujer, false si es hombre)
y devuelve un String: "Hombre" o "Mujer" en cada caso.
Para probarlo, imprimir una frase del tipo "Nicki Minaj es mujer",
donde Nicki Minaj es el valor de nombreArtístico[3] y “Mujer" es el resultado
de realizar la llamada correspondiente al método que hemos creado.
*/

    public static String devolverGénero(boolean sexo) {
        if (sexo = true)
            return "Mujer";
        else
            return "Hombre";
    }

/*
7. (1,5 puntos) imprimirArtistaAlAzar, en el que se genera un número entero aleatoriamente,
entre 0 y 14 y, a continuación, imprime los datos del artista al que corresponda esa posición en el array.
El método recibe los arrays creados en los cuatro primeros apartados, y no devuelve nada,
simplemente imprime algo parecido a esto:
Posición generada: 8
Marilyn Manson, hombre, 1969 cumple 52 en 2021. Mide 1.85.
En el main, realiza simplemente la llamada al método con los parámetros indicados.
 */

    public static void imprimirArtistaAlAzar(String[] nombreArtísico, int[] añoNacimiento, double[] estatura, boolean[] esMujer) {
        int num = (int) (Math.random() * 14);
        System.out.println(nombreArtísico[num] + ", " + devolverGénero(esMujer[num]).toLowerCase() + ", " + añoNacimiento[num] +
                ", cumple " + calcularEdad2021(añoNacimiento[num]) + " en 2021.");
    }

/* 8.
(2,5 puntos) calcularEstaturaMedia, que recibe dos arrays: estatura y esMujer,
y devuelve otro array con tres elementos: el primero, la estatura media de todo el array;
el segundo, la estatura media de los hombres; y el tercero, la estatura media de las mujeres.
Para mostrar su funcionamiento, en el método main se mostrará el resultado de la
siguiente forma: "La estatura media general es de X,XX cms, siendo X,XX la de los
hombres, y X,XX la de las mujeres”, donde X,XX son valores que se tomarán del array
devuelto con llamada al método; se mostrará la estatura únicamente con dos decimales.
*/

    public static double[] calcularEstaturaMedia(double[] estatura, boolean[] esMujer) {
        double sumaEstaturaT = 0, sumaEstaturaH = 0, sumaEstaturaM = 0;
        double numH = 0, numM = 0;

        for (int i = 0; i < estatura.length; i++) {
            sumaEstaturaT = sumaEstaturaT + estatura[i]; // vamos sumando estaturas del array al completo
            if (esMujer[i] == true) {
                sumaEstaturaM = sumaEstaturaM + estatura[i]; // vamos sumando las estaturas de las mujeres
                numM++; // vamos contando las mujeres
            } else {
                sumaEstaturaH = sumaEstaturaH + estatura[i]; // vamos sumando las estaturas de los hombres
                numH++; // vamos contando los hombres
            }
        }

        double mediaT = sumaEstaturaT / estatura.length; // estatura media de todo el array

        double mediaM = sumaEstaturaM / numM;   // estatura media de las mujeres

        double mediaH = sumaEstaturaH / numH;   // estatura media de los hombres

        // creamos un array para guardar las tres medias
        double[] medias = {mediaT, mediaM, mediaH};

        return medias;
    }
}
