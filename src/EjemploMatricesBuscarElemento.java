public class EjemploMatricesBuscarElemento {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
                {30,90,3},
                {15,220,156},
                {45,7,899}
        };
        int elementoBuscar = 345;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                encontrado = elementoBuscar == matrizDeEnteros[i][j];
                if (encontrado) break buscar;
            }
        }
        if (encontrado){
            System.out.println("Encontrado el elemento " + elementoBuscar + "en las coordenadas " + i +" , " + j);
        } else {
            System.out.println("No se encontró en la matriz");
        }
    }
}
