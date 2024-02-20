package ejercicios_string_buffer;

public class ut6_01_02b {

    public static void main(String[] args) {

        System.out.println("Apartado A:");

        StringBuffer stringBuffer = new StringBuffer("Hola mundo");
        stringBuffer.append("!!!");
        System.out.println(stringBuffer.append(stringBuffer));
        System.out.println("+-----------------------------------+");

        System.out.println("Apartado b:");

        stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        System.out.println(stringBuffer.length() -1);
        System.out.println("+-----------------------------------+");

        System.out.println("Apartado c:");

        stringBuffer.setCharAt(0, 'h');
        System.out.println(stringBuffer);
        System.out.println("+-----------------------------------+");

        System.out.println("Apartado d:");

        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == '!') {
                stringBuffer.insert(i, '-');
                i++;
            }
        }
        System.out.println(stringBuffer);
        System.out.println("+-----------------------------------+");

        System.out.println("Apartado e:");

        int indexMundo = stringBuffer.indexOf("mundo");
        stringBuffer.delete(indexMundo, indexMundo + "mundo".length());
        stringBuffer.deleteCharAt(indexMundo);
        System.out.println(stringBuffer);
        System.out.println("+-----------------------------------+");

        System.out.println("Apartado f:");

        System.out.println(stringBuffer.reverse());
        System.out.println("+-----------------------------------+");

        System.out.println("Apartado g:");

        StringBuffer emptyBuffer = new StringBuffer();
        System.out.println("Capacidad de la cadena vacía: " + emptyBuffer.capacity());
        System.out.println("+-----------------------------------+");

        System.out.println("Apartado h:");

        String fraseLarga = "Esta es una frase larga para probar la capacidad de StringBuffer";
        StringBuffer stringBuffer2 = new StringBuffer(fraseLarga);
        System.out.println("Capacidad de la cadena larga: " + stringBuffer2.capacity());
        System.out.println("+-----------------------------------+");
    }

}
