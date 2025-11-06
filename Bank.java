import java.util.*;

public class Bank implements HasMenu{

	Admin admin;
	ArrayList<Customer> customers;
	Scanner scanner = new Scanner(System.in);
	
	public Bank(){
		admin = new Admin();
		customers = new ArrayList<>();
		loadSampleCustomers();
	} // end constructor

	public static void main(String[] args){
		Bank b = new Bank();
		b.start();
	} // end main

	public void loadSampleCustomers(){
		customers.add(new Customer("Alice", "1111"));
		customers.add(new Customer("Bob", "2222"));
		customers.add(new Customer("Cindy", "3333"));
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
				c.start();
				return;
			} // end if
			else {
				System.out.println("Invalid username or PIN.");
			} // end else
		} // end for
	} // end loginAsCustomer

	public String menu(){
		System.out.println("\nBank Menu\n");
		System.out.println("0) Exit System");
		System.out.println("1) Login as admin");
		System.out.println("2) Login as customer\n");
		System.out.print("Please enter 0-2: ");
		return scanner.nextLine();
	} // end menu

	public void start(){
		boolean keepGoing = true;
		while (keepGoing == true) {
			String menuRequest = menu();
			if (menuRequest.equals("0")) {
				keepGoing = false;
			} // end if
			else if (menuRequest.equals("1")) {
				startAdmin();
			} // end else if
			else if (menuRequest.equals("2")) {
				loginAsCustomer();
			} // end else if
			else {
				System.out.println("Invalid selection.");
			} // end else
		} // end while
	} // end start

	public void startAdmin(){
		if (userName == "admin" && PIN == "0000") {
			boolean keepGoing = true;
			while (keepGoing == true) {
				String menuRequest = admin.menu();
				if (menuRequest.equals("0")) {
					keepGoing = false;
				} // end if
				else if (menuRequest.equals("1")) {
					reportAllUsers();
				} // end else if
				else if (menuRequest.equals("2")) {
					addUser();
				} // end else if
				else if (menuRequest.equals("3")) {
					applyInterest();
				} // end else if
				else {
					System.out.println("Invalid selection.");
				} // end else
			} // end while
		} // end if
		else {
			System.out.println("Invalid username or PIN.");
		} // end else
	} // end startAdmin
} // end
