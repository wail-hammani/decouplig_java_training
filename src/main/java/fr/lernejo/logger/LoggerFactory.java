package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger (String name)
    {
        return new CompositeLogger(new ContextualLogger(new ConsoleLogger(),name) , new ContextualLogger(new FileLogger("logs.txt"),name));
    }


}
