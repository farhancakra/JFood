package MuhammadFarhan.JFood;
import MuhammadFarhan.JFood.*;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

public class SellerController {
    @RequestMapping(value = "/seller", method = RequestMethod.GET)
    public ArrayList<Seller> getAllSeller(){
        ArrayList<Seller> seller;
        seller = DatabaseSeller.getSellerDatabase();
        return seller;
    }

    @RequestMapping(value = "/food/category/{category}", method = RequestMethod.GET)
    public ArrayList<Seller> getSellerById(@PathVariable int id){
        ArrayList<Seller> seller = null;
        seller = DatabaseSeller.getSellerById(id);
        return seller;
    }

    @RequestMapping(value = "/seller",method = RequestMethod.POST)
    public Seller addSeller(@RequestParam(value = "Name") String name,
                            @RequestParam(value = "Email")String email,
                            @RequestParam(value = "Phone Number")String phoneNumber,
                            @RequestParam(value = "Province")String province,
                            @RequestParam(value = "Description")String description,
                            @RequestParam(value = "City")String city ){
        Location location = new Location(province, description, city);
        Seller seller=new Seller(DatabaseSeller.getLastId()+1,name,email,phoneNumber,location);
        DatabaseSeller.addSeller(seller);
        return seller;
    }
}
