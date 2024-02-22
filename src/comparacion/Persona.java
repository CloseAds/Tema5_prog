package comparacion;

import java.util.Objects;

public class Persona implements Comparable<Persona> {

    private String nombre;

    private String dni;

    private String apellidos;

    private String telefono;

    public Persona(String dni, String nombre, String apellidos, String telewfono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telewfono;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telewfono='" + telefono + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(apellidos, persona.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apellidos);
    }

    @Override
    public int compareTo(Persona o) {
        int resultado = this.apellidos.compareTo(o.getApellidos());
        if (resultado == 0){
             resultado = this.nombre.compareTo(o.getNombre());
             if (resultado == 0){
                 return resultado;
             }
        }
        return resultado;
    }


}
