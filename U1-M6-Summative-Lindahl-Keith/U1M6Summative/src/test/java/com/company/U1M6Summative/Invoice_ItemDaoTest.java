package com.company.U1M6Summative;

import com.company.U1M6Summative.dao.CustomerDao;
import com.company.U1M6Summative.dao.InvoiceDao;
import com.company.U1M6Summative.dao.Invoice_ItemDao;
import com.company.U1M6Summative.dao.ItemDao;
import com.company.U1M6Summative.model.Customer;
import com.company.U1M6Summative.model.Invoice;
import com.company.U1M6Summative.model.Invoice_Item;
import com.company.U1M6Summative.model.Item;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Invoice_ItemDaoTest {

    @Autowired
    CustomerDao customerDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    Invoice_ItemDao invoice_itemDao;

    @Before
    public void setUp() throws Exception {

        // Clean up the test db
        // Clean up the test db
        List<Invoice_Item> iiList = invoice_itemDao.getAllInvoice_Items();
        for (Invoice_Item ii : iiList) {
            invoice_itemDao.deleteInvoice_Item(ii.getId());
        }

        List<Item> iList = itemDao.getAllItems();
        for (Item i : iList) {
            itemDao.deleteItem(i.getId());
        }

        List<Invoice> inList = invoiceDao.getAllInvoices();
        for (Invoice in : inList) {
            invoiceDao.deleteInvoice(in.getId());
        }

        List<Customer> customerList = customerDao.getAllCustomers();
        for (Customer c : customerList) {
            customerDao.deleteCustomer(c.getId());
        }
    }


    @Test
    public void addGetDeleteInvoice_Item() {

        Item item = new Item();
        item.setName("phone");
        item.setDescription("black");
        item.setDaily_rate(new BigDecimal("21.95"));
        item = itemDao.addItem(item);

        Customer customer = new Customer();
        customer.setFirst_name("Keith");
        customer.setLast_name("Lindahl");
        customer.setEmail("@hotmail.com");
        customer.setCompany("Big Company");
        customer.setPhone("222-555-4444");
        customer = customerDao.addCustomer(customer);

        Invoice invoice = new Invoice();
        invoice.setCustomer_id(customer.getId());
        invoice.setOrder_date((LocalDate.of(2019, 8, 03)));
        invoice.setPickup_date((LocalDate.of(2019, 8, 06)));
        invoice.setReturn_date((LocalDate.of(2019, 8, 24)));
        invoice.setLate_fee(new BigDecimal("3.99"));
        invoice.setId(invoice.getId());
        invoice = invoiceDao.addInvoice(invoice);

        Invoice_Item invoice_item = new Invoice_Item();
        invoice_item.setItem_id(item.getId());
        invoice_item.setInvoice_id(invoice.getId());
        invoice_item.setQuantity(34);
        invoice_item.setUnit_rate(new BigDecimal("21.95"));
        invoice_item.setDiscount(new BigDecimal("3.00"));

        invoice_item = invoice_itemDao.addInvoice_Item(invoice_item);


        Invoice_Item invoice_item1 = invoice_itemDao.getInvoice_Item(invoice_item.getId());

        assertEquals(invoice_item1, invoice_item);

        invoice_itemDao.deleteInvoice_Item(invoice_item.getId());

        invoice_item1 = invoice_itemDao.getInvoice_Item(invoice_item.getId());

        assertNull(invoice_item1);
    }
    @Test(expected  = DataIntegrityViolationException.class)
    public void addWithRefIntegrityException() {

        Invoice_Item invoice_item = new Invoice_Item();
        invoice_item.setQuantity(34);
        invoice_item.setItem_id(54);
        invoice_item.setInvoice_id(91);
        invoice_item.setUnit_rate(new BigDecimal("21.95"));
        invoice_item.setDiscount(new BigDecimal("3.00"));

        invoice_item = invoice_itemDao.addInvoice_Item(invoice_item);
    }

    @Test
    public void getAllInvoice_Items() {

        // Need to create a Customer, Item, and Invoice_Item first
        Item item = new Item();
        item.setName("phone");
        item.setDescription("black");
        item.setDaily_rate(new BigDecimal("21.95"));
        item = itemDao.addItem(item);

        Customer customer = new Customer();
        customer.setFirst_name("Keith");
        customer.setLast_name("Lindahl");
        customer.setEmail("@hotmail.com");
        customer.setCompany("Big Company");
        customer.setPhone("222-555-4444");
        customer = customerDao.addCustomer(customer);

        Invoice invoice = new Invoice();
        invoice.setCustomer_id(customer.getId());
        invoice.setOrder_date((LocalDate.of(2019, 8, 03)));
        invoice.setPickup_date((LocalDate.of(2019, 8, 06)));
        invoice.setReturn_date((LocalDate.of(2019, 8, 24)));
        invoice.setLate_fee(new BigDecimal("3.99"));
        invoice.setId(invoice.getId());
        invoice = invoiceDao.addInvoice(invoice);

        Invoice_Item invoice_item = new Invoice_Item();
        invoice_item.setItem_id(item.getId());
        invoice_item.setInvoice_id(invoice.getId());
        invoice_item.setQuantity(34);
        invoice_item.setUnit_rate(new BigDecimal("21.95"));
        invoice_item.setDiscount(new BigDecimal("3.00"));

        invoice_item = invoice_itemDao.addInvoice_Item(invoice_item);

        invoice_item = new Invoice_Item();
        invoice_item.setItem_id(item.getId());
        invoice_item.setInvoice_id(invoice.getId());
        invoice_item.setQuantity(34);
        invoice_item.setUnit_rate(new BigDecimal("21.95"));
        invoice_item.setDiscount(new BigDecimal("3.00"));

        invoice_item = invoice_itemDao.addInvoice_Item(invoice_item);

        List<Invoice_Item> aList = invoice_itemDao.getAllInvoice_Items();

        assertEquals(aList.size(), 2);

    }

    @Test
    public void updateInvoice_Item() {

        // Need to create a Customer, Item, and Invoice first
        Item item = new Item();
        item.setName("phone");
        item.setDescription("black");
        item.setDaily_rate(new BigDecimal("21.95"));
        item = itemDao.addItem(item);

        Customer customer = new Customer();
        customer.setFirst_name("Keith");
        customer.setLast_name("Lindahl");
        customer.setEmail("@hotmail.com");
        customer.setCompany("Big Company");
        customer.setPhone("222-555-4444");
        customer = customerDao.addCustomer(customer);

        Invoice invoice = new Invoice();
        invoice.setId(invoice.getId());
        invoice.setCustomer_id(customer.getId());
        invoice.setOrder_date((LocalDate.of(2019, 8, 03)));
        invoice.setPickup_date((LocalDate.of(2019, 8, 06)));
        invoice.setReturn_date((LocalDate.of(2019, 8, 24)));
        invoice.setLate_fee(new BigDecimal("3.99"));
        invoice = invoiceDao.addInvoice(invoice);

        Invoice_Item invoice_item = new Invoice_Item();
        invoice_item.setId(invoice_item.getId());
        invoice_item.setInvoice_id(invoice.getId());
        invoice_item.setItem_id(item.getId());
        invoice_item.setQuantity(34);
        invoice_item.setUnit_rate(new BigDecimal("21.95"));
        invoice_item.setDiscount(new BigDecimal("3.00"));

        invoice_item = invoice_itemDao.addInvoice_Item(invoice_item);


        invoice_item.setQuantity(38);
        invoice_item.setUnit_rate(new BigDecimal("13.99"));
        invoice_item.setDiscount(new BigDecimal("1.00"));

        invoice_itemDao.updateInvoice_Item(invoice_item);

        Invoice_Item invoice_item_1 = invoice_itemDao.getInvoice_Item(invoice_item.getId());
        assertEquals(invoice_item_1, invoice_item);
    }

    public void getInvoiceItemsByInvoice()
    {

        Item item = new Item();
        item.setName("phone");
        item.setDescription("black");
        item.setDaily_rate(new BigDecimal("21.95"));
        item = itemDao.addItem(item);

        Customer customer = new Customer();
        customer.setFirst_name("Keith");
        customer.setLast_name("Lindahl");
        customer.setEmail("@hotmail.com");
        customer.setCompany("Big Company");
        customer.setPhone("222-555-4444");
        customer = customerDao.addCustomer(customer);

        Invoice invoice = new Invoice();
        invoice.setId(invoice.getId());
        invoice.setCustomer_id(customer.getId());
        invoice.setOrder_date((LocalDate.of(2019, 8, 03)));
        invoice.setPickup_date((LocalDate.of(2019, 8, 06)));
        invoice.setReturn_date((LocalDate.of(2019, 8, 24)));
        invoice.setLate_fee(new BigDecimal("3.99"));
        invoice = invoiceDao.addInvoice(invoice);


        Invoice_Item invoice_item = new Invoice_Item();

        invoice_item.setId(invoice_item.getId());
        invoice_item.setInvoice_id(invoice.getId());
        invoice_item.setItem_id(item.getId());
        invoice_item.setQuantity(34);
        invoice_item.setUnit_rate(new BigDecimal("21.95"));
        invoice_item.setDiscount(new BigDecimal("3.00"));

        invoice_item = invoice_itemDao.addInvoice_Item(invoice_item);

        Invoice_Item invoiceItem1 = new Invoice_Item();
        invoiceItem1.setItem_id(item.getId());
        invoiceItem1.setQuantity(3);
        invoiceItem1.setInvoice_id(invoice.getId());
        invoiceItem1.setUnit_rate(new BigDecimal(35).setScale(2));
        invoiceItem1.setDiscount(new BigDecimal(3).setScale(2));
        invoice_itemDao.addInvoice_Item(invoiceItem1);

        List<Invoice_Item> iList = invoice_itemDao.getInvoice_ItemsByInvoice(invoice.getId());
        assertEquals(2,iList.size());


    }




}
