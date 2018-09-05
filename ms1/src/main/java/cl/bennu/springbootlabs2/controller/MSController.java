package cl.bennu.springbootlabs2.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MSController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "MS1";
    }
}
