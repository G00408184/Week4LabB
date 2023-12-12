package ie.atu.registrationservicepartb;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @PostMapping("/confirm")
    public  String confirmDetail(@RequestBody UserDetails userDetails){
        String confirm = String.format("Received details for %s with email %s",
                userDetails.getName(), userDetails.getEmail());
        return confirm;
    }
}
