package dev.asjordi;

public class Main {

    public static void main(String[] args) {
        if (args.length == 1) processSingleArgument(args);
        else processArguments();
    }

    public static void processSingleArgument(String[] args) {
        String arg = args[0];

        if (arg.equals("-h") || arg.equals("--help")) {
            showHelp();
            return;
        }

        UserActivity userActivity = new UserActivity(arg);
        userActivity.showActivity();
    }

    public static void processArguments() {
        System.out.println("Please provide a GitHub username or use -h or --help for more information");
    }

    static void showHelp() {
        System.out.println("Usage: java -jar github-activity.jar [options]");
        System.out.println("The options below are available for the GitHub User Activity:");
        System.out.println("  <username>     GitHub username");
        System.out.println("  -h, --help     Show this help message and exit");
    }
}