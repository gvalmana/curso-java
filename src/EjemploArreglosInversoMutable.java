import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosInversoMutable {

    public static void InvertirArreglo(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 -i ] = actual;
            total2--;
        }
    }
    public static void main(String[] args) {
        String[] productos = new String[7];
        productos[0] = "Memoria Kinstong";
        productos[1] = "Samsun Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Macbook Air";
        productos[4] = "Chromecast 4th gen";
        productos[5] = "Asus Noteboook";
        productos[6] = "Other";
        //Ordenando
        Arrays.sort(productos);
        int total = productos.length;
        System.out.println("=== USANDO FOR ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Productos " + i +" : "+ productos[i]);
        }
        System.out.println("=== INVIRTIENDO ===");
        InvertirArreglo(productos);
        //Collections.reverse(Arrays.asList(productos));
        System.out.println("===RESULTADO===");
        for (int i = 0; i < total; i++) {
            System.out.println("Productos " + i +" : "+ productos[i]);
        }
    }
}
