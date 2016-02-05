/**
 * GroobleApi mock for development testing
 * Copyright (c) Yesterday by Grooble, Inc.
 * All Rights Reserved But Still Friendly
 * v0.1
 */
public class GroobleApi implements IGroobleApi {
    private boolean _washit;
    public GroobleApi() {
        _washit = false;
    }
    public void hit() throws Exception {
        if (_washit) {
            throw new Exception("hit failure");
        }
        _washit = true;
    }
    public boolean washit() {
        return _washit;
    }
    public void reset() {
        _washit = false;
    }
}
