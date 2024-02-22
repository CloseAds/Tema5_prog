package gestion_estudiantes;

import java.util.*;

public class GestionMain {

    public static void main(String[] args) {

        HashSet conujunto = new HashSet();

        conujunto.add("1ºDAM");
        conujunto.add("1ºDAW");
        conujunto.add("1ºASIR");

        final Map<String, List<Estudiante>> listadoGrupos = new TreeMap<>();

        listadoGrupos.put("1ºDAM", new ArrayList<>());
        listadoGrupos.put("1ºDAW", new ArrayList<>());
        listadoGrupos.put("1ºASIR", new ArrayList<>());

        boolean salir = false;
        while (!salir) {
            switch (dibujarMenu()){
                case 1:
                    return "";
            }
        }

    }

    public static void dibujarMenu(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

}
