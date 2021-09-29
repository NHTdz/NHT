import java.util.Scanner;

public class Bigger {

	public Bigger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int d1;
		int d2;
		int bigger;
		System.out.println("Found bigger");
		Scanner in = new Scanner(System.in);
		System.out.print("Input d1:");
		d1 = Integer.parseInt(in.nextLine());
		System.out.print("Input d2:");
		d2 = Integer.parseInt(in.nextLine());
        if (d1>d2) {
        	bigger = d1;
        }
		else {
			bigger = d2;
		}
		System.out.println("The bigger is:" + bigger);
	}

}
