import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        System.out.println("Ingrese 7 enteros: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i+1]){
                descendente = true;
            }
            if (a[i] < a[i+1]) {
                ascendente = true;
            }
        }
        if (descendente && ascendente){
            System.out.println("Arreglo desordenado");
        }
        if (!descendente && !ascendente){
            System.out.println("Los elementos del arreglo son iguales");
        }
        if (descendente && !ascendente){
            System.out.println("El arreglo está ordenado de forma descendente");
        }
        if (ascendente && !descendente){
            System.out.println("El arreglo está ordenado de forma ascendente");
        }
    }
}
