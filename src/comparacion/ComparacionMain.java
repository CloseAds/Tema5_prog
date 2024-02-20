package comparacion;

import java.util.ArrayList;
import java.util.List;

public class ComparacionMain {

    public static void main(String[] args) {

        Persona p1 = new Persona("12345678Z", "Luis", "López", "5512345567");
        Persona p2 = new Persona("23456789A", "Antonio", "Molina", "12234678");
        Persona p3 = new Persona("12345678Z", "Isabel", "Garcia", "567890123456");
        Persona p4 = new Persona("23454778B", "Manuel", "Pérez", "8934572090");

        List<Persona> lista = new ArrayList<>();

        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));
        System.out.println(p1.compareTo(p4));
        System.out.println(p2.compareTo(p1));

        p1.equals(p2);



    }

}
