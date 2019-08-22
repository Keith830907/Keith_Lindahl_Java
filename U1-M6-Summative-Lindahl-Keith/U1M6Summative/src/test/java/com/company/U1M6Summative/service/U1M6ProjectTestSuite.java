package com.company.U1M6Summative.service;

import com.company.U1M6Summative.CustomerDaoTest;
import com.company.U1M6Summative.InvoiceDaoTest;
import com.company.U1M6Summative.Invoice_ItemDaoTest;
import com.company.U1M6Summative.ItemDaoTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CustomerDaoTest.class,
        Invoice_ItemDaoTest.class,
        ItemDaoTest.class,
        InvoiceDaoTest.class,
        InvoiceInventoryServiceTest.class
})
public class U1M6ProjectTestSuite {
}

