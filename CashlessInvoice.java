import java.util.*; 
import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashlessInvoice extends Invoice
{
    
    private static PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;
    
    
    public CashlessInvoice(int id, Food food, Calendar date, Customer customer,
                            InvoiceStatus invoiceStatus)
    {
      
        super(id, food, date, customer, invoiceStatus);
        
        //this.id = id;
        //this.food = food;
        //this.date = date;
        //this.customer = customer;
        //this.invoiceStatus = invoiceStatus;
    }
    
    public CashlessInvoice(int id, Food food, Calendar date, Customer customer,
                            InvoiceStatus invoiceStatus, Promo promo)
    {
        super(id, food, date, customer, invoiceStatus);
        this.promo = promo;
        //this.id = id;
        //this.food = food;
        //this.date = date;
        //this.customer = customer;
        //this.invoiceStatus = invoiceStatus;
        //this.promo = promo;
    }
    
    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo(){
        return promo;
    }
    
    public void setPromo(Promo promo){
        //this.promo = promo;
    }
    
    public void setTotalPrice(){
        if((promo != null) && (promo.getActive()==true) && (super.getFood().getPrice()>=promo.getMinPrice())
        )
        {
            super.totalPrice= getFood().getPrice()-promo.getDiscount(); 
        }
          
        else
        {
             super.totalPrice = getFood().getPrice(); 
        }
    }
    
    
    public String toString(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        if(promo == null || promo.getActive()==false || super.getTotalPrice()<promo.getMinPrice()
        )
        
        {
            System.out.println("-----------INVOICE------------"); 
            System.out.println("ID: " + super.getId()); 
            System.out.println("Date: " + sdf.format(getDate().getTime())); 
            System.out.println("Customer: " + super.getCustomer().getName()); 
            System.out.println("Total Price: " + getTotalPrice()); 
            System.out.println("Status: " + super.getInvoiceStatus()); 
            System.out.println("Payment Type: " + PAYMENT_TYPE); 
            System.out.println("==============================="); 
        }
        else
        {
            System.out.println("-----------INVOICE------------"); 
            System.out.println("ID: " + super.getId()); 
            System.out.println("Date: " + sdf.format(getDate().getTime())); 
            System.out.println("Customer: " + super.getCustomer().getName()); 
            System.out.println("Code Promo: " + promo.getCode());
            System.out.println("Total Price: " + getTotalPrice()); 
            System.out.println("Status: " + super.getInvoiceStatus()); 
            System.out.println("Payment Type: " + PAYMENT_TYPE); 
            System.out.println("==============================="); 
            
        }
        return null; 
    }


    
}
