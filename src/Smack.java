/**
 * a Smack gets Boomed into a Skrinket
 */
public class Smack {
    private GroobleApi _groobleApi = new GroobleApi();
    public Skrinket Boom() throws Exception {
        if (_groobleApi.empty()) {
            _groobleApi.load();
        }
        _groobleApi.hit();
        if (_groobleApi.washit()) {
            _groobleApi.reset();
            return new Skrinket(this);
        }
        return null;
    }
}
