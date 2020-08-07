public class CardPayment {

	public int CardVerify(int card_no)
    {
        int cardno = card_no;
        int sum1 = 0;
        int temp1 = card_no;
        int verify;

      for (int i = 1; i < 8; i += 2){
         sum1 += temp1 % 10; 
         temp1 /= 100;   
         
      }

      int sum2 = 0;
      int temp2 = card_no / 10;
        
      for (int i = 1; i < 8; i += 2) {
         int digit = (temp2 % 10) * 2;   
         sum2 += digit % 10; 
         digit /= 10;
         sum2 += digit % 100;   
         temp2 /= 100;
      }
 
      int finalSum = sum1 + sum2;

      if (finalSum % 10 == 0)
      {
        System.out.println("The credit card number is valid.");
        verify = 1;
      }
         
      else  {
         System.out.println("The credit card number is not valid.");

         verify = 0;
      }

      return verify;
	}

	

    public void CardPayment(double charge_amount) 
    {
        double cost = charge_amount;
        
        System.out.println("Total Cost for Food Items: " + "RM" + cost);

	}



	

    

	
    
        
    
}