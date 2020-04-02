import java.util.ArrayList;
public class DatabaseCustomer
{

    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
    private static int lastId = 0;
    
    public DatabaseCustomer()
    {
        
       
    }

    
    public boolean addCustomer(Customer customer){
        return true;
    }
    
    public boolean removeCustomer(Customer customer){
        return true;
    }
    
    public Customer getCustomerById(int id){
        return null;
    }
    public int getLastId(){
        return lastId;
    }
    
    public ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }
}
