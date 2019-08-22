package com.company.U1M6Summative.controller;

import com.company.U1M6Summative.service.InvoiceInventoryService;
import com.company.U1M6Summative.viewmodel.ItemViewModel;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/item")
public class ItemInventoryController {

    @Autowired
    InvoiceInventoryService inventoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ItemViewModel createItem(@RequestBody @Valid ItemViewModel item) {
        return inventoryService.saveItem(item);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ItemViewModel getItem(@PathVariable("id") int itemId) throws NotFoundException {
        ItemViewModel item = inventoryService.findItem(itemId);
        if (item == null)
            throw new NotFoundException("Item could not be retrieved for id " + itemId);
        return item;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteItem(@PathVariable("id") int itemId) {
        inventoryService.removeItem(itemId);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateItem(@PathVariable("id") int itemId, @RequestBody @Valid ItemViewModel itemviewModel) {
        if (itemviewModel.getId() == 0)
            itemviewModel.setId(itemId);
        if (itemId != itemviewModel.getId()) {
            throw new IllegalArgumentException("Item ID on path must match the ID in the Item object");
        }
        inventoryService.updateItem(itemviewModel);
    }
}

