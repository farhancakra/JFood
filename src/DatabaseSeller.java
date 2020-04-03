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
    public static Seller getSellerById(int id)
    {
        Seller value = null;
        for(Seller seller : SELLER_DATABASE)
        {
            if(seller.getId()==lastId)
            {
                value=seller;
            }
            else
            {
                return value;
            }
        }

        return value;
    }
    public static boolean addSeller(Seller seller){
        SELLER_DATABASE.add(seller);
        lastId = SELLER_DATABASE.indexOf(seller);
        return true;
    }

    public static boolean removeSeller(int id) {
        Seller seller = SELLER_DATABASE.get(id);
        if (seller != null) {
            SELLER_DATABASE.remove(seller);
            return true;
        }
        return false;
    }

}
