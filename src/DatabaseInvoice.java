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

    public static Invoice getInvoiceById(int id)
    {
        Invoice invoice = INVOICE_DATABASE.get(id);
        if (invoice != null) {
            return invoice;
        }
        return null;
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

    public static boolean addInvoice(Invoice invoice) {
        // initialise instance variables
        boolean ongoing= false;
        for (Invoice i : INVOICE_DATABASE) {
            if (invoice.getInvoiceStatus() == i.getInvoiceStatus()) {
                ongoing = true;
            }
        }

        if (!ongoing) {
            INVOICE_DATABASE.add(invoice);
            lastId = INVOICE_DATABASE.indexOf(invoice);
        }
        return false;
    }

   // public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
     //   Invoice invoice1 = INVOICE_DATABASE.get(id);
       // Invoice invoice2 = INVOICE_DATABASE.get(invoiceStatus);
        //if (invoice1 != null) {

          //  return true;
        //}
        //return false;
    //}

    public static boolean removeInvocer(int id) {
        // put your code here
        Invoice invoice = INVOICE_DATABASE.get(id);
        if (invoice != null) {
            INVOICE_DATABASE.remove(invoice);
            return true;
        }
        return false;
    }
}
