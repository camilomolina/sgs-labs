package cl.bennu.springbootlabs2;

import cl.bennu.springbootlabs2.dao.iface.IUserDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MS2 {

    private final IUserDAO userDAO;

    public MS2(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public static void main(String[] args) {
        SpringApplication.run(MS2.class, args);
    }

}
