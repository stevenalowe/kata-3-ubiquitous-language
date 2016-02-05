import org.junit.Assert;
import org.junit.Test;

/**
 * exercise the GroobleApi, including failure modes
 */
public class GroobleApiContractTests {
    private GroobleApi _groobleApi = new GroobleApi();
    @Test
    public void HappyPathHitTest() {
        //in which we do everything right
    }
    @Test(expected = Exception.class)
    public void FailurePathReHitTest() throws Exception {
        //in which we trigger a rehit exception
    }
    @Test(expected = Exception.class)
    public void FailurePathEmptyHitTest() throws Exception {
        //in which we trigger a hit exception on an empty machine
    }
}
