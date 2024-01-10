package Igor_Projects.EmailService.adapters;

public interface EmaIlSenderGateway {
    void sendEmail(String to, String subject, String body);
}
