package com.udemy.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.component.ContactConverter;
import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;
import com.udemy.repository.ContactRepository;
import com.udemy.service.ContactService;

@Service("contactServiceImpl")
public class ContactServiceImpl implements ContactService {

	@Autowired
	@Qualifier("contactRepository")
	private ContactRepository contactRepository;
	
	@Autowired
	@Qualifier("contactConverter")
	private ContactConverter contactConverter;


	@Override
	public ContactModel addContact(ContactModel contactModel) {
		Contact contact = contactRepository.save(contactConverter.convertContactModel2Contact(contactModel));
		return contactConverter.converCOntact2ContactModel(contact);
	}


	@Override
	public List<ContactModel> listAllContacts() {
		List<Contact> contacts =  contactRepository.findAll();
		List<ContactModel> contactModels = new ArrayList<>();
		
		for(Contact contact : contacts){
			contactModels.add(contactConverter.converCOntact2ContactModel(contact));
		}
		
		
		return contactModels;
	}


	@Override
	public Contact findContactById(int id) {
		return contactRepository.findById(id);
	}
	
	@Override
	public ContactModel findContactByIdModel(int id) {
		return contactConverter.converCOntact2ContactModel(findContactById(id));
	}


	@Override
	public void remomeContact(int id) {
		Contact contact = findContactById(id);
		if(null != contact) {
			contactRepository.delete(findContactById(id));
		}
		
		
	}
	
	

	
	
}
