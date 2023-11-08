import java.text.SimpleDateFormat;
import java.util.Date;

public class Tanggal {
    public static void main(String[] args){
        Date tanggal = new Date();

        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf1=new SimpleDateFormat("dd MMMM yyyy");

       System.out.println(sdf.format(tanggal));
       System.out.println(sdf1.format(tanggal));
    }
}
