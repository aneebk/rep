public class Broker 
{
	public Account AccountType(String AccountType)
	{
		AccountFactory af = new AccountFactory();
		if(AccountType == null)
		{
			System.out.println("Enter Bank Account Type");
		}
		else if(AccountType.equalsIgnoreCase("BASIC"))
		{
			Account basic = af.CreateAccount("BASE");
			System.out.println(basic.withdraw_credit_limit(10000, 1000));
			return basic;
		}
		else if(AccountType.equalsIgnoreCase("GOLD"))
		{
			Account golden = af.CreateAccount("GOLD");
			System.out.println(golden.withdraw_credit_limit(10000, 1000));
			return golden;
		}
		else if(AccountType.equalsIgnoreCase("PREMIUM"))
		{
			Account premium = af.CreateAccount("PREMIUM");
			System.out.println(premium.withdraw_credit_limit(10000, 1000));
			return premium;
		}
		
		
		return null;
		
	}

}
