import ValidateEmail.ValidateEmail;
import org.junit.Assert;
import org.junit.Test;

public class EmailTest {
    private static ValidateEmail email = new ValidateEmail();

    @Test
    public void testExampleTrue() {
        String validemail = "abc@hotmail.com";
        boolean isvalid1 = email.validate(validemail);
        Assert.assertEquals(true, isvalid1);
    }

    @Test
    public void testExampleFalse() {
        String invalistemail = "@#abc@gmail.com";
        boolean isvalid2 = email.validate(invalistemail);
        Assert.assertEquals(false, isvalid2);
    }
}
