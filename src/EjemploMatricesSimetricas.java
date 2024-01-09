public class EjemploMatricesSimetricas {
    public static void main(String[] args) {
        int[][] matriz = {
            {1,2,3,4},
            {2,1,0,5},
            {3,0,1,6},
            {4,5,6,7}
        };
        boolean esSimetrica = true;
        int i , j;
        i = 0;
        while (i < matriz.length && esSimetrica){
            j = 0;
            while (j < i && esSimetrica){
                esSimetrica = matriz[i][j] == matriz[j][i];
                j++;
            }
            i++;
        }
        if (esSimetrica){
            System.out.println("Es simétrica");
        } else {
            System.out.println("No es simétrica");
        }
    }
}
