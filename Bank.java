import java.util.*;

public class Bank implements HasMenu{

	Admin admin;
	ArrayList customers;
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
		
	} // end loadSampleCustomers

	public void saveCustomers(){

	} // end saveCustomers
	
	public void loadCustomers(){
		
	} // end loadCustomers
	
	public void reportAllUsers(){
		
	} // end reportAllUsers
	
	public void addUser(){
		
	} // end addUser
	
	public void applyInterest(){
		
	} // end applyInterest
	
	public void loginAsCustomer(){

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
		
	} // end startAdmin
} // end
