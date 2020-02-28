/**
 * <h1>Deskripsi Lokasi penjual atau pembeli</h1>
 *  class Location merupakan class yang menyimpan provinsi penjual/pembeli, deskripsi penjual/pembeli
 *  , kota penjual/pembeli
 *  province -> provinsi penjual/pembeli
 *  description -> deskripsi penjual/pembeli
 *  city -> kota penjual/pembeli
 *  @author Muhammad Farhan
 *  @27/02/2020
 */

public class Location
{
    private String province;//provinsi penjual/pelanggan
    private String description;//deskripsi penjual/pelanggan
    private String city;//kota penjual/pelanggan
    
    /***
     * constructor Location digunakan untuk memasukkan deskripsi lokasi penjual/pembeli baru
     * @params city, province, description
     * @return tidak ada
     */
    public Location(String city, String province, String description)
    {
       this.city = city;//mengganti nilai variabel city yang lama dengan parameter yang dimasukkan
       this.province = province;//mengganti nilai variabel province yang lama dengan parameter yang dimasukkan
       this.description = description;//mengganti nilai variabel description yang lama dengan parameter yang dimasukkan
    }
    /***
     * getter getProvince digunakan untuk memanggil province yang saat ini tersimpan di memori
     * @params tidak ada
     * @return province
     */
    public String getProvince(){
        
        return province;//mengembalikan nilai province
    }
    /***
     * getter getCity digunakan untuk memanggil city yang saat ini tersimpan di memori
     * @params tidak ada
     * @return city
     */
    public String getCity(){
        
        return city;//mengembalikan nilai city
    }
    /***
     * getter getDescription digunakan untuk memanggil description
     * yang saat ini tersimpan di memori
     * @params tidak ada
     * @return description
     */
    public String getDescription(){
        
        return description;//mengembalikan nilai description
    }
    /***
     * setter setProvince digunakan untuk menyimpan nilai province baru
     * this.province digunakan untuk merujuk ke variabel province saat ini
     * @params province
     * @return tidak ada
     */
    public void setProvince(String province){
       this.province = province;//mengganti nilai province sesuai setter
    }
    /***
     * setter setCity digunakan untuk menyimpan nilai city baru
     * this.city digunakan untuk merujuk ke variabel city saat ini
     * @params city
     * @return tidak ada
     */
    public void setCity(String city){
        this.city = city;//mengganti nilai city sesuai setter
    }
    /***
     * setter setDescription digunakan untuk menyimpan nilai description baru
     * this.description digunakan untuk merujuk ke variabel description saat ini
     * @params description
     * @return tidak ada
     */
    public void setDescription(String description){
        this.description = description;//mengganti nilai description sesuai setter
    }
    /***
     * method ini digunakan untuk menampilkan isi dari variabel province ke layar
     */
    public void printData(){
        System.out.println(province);//menampilkan nilai province
    }
    
   
}
