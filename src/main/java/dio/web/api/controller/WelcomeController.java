package dio.web.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Usamos para transformar nossa classe em um componente Rest. Alguns servicos serao http
public class WelcomeController {
    @GetMapping //usamos para mapear o metodo utilizando um recurso http
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }
}
