package ValidateofClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static String Class = "^[CAP][\\d]{4}[GHIKLM]$";

    public ValidateClass() {
    }

    public boolean validate(String string) {
        Pattern pattern = Pattern.compile(Class);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
