import java.util.Scanner;
public class xuly {
	final static int level1 = 50;
	final static int level2 = 100;
	final static int level3 = 200;	
	final static int level4 = 350;
	final static int about_level2 = 50;
	final static int about_level3 = 100;
	final static int about_level4 = 150;
	final static int price1 = 500;
	final static int price2 = 650;
	final static int price3 = 850;
	final static int price4 = 1100;
	final static int price5 = 1300;
	public xuly() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		name(scan);
		int Kw = numberKw(scan);
		System.out.println("Your Kw is: " + Kw);
		float total = calculate(Kw);
		System.out.print("Your total amount you have to pay is: "+ total);
	}
	public static String name(Scanner scan) {
		System.out.print("Input your name: ");
		String name = scan.nextLine();
		return name;
	}
	public static int numberKw(Scanner scan) {
		System.out.print("Input the numbers of kw: ");
		int Kw = Integer.parseInt(scan.nextLine());
		return Kw;
	}
	public static float calculate(int Kw) {
		float total = 0;
		if (Kw <level1) {
			total = Kw * price1;
		}else if (Kw <level2) {
			total = level1 *price1 + (Kw- level1)*price2;
		}else if (Kw <level3) {
			total = level1 *price1 + about_level2*price2 + (Kw- level2)*price3;
		}else if (Kw <level4) {
			total = level1 *price1 + about_level2*price2+ about_level3*price3 + (Kw- level3)*price4;
		}else {
			total = level1 *price1 + about_level2*price2+ about_level3*price3+about_level4*price4 + (Kw- level4)*price5;
		}
		return total;
	}
}
