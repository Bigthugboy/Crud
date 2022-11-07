package africa.semicolon.crud.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class userController {

    @GetMapping("")
    public String showHomePage(){

        return "index";
    }

}
