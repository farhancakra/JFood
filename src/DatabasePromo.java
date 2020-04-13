
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
import java.util.ArrayList;
public class DatabasePromo
{
    //Atribut yang digunakan pada kelas ini dengan access modifier private
    private static ArrayList<Promo> PROMO_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Promo>  getPromoDatabase()
    {
        return PROMO_DATABASE;
    }

    public static int getLastId()
    {
        return lastId;
    }
    public static Promo getPromoById(int id) throws PromoNotFoundException{
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getId() == id) {
                return promo;
            }
        }
        throw new PromoNotFoundException(id);

    }

    public static Promo getPromoByCode(String code)
    {
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getCode().equals(code)) {
                return promo;
            }
        }
        return null;
    }

    /**
     * Method ini berfungsi untuk menambahkan Promo ke dalam listPromo
     * @param promo obyek promo akan dimasukkan ke dalam list listPromo
     * @return true, apabila obyek berhasil ditambahkan maka akan mengembalikan nilai true
     */
    public static boolean addPromo(Promo promo) throws PromoCodeAlreadyExistException{
    
        boolean kodePromo = false;
        for (Promo i: PROMO_DATABASE) {
            if (promo.getCode() == i.getCode()) {
                kodePromo = true;
                break;
            }
        }

        if (!kodePromo) {
            PROMO_DATABASE.add(promo);
            lastId = promo.getId();
            return true;
        }
        throw new PromoCodeAlreadyExistException(promo);
    }

    public static boolean activePromo(int id)
    {
        Promo active = PROMO_DATABASE.get(id);
        if (active != null) {
            active.setActive(true);
            return true;
        }
        return false;
    }
    public static boolean deactivePromo(int id)
    {
        Promo deactive = PROMO_DATABASE.get(id);
        if (deactive != null) {
            deactive.setActive(false);
            return true;
        }
        return false;
    }

    /**
     * Method ini berfungsi untuk menghapus promo dari listPromo
     * @param promo obyek promo akan dikeluarkan dari list listPromo
     * @return true, apabila obyek berhasil dikeluarkan maka akan mengembalikan nilai true
     */
    public boolean removePromo (int id) throws PromoNotFoundException{
        for (Promo promo: PROMO_DATABASE) {
            if (promo.getId() == id) {
                PROMO_DATABASE.remove(promo);
                return true;
            }
        }
        throw new PromoNotFoundException(id);
    }

    
    /**
     * Method getListPromo merupakan method getter untuk variabel listPromo
     * @return <code>String[]<code> akan mengembalikan nilai listPromo ketika method ini
     * dipanggil
     */
    
}


    
    

