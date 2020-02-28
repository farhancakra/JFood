/**
 * <h1>Biodata Penjual</h1>
 *  class Seller merupakan class yang menyimpan id penjual, nama penjual, email penjual, 
 *  nomer penjual, dan lokasi detail dari penjual
 *  id -> id penjual
 *  name -> nama penjual
 *  phoneNumber -> nomer penjual
 *  location -> detail lokasi penjual
 *  @author Muhammad Farhan
 *  @27/02/2020
 */
public class Seller
{
    private int id;//id penjual
    private String name;// nama penjual
    private String email;//email penjual
    private String phoneNumber;//nomer hp penjual
    private Location location;// lokasi penjual
    /***
     * constructor Seller digunakan untuk memasukkan penjual baru
     * @params id, name, email, phoneNumber, location
     * @return tidak ada
     */
    public Seller(int id, String name, String email, String phoneNumber, Location location) {
        this.id = id;//mengganti nilai variabel id yang lama dengan parameter yang dimasukkan
        this.name = name;//mengganti nilai variabel name yang lama dengan parameter yang dimasukkan
        this.email = email;//mengganti nilai variabel email yang lama dengan parameter yang dimasukkan
        this.phoneNumber = phoneNumber;//mengganti nilai variabel phoneNumber yang lama dengan parameter yang dimasukkan
        this.location = location;//mengganti nilai variabel location yang lama dengan parameter yang dimasukkan
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
        
        return name;//mengembalikan nilai getName
    }
    /***
     * getter getEmail digunakan untuk memanggil email yang saat ini tersimpan di memori
     * @params tidak ada
     * @return email
     */
    public String getEmail(){
        
        return email;//mengembalikan nilai getEmail
    }
    /***
     * getter getPhoneNumber digunakan untuk memanggil phoneNumber 
     * yang saat ini tersimpan di memori
     * @params tidak ada
     * @return phoneNumber
     */
    public String getPhoneNumber(){
        
        return phoneNumber;//mengembalikan nilai PhoneNumber
    }
    /***
     * getter getLocation digunakan untuk memanggil location yang saat ini tersimpan di memori
     * @params tidak ada
     * @return location
     */
    public Location getLocation(){
        return location;//mengembalikan nilai location
    }
    /***
     * setter setId digunakan untuk menyimpan id baru
     * this.id digunakan untuk merujuk ke variabel id saat ini
     * @params id
     * @return tidak ada
     */
    public void setId(int id){
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
     * setter setEmail digunakan untuk menyimpan email baru
     * this.email digunakan untuk merujuk ke variabel email saat ini
     * @params email
     * @return tidak ada
     */
    public void setEmail(String email){
        this.email = email;//mengganti nilai email sesuai setter
        
    }
    /***
     * setter setPhoneNumber digunakan untuk menyimpan phoneNumber baru
     * this.phoneNumber digunakan untuk merujuk ke variabel phoneNumber saat ini
     * @params phoneNumber
     * @return tidak ada
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;//mengganti nilai phoneNumber sesuai setter
        
    }
    /***
     * setter setLocation digunakan untuk menyimpan location baru
     * this.location digunakan untuk merujuk ke variabel location saat ini
     * @params location
     * @return tidak ada
     */
    public void setLocation (Location location){
        this.location = location;//mengganti nilai location sesuai setter
    }
    /***
     * jika method printData dipanggil, maka akan menampilkan nilai dari name
     */
    public void printData() {
        System.out.println(name);//menampilkan isi variabel name
    }
}
