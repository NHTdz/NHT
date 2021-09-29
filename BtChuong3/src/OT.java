import java.util.Scanner;

public class OT {

	public OT() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Calculate OT");
		final int time = 40;
		final float add = 1.5f;
		float hours; 
		float rate;
		float payment;
		Scanner in = new Scanner(System.in);
		System.out.print("Input the hours you work:");
		hours = Float.parseFloat(in.nextLine());
		System.out.print("Input the price per hour:");
		rate = Float.parseFloat(in.nextLine());
		if (hours >40) {
			payment = time*rate + (hours -time)*add*rate;
		}
		else {
			payment = hours * rate;
		}
		System.out.print("The payment is:" + payment);
		
		

	}

}
