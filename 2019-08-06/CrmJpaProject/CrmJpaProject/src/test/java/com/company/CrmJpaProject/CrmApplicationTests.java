package com.company.CrmJpaProject;

import com.company.CrmJpaProject.model.Customer;
import com.company.CrmJpaProject.model.Note;
import com.company.CrmJpaProject.repository.CustomerRepository;
import com.company.CrmJpaProject.repository.NoteRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrmApplicationTests {

    @Autowired
    CustomerRepository customerRepo;

    @Autowired
    NoteRepository noteRepo;

    @Test
    public void contextLoads(){

    }

    @Test
    public void createTest(){
        customerRepo.deleteAll();


        Customer customer = new Customer();
        customer.setFirstName("Joe");
        customer.setLastName("Smith");
        customer.setPhone("111-222-3456");
        customer.setCompany("BigCo");

        customerRepo.save(customer);

        Note note = new Note();
        note.setContent("This is a test note.");
        note.setCustomerId(customer.getId());

        Note note2 = new Note();
        note2.setContent("This is the SECOND note.");
        note2.setCustomerId(customer.getId());

        noteRepo.save(note);
        noteRepo.save(note2);


        List<Customer> customerList = customerRepo.findAll();

        assertEquals(1, customerList.size());

        Set<Note> noteSet = customerList.get(0).getNotes();
        assertEquals(2, noteSet.size());


    }
}
