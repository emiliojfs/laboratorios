package modulo003.clase001;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        simpleDateFormatApi();
    }
    private static void simpleDateFormatApi(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        String fechaTexto = "10/12/2017";
        try {
            Date mifecha = sdf.parse(fechaTexto);
            System.out.println(mifecha);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String fechaTexto2 = "10/12/2018";
        try {
            Date mifecha = sdf.parse(fechaTexto2);
            System.out.println(sdf.format(mifecha));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
