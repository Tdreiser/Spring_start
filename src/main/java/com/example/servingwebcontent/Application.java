
package com.example.servingwebcontent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(MessageRepository messageRepository){

        return args -> {
            Messages asks = new Messages(5,
                                            4,
                                            "11111fff",
                                            2330,
                                            1);
            messageRepository.save(asks);
        };
    }

}

