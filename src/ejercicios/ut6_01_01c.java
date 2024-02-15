package ejercicios;

import java.util.Scanner;

public class ut6_01_01c {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena de caracteres:");

        String cadena = scanner.nextLine();

        String[] caracteres = cadena.split(" ");

        int contadorPalabras = caracteres.length;

        System.out.println("El número de palabras en la cadena es: " + contadorPalabras);

        scanner.close();

    }

}
