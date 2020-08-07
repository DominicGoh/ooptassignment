import java.util.Scanner;

public class PaymentMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int payType;
        double charge_amount = 100;
        String payment_id;

        do {
            System.out.println("(0) Card Payment (1) Cash Payment");
            System.out.print("Enter Customer Payment Type: ");
            payType = scanner.nextInt();

            if (payType == 0) {
                
                int verification;

                do {

                    System.out.print("Enter Card Number: ");
                    int card_no = scanner.nextInt();
                    CardPayment cardV = new CardPayment();

                    verification = cardV.CardVerify(card_no);


                } while (verification == 0);

                CardPayment cardP = new CardPayment();
                

                cardP.CardPayment(charge_amount);

                System.out.print("You did it!");
                
            }

            else if(payType == 1)
            {

                CashPayment cash = new CashPayment(charge_amount);

            }

        } while (payType > 1);
    }

}