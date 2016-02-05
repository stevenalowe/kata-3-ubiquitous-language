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
    @Test
    public void TestGrizzleShiner() throws Exception {
        Smack smack = new Smack();
        Skrinket skrinket = smack.Boom();
        Assert.assertNotNull(skrinket);
        Shiner shiner = skrinket.grizzle();
        Assert.assertNotNull(shiner);
    }
    @Test
    public void TestInspectShiner() throws Exception {
        Smack smack = new Smack();
        Skrinket skrinket = smack.Boom();
        Assert.assertNotNull(skrinket);
        Shiner shiner = skrinket.grizzle();
        Assert.assertNotNull(shiner);
        Assert.assertTrue(shiner.inspect());
    }
}
