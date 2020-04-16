package MuhammadFarhan.JFood;
import java.util.ArrayList;

public class CustomerController {
    private Customer customer;

    public Customer loginCustomer(String name, String email, String password) {
        DatabaseCustomer.CustomerLogin(email, password);
        return customer;
    }

    public Customer registerCustomer(String name, String password) {
        return null;
    }

    public Customer getCustomerById(int id) {
        return null;
    }
}
