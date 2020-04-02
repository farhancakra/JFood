
public class DatabaseCustomer
{
    
    private String[] listFood;
    public Customer customer;
    
    public DatabaseCustomer()
    {
        
       
    }

    
    public boolean addCustomer(Customer customer){
        return true;
    }
    
    public boolean removeCustomer(Customer customer){
        return true;
    }
    
    public Customer getCustomer(){
        return null;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;//mengganti nilai name sesuai setter
    }
    
    
    public String[] getListCustomer (){
        return null;
    }
}
