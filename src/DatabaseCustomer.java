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

    public static Customer getCustomerById(int id) {
        Customer customer = CUSTOMER_DATABASE.get(id);
        if (customer != null) {
            return customer;
        }
        return null;
    }

    public static boolean addCustomer(Customer customer) {
        // initialise instance variables
        boolean email = false;
        for (Customer cust : CUSTOMER_DATABASE) {
            if (customer.getEmail() == cust.getEmail()) {
                email = true;
            }
        }

        if (!email) {
            CUSTOMER_DATABASE.add(customer);
            lastId = CUSTOMER_DATABASE.indexOf(customer);
        }
        return false;
    }

    public static boolean removeCustomer(int id) {
        // put your code here
        Customer customer = CUSTOMER_DATABASE.get(id);
        if (customer != null) {
            CUSTOMER_DATABASE.remove(customer);
            return true;
        }
        return false;
    }
}
