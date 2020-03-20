import java.text.SimpleDateFormat; 
import java.util.Calendar;
import java.util.Date;

public class CashlessInvoice extends Invoice
{
    
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
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
        this.promo = promo;
    }
    
    public void setTotalPrice(){
        if (promo != null && promo.getActive() == true && super.getFood().getPrice() >= promo.getMinPrice())
        {
            super.totalPrice = getFood().getPrice() - promo.getDiscount();
        }
        
        else
        {
            super.totalPrice = getFood().getPrice();
        }
    }
    
    
    public String toString(){
        
        SimpleDateFormat date2 = new SimpleDateFormat(" dd MMMM YYYY");
        
        if (promo != null && promo.getActive() == true && super.getFood().getPrice() >= promo.getMinPrice())
        {
            System.out.println("===================INVOICE=============");
            System.out.println("ID: " + super.getId());
            System.out.println("Food ID: " + super.getFood());
            System.out.println("Date: " + date2.format(getDate().getTime()));
            System.out.println("Customer: " + super.getCustomer().getName());
            System.out.println("Total Price " + super.getTotalPrice());
            System.out.println("status: " + super.getInvoiceStatus());
            System.out.println("Code: " + promo.getCode());
            System.out.println ("Payment Type :" + PAYMENT_TYPE);
        }
        else{
            System.out.println("===================INVOICE=============");
            System.out.println("ID: " + super.getId());
            System.out.println("Food ID: " + super.getFood());
            System.out.println("Date: " + date2.format(getDate().getTime()));
            System.out.println("Customer: " + super.getCustomer().getName());
            System.out.println("Total Price " + super.getTotalPrice());
            System.out.println("status: " + super.getInvoiceStatus());
            System.out.println ("Payment Type :" + PAYMENT_TYPE);
    }
    
    return null;
    }


    
}
