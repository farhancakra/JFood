
public abstract class CashlessInvoice extends Invoice
{
    private static PaymentType PAYMENT_TYPE;
    private Promo promo;
    
    
    public CashlessInvoice(int id, Food food, String date, Customer customer,
                            InvoiceStatus invoiceStatus)
    {
        super(id, food, date, customer, invoiceStatus);
        //this.id = id;
        //this.food = food;
        //this.date = date;
        //this.customer = customer;
        //this.invoiceStatus = invoiceStatus;
    }
    
    public CashlessInvoice(int id, Food food, String date, Customer customer,
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
        if ((getPromo().getActive() == true) && getPromo().getMinPrice() 
            < super.getFood().getPrice()){
            super.totalPrice = super.getFood().getPrice() - getPromo().getMinPrice();
        }
        
        else{
            super.totalPrice = super.getFood().getPrice();
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
        if ((getPromo().getActive() == true || getPromo().getMinPrice() 
            < super.getFood().getPrice())){
                System.out.println("Kode: " + promo.getCode());
            }
        
    }
    
    
        
    
    

   
    
}
