package trecos.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateToFormat {

    // Atividade 5
    public String getBr(String systemDate) {
        return formatDate(systemDate, "yyyy-MM-dd", "dd/MM/yyyy");
    }

    // Atividade 6
    public String getSystem(String brDate) {
        return formatDate(brDate, "dd/MM/yyyy", "yyyy-MM-dd");
    }

    public String formatDate(String originalDate, String originalFormat, String convertedFormat) {
        String output = null;
        try {
            DateFormat parser = new SimpleDateFormat(originalFormat);
            Date date = parser.parse(originalDate);
            DateFormat formatter = new SimpleDateFormat(convertedFormat);
            output = formatter.format(date);
        } catch (ParseException ex) {
            Logger.getLogger(DateToFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

}
