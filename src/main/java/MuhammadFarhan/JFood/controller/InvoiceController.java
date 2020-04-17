package MuhammadFarhan.JFood.controller;

import MuhammadFarhan.JFood.*;
import MuhammadFarhan.JFood.Invoice;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/invoice")
@RestController

public class InvoiceController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ArrayList<Invoice> getAllInvoice() {

        return DatabaseInvoice.getInvoiceDatabase();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable int id) {
        Invoice invoice = null;
        try {
            invoice = DatabaseInvoice.getInvoiceById(id);
            return invoice;
        } catch (InvoiceNotFoundException e) {
            e.getMessage();

        }
        return null;
    }

    @RequestMapping("{customerId}")
    public Customer getInvoiceByCustomer(@PathVariable int customerId) {
        Customer customer;
        try {
            customer = DatabaseCustomer.getCustomerById(customerId);
            return customer;
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    //@RequestMapping(value = "",method = RequestMethod.POST)
    //public Promo addCashInvoice(@RequestParam(value = "foodIdList") ArrayList<Integer> foodIdList,
                        //  @RequestParam(value = "customerId")int customerId,
                        //  @RequestParam(value = "deliveryFee")int deliveryFee){
        //try {
            //CashInvoice cash = new CashInvoice(customerId, foodIdList, deliveryFee);
            //DatabaseInvoice.addInvoice(cash);
       // } catch (OngoingInvoiceAlreadyExistException e){
           // e.getMessage();

       // }
      //  return null;
   // }

}
