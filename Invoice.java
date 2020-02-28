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
public class Invoice
{
    private int id;//id invoice
    private int idFood;//id dari makanan yang dibeli
    private String date;// tanggal pembelian
    private int totalPrice;// total harga makanan yang dibeli
    private Customer customer;// biodata customer
    /***
     * constructor Invoice digunakan untuk memasukkan pesanan baru
     * @params id, idFood, date, customer, totalPrice
     * @return tidak ada
     */
    public Invoice(int id, int idFood, String date, Customer customer, int totalPrice){
        this.id = id;//id di memori diganti dengan id pada parameter
        this.idFood = idFood;//idFood di memori diganti dengan idFood pada parameter
        this.date = date;//date di memori diganti dengan date pada parameter
        this.customer = customer;//customer di memori diganti dengan customer pada parameter
        this.totalPrice = totalPrice;//totalPrice di memori diganti dengan totalPrice pada parameter
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
    public int getFood(){
        
        return idFood;//mengembalikan nilai getFood
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
    public void setIdFoods(int idFood){
        this.idFood = idFood;//nilai idFood pada memori diganti dengan parameter
        
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
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;//nilai totalPrice pada memori diganti dengan parameter
        
    }
    /***
     * setter setCustomer digunakan untuk menyimpan customer baru
     * this.customer digunakan untuk merujuk ke variabel customer saat ini
     * @params customer
     * @return tidak ada
     */
    public void setCustomer(Customer customer){
        this.customer = customer;//nilai customer pada memori diganti dengan parameter
    }
    /***
     * method bernama printData
     * @param tidak ada
     * @return tidak ada
     */
    public void printData(){
        
    }
}
