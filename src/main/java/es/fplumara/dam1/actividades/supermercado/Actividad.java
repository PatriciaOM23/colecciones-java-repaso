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

//        System.out.println("--------------------------------\n");
//        Set <String> escaneoProductos = new HashSet<>();
//
//        int productoRepetido = 0;
//        for(String escaneo : escaneos){
//            String escaneoFormateado = escaneo.trim().toLowerCase();
//            while(escaneoFormateado.contains("  ")){
//                escaneoFormateado.replace("  ", " ");
//            }
//            if(escaneoProductos.add(escaneoFormateado)){
//                System.out.println("AÑADIDO -> " + escaneoFormateado);
//            } else {
//                System.out.println("REPETIDO -> " + escaneoFormateado);
//                productoRepetido++;
//            }
//        }
//        System.out.println("Total escaneos: " + escaneos.size() + "-----------------------------");
//        System.out.println("Total repetidos" + productoRepetido + "-----------------------------" );
//        System.out.println("Total productos distintos" + escaneoProductos.size() + "-----------------------------");
//        escaneoProductos.forEach(scan -> System.out.println(" - " + scan + "-----------------------------") );
    }


}
