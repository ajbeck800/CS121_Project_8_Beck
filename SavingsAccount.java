import java.util.*;

public class SavingsAccount extends CheckingAccount{
	
	double interestRate;
	
	public static void main(String[] args){
		SavingsAccount s = new SavingsAccount();
		s.start();
	} // end main
	
	public void calcInterest(){
		double interest = balance * interestRate;
		balance += interest;
		System.out.println("Interest of " + String.format("$%.2f", interest) + " added.");
		System.out.println("New balance: " + getBalanceString());
	} // end calcInterest

	public void setInterestRate(){
		System.out.print("Enter new interest rate (as decimal, e.g. 0.03 for 3%): ");
		double rate = input.nextDouble();
		input.nextLine();
		this.interestRate = rate;
		System.out.println("Interest rate set to " + (interestRate * 100) + "%");
	} // end setInterestRate

	public double getInterestRate(){
		return this.interestRate;
	} // end getInterestRate
} // end
