package com.example.employee;

public class Employee {
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String address;
	private String contact;

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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setFirstName("Tejaswini");
		employee.setLastName("T");
		employee.setUserName("tejaswini28");
		employee.setPassword("Teju@123");
		employee.setAddress("Mysuru");
		employee.setContact("9685741236");

		System.out.println("First Name is " + employee.getFirstName());
		System.out.println("Last Name is " + employee.getLastName());
		System.out.println("User Name is " + employee.getUserName());
		System.out.println("Password is " + employee.getPassword());
		System.out.println("Address is " + employee.getAddress());
		System.out.println("Contact is " + employee.getContact());
	}


}
