import ValidateofClass.ValidateClass;
import org.junit.Assert;
import org.junit.Test;

public class ClassTest {
    ValidateClass numberClass = new ValidateClass();

    @Test
    public void testClassTrue() {
        String a = "C0318G";
        boolean validate = numberClass.validate(a);
        Assert.assertEquals(true, validate);
    }

    @Test
    public void testClassFalse1() {
        String a = "M0318G";
        boolean validate = numberClass.validate(a);
        Assert.assertEquals(false, validate);
    }
    @Test
    public void testClassFalse2() {
        String a = "P0323A";
        boolean validate = numberClass.validate(a);
        Assert.assertEquals(false, validate);
    }
}
