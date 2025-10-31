import java.util.*;

public class User implements HasMenu, Serializable{
	
	String userName;
	String PIN;
	Scanner input = new Scanner(System.in);

	public boolean login{
		System.out.print("Enter Username: ");
		String u = input.nextLine();
		System.out.print("Enter PIN: ");
		String p = input.nextLine();
		return login(u, p);
	} // end login
	
	public boolean login(String userName, String PIN){
		return this.userName.equals(userName) && this.PIN.equals(PIN);
        } // end login

	public void setUserName(String userName){
		this.userName = userName;
	} // end setUserName

	public String getUserName(){
		return this.userName;
	} // end getUserName

	public void setPIN(String PIN){
		this.PIN = PIN;
        } // end setPIN

        public String getPIN(){
		return this.PIN;
        } // end getPIN

	abstract String getReport();
} // end
