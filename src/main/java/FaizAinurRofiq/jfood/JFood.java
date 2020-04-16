
package FaizAinurRofiq.jfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JFood {

    public static void main(String[] args) {
        Location location1 = new Location("Depok", "Jabar", "My Home");
        Location location2 = new Location("Surabaya", "Jatim", "My Old Home");
        Location location3 = new Location("Lumajang", "Jatim", "My Hometown");

        Seller seller = new Seller(DatabaseSeller.getLastId() + 1, "Joen", "Joen@jeo.com", "1002020011", location1);
        Seller seller2 = new Seller(DatabaseSeller.getLastId() + 1, "Joen", "Joen@jeo.com", "1002020011", location2);
        Seller seller3 = new Seller(DatabaseSeller.getLastId() + 1, "Joen", "Joen@jeo.com", "1002020011", location3);

        DatabaseSeller.addSeller(seller);
        DatabaseSeller.addSeller(seller2);
        DatabaseSeller.addSeller(seller3);

        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Rawon", seller, 2000, FoodCategory.Rice));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Pecel", seller, 5000, FoodCategory.Rice));
        DatabaseFood.addFood(new Food(DatabaseFood.getLastId() + 1, "Soto Ayam", seller, 4000, FoodCategory.Rice));



        SpringApplication.run(JFood.class, args);
    }

}