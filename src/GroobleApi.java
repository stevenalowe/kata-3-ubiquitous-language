/**
 * GroobleApi mock for development testing
 * Copyright (c) Yesterday by Grooble, Inc.
 * All Rights Reserved But Still Friendly
 * v0.2
 */
public class GroobleApi implements IGroobleApi {
    private boolean _washit;
    private boolean _empty;
    public GroobleApi() {
        _washit = false;
        _empty = true;
    }
    public void hit() throws Exception {
        if (_washit) {
            throw new Exception("hit failure");
        }
        if (_empty) {
            throw new Exception("empty failure");
        }
        _washit = true;
    }
    public boolean washit() {
        return _washit;
    }
    public void reset() {
        _washit = false;
        _empty = true;
    }
    public void load() {
        _empty = false;
    }
    public boolean empty() {
        return _empty;
    }
}
