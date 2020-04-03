import java.util.Calendar;
import java.util.GregorianCalendar;
    
public class Jfood
{
    
    public static void main (String[] args) {
        
        Location location1 = new Location("DKI Jakarta","Jakarta Selatan","Bagian Selatan");
       Location location2 = new Location("Jawa Tengah", "Bekasi", "Macet");
        Seller seller = new Seller(1, "Farhana", "farhan.cakra@gmail.com", "08224544", location1);

       Food food = new Food(1, "farhan", seller, 20000, FoodCategory.Noodles);

        Customer customer10 = new Customer(1,"Farhan","farhan@gmail.com", "aA345678");
       //CashlessInvoice invoice1 = new CashlessInvoice (3, food1, new GregorianCalendar(2020, 3, 20),customer1, InvoiceStatus.Ongoing);
       //CashlessInvoice invoice2 = new CashlessInvoice (2, food2, new GregorianCalendar(2020,3,20),customer2, InvoiceStatus.Finished,promo1);
         
       //CashInvoice invoicebaru1 = new CashInvoice (4, food1, new GregorianCalendar(2020,3,20),customer1, InvoiceStatus.Finished);
       //CashInvoice invoicebaru2 = new CashInvoice (5, food2, customer2, new GregorianCalendar(2020, 3,20), InvoiceStatus.Finished, 13000);
        
       //
        //invoicebaru1.setTotalPrice();
        //invoicebaru2.setTotalPrice();
        
        //
        //invoice1.setTotalPrice();
        //invoice2.setTotalPrice();

        
        //invoice1.toString();
        //invoice2.toString();

        
        //
       // invoicebaru1.toString();
       // invoicebaru2.toString();

        DatabasePromo.addPromo((new Promo(1, "123", 2000, 3000, true)));
        DatabasePromo.addPromo((new Promo(2, "123", 2000, 3000, true)));

        DatabaseSeller.addSeller(new Seller(1, "farhan", "farhan@gmail.com", "0811111", location1));
        DatabaseSeller.addSeller(new Seller(2, "muhammad", "muhamad@gmail.com", "0822222", location2));

        DatabaseCustomer.addCustomer(new Customer(1,"Farhan","farhan@gmail.com", "aA345678"));
        DatabaseCustomer.addCustomer(new Customer(2,"Farhan","farhan@gmail.com", "12345678"));
        DatabaseCustomer.addCustomer(new Customer(3,"Wito","wito@gmail.com", "1234567"));

        DatabaseFood.addFood(new Food(1, "Kopi", DatabaseSeller.getSellerById(1), 6000, FoodCategory.Coffee));
        DatabaseFood.addFood(new Food(2, "Coklat", DatabaseSeller.getSellerById(2), 4000, FoodCategory.Coffee));
        DatabaseFood.addFood(new Food(3, "Indomie", DatabaseSeller.getSellerById(3), 17000, FoodCategory.Noodles));

        DatabaseInvoice.addInvoice(new Invoice(1, "Pizza", customer10));


        //for (Customer i: DatabaseCustomer.getCustomerDatabase()){

           // System.out.println(i);
       // }

        for ( Invoice invoice: DatabaseInvoice.getInvoiceDatabase()){

            System.out.println(invoice);
        }


        
        
        
}
}
