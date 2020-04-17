package MuhammadFarhan.JFood;

import MuhammadFarhan.JFood.DatabaseFood;
import MuhammadFarhan.JFood.DatabaseSeller;
import MuhammadFarhan.JFood.Food;
import MuhammadFarhan.JFood.FoodCategory;
import MuhammadFarhan.JFood.Location;
import MuhammadFarhan.JFood.Seller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JFood {

    public static void main(String[] args) {
        Location location1 = new Location("Bekas", "Jawa Barat", "Panas");
        Location location2 = new Location("Surabaya", "Jawa Timur", "Panas");
        Location location3 = new Location("Bojonegoro", "Jawa Timur", "Panas Bat");

        Seller seller = new Seller(DatabaseSeller.getLastId() + 1, "Muhammad", "muhammad@gmail.com", "123", location1);
        Seller seller2 = new Seller(DatabaseSeller.getLastId() + 1, "Farhan", "farhan@gmail.com", "234", location2);
        Seller seller3 = new Seller(DatabaseSeller.getLastId() + 1, "Cakra", "cakra@gmail.com", "345", location3);

        DatabaseSeller.addSeller(seller);
        DatabaseSeller.addSeller(seller2);
        DatabaseSeller.addSeller(seller3);

        Food food = new Food(DatabaseFood.getLastId() + 1, "Rawon", seller, 2000, FoodCategory.Rice);
        Food food1 = new Food(DatabaseFood.getLastId() + 1, "Pecel", seller, 5000, FoodCategory.Rice);
        Food food2 = new Food(DatabaseFood.getLastId() + 1, "Soto Ayam", seller, 4000, FoodCategory.Rice);

        DatabaseFood.addFood(food);
        DatabaseFood.addFood(food1);
        DatabaseFood.addFood(food2);

        SpringApplication.run(JFood.class, args);
    }

}