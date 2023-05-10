package cap.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.time.LocalTime;
import java.time.ZoneId;




public class DateUtil {

    /**
     * @param strFormat
     * @return
     */

    /** This method is used for getting the current date in your system runtime.*/
    public static String getCurrentDate(String strFormat) {
        DateFormat dateFormat = new SimpleDateFormat(strFormat);
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void main(String[] args) {

//        String currentDate = getCurrentDate("dd MMM yyyy");
//        System.out.println(currentDate);
//        String TomorrowDate = getDate("TOMORROW","dd MMM yyyy");
//        System.out.println(currentDate);
        String Date = getDate("AFTER_THREE_DAYS","dd MMM yyyy");
        System.out.println(Date);




        String strTime = getCurrentDate("h:mm aaa");
        System.out.println(strTime);
        String DAYAFTERTOMORROW = getDayAfterTommorrowDate("dd MMM yyyy");
//        System.out.println(DAYAFTERTOMORROW);
    }

    public static String getCurrentTime() {
        String strDateAndTime = "";
        strDateAndTime = getCurrentDate("h:mm");
        return strDateAndTime;
    }


    /**
     * @return
     */

    /** This method is used for getting the current date and Time in your system runtime.*/
    public static String getCurrentDateTime() {
        String ranNum = "";
        DateFormat formatter = new SimpleDateFormat("MMM");
        SimpleDateFormat monthParse = new SimpleDateFormat("MM");
        DateFormat dformatter = new SimpleDateFormat("DD");
        SimpleDateFormat dateParse = new SimpleDateFormat("DD");
        Calendar cal = Calendar.getInstance();
        String month = Integer.toString(cal.get(Calendar.MONTH) + 1);
        String date = Integer.toString(cal.get(Calendar.DATE) + 1);
        try {
            ranNum = "_" + dformatter.format(dateParse.parse(date))
                    + formatter.format(monthParse.parse(month)) + "_"
                    + Integer.toString(cal.get(Calendar.HOUR_OF_DAY))
                    + Integer.toString(cal.get(Calendar.MINUTE));
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("************Exception:  ")
                    .append(e.getLocalizedMessage())
                    .append("   occured in:")
                    .append(e.getStackTrace()[0])
                    .append("********************"));

        }
        return ranNum;
    }
    /** This method is used for getting the DayAfterTommorrowDate in your system runtime.*/
    public static String getDayAfterTommorrowDate() {
        DateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //Current Date should be go on Next Month and Year
        calendar.add(Calendar.DATE, +2);
        String strNextMonthAndYear = Integer.toString(calendar.get(Calendar.DATE)); //To Convert Integer to String (Next Month and Year)
        Date NextMonthAndYear = calendar.getTime();
        strNextMonthAndYear = dateFormat.format(NextMonthAndYear);
        return strNextMonthAndYear;
    }

    /** This method is used for getting the Date in your system runtime.*/
    public static String getDate(int inDate, String strDateFormat) {
        SimpleDateFormat formatter = new SimpleDateFormat(strDateFormat);
        Date today = new Date();
        Date date = new Date(today.getTime() + inDate * (1000 * 60 * 60 * 24));
        System.out.println("Date" + date);
        String strDate = formatter.format(date);
        System.out.println("Date" + strDate);
        return strDate;
    }

    /** This method is used for getting the Date in your system runtime.*/
    public static String getDate(String strDay, String strDateFormat) {
        SimpleDateFormat formatter = new SimpleDateFormat(strDateFormat);
        int day = 0;
        strDay = strDay.toUpperCase();
        System.out.println("strDay" + strDay);
        Date today = new Date();

        if (strDay.contains("PLUS") || strDay.contains("MINUS")) {
            // Replacing every non-digit number with a space (" ") & Remove extra spaces from the beginning and the ending of the string
            day = Integer.parseInt((strDay.replaceAll("[^\\d]", " ")).trim());
            strDay = strDay.substring(0, strDay.length() - 2);
            System.out.println(" day >> " + day);
        }

        Date date = new Date();
        switch (strDay) {
            case "PLUS":
                date = new Date(today.getTime() + day * (1000 * 60 * 60 * 24));
                System.out.println("DAYBEFOREYESTERDAY" + date);
                break;
            case "MINUS":
                date = new Date(today.getTime() - day * (1000 * 60 * 60 * 24));
                System.out.println("DAYBEFOREYESTERDAY" + date);
                break;
            case "YESTERDAY":
                date = new Date(today.getTime() - 1 * (1000 * 60 * 60 * 24));
                System.out.println("YESTERDAY" + date);
                break;
            case "TODAY":
                date = new Date(today.getTime() + 0 * (1000 * 60 * 60 * 24));
                System.out.println("TODAY: " + date);
                break;
            case "TOMORROW":
                date = new Date(today.getTime() + 1 * (1000 * 60 * 60 * 24));
                System.out.println("TOMORROW" + date);
                break;
            case "DAYAFTERTOMORROW":
                date = new Date(today.getTime() + 2 * (1000 * 60 * 60 * 24));
                System.out.println("DAYAFTERTOMORROW" + date);
                break;

            case "AFTER_THREE_DAYS":
                date = new Date(today.getTime() + 3 * (1000 * 60 * 60 * 24));
                System.out.println("AFTER_THREE_DAYS" + date);
                break;

            case "AFTER_FOUR_DAYS":
                date = new Date(today.getTime() + 4 * (1000 * 60 * 60 * 24));
                System.out.println("AFTER_FOUR_DAYS" + date);
                break;

            case "AFTER_FIVE_DAYS":
                date = new Date(today.getTime() + 5 * (1000 * 60 * 60 * 24));
                System.out.println("AFTER_FIVE_DAYS" + date);
                break;

            default:
//                date = new Date(today.getTime() + 0 * (1000 * 60 * 60 * 24));
                System.out.println("Day String NOT MATCH !");
        }
        String strDate = formatter.format(date);
        System.out.println("DateUtil. strDate: " + strDate);
        return strDate;
    }

    /** This method is used for getting the CurrentDateByTimeZone in your system runtime.*/

    public static String getCurrentDateByTimeZone(String strDateFormat, String strTimeZone) {

        Calendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        DateFormat formatter = new SimpleDateFormat(strDateFormat);
        formatter.setTimeZone(TimeZone.getTimeZone(strTimeZone));
        String currentDate = formatter.format(calendar.getTime());
        System.out.println("currentDate >>> :: " + currentDate);
        return currentDate;
    }

    /** This method is used for getting the DayAfterTommorrowDate in your system runtime.*/
    public static String getDayAfterTommorrowDate(String strFormat) {
        DateFormat dateFormat = new SimpleDateFormat(strFormat);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        //Current Date should be go on Next Month and Year
        calendar.add(Calendar.DATE, +2);
        String strNextMonthAndYear = Integer.toString(calendar.get(Calendar.DATE)); //To Convert Integer to String (Next Month and Year)
        Date NextMonthAndYear = calendar.getTime();
        strNextMonthAndYear = dateFormat.format(NextMonthAndYear);
        return strNextMonthAndYear;
    }
}
