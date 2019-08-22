package com.company.CrmJpaProject.controller;

import com.company.CrmJpaProject.model.Customer;
import com.company.CrmJpaProject.model.Note;
import com.company.CrmJpaProject.repository.CustomerRepository;
import com.company.CrmJpaProject.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value="ALT")
public class CRMController2 {

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private NoteRepository noteRepo;

    @RequestMapping(value="/customer", method = RequestMethod.POST)
    @ResponseBody
    public Customer createCustomer(@RequestBody Customer customer) {
        customerRepo.save(customer);
        return customer;
    }

    @RequestMapping(value="/customer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Customer getCustomerById(@PathVariable(name="id") int id) {
        return customerRepo.findOne((long)id);
    }

    @RequestMapping(value="/customer/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@RequestBody Customer customer, @PathVariable(name = "id") int id) {

        customerRepo.save(customer);
    }

    @RequestMapping(value="/customer/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomer(@PathVariable(name = "id") int id) {
        customerRepo.delete((long)id);
    }

    @RequestMapping(value="/customers", method = RequestMethod.GET)
    @ResponseBody
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @RequestMapping(value="/note", method = RequestMethod.POST)
    @ResponseBody
    public Note createNote(@RequestBody Note note) {
        noteRepo.save(note);
        return note;
    }

    @RequestMapping(value="/note/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Note getNoteById(@PathVariable(name="id") int id) {
        Note note = noteRepo.findOne((long)id);
        return note;
    }

    @RequestMapping(value="/note/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateNote(@RequestBody Note note, @PathVariable(name="id") int id) {
        // TODO - check matching ids...
        noteRepo.save(note);
    }

    @RequestMapping(value="/note/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteNote(@PathVariable(name="id") int id) {
        noteRepo.delete((long)id);
    }

    @RequestMapping(value="/notes", method = RequestMethod.GET)
    @ResponseBody
    public List<Note> getAllNotes() {
        List<Note> noteList =  noteRepo.findAll();
        return noteList;
    }
}

