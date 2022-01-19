package com.addressbook;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook implements AddressBookInterface {
	List<SingleAddress> listOfAddress = new ArrayList<SingleAddress>();


	
	@Override
	public void addNewAddress(SingleAddress address) throws DuplicateAddressException {
		
		
		for( SingleAddress address1 : listOfAddress) {
			if(address1.firstName == address.firstName){
				throw new DuplicateAddressException("Address with the first name already exist");
		}
			
			
		
			
		}
		listOfAddress.add(address);
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeAddress(SingleAddress address) {
		for( Iterator<SingleAddress> iterator = listOfAddress.iterator(); iterator.hasNext(); ) {
			SingleAddress address1 = iterator.next();
			if(address1.firstName == address.firstName) {
				iterator.remove();
			}
		}
	}
	public String  toString(SingleAddress address) {
		 return address.firstName +" ,"+ address.lastName +" ," + address.streetAddress  +" ,"+ address.city +" ," + address.state +" ," + address.country +" ," + address.postalCode;
	}
			
	

}
