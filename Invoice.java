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
public abstract class Invoice
{
    private int id;//id invoice
    private Food food;
    private String date;// tanggal pembelian
    protected int totalPrice;// total harga makanan yang dibeli
    private Customer customer;// biodata customer
    private InvoiceStatus invoiceStatus;
    /***
     * constructor Invoice digunakan untuk memasukkan pesanan baru
     * @params id, idFood, date, customer, totalPrice
     * @return tidak ada
     */
    public Invoice(int id, Food food, String date, Customer customer, InvoiceStatus invoiceStatus){
        this.id = id;//id di memori diganti dengan id pada parameter
        this.food = food;//idFood di memori diganti dengan idFood pada parameter
        this.date = date;//date di memori diganti dengan date pada parameter
        this.customer = customer;//customer di memori diganti dengan customer pada parameter
        this.invoiceStatus = invoiceStatus;
    }
    /***
     * getter getId digunakan untuk memanggil id yang saat ini tersimpan di memori
     * @params tidak ada
     * @return id
     */
    public int getId(){
        
        return id;//mengembalikan nilai id
    }
    /***
     * getter getFood digunakan untuk memanggil nilai idFood yang saat ini tersimpan di memori
     * @params tidak ada
     * @return idFood
     */
    public Food getFood(){
        
        return food;//mengembalikan nilai getFood
    }
    /***
     * getter getDate digunakan untuk memanggil nilai date yang saat ini tersimpan di memori
     * @params tidak ada
     * @return date
     */
    public String getDate(){
        
        return date;//mengembalikan nilai getDate
    }
    /***
     * getter getTotalPrice digunakan untuk memanggil nilai totalPrice
     * yang saat ini tersimpan di memori
     * @params tidak ada
     * @return totalPrice
     */
    public int getTotalPrice(){
        
        return totalPrice;//mengembalikan nilai totalPrice
    }
    /***
     * getter getCustomer digunakan untuk memanggil nilai customer
     * yang saat ini tersimpan di memori
     * @params tidak ada
     * @return customer
     */
    public Customer getCustomer(){
        
        return customer;//mengembalikan nilai customer
    }
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus(){
        return invoiceStatus;
    }
    /***
     * setter setId digunakan untuk menyimpan id baru
     * this.id digunakan untuk merujuk ke variabel id saat ini
     * @params id
     * @return tidak ada
     */
    public void setId(int id){
        this.id = id;//nilai id pada memori diganti dengan parameter
    }
    /***
     * setter setIdFoods digunakan untuk menyimpan idFood baru
     * this.idFood digunakan untuk merujuk ke variabel idFood saat ini
     * @params idFood
     * @return tidak ada
     */
    public void setFood(Food food){
        this.food = food;//nilai idFood pada memori diganti dengan parameter
        
    }
    /***
     * setter setDate digunakan untuk menyimpan setDate baru
     * this.Date digunakan untuk merujuk ke variabel date saat ini
     * @params date
     * @return tidak ada
     */
    public void setDate(String date){
        this.date = date;//nilai date pada memori diganti dengan parameter
        
    }
    /***
     * setter setTotalPrice digunakan untuk menyimpan totalPrice baru
     * this.totalPrice digunakan untuk merujuk ke variabel totalPrice saat ini
     * @params totalPrice
     * @return tidak ada
     */
    public abstract void setTotalPrice();
    /***
     * setter setCustomer digunakan untuk menyimpan customer baru
     * this.customer digunakan untuk merujuk ke variabel customer saat ini
     * @params customer
     * @return tidak ada
     */
    public void setCustomer(Customer customer){
        this.customer = customer;//nilai customer pada memori diganti dengan parameter
    }
    
    public abstract void setPaymentType(PaymentType paymentType);
    
    public void setInvoiceStatus(InvoiceStatus status){
        //this.status = status;
    }
    /***
     * method bernama printData
     * @param tidak ada
     * @return tidak ada
     */
    public void printData(){
        System.out.println("===================INVOICE=============");
        System.out.println("ID: " + id);
        System.out.println("Food ID: " + food);
        System.out.println("Date: " + date);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Total Price " + totalPrice);
        System.out.println("status: " + invoiceStatus);
    }
}
