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
    private static ArrayList<Food> FOOD_DATABASE = new ArrayList<>();
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

    public static ArrayList<Food> getFoodDatabase()
    {
        return FOOD_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }
    public static Food getFoodById(int id)
    {
        Food food = FOOD_DATABASE.get(id);
        if (food != null) {
            return food;
        }
        return null;
    }

    public static ArrayList<Food> getFoodBySeller (int sellerId)
    {
        ArrayList<Food> seller = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getSeller().getId() == sellerId) {
                seller.add(food);
            }
        }
        return seller;
    }

    public static ArrayList<Food> getFoodByCategory(FoodCategory category)
    {
        ArrayList<Food> cat = new ArrayList<>();
        for (Food food: FOOD_DATABASE) {
            if (food.getCategory() == category) {
                cat.add(food);
            }
        }
        return cat;
    }

    public static boolean addFood(Food food)
    {
        // put your code here
        if (FOOD_DATABASE.add(food)) {
            FOOD_DATABASE.indexOf(food);
            return true;
        }
        return false;
    }

    public static boolean removeFood(int id) {
        Food food = FOOD_DATABASE.get(id);
        if (food != null) {
            FOOD_DATABASE.remove(food);
            return true;
        }
        return false;
    }
      /**
 * mengembalikan nilai pengurangan makanan
 * @params food
 * @return true
 */

    
    
    
}
