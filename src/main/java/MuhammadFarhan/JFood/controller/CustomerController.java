package MuhammadFarhan.JFood.controller;
import MuhammadFarhan.JFood.Customer;
import MuhammadFarhan.JFood.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("/customer")
@RestController

public class CustomerController {

    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Customer loginCustomer(@RequestParam(value = "email") String email,
                                  @RequestParam(value = "password") String password)
    {
        return DatabaseCustomer.CustomerLogin(email, password);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Customer registerCustomer(@RequestParam(value="name") String name,
                                     @RequestParam(value="email") String email,
                                     @RequestParam(value="password") String password)
    {
        Customer customer = new Customer(DatabaseCustomer.getLastId()+1, name, email, password);
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch (EmailAlreadyExistException e) {
            e.getMessage();
            return null;
        }
        return customer;
    }


    @RequestMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        Customer customer = null;
        try {
            customer = DatabaseCustomer.getCustomerById(id);
        } catch (CustomerNotFoundException e) {
            e.getMessage();
            return null;
        }
        return customer;
    }
}
