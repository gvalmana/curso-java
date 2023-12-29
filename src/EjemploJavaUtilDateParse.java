import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String formato = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat(formato);
        System.out.println("Entre una fecha con formato " + formato);
        try {
            Date fecha = simpleDateFormat.parse(scan.next());
            System.out.println("fecha = " + fecha);
            System.out.println("simpleDateFormat = " + simpleDateFormat.format(fecha));
            Calendar calendario = Calendar.getInstance();
            Date fecha2 = new Date();
            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es mayor que la actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es menor que la actual");
            } else {
                System.out.println("Las fechas son iguales");
            }
            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario es mayor que la actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha del usuario es menor que la actual");
            } else {
                System.out.println("Las fechas son iguales");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
