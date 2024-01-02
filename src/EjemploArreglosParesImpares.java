import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];
        System.out.println("Ingrese 10 enteros: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
                totalPares++;
            }else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];
        int paresIndex = 0;
        int imparesIndex =0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2 == 0){
                pares[paresIndex++] = a[i];
            }else {
                impares[imparesIndex++] = a[i];
            }
        }
        System.out.println("===Pares===");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i]+" ");
        }
        System.out.println("\n===Impares===");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i]+" ");
        }
        System.out.println();
    }
}
