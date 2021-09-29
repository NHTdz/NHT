import java.util.Scanner;

public class CreditCard {

	public CreditCard() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Credit calculation");
		final float penaltiPercent = 1.5f/100;
		float creditCardbalance;
		float payment;
		float balance;
		float penalti = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Please input credit card balance:");
		creditCardbalance = Float.parseFloat(in.nextLine());
		System.out.print("Input the amount you pay:");
		payment = Float.parseFloat(in.nextLine());
		balance = creditCardbalance - payment;
		if (balance>0)
		{	penalti = balance* penaltiPercent;
		}
		
		System.out.print("The penalti will be paid is:" + penalti);
	}

}
