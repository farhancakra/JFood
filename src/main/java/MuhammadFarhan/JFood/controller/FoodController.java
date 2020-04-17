package MuhammadFarhan.JFood.controller;
import MuhammadFarhan.JFood.*;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/food")
@RestController


public class FoodController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Food> getAllFood() {
        return DatabaseFood.getFoodDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public  Food getFoodById(@PathVariable int id){
        Food food = null;
        try{
            food = DatabaseFood.getFoodById(id);
            return food;
        }
        catch (FoodNotFoundException e){
            e.getMessage();

        }
        return null;
    }

    @RequestMapping("/seller/{sellerid}")
    public ArrayList<Food> getFoodBySeller(@PathVariable int sellerid){
        return DatabaseFood.getFoodBySeller(sellerid);
    }

    @RequestMapping("/category/{category}")
    public ArrayList<Food> getFoodByCategory(@PathVariable FoodCategory category) {
        return DatabaseFood.getFoodByCategory(category);
    }
    @RequestMapping(value = "",method = RequestMethod.POST)
    public Food addFood(@RequestParam(value = "name") String name,
                        @RequestParam(value = "price")int price,
                        @RequestParam(value = "category")FoodCategory category,
                        @RequestParam(value = "sellerId")int sellerId ) {
        Food food = null;
        try{
            food = new Food(DatabaseFood.getLastId()+1, name,DatabaseSeller.getSellerById(sellerId),price,category);
            DatabaseFood.addFood(food);
        } catch (SellerNotFoundException e) {
            e.getMessage();
            return null;
        }

        return food;

    }




}
