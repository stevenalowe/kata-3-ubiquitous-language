import org.junit.Assert;
import org.junit.Test;

/**
 * exercise the GroobleApi, including failure modes
 */
public class GroobleApiContractTests {
    private GroobleApi _groobleApi = new GroobleApi();
    @Test
    public void HappyPathHitTest() throws Exception {
        //initially it's empty and wasn't hit
        Assert.assertTrue(_groobleApi.empty());
        Assert.assertFalse(_groobleApi.washit());
        //so we load it
        _groobleApi.load();
        //and now it's not empty
        Assert.assertFalse(_groobleApi.empty());
        //and still wasn't hit
        Assert.assertFalse(_groobleApi.washit());
        //so we hit it
        _groobleApi.hit();
        //now it was hit
        Assert.assertTrue(_groobleApi.washit());
        //but it's still not empty
        Assert.assertFalse(_groobleApi.empty());
        //reset it
        _groobleApi.reset();
        //and now it's empty
        Assert.assertTrue(_groobleApi.empty());
        //and wasn't hit
        Assert.assertFalse(_groobleApi.washit());
    }
    @Test(expected = Exception.class)
    public void FailurePathReHitTest() throws Exception {
        //in which we trigger a hit exception
        //load and hit it twice to cause exception
        _groobleApi.load();
        _groobleApi.hit();
        _groobleApi.hit();
    }
    @Test(expected = Exception.class)
    public void FailurePathEmptyHitTest() throws Exception {
        //in which we trigger a hit exception on an empty machine
        Assert.assertTrue(_groobleApi.empty());
        _groobleApi.hit();
    }
}
