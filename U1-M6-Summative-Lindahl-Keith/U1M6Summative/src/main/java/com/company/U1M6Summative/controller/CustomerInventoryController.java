package com.company.U1M6Summative.controller;

import com.company.U1M6Summative.Exception.NotFoundException;
import com.company.U1M6Summative.service.InvoiceInventoryService;
import com.company.U1M6Summative.viewmodel.CustomerViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customer")//This mapping at class level allows to set the base path for the Customer API
public class CustomerInventoryController {

    @Autowired
    InvoiceInventoryService inventoryService;

    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerViewModel createCustomer(@RequestBody @Valid CustomerViewModel customer) {
        return inventoryService.saveCustomer(customer);
    }

    @GetMapping("/{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public CustomerViewModel getCustomer(@PathVariable("id") int customerId) {
        CustomerViewModel customerViewModel = inventoryService.findCustomerbyId(customerId);
        if (customerViewModel == null)
            throw new NotFoundException("Customer could not be retrieved for id " + customerId);
        return customerViewModel;
    }

    @DeleteMapping("/{id}")//Another way to set the Rest API Delete mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable("id") int customerId) {
        inventoryService.removeCustomer(customerId);
    }

    @PutMapping("/{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("id") int customerId, @RequestBody @Valid CustomerViewModel customerViewModel) {
        if (customerViewModel.getId() == 0)
            customerViewModel.setId(customerId);
        if (customerId != customerViewModel.getId()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID in the Customer object");
        }
        inventoryService.updateCustomer(customerViewModel);
    }

}

