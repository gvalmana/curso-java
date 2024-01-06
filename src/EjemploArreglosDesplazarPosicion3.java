import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion3 {
    public static void main(String[] args) {
        int[] a = new int[7];
        int numero, position;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Ingrese un número a insertar: ");
        numero = s.nextInt();
        position = 0;
        while (position < 6 && numero > a[position]){
            position++;
        }
        for (int i = a.length - 2; i >= position ; i--) {
            a[i+1] = a[i];
        }
        a[position] = numero;
        System.out.println("El arreglo ordenado: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }
    }
}
