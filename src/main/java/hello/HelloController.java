package hello;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class HelloController {
    private Student st1;

    @RequestMapping(value = "/hello/{userName}/{userId}", method = RequestMethod.GET)
    public String welcomeMessage(@PathVariable("userName") String userName, @PathVariable("userId") int userId) {
        st1 = new Student(userName);
        return "hello " + st1.getName() +"\n"+"User Id: " + userId;
    }

    @RequestMapping(value = "/subjects/{sub1}/{sub2}/{sub3}", method = RequestMethod.GET)
    public String printSubjects(@PathVariable("sub1") String subject1, @PathVariable("sub2") String subject2,
                              @PathVariable("sub3") String subject3) {
        if (subject3.length() > 0)
            return "u study " + subject1 + " " + subject2 + " " + subject3;
        else
            return "u study " + subject1 + " " + subject2;
    }

    @RequestMapping(value = {"/method1", "/method1/method2"}, method = RequestMethod.GET)
    public String printMessage() {
        return "This is to indicate that multiple url's are mapped to same method";
    }
}