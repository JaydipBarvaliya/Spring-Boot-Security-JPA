package io.javabrains;

import io.javabrains.Repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringBootSecurityJPAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityJPAApplication.class, args);
    }

}
