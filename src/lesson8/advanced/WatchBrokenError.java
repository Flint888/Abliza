package lesson8.advanced;

public class WatchBrokenError extends Exception {
    public WatchBrokenError() {
    }

    public WatchBrokenError(String message) {
        super(message);
    }
}
