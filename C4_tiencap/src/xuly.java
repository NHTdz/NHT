import java.util.Scanner;
public class xuly {
	// N is residential customers
	// P is business customers
	final static float N_invoice = 4.5f;
	final static float N_service = 20.5f;
	final static float N_channel = 7.5f;
	final static float P_invoice = 15f;
	final static float P_service = 75f;
	final static float P_channel = 50f;
	final static float Padd_service = 5f;
	public xuly() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		information(scan);
		accountnumber(scan);
		int choose = choose(scan);
		int addChannel= addChannels(scan, choose);
		float calculateChannel= calculateChannel(choose, addChannel);
		float total = calculateAll(choose, calculateChannel);
		System.out.println("Your total bill is: "+ total);
	}
	public static void information(Scanner scan ) {
		System.out.print("Input your code: ");
		String code = scan.nextLine();
		System.out.println("Your code is:" + code);
	}
	public static void accountnumber(Scanner scan) {
		System.out.print("Input your account number: ");
		String number = scan.nextLine();
		System.out.println("Your account number is:" + number);
	}
	public static int choose(Scanner scan) {
		System.out.print("Input your choose: ");
		int choose = Integer.parseInt(scan.nextLine());
		System.out.println("Your choose is:" + choose);
		return choose;
	}
	public static int addChannels(Scanner scan,int choose) {
		int addChannel = 0;
		if(choose == 1) {
			System.out.print("Input the number of channel you want to buy: ");
			addChannel += Integer.parseInt(scan.nextLine());
		}else if(choose == 2) {
			System.out.print("Input the number of channel you want to buy add: ");
			addChannel += Integer.parseInt(scan.nextLine());
		}
		return addChannel;
	}
	public static float calculateChannel(int choose, int addChannel) {
		float calculateChannel =0;
		if(choose == 1) {
			calculateChannel += addChannel* N_channel;
		}else if(choose == 2) {
			calculateChannel += addChannel* Padd_service+ P_channel;
		}
		return calculateChannel;
	}
	public static float calculateAll(int choose, float calculateChannel) {
		float total =0;
		if(choose == 1) {
			total = N_invoice + N_service + calculateChannel;
		}else{
			total = P_invoice + P_service + calculateChannel;
		}
		return total;
	}
}
