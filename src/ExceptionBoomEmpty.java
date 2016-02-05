/**
 * custom exception for attempting to boom when empty
 */
public class ExceptionBoomEmpty extends Exception {
    public ExceptionBoomEmpty(String message) {
        super(message);
    }
}
