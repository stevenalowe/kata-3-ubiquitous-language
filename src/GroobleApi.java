/**
 * GroobleApi mock for development testing
 * Copyright (c) Yesterday by Grooble, Inc.
 * All Rights Reserved But Still Friendly
 * v0.3
 */
public class GroobleApi implements IGroobleApi {
    private boolean _wasBoomed;
    private boolean _isEmpty;
    public GroobleApi() {
        _wasBoomed = false;
        _isEmpty = true;
    }
    public void boom() throws ExceptionBoomRehit, ExceptionBoomEmpty {
        if (_wasBoomed) {
            throw new ExceptionBoomRehit("attempted to boom twice without reset");
        }
        if (_isEmpty) {
            throw new ExceptionBoomEmpty("attempted to boom when empty");
        }
        _wasBoomed = true;
    }
    public boolean wasBoomed() {
        return _wasBoomed;
    }
    public void reset() {
        _wasBoomed = false;
        _isEmpty = true;
    }
    public void load() {
        _isEmpty = false;
    }
    public boolean isEmpty() {
        return _isEmpty;
    }
    public boolean grizzle() { return true; }
}
