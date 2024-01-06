import java.util.Scanner;

public class EjemploArreglosEliminar {
    public static void main(String[] args) {
        int[] a = new int[10];
        int position;
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero: ");
            a[i] = s.nextInt();
        }
        System.out.println();
        System.out.println("Inserte la posición a eliminar (0 a 9)");
        position = s.nextInt();
        for (int i = position; i < a.length - 1; i++) {
            a[i] = a[i+1];
        }
        System.out.println("El arreglo: ");
        int[] array_response = new int[a.length-1];
        System.arraycopy(a, 0, array_response,0, array_response.length);
        a = array_response;
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " => " + a[i]);
        }
    }
}
