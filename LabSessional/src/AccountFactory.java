public class AccountFactory 
{
	public Account CreateAccount(String AccountName)
	{
		if(AccountName == null)
		{
			System.out.println("Enter Bank Account Type");
		}
		else if(AccountName.equalsIgnoreCase("BASIC"))
		{
			return new Basic_Account();
		}
		else if(AccountName.equalsIgnoreCase("GOLD"))
		{
			return new Golden_Account();
		}
		else if(AccountName.equalsIgnoreCase("PREMIUM"))
		{
			return new Premium_Account();
		}
return null;
	}

}
