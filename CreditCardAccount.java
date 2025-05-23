public class CreditCardAccount {
	private String customerName;
	private double creditLimit;
	private double currentDebt;
	private double interestRate;
   	public CreditCardAccount(String customerName,double creditLimit,double currentDebt ,double interestRate){
		this.customerName=customerName;
		this.creditLimit=creditLimit;
		this.interestRate=interestRate;
		this.currentDebt=currentDebt;
		System.out.println( "Credit Card Created Successfully" );
	}
   		
	public String getCustomerName() {
		return this.customerName;
	}
	public double getCreditLimit() {
		return this.creditLimit;
	}
	public double getCurrentDebt() {
		return this.currentDebt;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	public  void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	public  void setCreditLimit(double creditLimit) {
		this.creditLimit=creditLimit;
	}
	public  void setCurrentDebt(double  currentDebt) {
		this. currentDebt= currentDebt;
	}
	public  void setInterestRate(double interestRate) {
		this.interestRate=interestRate;
	}
	
	public void swipeCard(double amount) {
		if(amount>this.getCreditLimit()) {
			System.out.println( "Transaction declined:Limit exceeded");
		}
		else {
			this.currentDebt+=amount;
			System.out.println("Credit Card Swipped SuccessFully at Current Credi Card debt is:"+this.currentDebt);
		}
	}
	
	public void makePayement(double amount) {
		
		if(amount>this.getCurrentDebt()) {
			System.out.println("Excess payment not allowed.");
		}
		else {
			this.currentDebt-=amount;
			System.out.println("You are succesfully paying credicard debt and remaning balance:"+this.currentDebt);
		}
	}
	
	public void applyInterest() {
		currentDebt=currentDebt+(currentDebt*(intrestRate/100));
		System.out.println("Current Debt with intrest is:"+currentDebt);
		}
		
	}
	public static void main(String[] args) {
		CreditCardAccount creditCA = new CreditCardAccount("Bhumi",10000,1000,2);
		creditCA.applyInterest();
	}

}