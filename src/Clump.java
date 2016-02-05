import java.util.ArrayList;
import java.util.List;

/**
 * Groobles are nestled into Clumps for Parting
 */
public class Clump {
    private List<Grooble> _list = new ArrayList<Grooble>();
    private boolean _isParting;
    public Clump() {
        _isParting = false;
    }
    public void nestle(Grooble grooble) {
        if (!_isParting) {
            _list.add(grooble);
        }
    }
    public void parting() {
        _isParting = true;
    }
}
