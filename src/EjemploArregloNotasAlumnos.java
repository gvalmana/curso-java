import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        System.out.println("Ingrese 7 notas para matemáticas: ");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas para historia: ");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas para lenguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }
        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematics = (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);
        System.out.println("Promedio matematicas = " + promedioHistoria);
        System.out.println("Promedio historia = " + promedioHistoria);
        System.out.println("Promedio lenguaje " + promedioLenguaje);
        System.out.println("Promedio del curso es: " + (promedioHistoria + promedioMatematics + promedioLenguaje)/3);
        System.out.println("Ingrese el identificador del alumno (0-6):");
        int id = s.nextInt();
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;
        System.out.println("El promedio del alumno es: " + id + " : " + promedioAlumno);
    }
}
