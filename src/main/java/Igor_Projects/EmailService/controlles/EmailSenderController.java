package Igor_Projects.EmailService.controlles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Igor_Projects.EmailService.services.EmailRequest;
import Igor_Projects.EmailService.services.EmailSenderService;
import Igor_Projects.EmailService.services.exceptions.EmailServiceException;

@RestController
@RequestMapping("/api/email")
public class EmailSenderController {
    private EmailSenderService  emailsenderService;

    @Autowired
    public EmailSenderController(EmailSenderService emailsenderService){
        this.emailsenderService = emailsenderService;

    }

    // sendemail
    @RequestMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody EmailRequest request){  
        try{
            this.emailsenderService.sendEmail(request.to(), request.subject(), request.body());
            return ResponseEntity.ok("Email sent successfully");
        }catch(EmailServiceException  ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("ERRO WHILE SEND EMAIL");


    }
    
}

}
