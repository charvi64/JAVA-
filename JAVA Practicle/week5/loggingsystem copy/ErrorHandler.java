package loggingsystem;

public class ErrorHandler extends LogHandler {
    @Override
    public void handleRequest(LogLevel level, String message) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level, message);
        }
    }
}