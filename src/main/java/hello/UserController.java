package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/userapi")
public class UserController {

    @RequestMapping(value="/user", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    public User getUser() {
        return new User("Shivani",15);
    }

    @RequestMapping(value="/sendUser", method = RequestMethod.POST, headers = {"Content-type=application/json"})
    public User  setUser (@RequestBody User user) {
        return user;
    }
}
