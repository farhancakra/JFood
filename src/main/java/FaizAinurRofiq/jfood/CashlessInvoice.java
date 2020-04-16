package FaizAinurRofiq.jfood;

import java.util.*;
import java.text.SimpleDateFormat;
/**
 * Write a description of class CashlessInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashlessInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE = PaymentType.Cashless;
    private Promo promo;
    private int total = 0;

    /**
     * Constructor for objects of class CashlessInvoice
     */
    public CashlessInvoice(int id, ArrayList<Food> food, Customer customer)
    {
        // initialise instance variables
        super(id, food, customer);
                
        
    }
    
    public CashlessInvoice(int id, ArrayList<Food> food, Customer customer, Promo promo) {
        super(id, food, customer);
        this.promo = promo;
    }

    public PaymentType getPaymentType() {
        return PAYMENT_TYPE;
    }
    
    public Promo getPromo() {
        return promo;
    }
    
    public void setPromo(Promo promo) {
        this.promo = promo;
    }
    
    public void setTotalPrice() {
        ArrayList<Food> listFood = super.getFoods();


        for (Food food: listFood) {
            total += food.getPrice();
        }

        if (promo != null && promo.getActive() && total > promo.getMinPrice()) {
            super.totalPrice = total - promo.getDiscount();
        } else {
            super.totalPrice = total;
        }
    }
    
    public String toString(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder stringBuilder = new StringBuilder();

        ArrayList<Food> list = super.getFoods();
        for (Food food: list) {
            stringBuilder.append(food.getName()).append("\n");
        }
        setTotalPrice();
        String ret = "\nId: " + super.getId() + "\n" +
                            "Food Name: \n" + stringBuilder+ "\n" +
                            "Date: " + formatter.format(super.getDate().getTime()) + "\n" +
                            "Total Price: " + super.totalPrice + "\n" +
                            "Customer Name: " + super.getCustomer().getName() + "\n" +
                            "Invoice Status: " + super.getInvoiceStatus().toString() + "\n" + 
                            "Payment Type: " + PAYMENT_TYPE.toString();
        
        if ((promo != null && promo.getActive() && total > promo.getMinPrice())) {
            ret += "\nPromo code: " + promo.getCode() + "\n";
            return ret;
        } else {
            return ret;
        }
    }
}
