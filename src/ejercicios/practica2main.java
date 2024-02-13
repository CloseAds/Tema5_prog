package ejercicios;

import java.util.Scanner;

public class practica2main {

    public static void main(String[] args) {

        apartado_a();

        apartado_b();

        apartado_c();


    }

    private static void apartado_a() {
        String cadena = "This is Java!";
        System.out.println(cadena.length());
    }

    private static void apartado_b() {
        String cadena = "Java";
        char [] charArray = cadena.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }

    private static void apartado_c() {
        String cadena = "Java desde 0";
        String invertida = "";
        for (int i = cadena.length() -1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        System.out.println(cadena);
        System.out.println(invertida);
    }

}
