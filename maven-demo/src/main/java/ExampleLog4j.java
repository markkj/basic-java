import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ExampleLog4j {
    private static final Logger logger = Logger.getLogger(ExampleLog4j.class);

    public static void main(String[] args) {
        ExampleLog4j.logger.info("Initialize ExampleLog4J Application");
    }

}
