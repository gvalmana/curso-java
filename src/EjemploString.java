public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");
        boolean esIqual = curso == curso2;
        System.out.println("curso == curso2 = " + esIqual);

        esIqual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIqual);
        esIqual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIqual);

        String curso3 = "Programación Java";
        esIqual = curso == curso3;
        System.out.println("curso == curso = " + esIqual);
    }
}
