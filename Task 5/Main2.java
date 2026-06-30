public class Main4 {

    public static void main(String[] args) {
        MessageSender sender = new EmailSender();
        NotificationService service = new NotificationService(sender);

        service.alertUser("Hello User!");

    }

}

interface MessageSender {
    void sendMessage(String message);

}

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class NotificationService {
    private MessageSender sender;

    NotificationService(MessageSender sender) {
        this.sender = sender;
    }

    public void alertUser(String msg) {
        sender.sendMessage(msg);
    }
}
