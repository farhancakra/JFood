
/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.text.SimpleDateFormat; 
import java.util.Calendar;
import java.util.Date;

public class CashInvoice extends Invoice
{
    private static final PaymentType PAYMENT_TYPE = PaymentType.Cash;
    private int deliveryFee;
    
    public CashInvoice(int id, Food food, Calendar date, Customer customer, InvoiceStatus invoiceStatus){
        super(id, food, date, customer, invoiceStatus);
    }
    
    public CashInvoice(int id, Food food, Customer customer, Calendar date, InvoiceStatus invoiceStatus, 
                        int deliveryFee){
        super(id, food, date, customer, invoiceStatus);
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
    
    public void setTotalPrice(){
        if (deliveryFee == 0){
            super.totalPrice = super.getFood().getPrice();
        }
        
        else{
            super.totalPrice = super.getFood().getPrice() + deliveryFee;
        }
    }
    
    public String toString(){
        SimpleDateFormat date2 = new SimpleDateFormat(" dd MMMM YYYY");
        
        System.out.println ("===========Invoice===========");
        System.out.println ("Id : " + super.getId());
        System.out.println ("Food : " + super.getFood().getName());
        System.out.println("Date: " + date2.format(getDate().getTime()));
        System.out.println ("Customer : " + super.getCustomer().getName());
        System.out.println ("Delivery Fee : " + getDeliveryFee());
        System.out.println ("Total Price : " + super.totalPrice);
        System.out.println ("Status :" + super.getInvoiceStatus());
        System.out.println ("Payment Type :" + PAYMENT_TYPE);
        
        return null;
    }}
