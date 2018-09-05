package cl.bennu.springbootlabs2.controller;

import cl.bennu.springbootlabs2.domain.Data;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@EnableAutoConfiguration
public class MSController {
//=== MimeHeaders ===
//host = localhost:8001
//connection = keep-alive
//cache-control = max-age=0
//upgrade-insecure-requests = 1
//user-agent = Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/68.0.3440.106 Safari/537.36
//accept = text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8
//accept-encoding = gzip, deflate, br
//accept-language = es-ES,es;q=0.9,en;q=0.8
    private HttpServletRequest request;

    @Autowired
    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    @RequestMapping("/")
    @ResponseBody
    String home() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Data data = new Data();
        data.setHost(request.getHeader("host"));
        data.setIp(request.getHeader("host"));
        data.setAgent(request.getHeader("user-agent"));

        data.setMessage("Saludos!");

        return mapper.writeValueAsString(data);
    }

}
