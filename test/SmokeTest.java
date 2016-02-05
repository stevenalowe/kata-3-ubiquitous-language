import org.junit.Assert;
import org.junit.Test;

/**
 * SmokeTest for GroobleApi
 */
public class SmokeTest {
    @Test
    public void TestBoomSmack() throws Exception {
        Smack smack = new Smack();
        Skrinket skrinket = smack.Boom();
        Assert.assertNotNull(skrinket);
    }
}
