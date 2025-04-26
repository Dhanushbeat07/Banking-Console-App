package Bank;

public abstract class BankAccount {
	
   protected String Name;
   protected String AcNo;
   protected double Balance;
   
   public BankAccount(String Name,String AcNo,double Balance) {
	   this.Name = Name;
	   this.AcNo = AcNo;
	   this.Balance = Balance;
	   
	   
   }
   
   public void deposit(double Amount) {
	   Balance =+ Amount;
	   System.out.println("The amount is credited sccessfully");
   }
   
	public void withdraw(double Amount) {
		if(Amount>Balance) {
			System.out.println("Insufficient fund");
		}else {
			Balance-=Amount;
			System.out.println("Amount "+Amount+" withdrawn successfully");
		}
	}
	
	public void displayinfo() {
		System.out.println("Account Holder name : "+ Name);
		System.out.println("Account Number : "+ AcNo);
		System.out.println("Balance Amt : "+ Balance);
	}
	
	public abstract void AccountType();

}
