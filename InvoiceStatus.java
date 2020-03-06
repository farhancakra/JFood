
public enum InvoiceStatus
{
    Ongoing("Ongoing"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
private String statusInvoice;

InvoiceStatus (String statusInvoice)
{
    this.statusInvoice = statusInvoice;
}

public String toString(){
    return statusInvoice;
}
    

}
