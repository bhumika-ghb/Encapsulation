public class FixedDepositAccount{
	private String customerName;
	private double principalAmount;
	private double interestRate;
	private int duration;
	private double maturityAmount;
	public FixedDepositAccount(String customerName,double principalAmount,double interestRate,int duration,double maturityAmount){
		this.customerName=customerName;
		this.principalAmount=principalAmount;
		this.interestRate=interestRate;
		this.duration=duration;
		this.maturityAmount=maturityAmount;
		System.out.println("Fixed Amount Deposited Successfully");
	}
	public String getcustomerName(){
		return customerName;
	}
	public double getprincipalAmount(){
		return principalAmount;
	}
	public double getinterestRate(){
		return interestRate;
	}
	public int getduration(){
		return duration;
	}
	public double getmaturityAmount(){
		return maturityAmount;
	}
	public void setcustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setprincipalAmount(double principalAmount){
		this.principalAmount=principalAmount;
	}
	public void setinterestRate(double interestRate){
		this.interestRate=interestRate;
	}
	public void setduration(int duration){
		this.duration=duration;
	}
	public void setmaturityAmount(double maturityAmount){
		this.maturityAmount=maturityAmount;
	}
	public double calculateMaturityAmount(){
		return principalAmount*Math.pow(1+(interestRate/100), duration);
	}
	public void withdrawBeforeMaturity(int withdraw){
		if(withdraw<12){
			System.out.println("cannot before with draw one year");
		}else if(withdraw<this.duration*12){
			double penality=this.principalAmount*12;
			double withdrawAmount = this.principalAmount - penality;
		        System.out.println("Withdrawal before maturity with 2% penalty applied.");
		        System.out.println("Amount after penalty: " + Math.round(withdrawAmount * 100.0) / 100.0);
		    }
		  else {
			  System.out.println("You are withdrawing after maturity go and collect it");
		  }
		
	}
	public static void main(String[] args) {
		FixedDepositAccount f = new FixedDepositAccount("Bhumi",50000,8,3,0);
		System.out.println(f.calculateMaturityAmount());
		f.withdrawBeforeMaturity(3);

	}

}
		
