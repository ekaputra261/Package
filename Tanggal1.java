import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tanggal1 {
    public static void main(String[] args){
        Date tanggal=new Date();

        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf1=new SimpleDateFormat("dd MMMM yyyy");

        System.out.println(tanggal);
        System.out.println(sdf.format(tanggal));
        System.out.println(sdf1.format(tanggal));

        Calendar cal=Calendar.getInstance();
        cal.add(Calendar.DATE, 3);
        Date tigaHariLagi = cal.getTime();

        System.out.println("3 Hari Lagi : "+sdf.format(tigaHariLagi));
    }
}
