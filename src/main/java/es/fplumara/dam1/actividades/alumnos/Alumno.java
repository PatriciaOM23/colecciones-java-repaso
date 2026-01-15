package es.fplumara.dam1.actividades.alumnos;

import java.util.Objects;

public class Alumno implements Comparable <Alumno> {
    private final String dni;
    private final String nombre;

    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{dni='" + dni + "', nombre='" + nombre + "'}";
    }

    @Override
    public int compareTo(Alumno o) {
        return this.dni.compareTo(o.dni);
    }
}
