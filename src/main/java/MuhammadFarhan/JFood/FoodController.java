package MuhammadFarhan.JFood;
import MuhammadFarhan.JFood.*;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

@RequestMapping("/food")
@RestController


public class FoodController {
    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood(){
        ArrayList<Food> food;
        food = DatabaseFood.getFoodDatabase();
        return food;
    }

    @RequestMapping("/id")
    public  Food getFoodById(@PathVariable int id){
        Food food = null;
        try{
            food = DatabaseFood.getFoodById(id);
        }
        catch (FoodNotFoundException e){
            e.getMessage();
            return null;
        }
        return food;
    }

    @RequestMapping(value = "/seller", method = RequestMethod.GET)
    public ArrayList<Food> getFoodBySeller(@PathVariable int id){
        ArrayList<Food> food = null;
        try{
            food=DatabaseFood.getFoodBySeller(id);
        }
        catch (SellerNotFoundException e){
            e.getMessage();
        }
        return food;
    }

    @RequestMapping(value = "/food/category/{category}", method = RequestMethod.GET)
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category){
        ArrayList<Food> ret = null;
        ret = DatabaseFood.getFoodByCategory(category);
        return ret;
    }
    @RequestMapping(value = "/food",method = RequestMethod.POST)
    public Food addFood(@RequestParam(value = "Name") String name,
                        @RequestParam(value = "Price")int price,
                        @RequestParam(value = "Category")FoodCategory category,
                        @RequestParam(value = "Seller ID")int sellerId ) throws SellerNotFoundException {
        Food food = new Food(DatabaseFood.getLastId()+1, name,DatabaseSeller.getSellerById(sellerId),price,category);
        DatabaseFood.addFood(food);
        return food;

    }




}
