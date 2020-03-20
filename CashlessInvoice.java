import java.util.*;
import java.text.*;

public class CashlessInvoice extends Invoice
{
    Date date = new Date();
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;
    
    
    public CashlessInvoice(int id, Food food,  Customer customer,
                            InvoiceStatus invoiceStatus)
    {
      
        super(id, food, customer, invoiceStatus);
        
        //this.id = id;
        //this.food = food;
        //this.date = date;
        //this.customer = customer;
        //this.invoiceStatus = invoiceStatus;
    }
    
    public CashlessInvoice(int id, Food food, Customer customer,
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
    
    
    public void printData(){
        System.out.println("===================INVOICE=============");
        System.out.println("ID: " + super.getId());
        System.out.println("Food ID: " + super.getFood());
        System.out.println("Date: " + super.getDate());
        System.out.println("Customer: " + super.getCustomer().getName());
        System.out.println("Total Price " + super.getTotalPrice());
        System.out.println("status: " + super.getInvoiceStatus());
        if (promo != null && promo.getActive() == true && super.getFood().getPrice() >= promo.getMinPrice())
        {
            System.out.println("Code: " + promo.getCode());
        }
        System.out.println ("Payment Type :" + PAYMENT_TYPE);
    }
    
    
        
    
    

   
    
}
