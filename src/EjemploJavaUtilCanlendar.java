import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCanlendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        //calendario.set(1988, Calendar.SEPTEMBER, 20, 15, 50);
        calendario.set(Calendar.YEAR, 1988);
        calendario.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 20);
        //calendario.set(Calendar.HOUR_OF_DAY,15);
        calendario.set(Calendar.HOUR, 3);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaConFormato = simpleDateFormat.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);
    }
}
