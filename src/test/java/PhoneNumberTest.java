import ValidatePhoneNumber.ValidatePhoneNumber;
import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberTest {
    ValidatePhoneNumber phoneNumber= new ValidatePhoneNumber();

    @Test
    public void testTrue() {
        String number = "(84)-(0978489648)";
        boolean validate = phoneNumber.validate(number);
        Assert.assertEquals(true, validate);
    }

    @Test
    public void testFalse() {
        String number = "(a8)-(22222222)";
        boolean validate = phoneNumber.validate(number);
        Assert.assertEquals(false, validate);
    }
}
