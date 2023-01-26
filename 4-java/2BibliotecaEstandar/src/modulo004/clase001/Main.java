package modulo004.clase001;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        periodApi();
    }
    private static void localDateApi(){
        LocalDate localDate01 = LocalDate.now();
        LocalDate localDate02 = LocalDate.of(2016,10,10);
        System.out.println(localDate01);
        System.out.println(localDate02.getYear());
        System.out.println(localDate02.getMonth());
        System.out.println(localDate02.getDayOfMonth());

        System.out.println(localDate01.isBefore(localDate02));

        LocalDate localDate03 = localDate02.withDayOfMonth(20);
        System.out.println(localDate03.getDayOfMonth());

        LocalDate localDate04 = LocalDate.of(2015,1,1);
        System.out.println(localDate04.plusYears(1).plusMonths(1));
    }

    private static void periodApi(){
        LocalDate fecha01 = LocalDate.of(2015,1,1);
        LocalDate fecha02 = LocalDate.of(2020,11,1);
        Period period = Period.between(fecha01,fecha02);
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        System.out.println(period.getDays());
        System.out.println(period.toTotalMonths());
    }
}
