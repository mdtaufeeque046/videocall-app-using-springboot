package com.taufeeque.videocall;

import com.taufeeque.videocall.user.User;
import com.taufeeque.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {

    public static void main(String[] args) {

        SpringApplication.run(VideocallApplication.class, args);


    }

    // Adding Somme User
    @Bean
    public CommandLineRunner commandLineRunner(
            UserService service
    ) {
        return args -> {

            // First User
            service.register(User.builder()
                    .username("Tauseef")
                    .email("tauseef@gmail.com")
                    .password("Tauseef@123")
                    .build());

            // Second User
            service.register(User.builder()
                    .username("Taufeeque")
                    .email("taufeeque@gmail.com")
                    .password("Taufeeque@123")
                    .build());

            // Third User
            service.register(User.builder()
                    .username("Taukeer")
                    .email("taukeer@gmail.com")
                    .password("Taukeer@123")
                    .build());
        };

    }

}
