package com.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.contact.model.Contact;
import com.contact.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/{contactId}")
    public Contact getContactById(@PathVariable Integer ContactId) {
        return contactService.getContactById(ContactId);
    }

    @PostMapping()
    public Contact saveContact(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

    @PutMapping("/{contactId}")
    public Integer updateContactById(@PathVariable Integer ContactId, @RequestBody Contact contact) {
        return contactService.updateContactById(ContactId, contact);
    }
    
    @DeleteMapping("/{contactId}")
    public void deleteContact(@PathVariable Integer ContactId) {
        contactService.deleteContact(ContactId);
    }
}