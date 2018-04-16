
public class Basic_Account implements Account
{
	@Override
	public int withdraw_credit_limit(int balance,int withdraw_amount)
	{
		
		if (withdraw_amount <= balance && withdraw_amount <= balance && withdraw_amount > 0 )
		{
			balance = balance - withdraw_amount;
			System.out.println("Successfully transfer :"+withdraw_amount+"Pkr\nRemaining Balance = "+balance);
			return balance;
		}
		
		else
		{
			System.out.println("You cannot exceed your Balance");
		}
		return 0;
		
	}
	
	
	public int addbalance(int b)
	{
		
		
		return b;
		
	}
	



}
