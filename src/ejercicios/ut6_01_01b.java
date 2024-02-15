package ejercicios;

public class ut6_01_01b {

    public static void main(String[] args) {

        apartado_a();
        apartado_b();
        apartado_c();
        apartado_d();
        apartado_e();
        apartado_f();
        apartado_g();
        apartado_h();
        apartado_i();

    }

    private static void apartado_a() {

        System.out.println("Apartado a:");
        System.out.println("+--------------------------------+");


        String cadena = "This is Java!";
        System.out.println(cadena.length());
    }

    private static void apartado_b() {

        System.out.println("Apartado b:");
        System.out.println("+--------------------------------+");


        String cadena = "Java";
        char [] charArray = cadena.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }

    private static void apartado_c() {

        System.out.println("Apartado c:");
        System.out.println("+--------------------------------+");


        String cadena = "Java desde 0";
        String invertida = "";
        for (int i = cadena.length() -1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }
        System.out.println(cadena);
        System.out.println(invertida);
    }

    private static void apartado_d() {

        System.out.println("Apartado d:");

        String cadena = "James Gosling created Java";
        System.out.println(cadena.replace(" ", ""));
    }

    private static void apartado_e() {

        System.out.println("Apartado e:");
        System.out.println("+--------------------------------+");


        String cadena = "Java Java Java";
        int vocales = 0;
        int consonantes = 0;

        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') {
                if (esVocal(caracter)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    private static boolean esVocal (char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u';

    }

    private static void apartado_f() {

        System.out.println("Apartado f:");
        System.out.println("+--------------------------------+");

        String cadena = "ProgramaciónEntornos";

        String parte1 = cadena.substring(0, 11);
        String parte2 = cadena.substring(11);

        String concatenada = parte1 + parte2;
        System.out.println(concatenada);

    }

    private static void apartado_g() {

        System.out.println("Apartado g:");
        System.out.println("+--------------------------------+");


        String cadena = "java";
        String cadenaMayuscula = cadena.toUpperCase();
        String y = cadenaMayuscula;
        System.out.println(y);
        System.out.println(y.toLowerCase());
    }

    private static void apartado_h() {

        System.out.println("Apartado h:");
        System.out.println("+--------------------------------+");


        String c1 = "Java";
        String c2 = "JavaScript";
        System.out.println(c1.equals(c2));
    }

    private static void apartado_i() {

        System.out.println("Apartado i:");
        System.out.println("+--------------------------------+");


        String cadena = "Jeve jeve jeve";
        System.out.println(cadena);
        System.out.println(cadena.replace('e','a'));
    }

}
