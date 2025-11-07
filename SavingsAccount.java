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
		System.out.println("New Balance: " + getBalanceString());
	} // end calcInterest

	public void setInterestRate(){
		this.interestRate = 0.05;
	} // end setInterestRate

	public double getInterestRate(){
		return this.interestRate;
	} // end getInterestRate
} // end
