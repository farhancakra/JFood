package MuhammadFarhan.JFood.controller;

import MuhammadFarhan.JFood.DatabaseSeller;
import MuhammadFarhan.JFood.Location;
import MuhammadFarhan.JFood.Seller;
import MuhammadFarhan.JFood.SellerNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/seller")
@RestController
public class SellerController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller(){

        return DatabaseSeller.getSellerDatabase();
    }

    @RequestMapping("{id}")
    public Seller getSellerById(@PathVariable int id) {
        Seller seller;
        try {
            seller = DatabaseSeller.getSellerById(id);
            return seller;
        } catch (SellerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value = "name") String name,
                            @RequestParam(value = "email")String email,
                            @RequestParam(value = "phoneNumber")String phoneNumber,
                            @RequestParam(value = "city")String city,
                            @RequestParam(value = "province")String province,
                            @RequestParam(value = "description")String description){
        Location location = new Location(city, province, description);
        Seller seller=new Seller(DatabaseSeller.getLastId()+1,name,email,phoneNumber,location);
        DatabaseSeller.addSeller(seller);
        return seller;
    }
}
