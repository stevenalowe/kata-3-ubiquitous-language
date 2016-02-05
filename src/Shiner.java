/**
 * a skrinket is grizzled into a shiner
 */
public class Shiner {
    private GroobleApi _groobleApi = new GroobleApi();
    private Skrinket _skrinket;
    public Shiner(Skrinket skrinket) {
        _skrinket = skrinket;
    }
    public boolean inspect() {
        return _groobleApi.inspectForWorthiness();
    }
}
