package trecos.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public boolean isMail(String email) {

        String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(emailPattern, Pattern.CASE_INSENSITIVE);

        if (email == null && email.length() == 0) {
            return false;
        }

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
