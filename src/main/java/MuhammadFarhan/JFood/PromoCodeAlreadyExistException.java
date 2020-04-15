package MuhammadFarhan.JFood;
public class PromoCodeAlreadyExistException extends Exception{
    private Promo promo_error;

    PromoCodeAlreadyExistException(Promo promo_input){
        super("Promo Code: ");
        promo_error = promo_input;
    }

    public String getMessage(){
        return super.getMessage() + promo_error.getCode() + " already exist.";
    }
}
