import java.util.Arrays;

public class EjemploArreglosInverso {
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
        for (int i = productos.length-1; i >= 0; i--) {
            System.out.println("Productos " + i +" : "+ productos[i]);
        }
    }
}
