import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int elemento, position;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Nuevo elemento:");
        elemento = s.nextInt();
        System.out.println("Posición a agregar (0 a 9)");
        position = s.nextInt();
        for (int i = a.length - 2; i >= position; i--) {
            a[i + 1] = a[i];
        }
        a[position] = elemento;
        System.out.println("El arreglo: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
