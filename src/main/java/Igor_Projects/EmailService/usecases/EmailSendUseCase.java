package Igor_Projects.EmailService.usecases;


public interface EmailSendUseCase {
    void sendEmail(String to, String subject, String body);
}
