package net.ketone.error;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/web/servlet/error/DefaultErrorAttributes.html
 */
@RestController
public class ErrorApi {

    @GetMapping("/api")
    public String die() {
        throw new RuntimeException("die!");
    }

}
