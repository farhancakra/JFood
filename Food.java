/**
 * <h1>Deskripsi makanan yang dijual</h1>
 *  class Food merupakan class yang menyimpan id makanan, nama makanan, deskripsi penjual, 
 *  harga makanan, dan kategori makanan
 *  id -> id makanan
 *  name -> nama makanan
 *  seller -> deskripsi tentang penjual yang diambil dari class Seller
 *  price -> harga makanan
 *  category -> kategori makanan
 *  @author Muhammad Farhan
 *  @27/02/2020
 */

public class Food
{
    private int id;//variabel id makanan
    private String name;//variabel nama makanan
    private Seller seller;//deskripsi penjual
    private Location city;
    private int price;// harga makanan
    private FoodCategory category;
    /***
     * constructor Food digunakan untuk memasukkan deskripsi makanan baru
     * @params id, name, seller, price, category
     * @return tidak ada
     */
    public Food(int id, String name, Seller seller, int price, FoodCategory category){
        this.id = id;//mengganti nilai variabel id yang lama dengan parameter yang dimasukkan
        this.name = name;//mengganti nilai variabel name yang lama dengan parameter yang dimasukkan
        this.seller = seller;//mengganti nilai variabel seller yang lama dengan parameter yang dimasukkan
        this.price = price;//mengganti nilai variabel price yang lama dengan parameter yang dimasukkan
        this.category = category;//mengganti nilai variabel category yang lama dengan parameter yang dimasukkan
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
     * getter getName digunakan untuk memanggil name yang saat ini tersimpan di memori
     * @params tidak ada
     * @return name
     */
    public String getName(){
        
        return name;//mengembalikan nilai name
    }
    /***
     * getter getId digunakan untuk memanggil id yang saat ini tersimpan di memori
     * @params tidak ada
     * @return id
     */
    public Seller getSeller(){
        return seller;
    }
    // mendeklarasikan getter dalam bentuk variabel
    public int getPrice(){
        return price;
    }// mendeklarasikan getter dalam bentuk variabel
    
    
    public FoodCategory getCategory(){
            return category;
    }//mendeklarasikan getter dalam bentuk variabel
    /***
     * setter setId digunakan untuk menyimpan id baru
     * this.id digunakan untuk merujuk ke variabel id saat ini
     * @params id
     * @return tidak ada
     */
    
    public void setId(int id) {
        this.id = id;//mengganti nilai id sesuai setter
    }
    
    
    /***
     * setter setName digunakan untuk menyimpan name baru
     * this.name digunakan untuk merujuk ke variabel name saat ini
     * @params name
     * @return tidak ada
     */
    public void setName(String name){
        this.name = name;//mengganti nilai name sesuai setter
    }
    /***
     * setter setSeller digunakan untuk menyimpan seller baru
     * this.seller digunakan untuk merujuk ke variabel seller saat ini
     * @params seller
     * @return tidak ada
     */
    public void setSeller (Seller seller){
        this.seller = seller;//mengganti nilai seller sesuai setter
    }
    /***
     * setter setPrice digunakan untuk menyimpan price baru
     * this.price digunakan untuk merujuk ke variabel price saat ini
     * @params price
     * @return tidak ada
     */
    public void setPrice(int price){
        this.price = price;//mengganti nilai price sesuai setter
    }
    /***
     * setter setCategory digunakan untuk menyimpan category baru
     * this.category digunakan untuk merujuk ke variabel category saat ini
     * @params cateory
     * @return tidak ada
     */
    public void setCategory(FoodCategory category){
        //this.category = category;//mengganti nilai category sesuai setter
    }
    /***
     * method dengan nama printData
     */
    public String toString(){
        String output = "#################Food###############\n" + "ID = " + id + "\n" + 
               "Nama = " + name + "\n" + "Seller = " + seller.getName() + "\n" + 
               "City = " + seller.getLocation().getCity() + "\n" + "Price = " + price + "\n" + 
               "Category = " + category + "\n";
        System.out.println(output);
        return output;
        
    }
    
    
}
