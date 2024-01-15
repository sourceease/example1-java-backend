package com.contact.service;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {

    private List<Contact> contacts = new ArrayList<>();
    private Integer nextId =0;

    public List<Contact> getAllContacts() {
        return contacts;
    }

    public Contact getContactById(Integer contactId) {
        return contacts.get(contactId);
    }

    public Contact saveContact(Contact contact) {
        if (contact.getContactId() == null ) {
            contact.setContactId(nextId++);
        }
        contacts.add(contact);
        return contact;
    }
    
    public Integer updateContactById(Integer contactId, Contact contact){
    	//Integer index = id-1;
    	contacts.set(contactId, contact);
    	return contactId;
    }
    
    public void deleteContact(Integer contactId) {
        contacts.remove(contactId);
    }
}