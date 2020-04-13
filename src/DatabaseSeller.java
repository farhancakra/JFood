import java.util.ArrayList;

public class DatabaseSeller
{
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<Seller>();
    private static int lastId = 0;


    /*public DatabaseSeller()
    {
        
    }*/

    public static ArrayList<Seller> getSellerDatabase(){
        return SELLER_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Seller getSellerById(int id) throws SellerNotFoundException {
        for (Seller seller: SELLER_DATABASE) {
            if (seller.getId() == id) {
                return seller;
            }
        }
        throw new SellerNotFoundException(id);

    }
    public static boolean addSeller(Seller seller){
        SELLER_DATABASE.add(seller);
        lastId = SELLER_DATABASE.indexOf(seller);
        return true;
    }

    public static boolean removeSeller(int id) throws SellerNotFoundException {
        for (Seller seller: SELLER_DATABASE) {
            if (seller.getId() == id) {
                SELLER_DATABASE.remove(seller);
                return true;
            }
        }
        throw new SellerNotFoundException(id);
    }

}
