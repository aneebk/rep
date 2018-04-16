public class Premium_Account implements Account
{
	int loan = 100000;
	@Override
	public int withdraw_credit_limit(int balance,int withdraw_amount)
	{
		
		if (withdraw_amount <= balance && withdraw_amount <= balance && withdraw_amount > 0 )
		{
			balance = balance - withdraw_amount;
			System.out.println("Successfully transfer :"+withdraw_amount+"$\nRemaining Balance = "+balance);
			return balance;
		}
		else if(withdraw_amount > balance && withdraw_amount <= (balance + loan))
		{
			int total = balance + loan;
			int loan_amount = withdraw_amount - balance;
			setloan(total - withdraw_amount);
			System.out.println("You have withdrawn "+withdraw_amount+"pkr and your loan amount is: "+loan_amount+"$\nRemaining Credit for loan is :"+getloan());
			return 0;
		
		}
		else
		{
			System.out.println("You cannot exceed your Premium account limit of 100000pkr");
		}
		return 0;
		
	}
	public int addbalance(int b)
	{
		
		
		return b;
		
	}

	public void setloan(int a)
	{
		loan = a;
	}
	public int getloan()
	{
		return loan;
	}

}
