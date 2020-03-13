public class Jfood
{
    
    public static void main (String[] args) {
        
        Location location1 = new Location ("Bekasi", "Panas", "Jawa Barat");
        Seller seller1 = new Seller(1, "Frenzel", "farhan.cakra@gmail.com", "082245440870", location1);
        Food food = new Food(1, "Martabak", seller1,50000,  FoodCategory.Noodles);
        Food food1 = new Food(2, "Martabak", seller1, 50000,  FoodCategory.Noodles);
        Customer customer1 = new Customer(2, "JONY JONY", "asd@gmail.com", "asd", "Maret 2020");
        Promo promo = new Promo (3, "543", 10000, 25000, true);
        
        
        //CashlessInvoice cashless = new CashlessInvoice(1, food, "10102020", customer1, InvoiceStatus.Ongoing);
        //cashless.setTotalPrice();
        //CashlessInvoice cashless2 = new CashlessInvoice(2, food1, "11112020", customer1, InvoiceStatus.Ongoing, promo);
        //cashless2.setTotalPrice();
        CashInvoice cash = new CashInvoice(4, food1, "3/3/2020", customer1, InvoiceStatus.Finished); 
        cash.setTotalPrice();
        
        CashInvoice cash1 = new CashInvoice(5, food1, "3/3/2020", customer1, InvoiceStatus.Finished, 10000);
        cash1.setTotalPrice();
        
        cash.printData();
        cash1.printData();
        
        
    
        
        
        
        
}
}
