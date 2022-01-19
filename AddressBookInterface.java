package com.addressbook;

public interface AddressBookInterface {

	void addNewAddress(SingleAddress address) throws DuplicateAddressException;
	void removeAddress(SingleAddress address);
}
