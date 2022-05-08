import java.text.SimpleDateFormat;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    private SimpleDateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public Logger log(String msg) {
        System.out.println("[" + formatDate.format(System.currentTimeMillis()) + " " + num++ + "] " + msg);
        return this;
    }
}