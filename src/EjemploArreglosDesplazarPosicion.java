import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        int ultimo;
        ultimo = a[a.length - 1];
        for (int i = ultimo - 2; i >= 0; i--) {
            a[i+1] = a[i];
        }
        a[0] = ultimo;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
