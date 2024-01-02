import java.util.Arrays;

public class EjemploOrdenamientoBurbuja {

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

    public static void bubbleSort(Object[] array){
        int total = array.length;
        int contador = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (((Comparable<Object>)array[j+1]).compareTo(array[j]) < 0){
                    Object temporal = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temporal;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
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
        //Arrays.sort(productos);

        int total = productos.length;
        for (int i = 0; i < total; i++) {
            System.out.println("Productos " + i +" : "+ productos[i]);
        }

        System.out.println("=== ORDENANDO ===");
        bubbleSort(productos);
        System.out.println("===RESULTADO===");
        for (int i = 0; i < total; i++) {
            System.out.println("Productos " + i +" : "+ productos[i]);
        }

        Integer[] numbers = new Integer[4];
        numbers[0] = 35;
        numbers[1] = -4;
        numbers[2] = 10;
        numbers[3] = 5;

        int totalNumbers = numbers.length;
        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Numbers " + i +" : "+ numbers[i]);
        }

        System.out.println("=== ORDENANDO ===");
        bubbleSort(numbers);
        System.out.println("===RESULTADO===");
        for (int i = 0; i < totalNumbers; i++) {
            System.out.println("Numbers " + i +" : "+ numbers[i]);
        }
    }
}
