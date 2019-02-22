package com.udemy.component;

import org.springframework.stereotype.Component;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;

@Component("contactConverter")
public class ContactConverter {

	public Contact convertContactModel2Contact(ContactModel contactModel) {
		Contact contact = new Contact();
		contact.setCiudad(contactModel.getCiudad());
		contact.setApellido(contactModel.getApellido());
		contact.setNombre(contactModel.getNombre());
		contact.setTelefono(contactModel.getTelefono());
		contact.setId(contactModel.getId());
		return contact;
	}
	
	public ContactModel converCOntact2ContactModel(Contact contact) {
		ContactModel contactModel = new ContactModel();
		contactModel.setNombre(contact.getNombre());
		contactModel.setCiudad(contact.getCiudad());
		contactModel.setApellido(contact.getApellido());
		contactModel.setTelefono(contact.getTelefono());
		contactModel.setId(contact.getId());
		return contactModel;
	
	}
	
}
