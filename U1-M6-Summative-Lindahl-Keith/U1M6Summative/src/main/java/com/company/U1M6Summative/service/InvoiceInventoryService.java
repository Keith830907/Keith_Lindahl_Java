package com.company.U1M6Summative.service;

import com.company.U1M6Summative.dao.CustomerDao;
import com.company.U1M6Summative.dao.InvoiceDao;
import com.company.U1M6Summative.dao.Invoice_ItemDao;
import com.company.U1M6Summative.dao.ItemDao;
import com.company.U1M6Summative.model.Customer;
import com.company.U1M6Summative.model.Invoice;
import com.company.U1M6Summative.model.Invoice_Item;
import com.company.U1M6Summative.model.Item;
import com.company.U1M6Summative.viewmodel.CustomerViewModel;
import com.company.U1M6Summative.viewmodel.InvoiceViewModel;
import com.company.U1M6Summative.viewmodel.ItemViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class InvoiceInventoryService {

    CustomerDao customerDao;
    InvoiceDao invoiceDao;
    Invoice_ItemDao invoice_ItemDao;
    ItemDao itemDao;

    @Autowired
    public InvoiceInventoryService(CustomerDao customerDao, InvoiceDao invoiceDao, Invoice_ItemDao invoice_ItemDao, ItemDao itemDao) {
        this.customerDao = customerDao;
        this.invoiceDao = invoiceDao;
        this.invoice_ItemDao = invoice_ItemDao;
        this.itemDao = itemDao;
    }

    public CustomerViewModel saveCustomer(CustomerViewModel customerViewModel) {
        Customer customer = new Customer();
        customer.setFirst_name(customerViewModel.getFirstName());
        customer.setLast_name(customerViewModel.getLastName());
        customer.setPhone(customerViewModel.getPhone());
        customer.setCompany(customerViewModel.getCompany());
        customer.setEmail(customerViewModel.getEmail());
        customer =  customerDao.addCustomer(customer);

        customerViewModel.setId(customer.getId());
        return customerViewModel;
    }

    public void updateCustomer(CustomerViewModel customerViewModel)
    {
        Customer customer = new Customer();
        customer.setId(customerViewModel.getId());
        customer.setFirst_name(customerViewModel.getFirstName());
        customer.setLast_name(customerViewModel.getLastName());
        customer.setPhone(customerViewModel.getPhone());
        customer.setCompany(customerViewModel.getCompany());
        customer.setEmail(customerViewModel.getEmail());

        customerDao.updateCustomer(customer);
    }

    public CustomerViewModel findCustomerbyId(int id) {
        Customer customer =  customerDao.getCustomer(id);
        if(customer == null)
            return null;
        else
            return buildCustomerViewModel(customer);
    }

    public void removeCustomer(int id)
    {
        customerDao.deleteCustomer(id);
    }

    public ItemViewModel saveItem(ItemViewModel itemViewModel)
    {
        Item item = new Item();
        item.setName(itemViewModel.getName());
        item.setDescription(itemViewModel.getDescription());
        item.setDaily_rate(itemViewModel.getDailyRate());

        item =  itemDao.addItem(item);
        itemViewModel.setId(item.getId());
        return itemViewModel;
    }

    public ItemViewModel findItem(int id)
    {
        Item item = itemDao.getItem(id);
        if(item != null)
        {
            ItemViewModel itemViewModel = new ItemViewModel();
            itemViewModel.setId(item.getId());
            itemViewModel.setDailyRate(item.getDaily_rate());
            itemViewModel.setDescription(item.getDescription());
            itemViewModel.setName(item.getName());

            return itemViewModel;
        }
        else return null;

    }

    public void removeItem(int id)
    {
        itemDao.deleteItem(id);
    }

    public void updateItem(ItemViewModel itemViewModel)
    {
        Item item = new Item();
        item.setId(itemViewModel.getId());
        item.setName(itemViewModel.getName());
        item.setDescription(itemViewModel.getDescription());
        item.setDaily_rate(itemViewModel.getDailyRate());
        itemDao.updateItem(item);
    }

    @Transactional
    public InvoiceViewModel saveInvoice(InvoiceViewModel invoiceViewModel) {

        Invoice invoice = new Invoice();
        invoice.setReturn_date(invoiceViewModel.getReturnDate());
        invoice.setOrder_date(invoiceViewModel.getOrderDate());
        invoice.setPickup_date(invoiceViewModel.getPickupDate());
        invoice.setLate_fee(invoiceViewModel.getLateFee());
        invoice.setCustomer_id(invoiceViewModel.getCustomerId());
        invoice = invoiceDao.addInvoice(invoice);
        invoiceViewModel.setId(invoice.getId());

        List<Invoice_Item> invoiceItems = invoiceViewModel.getInvoiceItems();
        invoiceItems.stream().forEach(invoiceItem -> {
            invoiceItem.setInvoice_id(invoiceViewModel.getId());
            invoice_ItemDao.addInvoice_Item(invoiceItem);
        });

        invoiceItems = invoice_ItemDao.getInvoice_ItemsByInvoice(invoice.getId());
        invoiceViewModel.setInvoiceItems(invoiceItems);

        return invoiceViewModel;
    }
    /*
    @Transactional
    public void updateInvoice(InvoiceViewModel invoiceViewModel) {
        Invoice invoice = new Invoice();
        invoice.setId(invoiceViewModel.getId());
        invoice.setReturnDate(invoiceViewModel.getReturnDate());
        invoice.setOrderDate(invoiceViewModel.getOrderDate());
        invoice.setPickupDate(invoiceViewModel.getPickupDate());
        invoice.setLateFee(invoiceViewModel.getLateFee());
        invoice.setCustomerId(invoiceViewModel.getCustomerId());
        invoiceDao.updateInvoice(invoice);

        List<InvoiceItem> invoiceItems = invoiceItemDao.getInvoiceItemsByInvoice(invoice.getId());
        invoiceItems.stream().forEach(invoiceItem -> {
            invoiceItemDao.deleteInvoiceItem(invoiceItem.getId());
        });

        invoiceItems = invoiceViewModel.getInvoiceItems();
        invoiceItems.stream().forEach(invoiceItem -> {
            invoiceItem.setInvoiceId(invoiceViewModel.getId());
            invoiceItem = invoiceItemDao.addInvoiceItem(invoiceItem);

        });
    }*/

    public InvoiceViewModel findInvoice(int id) {
        Invoice invoice = invoiceDao.getInvoice(id);
        if(invoice == null )
            return null;
        else
            return buildInvoiceViewModel(invoice);
    }

    public List<InvoiceViewModel> findInvoiceByCustomer(int customerId)
    {
        List<Invoice> invoices = invoiceDao.getInvoiceByCustomer(customerId);
        List<InvoiceViewModel> invoiceViewModels = new ArrayList<>();

        for (Invoice invoice: invoices) {
            invoiceViewModels.add(buildInvoiceViewModel(invoice));
        }
        return invoiceViewModels;
    }

    public void removeInvoice(int id)
    {
        List<Invoice_Item> invoiceItems = invoice_ItemDao.getInvoice_ItemsByInvoice(id);
        for (Invoice_Item invoiceitem: invoiceItems) {
            invoice_ItemDao.deleteInvoice_Item(invoiceitem.getId());
        }
        invoiceDao.deleteInvoice(id);
    }

    public Invoice_Item saveInvoiceItem(Invoice_Item invoiceItem) {
        return invoice_ItemDao.addInvoice_Item(invoiceItem);
    }

    private CustomerViewModel buildCustomerViewModel(Customer customer) {
        CustomerViewModel customerViewModel = new CustomerViewModel();
        customerViewModel.setId(customer.getId());
        customerViewModel.setFirstName(customer.getFirst_name());
        customerViewModel.setLastName(customer.getLast_name());
        customerViewModel.setCompany(customer.getCompany());
        customerViewModel.setEmail(customer.getEmail());
        customerViewModel.setPhone(customer.getPhone());

        return customerViewModel;
    }

    private InvoiceViewModel buildInvoiceViewModel(Invoice invoice) {

        InvoiceViewModel invoiceViewModel = new InvoiceViewModel();
        invoiceViewModel.setId(invoice.getId());
        invoiceViewModel.setReturnDate(invoice.getReturn_date());
        invoiceViewModel.setOrderDate(invoice.getOrder_date());
        invoiceViewModel.setPickupDate(invoice.getPickup_date());
        invoiceViewModel.setLateFee(invoice.getLate_fee());

        Customer customer = customerDao.getCustomer(invoice.getCustomer_id());
        invoiceViewModel.setCustomerId(customer.getId());

        List<Invoice_Item> invoiceItems = invoice_ItemDao.getInvoice_ItemsByInvoice(invoice.getId());
        invoiceViewModel.setInvoiceItems(invoiceItems);
        return invoiceViewModel;
    }
}

