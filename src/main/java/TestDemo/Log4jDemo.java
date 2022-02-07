package TestDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
    private static Logger Logger = LogManager.getLogger(Log4jDemo.class);
    public static void main(String[] args) {
        System.out.println("Hello World....!\n");

        Logger.trace("This is trace Message");
        Logger.info("This is information Message");
        Logger.error("This is error Message");
        Logger.warn("This is warning Message");
        Logger.fatal("This is fatal Message");

        System.out.println("\n Completed");

    }
}
