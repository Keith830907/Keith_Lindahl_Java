package com.company.U1M6Summative.dao;

import com.company.U1M6Summative.model.Invoice_Item;

import java.util.List;

public interface Invoice_ItemDao {

    Invoice_Item addInvoice_Item(Invoice_Item invoice_item);

    Invoice_Item getInvoice_Item(int id);

    List<Invoice_Item> getAllInvoice_Items();

    void updateInvoice_Item(Invoice_Item invoice_item);

    void deleteInvoice_Item(int id);

    List<Invoice_Item> getInvoice_ItemsByInvoice(int id);
}
