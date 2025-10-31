import java.util.*;

public class CheckingAccount implements HasMenu{
	
	double balance = 0;
	Scanner scanner = new Scanner(System.in);

	public CheckingAccount(){
		this.balance = 0.0;	
	} // end constructor
	
	public CheckingAccount(double balance){
		this.balance = balance;
	} // end constructor
	
	public static void main(String[] args){
		CheckingAccount c = new CheckingAccount();
		System.out.println("Checking Account");
		c.start();
	} // end main
	
	public String menu(){
		System.out.println("\nAccount Menu\n");
		System.out.println("0) Quit");
		System.out.println("1) Check Balance");
		System.out.println("2) Make a Deposit");
		System.out.println("3) Make a Withdrawal");
		System.out.print("Please enter 0-3: ");
		return scanner.nextLine();
	} // end menu

	public void start(){
		CheckingAccount c = new CheckingAccount();
		boolean keepGoing = true;
		while (keepGoing == true) {
			String menuRequest = c.menu();
			if (menuRequest.equals("0")) {
				keepGoing = false;
			} // end if
			else if (menuRequest.equals("1")) {
				c.checkBalance();
			} // end else if
			else if (menuRequest.equals("2")) {
				c.makeDeposit();
			} // end else if
			else if (menuRequest.equals("3")) {
				c.makeWithdrawal();
			} // end else if
			else {
				System.out.println("Invalid selection.");
			} // end else
		} // end while
	} // end start

	public double getBalance(){
		return balance;
	} // end getBalance

	public String getBalanceString(){
		return String.format("$%.2f", balance);
	} // end getBalanceString

	public void setBalance(double balance){
		this.balance = balance;
	} // end setBalance

	public void checkBalance(){
		System.out.println("Checking balance...");
		System.out.println("Current balance: " + getBalanceString());
	} // end checkBalance

	private double getDouble(){
		try {
			double d = scanner.nextDouble();
			scanner.nextLine();
			return d;
		} // end try
		catch (Exception e) {
			System.out.println("Invalid input.");
			scanner.nextLine();
			return 0.0;
		} // end catch
	} // end getDouble

	public void makeDeposit(){
		System.out.println("Making a deposit...");
		System.out.print("How much to deposit? ");
		double deposit = getDouble();
		if (deposit > 0) {
			balance += deposit;
			System.out.println("New balance: " + getBalanceString());
		} // end if
		else {
			System.out.println("Invalid input.");
		} // end else
	} // end makeDeposit

	public void makeWithdrawal(){
		System.out.println("Making a withdrawal...");
		System.out.print("How much to withdraw? ");
		double withdrawal = getDouble();
		if (withdrawal <= 0) {
			System.out.println("Invalid input.");
		} // end if
		else if (withdrawal > balance) {
			System.out.println("Insufficient funds.");
		} // end else if
		else {
			balance -= withdrawal;
			System.out.println("New balance: " + getBalanceString());
		} // end else
	} // end makeWithdrawal
} // end
