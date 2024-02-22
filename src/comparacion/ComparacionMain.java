package comparacion;

import java.util.*;

public class ComparacionMain {

    public static void main(String[] args) {

        Persona p1 = new Persona("12345678Z", "Luis", "López", "5512345567");
        Persona p2 = new Persona("23456789A", "Antonio", "Molina", "12234678");
        Persona p3 = new Persona("12345678Z", "Isabel", "Garcia", "567890123456");
        Persona p4 = new Persona("23454778B", "Manuel", "Pérez", "8934572090");

        List<Persona> lista = new ArrayList<>();

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        Collections.sort(lista);

        Collections.sort(lista, new CompararTelefonoPersona());

        Collections.sort(lista, new Comparator<Persona>() {
                    @Override
                    public int compare(Persona o1, Persona o2) {
                        return 0;
                    }});

                System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        System.out.println(p1.compareTo(p4));
        System.out.println(p2.compareTo(p1));

        System.out.println("+-------------------------------------------------+");

        for (Persona p : lista){
            System.out.println(p);
        }



    }

}
