public class LogLevels {
    
    public static String message(String logLine) {
        String[] args = logLine.split(":");
        return args[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] args = logLine.split(":");
        return args[0].trim().substring(1, args[0].length() - 1).toLowerCase();
    }

    public static String reformat(String logLine) {
        String info1 = message(logLine);
        String info2 = logLevel(logLine);
        return info1 + " (" + info2 +")";
    }
}
