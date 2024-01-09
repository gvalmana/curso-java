public class EjemploMatricesSumarFilasColumnas {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {5,6,7},
                {9,10,11},
        };
        int sumnafila;
        int sumacolumna;
        for (int i = 0; i < a.length; i++) {
            sumnafila = 0;
            sumacolumna = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumnafila += a[i][j];
                sumacolumna += a[j][i];
            }
            System.out.println("Total fila " + i + ": "+sumnafila);
            System.out.println("Total columna " + i + ": "+sumacolumna);
        }
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
