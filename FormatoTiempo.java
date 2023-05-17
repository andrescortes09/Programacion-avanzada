import java.util.Calendar;
import java.util.Formatter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatoTiempo{
  public static void main(String args[]){
    //Formato fecha
    Formatter fecha = new Formatter();
    Calendar cal = Calendar.getInstance();
    fecha = new Formatter();
    fecha.format("%tB, %tb, %tm", cal, cal, cal);
    //Formato hora
    Date hora = new Date();
    String strformatoHora = "HH:mm:ss a";
    SimpleDateFormat forma = new SimpleDateFormat(strformatoHora);
    //Se imprime
    System.out.print("Presentación 1 de fecha y hora: ");
    System.out.println(fecha+" "+ forma.format(hora) + "\n");

    //otra forma
    fecha.format("%tc", cal);
    System.out.print("Presentación 2 de fecha y hora: ");
    System.out.println(fecha + "\n");

    //otra forma
    Date d = new Date();
    System.out.print("Presentación 3 de fecha y hora: ");
    System.out.println(d.toString());
  }
}
