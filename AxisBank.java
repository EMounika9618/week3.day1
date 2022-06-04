package week3.Day1;


public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("New Deposit");
}
	public static void main(String[] args) {
		AxisBank Ax= new AxisBank();
		Ax.deposit();
		Ax.saving();
		Ax.fixed();
	}
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("new fixed account");
	}
	public void saving() {
		// TODO Auto-generated method stub
		System.out.println("New Saving");
	}
}
