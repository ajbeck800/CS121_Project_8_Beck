# CS121_Project_8_Beck
## (lab) Bank on it part I

### UML Diagram
classDiagram
    class HasMenu {
        <<interface>>
        +String menu()
        +void start()
    }

    class CheckingAccount {
        -double balance
        +CheckingAccount()
        +CheckingAccount(double balance)
        +main()
        +String menu()
        +void start()
        +double getBalance()
        +String getBalanceString()
        +void setBalance(double balance)
        +void checkBalance()
        -double getDouble()
        +void makeDeposit()
        +void makeWithdrawal()
    }

    class SavingsAccount {
        -double interestRate
        +main()
        +void calcInterest()
        +void setInterestRate()
        +double getInterestRate()
    }

    class User {
        <<abstract>>
        -String userName
        -String PIN
        +boolean login()
        +boolean login(userName, PIN)
        +void setUserName(userName)
        +String getUserName()
        +void setPIN(PIN)
        +String getPIN()
        +abstract String getReport()
    }

    class Customer {
        -CheckingAccount checking
        -SavingsAccount savings
        +void main()
        +Customer()
        +Customer(userName, PIN)
        +void start()
        +String menu()
        +void changePin()
        +String getReport()
    }

    class Admin {
        +Admin()
        +String menu()
        +void start()
        +String getReport()
    }

    class Bank {
        -Admin admin
        -ArrayList customers
        +Bank()
        +void main()
        +void loadSampleCustomers()
        +void saveCustomers()
        +void loadCustomers()
        +void reportAllUsers()
        +void addUser()
        +void applyInterest()
        +void loginAsCustomer()
        +String menu()
        +void start()
        +void startAdmin()
    }

    HasMenu <|.. CheckingAccount
    CheckingAccount <|-- SavingsAccount
    HasMenu <|.. User
    User <|-- Customer
    User <|-- Admin
    HasMenu <|.. Bank

    Customer --> CheckingAccount
    Customer --> SavingsAccount
    Bank --> Admin
    Bank --> "ArrayList" : customers

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
prints a report of a user's userName and PIN
```

### class Customer extends User
```
stores details about the customer
```

#### void main()
```
creates CheckingAccount checking and SavingsAccount savings
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
prints a report of a user's userName and PIN
```

### class Admin extends User
```
stores details about the admin
```

#### String menu()
```
prints the menu
```

#### void start()
```
starts running the code
```

#### String getReport()
```
prints a report of a user's userName and PIN
```

### class Bank implements HasMenu
```
stores details about the Bank
```

#### void main()
```
creates Admin admin and ArrayList customers
```

#### void loadSampleCustomers()
```
stores sample customer data in ArrayList customers
```

#### void saveCustomers()
```
saves customer data stored in ArrayList customers
```

#### void loadCustomers()
```
stores customer data in ArrayList customers
```

#### void reportAllUsers()
```
for each element in ArrayList customers:
  prints a report of a user's userName, checking account, and savings account
```

#### void addUser()
```
allows the admin to create a new User's userName and PIN
adds the new user to ArrayList customers
```

#### void applyInterest()
```
for each element in ArrayList customers:
  set int interest to balance mulitplied by the interest rate
  add interest to balance
  print new balance
```

#### void loginAsCustomer()
```
allows the admin to login as a customer
```

#### String menu()
```
prints out the menu
```

#### void start()
```
starts running the code
```

#### void startAdmin()
```
starts running through Admin
```