package hello;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class HelloController {
    private Student st1;
    @RequestMapping(value = "/hello/{userName}/{userId}")
    public void welcomeMessage(@PathVariable("userName") String userName, @PathVariable("userId") int userId) {
        st1 = new Student(userName);
        System.out.println("hello "+ st1.getName());
        System.out.println("User Id: "+userId);
    }

    @RequestMapping(value = "/subjects/{sub1}/{sub2}/{sub3}")
    public void printSubjects(@PathVariable("sub1")String subject1, @PathVariable("sub2")String subject2,
                              @PathVariable("sub3")String subject3) {
        System.out.println("u study "+subject1 + " " + subject2 + " " + subject3);
    }
}