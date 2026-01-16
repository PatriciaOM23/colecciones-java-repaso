package es.fplumara.dam1.actividades.alumnos;

import java.util.*;

public class Actividad  {

    public void procesar(List<Alumno> alumnosEntrada) {

        // HASHSET
        Set<Alumno> alumnoSet = new HashSet<Alumno>();
        int contador = 0;
        for (Alumno alumnos : alumnosEntrada) {
            // NO ESTOY METIENDO ESTOS AL SET ES SOLO PARA NORMALIZAR EL DNI
            String alumnoFormateado = alumnos.getDni().trim().toUpperCase();
            while (alumnoFormateado.contains("  ")) {
                alumnoFormateado.replace("  ", " ");
            }

            alumnoSet.add(alumnos);
            contador++;
        }
        System.out.println(alumnoSet.size());
        alumnoSet.forEach(alumnos -> System.out.println("Alumno -> " + alumnos));
        System.out.println("Cuantos intentamos meter: " + contador);
        System.out.println("Cuantos han quedado: " + alumnoSet.size());


        // TREESET
        System.out.print("---------------------------------\n");
        Set<Alumno> alumnoTreeSet = new TreeSet<Alumno>();
        for (Alumno alumnoTree : alumnosEntrada) {
            alumnoTreeSet.add(alumnoTree);
        }

        alumnoTreeSet.forEach(alumnos -> System.out.println("Alumno -> " + alumnos));
        System.out.println(alumnoTreeSet.size());

    }


}