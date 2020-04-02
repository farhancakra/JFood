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
import java.util.ArrayList;
import java.util.*; 
import java.util.Calendar; 
import java.util.Date; 
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class Invoice{
    private int id; 
    //private int idFood;
    private ArrayList<Food> foods = new ArrayList<Food>();
    private Calendar date;
    protected int totalPrice; 
    private Customer customer; //connecting to Customer class
    //private PaymentType paymentType; 
    private InvoiceStatus status;
    
    /**
    * this method class invoice is used for getting information about food  
    * 
    * @param id, this variable is used for id invoice
    * @param food, this variable is used for id Food
    * @param date, this variable is used for date invoice
    * @param totalPrice, this variable is used for total price
    * @param customer, this variable is used for customer
    */
    
    public Invoice (int id, ArrayList<Food> foods, Calendar date, Customer customer, InvoiceStatus status){
        
        this.id=id; 
        this.foods=foods;
        //this.date=new isoFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.date=date; 
        this.customer=customer;
        this.status = status.Ongoing;
    }
    
    public int getId(){
         /*
         * @return id
         */
        return id; 
    }
    
    public ArrayList<Food> getFood(){
         /*
         * @return idFood
         */
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

    
    public void setId (int id){
    
    }
    
    public void setFood(ArrayList<Food> foods){
        this.foods = foods;
    }
    
    public Calendar setDate (Calendar date){
        this.date=date; 
        return date;  
    }
    
    public Calendar setDate (int year, int month, int dayOfMonth){
            this.date= new GregorianCalendar(year,month,dayOfMonth);
            return null; 
    }
    
    public void setTotalPrice (){
    
    }
    
    public void setCustomer (Customer customer){
    
    }
    
    public void setPaymentType (PaymentType paymentType){
        
    }

    
    public String toString(){
        return null; 
    }
    
}

