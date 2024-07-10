package exceptionsPro;

public class MinimumBalanceExc {

	public static void main(String[] args) throws InterruptedException {
		
		int bal = 6000;
		int withdraw = 4600;
		
		Thread.sleep(1000);
		
		int min_bal = 3500;
		int final_bal = bal - withdraw;
		if(final_bal < min_bal)
		{
			throw new ArithmeticException("Transaction Unsuccessful.\n"
					+ "You can withdraw maximum "+ (bal - min_bal));
		}
		else
		{
			System.out.println("Transaction Successful.\n"
					+ "Balance is: "+ final_bal);
		}

	}

}
