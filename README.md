# CS121_Project_8_Beck
## (lab) Bank on it part I

### UML Diagram
```
interface HasMenu 
  ====================
  ====================
  String menu()
  void start()
  ====================

class CheckingAccount implements HasMenu
  ====================
    double balance
  ====================
    CheckingAccount()
    CheckingAccount(double balance)
    main()
    String menu()
    void start()   
    double getBalance()
    String getBalanceString()
    void setBalance(double balance)
    void checkBalance()
    private double getDouble()
    void makeDeposit()
    void makeWithdrawal
  ====================

class SavingsAccount extends CheckingAccount
  ====================
    double interestRate
  ====================
    main()
    void calcInterest()
    void setInterestRate()
    double getInterestRate()
  ====================

abstract class User implements HasMenu, Serializable
  ====================
    String userName
    String PIN
  ====================
    boolean login()
    boolean login(userName, PIN)
    void setUserName(userName)
    String getUserName()
    void setPIN(PIN)
    String getPIN()
    abstract String getReport()
  ====================

class Customer extends User
  ====================
    CheckingAccount checking 
    SavingsAccount savings 
  ====================
    void main()
    Customer()
    Customer(userName, PIN)
    void start()
    String menu()
    void changePin()
    String getReport()
  ====================

class Admin extends User
  ====================
  ====================
    Admin()
    String menu()
    void start()
    String getReport()
  ====================

class Bank implements HasMenu
  ====================
    Admin admin
    ArrayList customers
  ====================
    Bank()
    void main()
    void loadSampleCustomers()
    void saveCustomers()
    void loadCustomers()
    void reportAllUsers()
    void addUser()
    void applyInterest()
    void loginAsCustomer()
    String menu()
    void start()
    void startAdmin()
  ====================
```

### interface HasMenu
```
implemented by CheckingAccount and User
```

#### String menu()
```
used to create a menu for the user
```

#### void start()
```
used to start running the code
```

### class CheckingAccount implements HasMenu
```
create double balance to store the user's balance
stores information on the user checking accounts
```

#### String menu()
```
prints out the menu and takes in a response
```

#### void start()   
```
repeats the menu, sends control to other methods, and exits the program
```

#### double getBalance()
```
gets the user's balance
returns the user's balance
```

#### String getBalanceString()
```
returns balance as a string
```

#### void setBalance(double balance)
```
sets the user's balance
```

#### void checkBalance()
```
allows the user to check their balance
```

#### private double getDouble()
```
reads balance from user input
if improper data is inputted, returns 0
```

#### void makeDeposit()
```
asks the user how much they would like to deposit
allows the user to deposit that money
```

#### void makeWithdrawal
```
asks the user how much they would like to withdraw
checks to make sure that the user has enough to be withdrawn
allows the user to withdraw that money
```

### class SavingsAccount extends CheckingAccount
```
create double interestRate to store the interest rate
store information on the user savings accounts
```

#### void calcInterest()
```
calculates the interest rate and adds it to the user's balance
```

#### void setInterestRate()
```
sets the interest rate to the interest rate from getInterestRate()
```

#### double getInterestRate()
```
gets the interest rate from calcInterest()
```

### abstract class User implements HasMenu, Serializable
```
create string userName to store the user's username
create string PIN to store the user's pin
used to create the customer and manage logins
```

#### boolean login()
```
prints the login screen for the user
```

#### boolean login(userName, PIN)
```
takes in the user's input for userName and PIN
```

#### void setUserName(userName)
```
sets the userName to the input from login()
```

#### String getUserName()
```
returns the userName
```

#### void setPIN(PIN)
```
sets the PIN to the input from login()
```

#### String getPIN()
```
returns the PIN
```

#### abstract String getReport()
```
prints a report of the user's username and PIN
```

### class Customer extends User
```
stores details about the customer
```

#### void main()
```
calls CheckingAccount checking and SavingsAccount savings
```

#### Customer()
```
creates Customer class
```

#### Customer(userName, PIN)
```
stores the user's userName and PIN from User()
```

#### void start()
```
starts running the code
```

#### String menu()
```
prints the menu
```

#### void changePin()
```
allows the user to change their PIN
```

#### String getReport()
```
prints a report of the user's username and PIN
```

### class Admin extends User
```

```

#### String menu()
```

```

#### void start()
```

```

#### String getReport()
```

```

### class Bank implements HasMenu
```

```

#### void main()
```

```

#### void loadSampleCustomers()
```

```

#### void saveCustomers()
```

```

#### void loadCustomers()
```

```

#### void reportAllUsers()
```

```

#### void addUser()
```

```

#### void applyInterest()
```

```

#### void loginAsCustomer()
```

```

#### String menu()
```

```

#### void start()
```

```

#### void startAdmin()
```

```