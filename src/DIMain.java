interface MessageService {
    void sendMessage(String msg, String rec);
}

class EmailService implements MessageService {
    public void sendMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + ": " + msg);
    }
}

class SMSService implements MessageService {
    public void sendMessage(String msg, String rec) {
        System.out.println("SMS sent to " + rec + ": " + msg);
    }
}

class Client {
    private MessageService service;
    
    public Client(MessageService service) {
        this.service = service;
    }
    
    public void processMessages(String msg, String rec) {
        service.sendMessage(msg, rec);
    }
}

public class DIMain {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        Client client1 = new Client(emailService);
        client1.processMessages("Hi there", "john@example.com");
        
        MessageService smsService = new SMSService();
        Client client2 = new Client(smsService);
        client2.processMessages("Hello", "1234567890");
    }
}