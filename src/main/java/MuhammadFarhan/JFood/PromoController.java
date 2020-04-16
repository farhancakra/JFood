package MuhammadFarhan.JFood;
import MuhammadFarhan.JFood.*;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

@RequestMapping("/promo")
@RestController
public class PromoController {
    @RequestMapping(value = "/promo", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo(){
        ArrayList<Promo> promo;
        promo = DatabasePromo.getPromoDatabase();
        return promo;
    }

    @RequestMapping(value = "/promo/code/{code}", method = RequestMethod.GET)
    public ArrayList<Promo> getPromobyCode(@PathVariable String code){
        Promo promo;
        promo = DatabasePromo.getPromoByCode(code);;
        return promo;
    }

    @RequestMapping(value = "/promo",method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value = "Id") String id,
                            @RequestParam(value = "Code") String code,
                            @RequestParam(value = "Discount")int discount,
                            @RequestParam(value = "MinPrice")int minPrice,
                            @RequestParam(value = "Active")Boolean active){
        Promo promo=new Promo(DatabaseSeller.getLastId()+1,code,discount,minPrice,active);
        DatabasePromo.addPromo(promo);
        return promo;
    }
}