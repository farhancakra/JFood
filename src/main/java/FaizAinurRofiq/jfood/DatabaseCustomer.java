package FaizAinurRofiq.jfood;

import java.util.ArrayList;

/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
    // instance variables - replace the example below with your own
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int lastId = 0;
    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public DatabaseCustomer()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     *
     */
    public static boolean addCustomer(Customer customer) throws EmailAlreadyExistException{
        boolean sameEmailBuff = false;
        for (Customer buff: CUSTOMER_DATABASE) {
            if (customer.getEmail().equals(buff.getEmail())) {
                sameEmailBuff = true;
                break;
            }
        }

        if (!sameEmailBuff) {
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

    public static Customer CustomerLogin(String email, String password) {
        for (Customer customer: CUSTOMER_DATABASE) {
            if (customer.getEmail().equals(email) && customer.getPassword().equals(password)) {
                return customer;
            }
        }
        return null;

    }
    
}
