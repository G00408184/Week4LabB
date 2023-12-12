package ie.atu.registrationservicepartb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication

public class RegistrationServicePartBApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationServicePartBApplication.class, args);
    }

}
