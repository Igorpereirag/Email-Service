package Igor_Projects.EmailService.infra.ses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest;
import Igor_Projects.EmailService.adapters.EmaIlSenderGateway;
import Igor_Projects.EmailService.services.exceptions.EmailServiceException;

@Service
public class SesEmailSender implements EmaIlSenderGateway {


    private final AmazonSimpleEmailService amazonsimpleemailservice;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonsimpleemailservice) {
        this.amazonsimpleemailservice = amazonsimpleemailservice;
    }

    @Override
    public void sendEmail(String toEmail, String subject, String body) {
        SendEmailRequest request = new SendEmailRequest()
                .withSource("seu email de disparos")
                .withDestination(new Destination().withToAddresses(toEmail))
                .withMessage(new Message()
                        .withSubject(new Content(subject))
                        .withBody(new Body().withText(new Content(body)))
                );

        try {
            amazonsimpleemailservice.sendEmail(request);
        } catch (AmazonServiceException ex) {
            throw new EmailServiceException("Email sending failed", ex);
        }
    }
}