package Bank;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(String Name, String AcNo, double Balance) {
		super(Name, AcNo, Balance);
		
	}
	
	@Override
	public void AccountType() {
		System.out.println("Account : Savings Account");
	}

}
