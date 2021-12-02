package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger (String message)
    {
        return new ConsoleLogger();
    }


}
