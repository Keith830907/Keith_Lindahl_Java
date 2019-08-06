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
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvoiceDaoTest {

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
    public void addGetDeleteInvoice() {
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

        Invoice invoice1 = invoiceDao.getInvoice(invoice.getId());

        assertEquals(invoice1, invoice);

        invoiceDao.deleteInvoice(invoice.getId());

        invoice1 = invoiceDao.getInvoice(invoice.getId());

        assertNull(invoice1);
    }

    @Test
    public void updateInvoice() {

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
        //invoice.setId(invoice.getId());
        invoice = invoiceDao.addInvoice(invoice);


        invoice.setOrder_date((LocalDate.of(2019, 9, 04)));
        invoice.setPickup_date((LocalDate.of(2019, 9, 06)));
        invoice.setReturn_date((LocalDate.of(2019, 9, 24)));
        invoice.setLate_fee(new BigDecimal("2.99"));

        invoiceDao.updateInvoice(invoice);

        Invoice invoice1 = invoiceDao.getInvoice(invoice.getId());

        assertEquals(invoice1, invoice);
    }

    @Test
    public void getAllInvoices() {

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

        Customer customer1 = new Customer();
        customer1.setFirst_name("Keith");
        customer1.setLast_name("Lindahl");
        customer1.setEmail("@hotmail.com");
        customer1.setCompany("Big Company");
        customer1.setPhone("222-555-4444");
        customer1 = customerDao.addCustomer(customer);

        Invoice invoice = new Invoice();
        invoice.setCustomer_id(customer.getId());
        invoice.setOrder_date((LocalDate.of(2019, 8, 03)));
        invoice.setPickup_date((LocalDate.of(2019, 8, 06)));
        invoice.setReturn_date((LocalDate.of(2019, 8, 24)));
        invoice.setLate_fee(new BigDecimal("3.99"));
        invoice.setId(invoice.getId());
        invoice = invoiceDao.addInvoice(invoice);

        invoice = new Invoice();
        invoice.setCustomer_id(customer.getId());
        invoice.setOrder_date((LocalDate.of(2019, 9, 8)));
        invoice.setPickup_date((LocalDate.of(2019, 9, 6)));
        invoice.setReturn_date((LocalDate.of(2019, 9, 26)));
        invoice.setLate_fee(new BigDecimal("3.99"));
        invoice.setId(invoice.getId());
        invoice = invoiceDao.addInvoice(invoice);

        List<Invoice> aList = invoiceDao.getAllInvoices();

        assertEquals(aList.size(), 2);

    }
}


