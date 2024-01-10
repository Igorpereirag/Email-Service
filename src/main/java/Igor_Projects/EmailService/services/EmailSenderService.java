package Igor_Projects.EmailService.services;

import org.springframework.beans.factory.annotation.Autowired;

import Igor_Projects.EmailService.adapters.EmaIlSenderGateway;
import Igor_Projects.EmailService.usecases.EmailSendUseCase;

public class EmailSenderService implements EmailSendUseCase {



    private final EmaIlSenderGateway emailsendergateway;

    @Autowired
    public EmailSenderService(EmaIlSenderGateway emailsendergateway){
        this.emailsendergateway = emailsendergateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sendEmail'");
    }
    
}
