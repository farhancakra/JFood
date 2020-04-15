package MuhammadFarhan.JFood;
import java.util.ArrayList;
public class DatabaseCustomer {

    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public DatabaseCustomer() {


    }

    public static ArrayList<Customer> getCustomerDatabase() {
        return CUSTOMER_DATABASE;
    }

    public static int getLastId() {
        return lastId;
    }

    public static Customer getCustomerById(int id) throws CustomerNotFoundException{
        for (Customer customer: CUSTOMER_DATABASE) {
            if (customer.getId() == id){
                return customer;
            }
        }
        throw new CustomerNotFoundException(id);

    }

    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistException {
        // initialise instance variables
        boolean email = false;
        for (Customer cust : CUSTOMER_DATABASE) {
            if (customer.getEmail() == cust.getEmail()) {
                email = true;
                break;
            }
        }

        if (!email) {
            CUSTOMER_DATABASE.add(customer);
            lastId = customer.getId();
            return true;
        }
        throw new EmailAlreadyExistException(customer);
    }

    public static boolean removeCustomer(int id) throws CustomerNotFoundException{
        for (Customer customer: CUSTOMER_DATABASE) {
            if (customer.getId() == id){
                CUSTOMER_DATABASE.remove(customer);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }
}
