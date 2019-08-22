package com.company.U1M6Summative.service;

import com.company.U1M6Summative.DaoJdbcTemplate.CustomerDaoJdbcTemplateImpl;
import com.company.U1M6Summative.DaoJdbcTemplate.InvoiceDaoJdbcTemplateImpl;
import com.company.U1M6Summative.DaoJdbcTemplate.Invoice_ItemDaoJdbcTemplateImpl;
import com.company.U1M6Summative.DaoJdbcTemplate.ItemDaoJdbcTemplateImpl;
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
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class InvoiceInventoryServiceTest {

    @Test
    public void saveCustomer() {
    }

    @Test
    public void updateCustomer() {
    }

    @Test
    public void findCustomerbyId() {
    }

    @Test
    public void removeCustomer() {
    }

    @Test
    public void saveItem() {
    }

    @Test
    public void findItem() {
    }

    @Test
    public void removeItem() {
    }

    @Test
    public void updateItem() {
    }

    @Test
    public void findInvoice() {
    }


    @Test
    public void removeInvoice() {
    }

    @Test
    public void saveInvoiceItem() {
    }




        CustomerDao customerDao;
        InvoiceDao invoiceDao;
        Invoice_ItemDao invoiceItemDao;
        ItemDao itemDao;
        InvoiceInventoryService invoiceInventoryService;

        @Before
        public void setUp() throws Exception {

            setUpCustomerDaoMock();
            setUpItemDaoMock();
            setUpInvoiceDaoMock();
            setUpInvoice_ItemDaoMock();

            invoiceInventoryService = new InvoiceInventoryService(customerDao,invoiceDao,invoiceItemDao,itemDao);
        }

        private void setUpInvoice_ItemDaoMock() {

            invoiceItemDao = mock(Invoice_ItemDaoJdbcTemplateImpl.class);

            Invoice_Item invoiceItem = new Invoice_Item();
            invoiceItem.setId(1);
            invoiceItem.setItem_id(42);
            invoiceItem.setQuantity(3);
            invoiceItem.setInvoice_id(2);
            invoiceItem.setUnit_rate(new BigDecimal(35).setScale(2));
            invoiceItem.setDiscount(new BigDecimal(3).setScale(2));

            Invoice_Item invoiceItem1 = new Invoice_Item();

            invoiceItem1.setItem_id(42);
            invoiceItem1.setQuantity(3);
            invoiceItem1.setInvoice_id(2);
            invoiceItem1.setUnit_rate(new BigDecimal(35).setScale(2));
            invoiceItem1.setDiscount(new BigDecimal(3).setScale(2));

            List<Invoice_Item> invoiceItemList = new ArrayList<>();
            invoiceItemList.add(invoiceItem);

            doReturn(invoiceItem).when(invoiceItemDao).addInvoice_Item(invoiceItem1);
            doReturn(invoiceItem).when(invoiceItemDao).getInvoice_Item(1);
            doReturn(invoiceItemList).when(invoiceItemDao).getAllInvoice_Items();
        }

        private void setUpInvoiceDaoMock() {
            invoiceDao = mock(InvoiceDaoJdbcTemplateImpl.class);

            Invoice invoice = new Invoice();
            invoice.setId(2);
            invoice.setCustomer_id(7);
            invoice.setOrder_date(LocalDate.of(2010, 1, 5));
            invoice.setPickup_date(LocalDate.of(2010, 1, 10));
            invoice.setReturn_date(LocalDate.of(2010, 1, 18));
            invoice.setLate_fee(new BigDecimal(3.5).setScale(2));

            Invoice invoice1 = new Invoice();
            invoice1.setCustomer_id(7);
            invoice1.setOrder_date(LocalDate.of(2010, 1, 5));
            invoice1.setPickup_date(LocalDate.of(2010, 1, 10));
            invoice1.setReturn_date(LocalDate.of(2010, 1, 18));
            invoice1.setLate_fee(new BigDecimal(3.5).setScale(2));

            List<Invoice> invoiceList = new ArrayList<>();
            invoiceList.add(invoice);

            doReturn(invoice).when(invoiceDao).addInvoice(invoice1);
            doReturn(invoice).when(invoiceDao).getInvoice(2);
            doReturn(invoiceList).when(invoiceDao).getAllInvoices();
            doReturn(invoiceList).when(invoiceDao).getInvoiceByCustomer(7);
        }

        private void setUpItemDaoMock() {
            itemDao = mock(ItemDaoJdbcTemplateImpl.class);

            Item item = new Item();
            item.setId(42);
            item.setDescription("Laptop");
            item.setName("MacBook Air");
            item.setDaily_rate(new BigDecimal("3.5").setScale(2));

            Item item1 = new Item();
            item1.setDescription("Laptop");
            item1.setName("MacBook Air");
            item1.setDaily_rate(new BigDecimal("3.5").setScale(2));

            List<Item> itemList = new ArrayList<>();
            itemList.add(item);

            doReturn(item).when(itemDao).addItem(item1);
            doReturn(item).when(itemDao).getItem(42);
            doReturn(itemList).when(itemDao).getAllItems();
        }

        private void setUpCustomerDaoMock() {
            customerDao = mock(CustomerDaoJdbcTemplateImpl.class);

            Customer customer = new Customer();
            customer.setId(7);
            customer.setFirst_name("Reshma");
            customer.setLast_name("Mary");
            customer.setEmail("reshmamary.serine@gmail.com");
            customer.setCompany("Trilogy");
            customer.setPhone("2246239082");

            Customer customer1 = new Customer();
            customer1.setFirst_name("Reshma");
            customer1.setLast_name("Mary");
            customer1.setEmail("reshmamary.serine@gmail.com");
            customer1.setCompany("Trilogy");
            customer1.setPhone("2246239082");

            List<Customer> cList =  new ArrayList<>();
            cList.add(customer);

            doReturn(customer).when(customerDao).addCustomer(customer1);
            doReturn(customer).when(customerDao).getCustomer(7);
            doReturn(cList).when(customerDao).getAllCustomers();
        }

        @Test
        public void saveFindCustomer()
        {
            CustomerViewModel customer = new CustomerViewModel();
            customer.setFirstName("Reshma");
            customer.setLastName("Mary");
            customer.setEmail("reshmamary.serine@gmail.com");
            customer.setCompany("Trilogy");
            customer.setPhone("2246239082");

            customer = invoiceInventoryService.saveCustomer(customer);
            CustomerViewModel fromService  =invoiceInventoryService.findCustomerbyId(customer.getId());
            assertEquals(customer,fromService);
        }

        @Test
        public void saveFindItem()
        {
            Item item = new Item();
            item.setDescription("Laptop");
            item.setName("MacBook Air");
            item.setDaily_rate(new BigDecimal("3.5").setScale(2));

            item = itemDao.addItem(item);

            Item item1 = itemDao.getItem(item.getId());
            assertEquals(item1,item);
        }

        @Test
        public void saveInvoice() {
            InvoiceViewModel invoiceViewModel = new InvoiceViewModel();

            invoiceViewModel.setCustomerId(7);
            invoiceViewModel.setOrderDate(LocalDate.of(2010, 1, 5));
            invoiceViewModel.setPickupDate(LocalDate.of(2010, 1, 10));
            invoiceViewModel.setReturnDate(LocalDate.of(2010, 1, 18));
            invoiceViewModel.setLateFee(new BigDecimal(3.5).setScale(2));

            Invoice_Item invoiceItem = new Invoice_Item();
            invoiceItem.setItem_id(42);
            invoiceItem.setQuantity(3);
            invoiceItem.setInvoice_id(2);
            invoiceItem.setUnit_rate(new BigDecimal(35).setScale(2));
            invoiceItem.setDiscount(new BigDecimal(3).setScale(2));
            invoiceItem = invoiceInventoryService.saveInvoiceItem(invoiceItem);

            List<Invoice_Item> invoiceItems = new ArrayList<>();
            invoiceItems.add(invoiceItem);

            invoiceViewModel.setInvoiceItems(invoiceItems);

            invoiceViewModel = invoiceInventoryService.saveInvoice(invoiceViewModel);

            InvoiceViewModel fromService =  invoiceInventoryService.findInvoice(invoiceViewModel.getId());
            assertEquals(invoiceViewModel,fromService);
        }

        @Test
        public void findInvoiceByCustomer()
        {
            InvoiceViewModel invoiceViewModel = new InvoiceViewModel();

            invoiceViewModel.setCustomerId(7);
            invoiceViewModel.setOrderDate(LocalDate.of(2010, 1, 5));
            invoiceViewModel.setPickupDate(LocalDate.of(2010, 1, 10));
            invoiceViewModel.setReturnDate(LocalDate.of(2010, 1, 18));
            invoiceViewModel.setLateFee(new BigDecimal(3.5).setScale(2));

            Invoice_Item invoiceItem = new Invoice_Item();
            invoiceItem.setItem_id(42);
            invoiceItem.setQuantity(3);
            invoiceItem.setInvoice_id(2);
            invoiceItem.setUnit_rate(new BigDecimal(35).setScale(2));
            invoiceItem.setDiscount(new BigDecimal(3).setScale(2));
            invoiceItem = invoiceInventoryService.saveInvoiceItem(invoiceItem);

            List<Invoice_Item> invoiceItems = new ArrayList<>();
            invoiceItems.add(invoiceItem);

            invoiceViewModel.setInvoiceItems(invoiceItems);

            invoiceViewModel = invoiceInventoryService.saveInvoice(invoiceViewModel);

            List<InvoiceViewModel> invoices = invoiceInventoryService.findInvoiceByCustomer(7);
            assertEquals(1,invoices.size());
            assertEquals(invoiceViewModel,invoices.get(0));
        }

    }