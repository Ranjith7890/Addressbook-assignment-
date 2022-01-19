package com.addressbook;

public class SingleAddress {
String firstName;
String lastName;
String streetAddress;
String city;
String state;
String country;
int postalCode;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public SingleAddress(String firstName, String lastName, String streetAddress, String city, String state, String country,
		int postalCode) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.streetAddress = streetAddress;
	this.city = city;
	this.state = state;
	this.country = country;
	this.postalCode = postalCode;
}
public String getStreetAddress() {
	return streetAddress;
}
public void setStreetAddress(String streetAddress) {
	this.streetAddress = streetAddress;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public int getPostalCode() {
	return postalCode;
}
public void setPostalCode(int postalCode) {
	this.postalCode = postalCode;
}
public String  toString() {
	 return this.firstName +" ,"+ this.lastName +" ," + this.streetAddress  +" ,"+ this.city +" ," + this.state +" ," + this.country +" ," + this.postalCode;
}
}
