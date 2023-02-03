package trecos.tools;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DateToFormat {

    public String getBr(String systemDate) {

        String output = null;
        try {

            DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
            Date date = parser.parse(systemDate);
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            output = formatter.format(date);

        } catch (ParseException ex) {
            Logger.getLogger(DateToFormat.class.getName()).log(Level.SEVERE, null, ex);
        }

        return output;

    }
}
