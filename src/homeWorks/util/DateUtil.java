package homeWorks.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {

    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");

    public static Date fromStringToDate(String dateStr) throws ParseException {
        return SDF.parse(dateStr);
    }
    public static String fromDateToString(Date date){
        return SDF.format(date);
    }
}
