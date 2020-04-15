package MuhammadFarhan.JFood;
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


    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);

    }

    public CashlessInvoice(int id, ArrayList<Food> foods, Customer customer, Promo promo)
    {
        super(id, foods, customer);
        this.promo = promo;

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

    public void setTotalPrice()
    {
        int totalFoodPrice =0;
        for(int i=0;i<getFoods().size();i++){
            totalFoodPrice = totalFoodPrice+ getFoods().get(i).getPrice() ;
        }

        if( promo != null){
            if (promo.getActive() == true && totalFoodPrice >promo.getMinPrice()){
                super.totalPrice = (totalFoodPrice - promo.getDiscount() );
            }
            else{
                super.totalPrice = totalFoodPrice;
            }

        }
        else{
            super.totalPrice = totalFoodPrice;
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
