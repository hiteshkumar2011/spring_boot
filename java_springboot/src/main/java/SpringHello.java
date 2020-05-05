//package net.codejava;
 
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
 
@RestController
@EnableAutoConfiguration
public class SpringHello {
 
    @RequestMapping("/")
    String home() {
        return "Hello Hitesh Talihlyani! \n This is your first test Spring boot Application \n Good Job"; 
    }
 
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringHello.class, args);
    }
 
}
