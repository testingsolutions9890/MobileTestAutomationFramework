package Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    public static final String date_format = "DD-MM-YYYY";

    // get current date and time with format
    public static Date getCurrentDate(){
        Calendar calendar = new GregorianCalendar();
        Date date = calendar.getTime();
        //getFormatDate(date);
        return date;
    }
    // change the format of date
    /*public static String getFormatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(date_format);
        simpleDateFormat.setCalendar(date);
        String dateInStringFormat = simpleDateFormat.format(date.getTime());
        return dateInStringFormat;
    }*/
    // get the working days of month
    // get 1st working day of month
    //get next/upcoming working day
    // get date of upcoming Monday
    // get date after given number if days
    // verify if the year is leap or not
    // get Day of last day of Year
    //


    public static void main(String[] arges){
        DateUtils.getCurrentDate();
    }
}
