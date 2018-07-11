package ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private String phoneNumber = "^.[\\d]{2}.-.[0][\\d]{9}.$";

    public ValidatePhoneNumber() {
    }

    public boolean validate(String string) {
        Pattern pattern = Pattern.compile(phoneNumber);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

}
