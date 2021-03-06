package MuhammadFarhan.JFood;
/**
 * <h1>Bukti Pembelian makanan</h1>
 *  class Invoice merupakan class yang menyimpan id pelanggan, id makanan, tanggal pembelian, 
 *  total harga, dan informasi dari customer
 *  id -> id pelanggan
 *  idFood -> id makanan
 *  date -> tanggal pembelian
 *  totalPrice -> total harga
 *  customer -> informasi pelanggan
 *  @author Muhammad Farhan
 *  @27/02/2020
 */

import java.util.*; 
import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public abstract class Invoice{
    private int id; 
    //private int idFood; 
    private ArrayList<Food> foods = new ArrayList();
    private Calendar date; 
    protected int totalPrice; 
    private Customer customer; //connecting to Customer class
    private InvoiceStatus invoiceStatus = InvoiceStatus.Ongoing;
    //private PaymentType paymentType; 
    //private InvoiceStatus status; 
    
    /**
    * this method class invoice is used for getting information about food  
    * 
    * @param id, this variable is used for id invoice
    * @param food, this variable is used for id Food
    * @param date, this variable is used for date invoice
    * @param totalPrice, this variable is used for total price
    * @param customer, this variable is used for customer
    */
    
    public Invoice (int id, ArrayList<Food> foods, Customer customer){
        
        this.id=id; 
        this.foods=foods;
        //this.date=new isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        //this.date=date;
        this.customer=customer; 
        //this.invoiceStatus=invoiceStatus;
    }
    
    public int getId(){
         /*
         * @return id
         */
        return id; 
    }
    
    public ArrayList<Food> getFoods(){
        return foods;
    }
    
    public Calendar getDate(){
         /*
         * @return date
         */
        return date; 
    }
    
    public int getTotalPrice(){
        return totalPrice; 
    }
    
    public Customer getCustomer(){
        return customer; 
    }
    
    public abstract PaymentType getPaymentType(); 
    
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus; 
    }
    
    public void setId (int id){
    
    }
    
    public void setFoods(ArrayList<Food> foods){
        this.foods = foods;
    }
    
    public Calendar setDate (Calendar date){
        this.date=date; 
        return date;
    }
    
    public Calendar setDate (int year, int month, int dayOfMonth){
            this.date= new GregorianCalendar(year,month,dayOfMonth);
            return date;
    }
    
    public abstract void setTotalPrice ();
    
    public void setCustomer (Customer customer){
            this.customer = customer;
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
        this.invoiceStatus = invoiceStatus;
    }
    public abstract String toString();

    
}

