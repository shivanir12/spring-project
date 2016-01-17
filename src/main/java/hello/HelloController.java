package hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping(value = "/")
    public Student welcomeMessage() {
        return new Student("Shivani");
    }

}