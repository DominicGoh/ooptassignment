import java.util.Scanner;

public class CashPayment {

	public CashPayment(double charge_amount) {
        double amount = charge_amount;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amount Customer Paid: ");
        double paid_amount = scanner.nextDouble();

        double balance = paid_amount - amount;

        System.out.println("The Balance is RM" + balance);
	}


    

}