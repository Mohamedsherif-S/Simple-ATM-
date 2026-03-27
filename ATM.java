//Mohamed sherif Ahmed


import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double Balance = 0.0;
        int PIN = 123;
        int PINAttempts = 3;
        int PINInput;

        boolean loggedIn = false;

// PIN Attempts for more security
        while (PINAttempts > 0) {

            System.out.println("Enter Your PIN");
            PINInput = input.nextInt();

            if (PINInput == PIN) {
                loggedIn = true;
                System.out.println("Welcome");
                break;

            } else {
                System.out.println("Wrong PIN !,Please try again");
                PINAttempts--;

                if (PINAttempts == 0) {
                    System.out.println("No Attempts Left,The Program Will Exit");
                    input.close();
                    return;
                }
            }
        }
        int choice;
        do {

            System.out.println("ATM Menu");
            System.out.println("1 Check Balance");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Change PIN");
            System.out.println("5 exit");
            System.out.println("Choose Option ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Current Balance is " + Balance);
                    break;
                case 2:
                    System.out.println("Enter amount to Deposit");
                    double deposit = input.nextInt();
                    if (deposit > 0) {
                        Balance += deposit;
                        System.out.println("Deposit Successful.The current Balance is :" + Balance);
                    } else {
                        System.out.println("Invalid amount to Deposit!");
                    }

                    break;
                case 3:
                    System.out.println("Enter amount to Withdraw");
                    double withdraw = input.nextInt();
                    if (withdraw <= Balance && withdraw > 0) {
                        Balance -= withdraw;
                        System.out.println("Withdraw Successful.The current Balance is :" + Balance);
                    } else {
                        System.out.println("Invalid amount to Withdraw");
                    }
                    break;
                case 4:
                    System.out.print("Enter current PIN to change it: ");
                    int currentPin = input.nextInt();
                    if (currentPin == PIN) {
                        System.out.print("Enter new PIN: ");
                        int newPin = input.nextInt();
                        PIN = newPin;
                        System.out.println("PIN changed successfully!");
                    } else {
                        System.out.println("Incorrect current PIN!");
                    }
                    break;

                case 5:
                    System.out.println("thank u for using our ATM");
                    break;
                default:
                System.out.println("Invalid option");
            }}

            while (choice != 5);
                input.close();


        }

    }
