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
        Assert.assertTrue(_groobleApi.isEmpty());
        Assert.assertFalse(_groobleApi.wasBoomed());
        //so we load it
        _groobleApi.load();
        //and now it's not empty
        Assert.assertFalse(_groobleApi.isEmpty());
        //and still wasn't hit
        Assert.assertFalse(_groobleApi.wasBoomed());
        //so we hit it
        _groobleApi.boom();
        //now it was hit
        Assert.assertTrue(_groobleApi.wasBoomed());
        //but it's still not empty
        Assert.assertFalse(_groobleApi.isEmpty());
        //reset it
        _groobleApi.reset();
        //and now it's empty
        Assert.assertTrue(_groobleApi.isEmpty());
        //and wasn't hit
        Assert.assertFalse(_groobleApi.wasBoomed());
    }
    @Test(expected = ExceptionBoomRehit.class)
    public void FailurePathReHitTest() throws ExceptionBoomRehit, ExceptionBoomEmpty {
        //in which we trigger a hit exception
        //load and hit it twice to cause exception
        _groobleApi.load();
        _groobleApi.boom();
        _groobleApi.boom();
    }
    @Test(expected = ExceptionBoomEmpty.class)
    public void FailurePathEmptyHitTest() throws ExceptionBoomRehit, ExceptionBoomEmpty {
        //in which we trigger a hit exception on an empty machine
        Assert.assertTrue(_groobleApi.isEmpty());
        _groobleApi.boom();
    }
}
