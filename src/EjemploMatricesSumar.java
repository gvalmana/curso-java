public class EjemploMatricesSumar {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {5,6,7},
                {9,10,11},
        };
        int[][] b = {
                {1,2,3},
                {5,6,7},
                {9,10,11},
        };
        int[][] suma = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                suma[i][j] = a[i][j] + b[i][j];
            }
        }
        imprimirMatrix(suma);
    }
    private static void imprimirMatrix(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
