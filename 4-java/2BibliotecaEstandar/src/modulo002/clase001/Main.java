package modulo002.clase001;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //dateApi();
        calendarApi();
    }
    private static void dateApi(){
        //contiene metodos deprecados
        Date dia1 = new Date();
        System.out.println(dia1);

        Date dia2 = new Date(10102017);
        System.out.println(dia2);
    }
    private static void calendarApi(){
        //contiene metodos de operaciones con fecha
        Calendar calendario01 = Calendar.getInstance();
        Calendar calendario02 = Calendar.getInstance();
        Calendar calendario03 = Calendar.getInstance();

        calendario01.set(Calendar.YEAR,2025);
        calendario01.set(Calendar.MONTH,0);
        calendario01.set(Calendar.DAY_OF_MONTH,1);
        Date fecha01 = calendario01.getTime();
        System.out.println(fecha01);

        calendario02.set(Calendar.YEAR,2026);
        calendario02.set(Calendar.MONTH,0);
        calendario02.set(Calendar.DAY_OF_MONTH,1);
        Date fecha02 = calendario02.getTime();
        System.out.println(fecha02);

        Date fecha03 = calendario03.getTime();
        calendario03.setTime(fecha03);
        System.out.println(calendario03.get(Calendar.YEAR));
        System.out.println(calendario03.get(Calendar.MONTH));
        System.out.println(calendario03.get(Calendar.DAY_OF_MONTH));

    }
}
