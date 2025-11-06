import java.util.*;

public class Admin extends User{
	
	Scanner scanner = new Scanner(System.in);
	
	public Admin(){
		this("Admin", "0000");
	} // end constructor

	public String menu(){
		System.out.println("\nAdmin Menu\n");
		System.out.println("0) Exit this menu");
		System.out.println("1) Full customer report");
		System.out.println("2) Add user");
		System.out.println("3) Apply interest to savings account");
		System.out.print("Please enter 0-3: ");
		return scanner.nextLine();
	} // end menu

	public void start(){
	
	} // end start
	
	public String getReport(){
		return userName && PIN;
	} // end getReport
} // end
