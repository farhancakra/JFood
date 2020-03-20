import java.util.Calendar;
import java.util.GregorianCalendar;
    
public class Jfood
{
    
    public static void main (String[] args) {
        
        Location location1 = new Location ("Bekasi", "Panas", "Jawa Barat");
        Seller seller1 = new Seller(1, "Frenzel", "farhan.cakra@gmail.com", "082245440870", location1);
        Food food = new Food(1, "Martabak", seller1,50000,  FoodCategory.Noodles);
        Food food1 = new Food(2, "Martabak", seller1, 50000,  FoodCategory.Noodles);
        Customer customer = new Customer(1, "Farhan", "farhan..cakra@ui.ac.id", "parhan", new GregorianCalendar(2020,3,19));
        Customer customer1 = new Customer(2, "Farhan", "farhan.cakra@ui.ac.id", "parhan", 2020, 3, 19);
        Customer customer2 = new Customer(3, "Farhan", "farhan.cakra@ui.ac.id", "parhan");
        Promo promo = new Promo (3, "543", 10000, 25000, true);
        
        customer.toString();
        customer1.toString();
        customer2.toString();
        
        customer.setEmail("farhan.cakra10@gmail.com");
        customer.setPassword("farhan");
        
        //CashlessInvoice cashless = new CashlessInvoice(1, food, "10102020", customer1, InvoiceStatus.Ongoing);
        //cashless.setTotalPrice();
        //CashlessInvoice cashless2 = new CashlessInvoice(2, food1, "11112020", customer1, InvoiceStatus.Ongoing, promo);
        //cashless2.setTotalPrice();
        customer.toString();
        
        
    
        
        
        
        
}
}
