/**
 * <h1>List dari DatabaseFood</h1>
 *  class DatabaseFood merupakan class yang list makanan
 *  listFood -> list makanan yang dijual
 *  @author Muhammad Farhan
 *  @27/02/2020
 */
import java.util.ArrayList;
public class DatabaseFood
{
    private static ArrayList<Seller> FOOD_DATABASE;
    private static int lastId = 0;
    /**
 * constructor DatabaseFood
 */
    /*public DatabaseFood()
    {
        
    }*/
    /**
 * mengembalikan nilai penambahan makanan
 * @params food
 * @return true
 */
    public static ArrayList<Food> getFoodDatabase(){
        return FOOD_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Food getFoodById(int id){

        return Food.getId();
    }

    public static ArrayList<Food> getFoodBySeller(int sellerid){

        return Food.getSeller();
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category){

        return Food.getSeller();
    }

    public static boolean addFood(Food food){
        return true;//mengembalikan true
        
    }
      /**
 * mengembalikan nilai pengurangan makanan
 * @params food
 * @return true
 */
    public static boolean removeFood(int id){
        return true;//mengembalikan true
    }
    
    
    
}
