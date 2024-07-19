import java.util.Scanner;;

public class AtmMachine 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int currentBalance = 20000;

        System.out.println("Welcome to the virtual ATM machine");
        System.out.println();

        System.out.println("Please choose your option");
        System.out.println("Enter 1 for withdraw the money \n" +"Enter 2 for deposit the money \n" +"Enter 3 for balance check");    //opption given to user
        int choice = input.nextInt();

        if(choice == 1) {
            System.out.println("You choose the Withdraw Option");                              //Withdraw opption
            System.out.println("Enter the withdraw amount");
            int wamount = input.nextInt();
            currentBalance = Withdraw(currentBalance, wamount);
        } else if(choice == 2) {
            System.out.println("You choose the Deposit Opption");                              //Deposit opption
            System.out.println("Enter the deposit amount");
            int damount = input.nextInt();
            currentBalance = deposit(currentBalance, damount);
        } else if(choice == 3) {
            System.out.println("You choose the Balance Check Opption");                         //Balance check opption
            System.out.println("Your current balance is Rs. "+currentBalance);
            currentBalance = checkBalance(currentBalance);
        } else {
            System.out.println("You chose a wrong opption, Transtion failed");                 //Transtion failed 
        }
    }

    public static int Withdraw(int currentBalance, int wamount)                                //withdraw() method
    {
        if(wamount <= currentBalance) {
            System.out.println("Withdraw of Rs. "+wamount+" successfull, Please collect your money and card");
            System.out.println();
            System.out.println("Your new balance is Rs. "+(currentBalance - wamount));
            checkBalance(currentBalance);
        } else {
            System.out.println("SORRY!! You have insufficient balance to withdraw");
        }
        return currentBalance;
    }
    
    public static int deposit(int currentBalance, int damount)                                   //deposit() method
    {   
        System.out.println("Deposit of Rs. "+damount+" is successfull");
        System.out.println();
        System.out.println("Your new balance is Rs. "+(currentBalance + damount)); 
        checkBalance(currentBalance);
        return currentBalance;
    }

    public static int checkBalance(int currentBalance)                                          //checkBalance() method
    {
        return currentBalance;
    }
}
