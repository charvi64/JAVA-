package loggingsystem;

public class Client {
    public static void main(String[] args) {
        // Setting up the chain of responsibility
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Creating commands
        Command infoCommand = new LogCommand(infoHandler, LogLevel.INFO);
        Command debugCommand = new LogCommand(debugHandler, LogLevel.DEBUG);
        Command errorCommand = new LogCommand(errorHandler, LogLevel.ERROR);

        // Creating the logger and adding commands
        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);

        // Processing all commands
        logger.processCommands();
    }
}
