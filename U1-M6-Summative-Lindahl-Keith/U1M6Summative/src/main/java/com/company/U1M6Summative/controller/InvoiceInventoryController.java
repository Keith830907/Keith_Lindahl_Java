package com.company.U1M6Summative.controller;

import com.company.U1M6Summative.Exception.NotFoundException;
import com.company.U1M6Summative.service.InvoiceInventoryService;
import com.company.U1M6Summative.viewmodel.InvoiceViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/invoice")
public class InvoiceInventoryController {

    @Autowired
    InvoiceInventoryService inventoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InvoiceViewModel createInvoice(@RequestBody InvoiceViewModel invoice) {
        return inventoryService.saveInvoice(invoice);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    //As per requirement this method is not needed
    public InvoiceViewModel getInvoice(@PathVariable("id") int id) {
        InvoiceViewModel invoice = inventoryService.findInvoice(id);
        if (invoice == null)
            throw new NotFoundException("Invoice could not be retrieved for id " + id);
        return invoice;
    }

    @GetMapping("/customer/{customerId}")
    @ResponseStatus(HttpStatus.OK)
    public List<InvoiceViewModel> getInvoiceByCustomer(@PathVariable("customerId") int customerId) {
        List<InvoiceViewModel> invoices = inventoryService.findInvoiceByCustomer(customerId);
        if (invoices != null && invoices.size() == 0)
            throw new NotFoundException("Invoice could not be retrieved for customer " + customerId);
        return invoices;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteInvoice(@PathVariable int id) {
        inventoryService.removeInvoice(id);
    }
}

