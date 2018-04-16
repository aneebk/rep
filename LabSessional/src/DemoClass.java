
public class DemoClass {

	public static void main(String[] args) {
		Broker b =new Broker();
		Broker b1 = new Broker();
		Broker b2 = new Broker();
		Account base = b.AccountType("BASE");
		Account golden = b1.AccountType("golden");
		Account premium = b2.AccountType("premium");
		
		//int balance = base.addbalance(100000);
		//base.withdraw_credit_limit(20000,10000);
		//golden.withdraw_credit_limit(10000,10000 );
		//premium.withdraw_credit_limit(1000000,10000 );
		
		

	}

}
