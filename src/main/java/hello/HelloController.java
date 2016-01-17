package hello;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class HelloController {
    private Student st1;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String welcomeMessage(@RequestParam("userName") String userName, @RequestParam("userId") int userId) {
        st1 = new Student(userName);
        return "hello " + st1.getName() +"\n"+"User Id: " + userId;
    }

    @RequestMapping(value = "/subjects", method = RequestMethod.GET)
    public String printSubjects(@RequestParam("sub1") String subject1, @RequestParam("sub2") String subject2,
                              @RequestParam("sub3") String subject3) {
        if (subject3.length() > 0)
            return "u study " + subject1 + " " + subject2 + " " + subject3;
        else
            return "u study " + subject1 + " " + subject2;
    }

    @RequestMapping(value = {"/method1", "/method1/method2"}, method = RequestMethod.GET)
    @ResponseBody
    public String printMessage() {
        return "This is to indicate that multiple url's are mapped to same method";
    }
}