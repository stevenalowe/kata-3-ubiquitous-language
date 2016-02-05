/**
 * a Smack gets Boomed into a Skrinket
 */
public class Smack {
    private GroobleApi _groobleApi = new GroobleApi();
    public Skrinket Boom() throws Exception {
        if (_groobleApi.isEmpty()) {
            _groobleApi.load();
        }
        _groobleApi.boom();
        if (_groobleApi.wasBoomed()) {
            _groobleApi.reset();
            return new Skrinket(this);
        }
        return null;
    }
}
