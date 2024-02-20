package mapas;

public class Persona {

    private String nombre;

    private String apellidos;

    private String telefono;

    public Persona(String nombre, String apellidos, String telewfono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telewfono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelewfono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telewfono='" + telefono + '\'' +
                '}';
    }
}
