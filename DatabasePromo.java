
/*public class DatabasePromo
{
    private static String[] listPromo;
    private Promo promo;
    
    public static boolean addPromo(Promo promo){
        return true;
        }
        
    public static boolean removePromo(Promo promo){
        return true;
    }
       
    public static Promo getPromo(){
        return null;
    }
    
    public static String[] getListPromo(){
        return listPromo;
    }
}*/

/**
 * <h1>Database Promo<h1>
 * Kelas ini berfungsi untuk menjadi wadah untuk menampung Promo makanan ke suatu variable
 * list yaitu listPromo
 * 
 * @author Muhammad Alfiyansyah
 * @version 27-February-2020
 * 
 */
public class DatabasePromo
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private
    private String[] listPromo;
    

    
    /**
     * Method ini berfungsi untuk menambahkan Promo ke dalam listPromo
     * @param promo obyek promo akan dimasukkan ke dalam list listPromo
     * @return true, apabila obyek berhasil ditambahkan maka akan mengembalikan nilai true
     */
    public boolean addPromo(Promo promo)
    {
       return false;
    }
    
    /**
     * Method ini berfungsi untuk menghapus promo dari listPromo
     * @param promo obyek promo akan dikeluarkan dari list listPromo
     * @return true, apabila obyek berhasil dikeluarkan maka akan mengembalikan nilai true
     */
    public boolean removePromo (Promo promo)
    {
        return false;
    }
    
    public Promo getPromo(){
        return null;
    } 
    
    /**
     * Method getListPromo merupakan method getter untuk variabel listPromo
     * @return <code>String[]<code> akan mengembalikan nilai listPromo ketika method ini
     * dipanggil
     */
    public String[] getListPromo (){
        return null;
    }
    
}


    
    

