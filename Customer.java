/**
 * <h1>biodata dari customer</h1>
 *  class Customer merupakan class yang menyimpan nama, email, password
 *  dan tanggal join customer
 *  @author Muhammad Farhan
 *  @27/02/2020
 */


public class Customer
{
    
    private int id;//variabel id pelanggan
    private String name;//variabel nama pelanggan
    private String email;//variabel email pelanggan
    private String password;//variabel password pelanggan
    private String joinDate;//variabel tanggal pelanggan bergabung
    /***
     * constructor customer digunakan untuk memasukkan biodata baru
     * @params id, name, email, password, joinDate
     * @return tidak ada
     */
    public Customer(int id, String name, String email, String password, String joinDate) {
        this.id = id; //mengganti nilai variabel id yang lama dengan parameter yang dimasukkan
        this.name = name;//mengganti nilai variabel name yang lama dengan parameter yang dimasukkan
        this.email = email;//mengganti nilai variabel email yang lama dengan parameter yang dimasukkan
        this.password = password;//mengganti nilai variabel password yang lama dengan parameter yang dimasukkan
        this.joinDate = joinDate;//mengganti nilai variabel joinDate yang lama dengan parameter yang dimasukkan
    }
    /***
     * getter getId digunakan untuk memanggil id yang saat ini tersimpan di memori
     * @params tidak ada
     * @return id
     */
    public int getId() {
        
        return id;//mengembalikan nilai id
    }
    /***
     *  getter getName digunakan untuk memanggil nama yang saat ini tersimpan di memori
     * @params tidak ada
     * @return nama
     */
    public String getName() {
        
        return name;//mengembalikan nilai name
    }
    /***
     * getter getEmail digunakan untuk memanggil email yang saat ini tersimpan di memori
     * @params tidak ada
     * @return email
     */
    public String getEmail() {
        
        return email;//mengembalikan nilai email
    }
    /***
     * getter getPassword digunakan untuk memanggil password yang saat ini tersimpan di memori
     * @params tidak ada
     * @return password
     */
    public String getPassword() {
        
        return password;//mengembalikan nilai password
    }
    /***
     * variable getJoinDate
     */
    public String getJoinDate;//mengembalikan nilai getJoinDate
    /***
     * setter setId digunakan untuk menyimpan id baru
     * this.id adalah digunakan untuk merujuk ke variabel id saat ini
     * @params id
     * @return tidak ada
     */
    public void setId(int id) {
        
        this.id = id;//mengganti nilai id sesuai setter
    }
    /***
     * setter setName digunakan untuk menyimpan id baru
     * this.name adalah digunakan untuk merujuk ke variabel name saat ini
     * @params name
     * @return tidak ada
     */
    public void setName(String name) {
        
        this.name = name;//mengganti nilai name sesuai setter
    }
    /***
     * setter setEmail digunakan untuk menyimpan email baru
     * this.email adalah digunakan untuk merujuk ke variabel email saat ini
     * @params email
     * @return tidak ada
     */
    public void setEmail(String email) {
        
        this.email = email;//mengganti nilai email sesuai setter
    }
    /***
     * setter setPassword digunakan untuk menyimpan password baru
     * this.password adalah digunakan untuk merujuk ke variabel password saat ini
     * @params password
     * @return tidak ada
     */
    public void setPassword(String password) {
        
        this.password = password;//mengganti nilai password sesuai setter
    }
    /***
     * setter joinDate digunakan untuk menyimpan tanggal baru
     * this.joinDate adalah digunakan untuk merujuk ke variabel joinDate saat ini
     * @params joinDate
     * @return tidak ada
     */
    public void JoinDate(String joinDate) {
        
        this.joinDate = joinDate;//mengganti nilai joinDate sesuai setter
    }
    /***
     * Ketika method printData dipanggil maka akan menampilkan isi dari variabel name
     * @params tidak ada
     * @return tidak ada
     */
    public void printData() {
        System.out.println(name);//menampilkan nilai name
    }
    
    
   
    
}
