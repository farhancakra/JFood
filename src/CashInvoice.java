
/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*; 
import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CashInvoice extends Invoice
{
    private static PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;

    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        // initialise instance variables
        super (id, foods, customer);
    }

    public CashInvoice(int id, ArrayList<Food> foods, Customer customer,int deliveryFee)
    {
        super (id, foods, customer);
        this.deliveryFee = deliveryFee;
    }

    public PaymentType getPaymentType(){
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee(){
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee){
        this.deliveryFee = deliveryFee;
    }

    public void setTotalPrice()
    {
        int foodPrice=0;
        for(int i = 0; i < super.getFoods().size(); i++){
            foodPrice+=super.getFoods().get(i).getPrice();
        }
        if(deliveryFee>0)
        {
            super.totalPrice=foodPrice+deliveryFee;
        }
        else super.totalPrice=foodPrice;
    }

    public String toString(){
        SimpleDateFormat date2 = new SimpleDateFormat(" dd MMMM YYYY");

        System.out.println ("===========Invoice===========");
        System.out.println ("Id : " + super.getId());
        System.out.println ("Food : " + super.getFoods());
        System.out.println("Date: " + date2.format(getDate().getTime()));
        System.out.println ("Customer : " + super.getCustomer().getName());
        System.out.println ("Delivery Fee : " + getDeliveryFee());
        System.out.println ("Total Price : " + super.totalPrice);
        System.out.println ("Status :" + super.getInvoiceStatus());
        System.out.println ("Payment Type :" + PAYMENT_TYPE);

        return null;
    }}
