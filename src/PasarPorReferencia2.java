class Persona{
    private String nombre;

    public Persona(){

    }
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

public class PasarPorReferencia2 {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Gustavo");
        System.out.println("persona = " + persona.getNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona = " + persona.getNombre());
        System.out.println("Finaliza el metodo main con los datos del arreglo modificado");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test");
        persona.setNombre("Ainhoa");
        System.out.println("Finaliza el metodo test con los datos cambiados");
    }
}
