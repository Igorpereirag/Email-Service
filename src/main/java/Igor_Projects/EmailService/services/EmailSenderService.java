package Igor_Projects.EmailService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Igor_Projects.EmailService.adapters.EmaIlSenderGateway;
import Igor_Projects.EmailService.usecases.EmailSendUseCase;
@Service
public class EmailSenderService implements EmailSendUseCase {



    private final EmaIlSenderGateway emailsendergateway;

    @Autowired
    public EmailSenderService(EmaIlSenderGateway emailgateway){
        this.emailsendergateway = emailgateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
       this.emailsendergateway.sendEmail(to, subject, body);
    
}

}
