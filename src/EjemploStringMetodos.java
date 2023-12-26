public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Gustavo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Gustavo\") = " + nombre.equals("Gustavo"));
        System.out.println("nombre.equals(\"gustavo\") = " + nombre.equals("gustavo"));
    }
}
