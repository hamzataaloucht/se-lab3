package problem5.problem5before;

public class EmailSender {
    private final String smtpServer;

    public EmailSender(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    public void send(String to, String message) {
        System.out.println("[EMAIL to " + to + " via " + smtpServer + "] " + message);
    }
}
