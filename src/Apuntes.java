// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Apuntes {
    public static void main(String[] args) {

        String cadena = null;

        System.out.println(cadena);

        cadena = "Hola mundo";

        String cadena2 = cadena;

        System.out.println(cadena);

        //cadena2 = cadena2 + " adios";

        System.out.println(cadena2);

        String cadena3 = cadena.toUpperCase();

        System.out.println(cadena.toUpperCase());

        System.out.println(cadena);

        cadena = cadena.toUpperCase();

        System.out.println(cadena);

        String cadena4 = "Hola mundo";

        cadena4 = cadena4 + "!!!";

        String cadena5 = new String("hola caracola");

        char[] charArray = cadena5.toCharArray();

        char[] charArray2 = {'a', 'b', 'c'};


        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        for (int i = 0; i < charArray2.length; i++) {
            System.out.println(charArray2[i]);
        }

        String cadena6 = new String(charArray2);

        System.out.println(cadena6);

        String cadena7 = new String(charArray,3,6);  //offset significa desplazamiento  se queda con "a cara" de hola caracola;

        System.out.println(cadena7);

        String cadena8 = 2 + 3 + "cervezas";
        String cadena9 = "cervezas " + 2 + 3;
        String cadena10 = "cervezas " + 2 + 3;

        System.out.println(cadena8);
        System.out.println(cadena9);

        System.out.println(cadena10.length());
        System.out.println(cadena10.toUpperCase());
        System.out.println(cadena10.toLowerCase());

        System.out.println(cadena10.equals(cadena9));  //metodo equals que devuelve si es verdadero o falso la implementación;

        System.out.println(cadena10.equalsIgnoreCase(cadena9));

        System.out.println(cadena10.toLowerCase().equals(cadena9.toLowerCase()));

        System.out.println(cadena10.compareTo(cadena9));
        System.out.println(cadena9.compareTo(cadena10));

        System.out.println(cadena9.concat(cadena10));
        cadena9 = cadena9.concat(cadena10);
        System.out.println(cadena9);

        System.out.println(cadena9.repeat(4));

        String cadena11 = " Adiós mundo cruel ";

        System.out.println("*" + cadena11 + "*");

        System.out.println("*" + cadena11.trim() + "*"); // metodo "trim" para quitar caracteres no imprimibles como espacios en blanco;

        System.out.println("*" + cadena11.stripLeading() + "*"); //StripLeading para quitar caracteres por delante;
        System.out.println("*" + cadena11.stripTrailing() + "*"); //StripTrailing para quitar caracteres por atrás;
        System.out.println("*" + cadena11.stripIndent() + "*");

        System.out.println(cadena11.isEmpty());
        System.out.println(cadena11.isBlank());

        System.out.println(cadena11.charAt(3));

        System.out.println(cadena11.substring(3)); // metodo substring para eliminar parte de la cadena y seguir por donde se ha marcado;
        System.out.println(cadena11.substring(3,7)); // segundo numero para marcar el final de la cadena y tambien se pueden implementar nuevo metodos como el .lenght;

        System.out.println(cadena11.indexOf('m')); //misma utilidad que substring;

        System.out.println(cadena11.substring(7));

        System.out.println(cadena11.indexOf("mundo")); //metodo indexOf para buscar caracteres dentro de una cádena;

        System.out.println(cadena11.lastIndexOf("cruel"));

        System.out.println(cadena11.indexOf('u'));
        System.out.println(cadena11.lastIndexOf('u'));

        System.out.println(cadena11.replace('u', '@'));

        System.out.println(cadena11.replace('u', '@'));
        System.out.println(cadena10.startsWith("Cer")); // Si empieza o no empieza por el caracter indicado o cadena de caracteres;

        System.out.println(cadena9.repeat(10));

        String cadena12 = cadena11.repeat(10);

        String[] s = cadena12.split("u"); // metodo split para dividir la cadena siguiendo el patrón del caracter indicado;

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}