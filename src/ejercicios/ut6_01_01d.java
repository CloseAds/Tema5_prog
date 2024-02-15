package ejercicios;

import java.util.Scanner;

public class ut6_01_01d {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el texto a evaluar:");
        String texto = scanner.nextLine().toLowerCase();

        int[] frecuenciaVocales = new int[5];

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            switch (caracter) {
                case 'a':
                    frecuenciaVocales[0]++;
                    break;
                case 'e':
                    frecuenciaVocales[1]++;
                    break;
                case 'i':
                    frecuenciaVocales[2]++;
                    break;
                case 'o':
                    frecuenciaVocales[3]++;
                    break;
                case 'u':
                    frecuenciaVocales[4]++;
                    break;
            }
        }

        System.out.println("Histograma de frecuencia de vocales:");
        System.out.println("Vocal\tFrecuencia\tHistograma");
        System.out.println("-------------------------------");
        System.out.println("a\t" + frecuenciaVocales[0] + "\t\t" + generarHistograma(frecuenciaVocales[0]));
        System.out.println("e\t" + frecuenciaVocales[1] + "\t\t" + generarHistograma(frecuenciaVocales[1]));
        System.out.println("i\t" + frecuenciaVocales[2] + "\t\t" + generarHistograma(frecuenciaVocales[2]));
        System.out.println("o\t" + frecuenciaVocales[3] + "\t\t" + generarHistograma(frecuenciaVocales[3]));
        System.out.println("u\t" + frecuenciaVocales[4] + "\t\t" + generarHistograma(frecuenciaVocales[4]));
    }


    public static String generarHistograma(int frecuencia) {
        StringBuilder histograma = new StringBuilder();
        for (int i = 0; i < frecuencia; i++) {
            histograma.append("*");
        }
        return histograma.toString();
    }
}
