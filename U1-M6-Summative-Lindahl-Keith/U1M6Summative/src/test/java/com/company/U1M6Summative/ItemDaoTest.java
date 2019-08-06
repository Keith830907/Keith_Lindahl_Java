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
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ItemDaoTest {

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
    public void addGetDeleteItem() {

        Item item = new Item();
        item.setName("Phone");
        item.setDescription("Black");
        item.setDaily_rate(new BigDecimal("35.99"));


        item = itemDao.addItem(item);

        Item item1 = itemDao.getItem(item.getId());

        assertEquals(item1, item);

        itemDao.deleteItem(item.getId());

        item1 = itemDao.getItem(item.getId());

        assertNull(item1);
    }




    @Test
    public void getAllItems() {

        Item item = new Item();
        item.setName("Phone");
        item.setDescription("Black");
        item.setDaily_rate(new BigDecimal("35.99"));
        item = itemDao.addItem(item);

        item = new Item();
        item.setName("NEW TABLET");
        item.setDescription("NEW DESCRIPTION");
        item.setDaily_rate(new BigDecimal("24.99"));
        item = itemDao.addItem(item);

        List<Item> aList = itemDao.getAllItems();

        assertEquals(aList.size(), 2);

    }

    @Test
    public void updateItem() {

        Item item = new Item();
        item.setName("Phone");
        item.setDescription("Black");
        item.setDaily_rate(new BigDecimal("35.99"));
        itemDao.addItem(item);

        item.setName("NEW NAME");
        item.setDescription("NEW DESCRIPTION");
        item.setDaily_rate(new BigDecimal("24.99"));
        itemDao.updateItem(item);

        Item item1 = itemDao.getItem(item.getId());

        assertEquals(item1, item);
    }

}
