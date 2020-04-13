import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    public static int getLastId()
    {
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException
    {
        for (Invoice invoice: INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                return invoice;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    public static ArrayList<Invoice> getInvoiceByCustomer (int customerId)
    {
        ArrayList<Invoice> invoice = new ArrayList<>();
        for (Invoice invoice1: INVOICE_DATABASE) {
            if (invoice1.getCustomer().getId() == customerId) {
                invoice.add(invoice1);
            }
        }
        return invoice;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistException{
        // initialise instance variables
        boolean ongoingInvoice = false;
        for (Invoice i: INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == i.getInvoiceStatus()) {
                ongoingInvoice = true;
                break;
            }
        }

        if (!ongoingInvoice) {
            INVOICE_DATABASE.add(invoice);
            lastId = invoice.getId();
            return true;
        }
        throw new OngoingInvoiceAlreadyExistException(invoice);
    }

   // public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
     //   Invoice invoice1 = INVOICE_DATABASE.get(id);
       // Invoice invoice2 = INVOICE_DATABASE.get(invoiceStatus);
        //if (invoice1 != null) {

          //  return true;
        //}
        //return false;
    //}

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        // put your code here
        for (Invoice invoice: INVOICE_DATABASE) {
            if (invoice.getId() == id) {
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }
}
