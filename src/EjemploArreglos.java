import java.util.Arrays;

public class EjemploArreglos {
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
        System.out.println("=== USANDO FOR ===");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Productos " + i +" : "+ productos[i]);
        }
        System.out.println("=== USANDO FOR EACH ===");
        for (String prod: productos) {
            System.out.println("prod = " + prod);
        }
        System.out.println("=== USANDO WHILE ===");
        int i = 0;
        while (i<productos.length){
            System.out.println("Productos " + i +" : "+ productos[i]);
            i++;
        }
        System.out.println("=== USANDO DO WHILE ===");
        int j = 0;
        do {
            System.out.println("Productos " + j +" : "+ productos[j]);
            j++;
        } while (j < productos.length);

        int[] enteros = new int[10];
        for (int k = 0; k < enteros.length; k++) {
            enteros[k] = k * 3;
            System.out.println("enteros[k] = " + enteros[k]);
        }
    }
}
