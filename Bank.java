import java.util.*;

public class Bank implements HasMenu{

	Admin admin;
	ArrayList<Customer> customers;
	Scanner scanner = new Scanner(System.in);
	
	public Bank(){
		this.loadSampleCustomers();
		this.saveCustomers();
		this.loadCustomers();
		this.start();
		this.saveCustomers();
	} // end constructor

	public static void main(String[] args){
		Bank b = new Bank();
		b.start();
	} // end main

	public void loadSampleCustomers(){
		customers.add(new Customer("Alice", "1111"));
		customers.add(new Customer("Bob", "2222"));
	} // end loadSampleCustomers

	public void saveCustomers(){

	} // end saveCustomers
	
	public void loadCustomers(){
		
	} // end loadCustomers
	
	public void reportAllUsers(){
		for (Customer c : customers){
			System.out.println(c.getReport());
		} // end for
	} // end reportAllUsers
	
	public void addUser(){
		System.out.print("Enter username: ");
		String userName = scanner.nextLine();
		System.out.print("Enter PIN: ");
		String PIN = scanner.nextLine();
		customers.add(new Customer(userName, PIN));
	} // end addUser
	
	public void applyInterest(){
		for (Customer c : customers) {
			c.savings.calcInterest();
		} // end for
	} // end applyInterest
	
	public void loginAsCustomer(){
		System.out.print("Enter username: ");
		String userName = scanner.nextLine();
		System.out.print("Enter PIN: ");
		String PIN = scanner.nextLine();
		for (Customer c : customers) {
			if (c.login(userName, PIN)) {
				System.out.println("Login successful!");
				c.start();
				return;
			} // end if
		} // end for
		System.out.println("Invalid username or PIN.");
	} // end loginAsCustomer

	public String menu(){
		System.out.println("\nBank Menu\n");
		System.out.println("0) Exit System");
		System.out.println("1) Login as admin");
		System.out.println("2) Login as customer");
		System.out.print("Please enter 0-2: ");
		return scanner.nextLine();
	} // end menu

	public void start(){
		Bank b = new Bank();
		boolean keepGoing = true;
		while (keepGoing == true) {
			String menuRequest = b.menu();
			if (menuRequest.equals("0")) {
				keepGoing = false;
			} // end if
			else if (menuRequest.equals("1")) {
				b.startAdmin();
			} // end else if
			else if (menuRequest.equals("2")) {
				b.loginAsCustomer();
			} // end else if
			else {
				System.out.println("Invalid selection.");
			} // end else
		} // end while
	} // end start

	public void startAdmin(){
		Bank b = new Bank();
		boolean keepGoing = true;
		while (keepGoing == true) {
			String menuRequest = admin.menu();
			if (menuRequest.equals("0")) {
				keepGoing = false;
			} // end if
			else if (menuRequest.equals("1")) {
				b.reportAllUsers();
			} // end else if
			else if (menuRequest.equals("2")) {
				b.addUser();
			} // end else if
			else if (menuRequest.equals("3")) {
				b.applyInterest();
			} // end else if
			else {
				System.out.println("Invalid selection.");
			} // end else
		} // end while
	} // end startAdmin
} // end
