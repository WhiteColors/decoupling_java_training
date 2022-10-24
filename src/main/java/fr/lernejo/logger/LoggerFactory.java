package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger() {
        return new ConsoleLogger();
    }
}
