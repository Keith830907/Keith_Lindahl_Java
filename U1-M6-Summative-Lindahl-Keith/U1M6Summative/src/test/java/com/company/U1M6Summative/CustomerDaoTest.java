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
    public class CustomerDaoTest {

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

            List<Invoice_Item> iiList = invoice_itemDao.getAllInvoice_Items();
            for (Invoice_Item ii : iiList) {
                invoice_itemDao.deleteInvoice_Item(ii.getId());
            }

            // Clean up the test db
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
        public void addGetDeleteCustomer() {


            Customer customer = new Customer();
            customer.setFirst_name("Keith");
            customer.setLast_name("Lindahl");
            customer.setEmail(("Keith@hotmail.com"));
            customer.setCompany("BigCompany");
            customer.setPhone("222-333-5555");

            customer = customerDao.addCustomer(customer);

            Customer customer1 = customerDao.getCustomer(customer.getId());

            assertEquals(customer1, customer);

            customerDao.deleteCustomer(customer.getId());

            customer1 = customerDao.getCustomer(customer.getId());

            assertNull(customer1);
        }



        @Test
        public void updateCustomer() {

            Customer customer = new Customer();
            customer.setFirst_name("Keith");
            customer.setLast_name("Lindahl");
            customer.setEmail(("Keith@hotmail.com"));
            customer.setCompany("BigCompany");
            customer.setPhone("222-333-5555");

            customer = customerDao.addCustomer(customer);

            customer.setFirst_name("John");
            customer.setLast_name("Doe");
            customer.setEmail(("JohnDoe@hotmail.com"));
            customer.setCompany("SmallCompany");
            customer.setPhone("222-333-4444");

            customerDao.updateCustomer(customer);

            Customer customer1 = customerDao.getCustomer(customer.getId());

            assertEquals(customer1, customer);
        }

        @Test
        public void getAllCustomers() {

            Customer customer = new Customer();
            customer.setFirst_name("John");
            customer.setLast_name("Doe");
            customer.setEmail(("JohnDoe@hotmail.com"));
            customer.setCompany("SmallCompany");
            customer.setPhone("222-333-4444");

            customer = customerDao.addCustomer(customer);

            customer = new Customer();
            customer.setFirst_name("Keith");
            customer.setLast_name("Lindahl");
            customer.setEmail(("Keith@hotmail.com"));
            customer.setCompany("BigCompany");
            customer.setPhone("222-333-5555");

            customer = customerDao.addCustomer(customer);

            List<Customer> aList = customerDao.getAllCustomers();
            assertEquals(aList.size(), 2);

        }

    }

