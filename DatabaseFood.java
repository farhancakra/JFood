/**
 * <h1>List dari DatabaseFood</h1>
 *  class DatabaseFood merupakan class yang list makanan
 *  listFood -> list makanan yang dijual
 *  @author Muhammad Farhan
 *  @27/02/2020
 */

public class DatabaseFood
{
    private static String[] listFood;//membuat list string listFood
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
    public static boolean addFood(Food food){
        return true;//mengembalikan true
        
    }
      /**
 * mengembalikan nilai pengurangan makanan
 * @params food
 * @return true
 */
    public static boolean removeFood(Food food){
        return true;//mengembalikan true
    }
    
    public static Food getFood(){
        return null;
    }
    
    public static String[] getListFood(){
     return listFood;   
    }
    
    
    
}
