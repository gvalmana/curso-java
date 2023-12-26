public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Gustavo";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Gustavo\") = " + nombre.equals("Gustavo"));
        System.out.println("nombre.equals(\"gustavo\") = " + nombre.equals("gustavo"));
        System.out.println("nombre.equalsIgnoreCase(\"gustavo\") = " + nombre.equalsIgnoreCase("gustavo"));
        System.out.println("nombre.compareTo(\"Gustavo\") = " + nombre.compareTo("Gustavo"));
        System.out.println("nombre.compareTo(\"Gabriel\") = " + nombre.compareTo("Andrés"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre = " + nombre.substring(1));
        System.out.println("nombre = " + nombre.substring(1, 4));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("t"));
        System.out.println("trabalenguas.contains(\"bal\") = " + trabalenguas.contains("bal"));
        System.out.println("trabalenguas.contains(\"bal\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.startsWith(\"g\") = " + trabalenguas.startsWith("g"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));

    }
}
