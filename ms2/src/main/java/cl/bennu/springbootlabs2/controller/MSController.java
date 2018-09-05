package cl.bennu.springbootlabs2.controller;

import cl.bennu.springbootlabs2.dao.iface.IProductDAO;
import cl.bennu.springbootlabs2.dao.iface.IUserDAO;
import cl.bennu.springbootlabs2.domain.Product;
import cl.bennu.springbootlabs2.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MSController {

    private final IUserDAO userDAO;
    private final IProductDAO productDAO;

    public MSController(IUserDAO userDAO, IProductDAO productDAO) {
        this.userDAO = userDAO;
        this.productDAO = productDAO;
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        List<User> userList = userDAO.getAll();
        System.out.println(userList);

        User user = userDAO.getById(1L);
        System.out.println(user);

        List<Product> productList = productDAO.getAll();
        System.out.println(productList);

        Product product = productDAO.getById(1L);
        System.out.println(product);


        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(userList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return "MS2" + user;
    }
}
