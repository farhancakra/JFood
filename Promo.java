/**public class Promo
{
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;
    
    public Promo(int id, String code, int discount, int minPrice,
                 boolean active)
    {
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;
    }
    
    public int getId(){
        return id;
    }
    
    public String getCode(){
        return code;
    }
    
    public int getDiscount(){
        return discount;
    }

    public int getMinPrice(){
        return minPrice;
    }
    
    public boolean getActive(){
        return active;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    public void setMinPrice(int minPrice){
        this.minPrice = minPrice;
    }
    
    public void setActive(boolean active){
        this.active = active;
    }
    
    public void printData(){
        System.out.println("===================PROMO=============");
        System.out.println("ID: " + id);
        System.out.println("Code: " + code);
        System.out.println("Discount: " + discount);
        System.out.println("Minimal Price: " + minPrice);
        System.out.println("Active: " + active);
        
    }
    
}*/

/**
 * <h1>Promo<h1>
 * Kelas ini berfungsi untuk mendapatkan dan memberikan nilai pada obyek Promo
 * dengan memanfaatkan method constructor, mutator, dan accessor
 * 
 * @author Muhammad Alfiyansyah
 * @version 27-February-2020
 * 
 */
public class Promo
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private
    private int id;
    private String code;
    private int discount;
    private int minPrice;
    private boolean active;
    
    public Promo(int id, String code, int discount, int minPrice, boolean active) {
        //Kata kunci this digunakan untuk mereferensikan obyek saat ini yaitu customer
        this.id = id;
        this.code = code;
        this.discount = discount;
        this.minPrice = minPrice;
        this.active = active;
    }
    
    /**
     * Method getID merupakan method getter untuk variabel id
     * @return <code>int<code> akan mengembalikan nilai id ketika method ini
     * dipanggil
     */
    public int getId() {
        return id;
    }
    
    /**
     * Method getName merupakan method getter untuk variabel Name
     * @return <code>String<code> akan mengembalikan nilai Name ketika method ini
     * dipanggil
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Method getEmail merupakan method getter untuk variabel email
     * @return <code>String<code> akan mengembalikan nilai email ketika method ini
     * dipanggil
     */
    public int getDiscount() {
        return discount;
    }
    
    /**
     * Method getPassword merupakan method getter untuk variabel password
     * @return <code>String<code> akan mengembalikan nilai password ketika method ini
     * dipanggil
     */
    public int getMinPrice() {
        return minPrice;
    }
    
    /**
     * Method getJoinDate merupakan method getter untuk variabel joinDate
     * @return <code>String<code> akan mengembalikan nilai password ketika method ini
     * dipanggil
     */
    public boolean getActive() {
        return active;
    }
    
    /**
     * Method setID merupakan method setter untuk variabel id
     * @param id untuk mengisi data berupa tipe data int ke dalam variabel id
     * @return tidak ada
     */
    public void setId(int id){
        this.id = id;
    }
    
    /**
     * Method setName merupakan method setter untuk variabel name
     * @param name untuk mengisi data berupa tipe data String ke dalam variabel name
     * @return tidak ada
     */
    public void setCode (String code) {
        this.code = code;
    }
    
      /**
     * Method setEmail merupakan method setter untuk variabel email
     * @param email untuk mengisi data berupa tipe data String ke dalam variabel email
     * @return tidak ada
     */
    public void setDiscount (int discount) {
        this.discount = discount;
    }
    
    /**
     * Method setPassword merupakan method setter untuk variabel password
     * @param email untuk mengisi data berupa tipe data String ke dalam variabel email
     * @return tidak ada
     */
    public void setMinPrice (int minPrice) {
        this.minPrice = minPrice;
    }
    
    /**
     * Method setJoinDate merupakan method setter untuk variabel joinDate
     * @param joinDate untuk mengisi data berupa tipe data String ke dalam variabel joinDate
     * @return tidak ada
     */
    public void setActive (boolean active) {
        this.active = active;
    }
    
    /**
     * Method ini digunakan untuk mencetak variable name
     */
    public void printData () {
        System.out.println ("id : " + id);
        System.out.println ("Code : " + code);
        System.out.println ("Discount : " + discount);
        System.out.println ("MinPrice : " + minPrice);
        System.out.println ("Active : " + active);

    }
    
    
    
    
    
    
       
            
}

