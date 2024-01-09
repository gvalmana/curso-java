public class EjemploMatricesString2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};
        System.out.println("Ciclo foreach");
        for(String[] fila: nombres){
            for (String nombre: fila){
                System.out.println("El nombre es: " + nombre);
            }
        }
    }
}
