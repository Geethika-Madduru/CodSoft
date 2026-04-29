import java.util.Scanner;

class BankAccount {

    double balance = 10000;

    void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit is Successful.");
        }
        else{
            System.out.println("Invalid Amount !");
        }
    }

    void withdraw(double amount){
        if(amount <= balance && amount > 0){
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance(){
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount user = new BankAccount();

        int choice;

        do{
            System.out.println("\nATM Menu");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice){

                case 1:
                    user.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    user.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();
                    user.withdraw(withdraw);
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        }while(choice != 4);

        sc.close();
    }
}