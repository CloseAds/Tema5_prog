package ejercicios;

import java.util.Scanner;

public class ut6_01_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.println("Introduce líneas de texto (escribe FIN para terminar):");
        while (true) {
            line = scanner.nextLine().trim();
            if (line.equalsIgnoreCase("FIN")) {
                break;
            }


            System.out.println("a) Línea en minúsculas: " + line.toLowerCase());


            System.out.print("b) Línea con caracteres en orden inverso: ");
            for (int i = line.length() - 1; i >= 0; i--) {
                System.out.print(line.charAt(i));
            }
            System.out.println();

            StringBuilder modifiedLine = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                if (i % 2 == 0) {
                    modifiedLine.append(Character.toLowerCase(currentChar));
                } else {
                    modifiedLine.append(Character.toUpperCase(currentChar));
                }
            }
            System.out.println("c) Línea con caracteres en posición impar mayúsculas y en posición par minúsculas: " + modifiedLine.toString());

            String replacedLine = line.replaceAll("[Aa]", "@");
            System.out.println("d) Línea con las letras 'A' reemplazadas por '@': " + replacedLine);

            int[] vowelCounts = new int[5]; // a, e, i, o, u
            for (int i = 0; i < line.length(); i++) {
                char currentChar = Character.toLowerCase(line.charAt(i));
                switch (currentChar) {
                    case 'a':
                        vowelCounts[0]++;
                        break;
                    case 'e':
                        vowelCounts[1]++;
                        break;
                    case 'i':
                        vowelCounts[2]++;
                        break;
                    case 'o':
                        vowelCounts[3]++;
                        break;
                    case 'u':
                        vowelCounts[4]++;
                        break;
                }
            }
            System.out.println("e) Número de veces que aparece cada vocal:");
            System.out.println("   a: " + vowelCounts[0]);
            System.out.println("   e: " + vowelCounts[1]);
            System.out.println("   i: " + vowelCounts[2]);
            System.out.println("   o: " + vowelCounts[3]);
            System.out.println("   u: " + vowelCounts[4]);
        }
        scanner.close();
    }
}

