import java.util.Scanner;

class Atm {
    float Balance = 0;
    int Pin = 2340;

    public void checkpin() {
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int entered_pin = sc.nextInt();
        if (entered_pin == Pin) {
            System.out.println("Pin is correct");
            menu();
        } else {
            System.out.println("Invalid pin");
        }
    }

    public void menu() {
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            checkbalance();
        } else if (choice == 2) {
            withdraw();
        } else if (choice == 3) {
            deposit();
        } else if (choice == 4) {
            return;
        } else {
            System.out.println("Invalid choice");
            menu();
        }
    }

    public void checkbalance() {
        System.out.println("Your balance is: " + Balance);
        menu();
    }

    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient balance");
        } else {
            Balance -= amount;
            System.out.println("Withdrawal successful");
        }
        menu();
    }

    public void deposit() {
        System.out.println("Enter the amount you want to deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance += amount;
        System.out.println("Deposit successful");
        menu();
    }
}

public class Atm_Center {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.checkpin();
    }
}