import java.util.*;

public class Customer extends User{

	CheckingAccount checking;
	SavingsAccount savings;
	Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		Customer c = new Customer("AJ", "2005");
		c.start();
	} // end main
	
	public Customer(){
		this("Unknown", "0000");
	} // end constructor

	public Customer(String userName, String PIN){
		this.userName = userName;
		this.PIN = PIN;
		this.checking = new CheckingAccount();
		this.savings = new SavingsAccount();
	} // end constructor

	public void start(){
		System.out.println("Login Successful");
		boolean keepGoing = true;
		while (keepGoing == true) {
			String menuRequest = c.menu();
			if (menuRequest.equals("0")) {
				keepGoing = false;
			} // end if
			else if (menuRequest.equals("1")) {
				checking.start();
			} // end else if
			else if (menuRequest.equals("2")) {
				savings.start();
			} // end else if
			else if (menuRequest.equals("3")) {
				changePin();
			} // end else if
			else {
				System.out.println("Invalid selection.");
			} // end else
		} // end while
	} // end start

	public String menu(){
		System.out.println("Customer Menu");
		System.out.println("0) Exit");
		System.out.println("1) Manage Checking Account");
		System.out.println("2) Manage Savings Account");
		System.out.println("3) Change PIN");
		System.out.print("Enter 0-3: ");
		return scanner.nextLine();
	} // end menu

	public void changePIN(){
		System.out.print("Enter new PIN: ");
		String newPIN = scanner.nextLine();
		setPIN(newPIN);
		System.out.println("PIN successfully changed.");
	} // end changePIN
	
	public String getReport(){

	} // end getReport
} // end
