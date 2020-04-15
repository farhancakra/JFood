package MuhammadFarhan.JFood;
public class OngoingInvoiceAlreadyExistException extends Exception{
    private Invoice invoice_error;

    OngoingInvoiceAlreadyExistException(Invoice invoice_input){
        super("Ongoing Invoice: ");
        invoice_error = invoice_input;
    }

    public String getMessage(){
        return super.getMessage() + invoice_error.getInvoiceStatus() + " already exist";
    }
}
