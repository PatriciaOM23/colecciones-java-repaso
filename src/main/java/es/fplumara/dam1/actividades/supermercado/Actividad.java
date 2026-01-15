package es.fplumara.dam1.actividades.supermercado;


import java.util.*;

public class Actividad {

    public void procesarEscaneos(List<String> escaneos) {
        Set<String> productScan = new LinkedHashSet<>();
        int repeatedProducts = 0;
    for(String scan : escaneos){
        String formatScan = scan.trim().toLowerCase();
        while(formatScan.contains("  ")){
            formatScan.replace("  ", " ");
        }
        if(productScan.add(formatScan)){
            System.out.println("AÑADIDO -> " +formatScan);
        } else {
            System.out.println("REPETIDO -> " + formatScan);
            repeatedProducts++;
        }
    }
        System.out.println("Total escaneos: " + escaneos.size() + "-----------------------------");
        System.out.println("Total repetidos" + repeatedProducts + "-----------------------------" );
        System.out.println("Total productos distintos" + productScan.size() + "-----------------------------");
        productScan.forEach(scan -> System.out.println(" - " + scan + "-----------------------------") );
    }


}
