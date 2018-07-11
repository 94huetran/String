import ValidateAccount.ValidateAccount;
import ValidateEmail.ValidateEmail;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    ValidateAccount account = new ValidateAccount();

    @Test
    public void accountTestWithTrue() {
        String validateAccount = "123abc_";
        boolean value = account.validate(validateAccount);
        Assert.assertEquals(true, value);
    }

    @Test
    public void accountTestWithFalse() {
        String validateAccount = "1234_";
        boolean value = account.validate(validateAccount);
        Assert.assertEquals(false, value);
    }
}
