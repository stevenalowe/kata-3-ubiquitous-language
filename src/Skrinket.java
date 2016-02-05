/**
 * a Skrinket is created when a Smack is Boomed
 */
public class Skrinket {
    private GroobleApi _groobleApi = new GroobleApi();
    private Smack _smack;
    public Skrinket(Smack smack) {
        _smack = smack;
    }
    public Shiner grizzle() {
        if (_groobleApi.grizzle()) {
            return new Shiner(this);
        }
        return null;
    }
}
