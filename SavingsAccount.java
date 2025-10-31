import java.util.*;

public class SavingsAccount extends CheckingAccount{
	
	double interestRate;
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		SavingsAccount s = new SavingsAccount();
		s.start();
	} // end main
	
	public void calcInterest(){
		double interest = balance * interestRate;
		balance += interest;
	} // end calcInterest

	public void setInterestRate(){
		System.out.print("Enter new interest rate as a decimal: ");
		double newRate = scanner.nextDouble();
		scanner.nextLine();
		this.interestRate = newRate;
	} // end setInterestRate

	public double getInterestRate(){
		return this.interestRate;
	} // end getInterestRate
} // end
