public class BankAccount {

    public static void main(String[] args) {

        System.out.println("===== Bank Account Management System =====");
        System.out.println("Project Started Successfully!");

    }
}

===== Bank Account Management System =====
Project Started Successfully!
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Bank Account Management System =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);

        sc.close();
    }
}
===== Bank Account Management System =====
Enter Account Holder Name: Ameena
Enter Account Number: 1234567890
Enter Initial Balance: 5000

----- Account Details -----
Account Holder: Ameena
Account Number: 1234567890
Balance: ₹5000.0
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Bank Account Management System =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Deposit
        System.out.print("Enter amount to deposit: ");
        double deposit = sc.nextDouble();

        balance = balance + deposit;

        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Deposited Amount: ₹" + deposit);
        System.out.println("Updated Balance: ₹" + balance);

        sc.close();
    }
}
===== Bank Account Management System =====
Enter Account Holder Name: Ameena
Enter Account Number: 1234567890
Enter Initial Balance: 5000
Enter amount to deposit: 2000

----- Account Details -----
Account Holder: Ameena
Account Number: 1234567890
Deposited Amount: ₹2000.0
Updated Balance: ₹7000.0
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Bank Account Management System =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Deposit
        System.out.print("Enter amount to deposit: ");
        double deposit = sc.nextDouble();

        balance = balance + deposit;

        // Withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }

        // Account Details
        System.out.println("\n----- Account Details -----");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);

        sc.close();
    }
}
===== Bank Account Management System =====
Enter Account Holder Name: Ameena
Enter Account Number: 1234567890
Enter Initial Balance: 5000
Enter amount to deposit: 2000
Enter amount to withdraw: 1500

Withdrawal successful!

----- Account Details -----
Account Holder: Ameena
Account Number: 1234567890
Current Balance: ₹5500.0
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Bank Account Management System =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Deposit
        System.out.print("Enter amount to deposit: ");
        double deposit = sc.nextDouble();

        balance = balance + deposit;

        // Withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }

        // Check Balance
        System.out.println("\n----- Balance Details -----");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);

        sc.close();
    }
}
===== Bank Account Management System =====
Enter Account Holder Name: Ameena
Enter Account Number: 1234567890
Enter Initial Balance: 5000
Enter amount to deposit: 2000
Enter amount to withdraw: 1500

Withdrawal successful!

----- Balance Details -----
Account Holder: Ameena
Account Number: 1234567890
Current Balance: ₹5500.0
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Bank Account Management System =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        long accountNumber = sc.nextLong();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        // Deposit
        System.out.print("Enter amount to deposit: ");
        double deposit = sc.nextDouble();

        balance = balance + deposit;

        // Withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdraw = sc.nextDouble();

        if (withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }

        // Search Account
        System.out.print("\nEnter account number to search: ");
        long searchAccount = sc.nextLong();

        if (searchAccount == accountNumber) {

            System.out.println("\n----- Account Found -----");
            System.out.println("Account Holder: " + name);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Current Balance: ₹" + balance);

        } else {

            System.out.println("Account not found!");

        }

        sc.close();
    }
}
===== Bank Account Management System =====

Enter Account Holder Name: Ameena
Enter Account Number: 1234567890
Enter Initial Balance: 5000
Enter amount to deposit: 2000
Enter amount to withdraw: 1000
Withdrawal successful!

Enter account number to search: 1234567890

----- Account Found -----
Account Holder: Ameena
Account Number: 1234567890
Current Balance: ₹6000.0
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        long accountNumber = 0;
        double balance = 0;

        int choice;

        do {
            System.out.println("\n===== Bank Account Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    accountNumber = sc.nextLong();

                    System.out.print("Enter Initial Balance: ");
                    balance = sc.nextDouble();

                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();

                    balance = balance + deposit;

                    System.out.println("Money deposited successfully!");
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Current Balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("\n----- Balance Details -----");
                    System.out.println("Account Holder: " + name);
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 5:
                    System.out.print("Enter account number to search: ");
                    long searchAccount = sc.nextLong();

                    if (searchAccount == accountNumber) {
                        System.out.println("\n----- Account Found -----");
                        System.out.println("Account Holder: " + name);
                        System.out.println("Account Number: " + accountNumber);
                        System.out.println("Balance: ₹" + balance);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Bank Account Management System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
===== Bank Account Management System =====
1. Create Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. Search Account
6. Exit

Enter your choice: 1
Enter Account Holder Name: Ameena
Enter Account Number: 12345
Enter Initial Balance: 5000
Account created successfully!

Enter your choice: 2
Enter amount to deposit: 2000
Money deposited successfully!
Current Balance: ₹7000.0

Enter your choice: 4

----- Balance Details -----
Account Holder: Ameena
Account Number: 12345
Balance: ₹7000.0
public class BankAccount {

    String name;
    long accountNumber;
    double balance;

    BankAccount(String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Money deposited successfully!");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
javac BankAccount.java BankManagement.java
public class BankAccount {

    String name;
    long accountNumber;
    double balance;

    BankAccount(String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Money deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayAccount() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}
import java.util.Scanner;

public class BankManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = null;

        int choice;

        do {
            System.out.println("\n===== Bank Account Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Search Account");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Account Number: ");
                    long accountNumber = sc.nextLong();

                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();

                    account = new BankAccount(name, accountNumber, balance);

                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();

                        account.deposit(deposit);
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();

                        account.withdraw(withdraw);
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 4:
                    if (account != null) {
                        System.out.println("\n----- Account Details -----");
                        account.displayAccount();
                    } else {
                        System.out.println("Please create an account first!");
                    }
                    break;

                case 5:
                    if (account != null) {
                        System.out.print("Enter account number to search: ");
                        long searchAccount = sc.nextLong();

                        if (searchAccount == account.accountNumber) {
                            System.out.println("\n----- Account Found -----");
                            account.displayAccount();
                        } else {
                            System.out.println("Account not found!");
                        }
                    } else {
                        System.out.println("No account available!");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using Bank Account Management System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}