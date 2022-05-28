package week3.Day1;

//week3 Day1 Assignment - 3
public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("This is Deposit method from Child Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		BankInfo ob= new BankInfo();
//		ob.deposit();

		AxisBank bankDetails = new AxisBank();
		bankDetails.saving();
		bankDetails.fixed();
		bankDetails.deposit();

	}

}
