public class LoanApplication{
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outstandingBalance;
	public LoanApplication(String customerName,double loanAmount,double interestRate,int loanTerm,double outstandingBalance){
		this.customerName=customerName;
		this.loanAmount=loanAmount;
		this.interestRate=interestRate;
		this.loanTerm=loanTerm;
		this.outstandingBalance=outstandingBalance;
		System.out.println("Application submitted Successfully");
	}
	public String getcustomerName(){
		return customerName;
	}
	public double loanAmount(){
		return loanAmount;
	}
	public double interestRate(){
		return interestRate;
	}
	public int loanTerm(){
		return loanTerm;
	}
	public double outstandingBalance(){
		return outstandingBalance;
	}
	public void setcustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setloanAmount(double loanAmount){
		this.loanAmount=loanAmount;
	}
	public void setinterestRate(double interestRate){
		this.interestRate=interestRate;
	}
	public void setloanTerm(int loanTerm){
		this.loanTerm=loanTerm;
	}
	public void setoutstandingBalance(double outstandingBalance){
		this.outstandingBalance=outstandingBalance;
	}
	public void makepayment(double amount){
		if(amount<=0){
			System.out.println("Inavalid payment");
		}else if(amount>=outstandingBalance){
			System.out.println("Payment exceeds amount balance");
		}else{
		        loanAmount=outstandingBalance-amount;
			System.out.println("Successfully deducted:"+loanAmount);
		}
	}
	public double calculateEMI(){
		double monthlyRate = interestRate / (12 * 100);
		int totalMonths = loanTerm * 12;
		double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, totalMonths))/(Math.pow(1 + monthlyRate, totalMonths) - 1);				return emi;
	}
	public void displayLoanDetails(){
		System.out.println("Loan Amount:"+loanAmount);
		System.out.println("Interest Rate:"+interestRate);
		System.out.println("EMI:"+calculateEMI());
		outstandingBalance+=calculateEMI();
		System.out.println("Remaining balance:"+outstandingBalance);
	}
	public static void main(String[] args){
		LoanApplication loanapplication=new LoanApplication("Bhumi",3000.0,1.0,2,30.0);
		loanapplication.displayLoanDetails();
	}
}
		
		