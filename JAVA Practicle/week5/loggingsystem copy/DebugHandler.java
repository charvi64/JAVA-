package loggingsystem;

public class DebugHandler extends LogHandler {
    @Override
    public void handleRequest(LogLevel level, String message) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level, message);
        }
    }
}
