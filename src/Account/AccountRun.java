package Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountRun {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Account account = new Account();

        System.out.printf("\nEnter account number: ");
        int number = scan.nextInt();

        System.out.printf("Enter account holder: ");
        scan.nextLine();
        String holder = scan.nextLine();

        System.out.printf("Is there an initial deposit (y/n)? ");
        char response = scan.next().charAt(0);

        if (response == 'y') {
            System.out.printf("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }

        System.out.printf("\nAccount data: \n");

        System.out.println(account);

        System.out.printf("\nEnter a deposit value: ");
        double depositValue = scan.nextDouble();
        account.deposit(depositValue);

        System.out.printf("Updated account data: \n");
        System.out.println(account);

        System.out.printf("\nEnter a withdraw value: ");
        double withdrawValue = scan.nextDouble();
        account.withdraw(withdrawValue);

        System.out.printf("Updated account data: \n");
        System.out.println(account);

        scan.close();

    }

}
