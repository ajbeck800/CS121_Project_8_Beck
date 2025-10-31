import java.util.*;

public class Customer extends User{

	CheckingAccount checking;
	SavingsAccount savings;
	
	public static void main(String[] args){
		Customer c = new Customer("AJ", "2005");
		c.start();
	} // end main
	
	public Customer(){
		this("guest", "0000");
	} // end constructor

	public Customer(String userName, String PIN){
		this.userName = userName;
		this.PIN = PIN;
		this.checking = new CheckingAccount();
		this.savings = new SavingsAccount();
	} // end constructor

	public void start(){
		System.out.println("Welcome, " + userName + "!");
		boolean keepGoing = true;
		while (keepGoing == true){
			switch (menu()){
				case "1":
					checking.start();
					break;
				case "2":
					savings.start();
					break;
				case "3":
					changePin();
					break;
				case "4":
					System.out.println(getReport());
					break;
				case "5":
					keepGoing = false;
					System.out.println("Goodbye, " + userName + "!");
					break;
				default: System.out.println("Invalid option.");
			} // end switch
		} // end while
	} // end start

	public String menu(){
		System.out.println("\n=== Customer Menu ===");
		System.out.println("1. Checking Account");
		System.out.println("2. Savings Account");
		System.out.println("3. Change PIN");
		System.out.println("4. View Report");
		System.out.println("5. Exit");
		System.out.print("Enter your choice: ");
		return input.nextLine();
	} // end menu

	public void changePIN(){
		System.out.print("Enter new PIN: ");
		String newPIN = input.nextLine();
		setPIN(newPIN);
		System.out.println("PIN successfully changed.");
	} // end changePIN
	
	public String getReport(){
		return "User Report:\nUsername: " + userName + "\nPIN: " + PIN + "\nChecking Balance: " + checking.getBalanceString() + "\nSavings Balance: " + savings.getBalanceString();
	} // end getReport
} // end
