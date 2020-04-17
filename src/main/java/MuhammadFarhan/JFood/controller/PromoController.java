package MuhammadFarhan.JFood.controller;
import MuhammadFarhan.JFood.*;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;

@RequestMapping("/promo")
@RestController
public class PromoController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Promo> getAllPromo(){
        return DatabasePromo.getPromoDatabase();
    }

    @RequestMapping(value = "/promo/{code}", method = RequestMethod.GET)
    public Promo getPromobyCode(@PathVariable String code){
        Promo promo;
        promo = DatabasePromo.getPromoByCode(code);;
        return promo;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Promo addPromo(@RequestParam(value = "code") String code,
                            @RequestParam(value = "discount")int discount,
                            @RequestParam(value = "minPrice")int minPrice,
                            @RequestParam(value = "active")Boolean active){
        try {
            Promo promo = new Promo(DatabaseSeller.getLastId() + 1, code, discount, minPrice, active);
            DatabasePromo.addPromo(promo);
        } catch (PromoCodeAlreadyExistException e){
            e.getMessage();

        }
            return null;
    }
}