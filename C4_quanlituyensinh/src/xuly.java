import java.util.Scanner;
public class xuly {
	static final float area_A = 2.0f;
	static final float area_B = 1.0f;
	static final float area_C = 0.5f;
	static final float object_1 = 2.5f;
	static final float object_2 = 1.5f;
	static final float object_3 = 1.0f;
	private static final String A = null;
	private static final String B = null;
	private static final String C = null;
	public xuly() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float reference = referencePoint(scan);
		float yourPoint = yourPoint(scan);
		float area = area(scan);
		System.out.println("Your priority area point is: "+ area);
		float object = object(scan);
		System.out.println("Your priority object point is: "+ object);
		float sumyourPoint = sumyourPoint(yourPoint, area, object);
		System.out.println("Your total score is: "+sumyourPoint);
		compare(reference,sumyourPoint);
	}
	public static float referencePoint(Scanner scan) {
		System.out.print("Input reference point:");
		float reference = Float.parseFloat(scan.nextLine());
		return reference;
		
	}
	public static float yourPoint(Scanner scan) {
		System.out.print("Input your first subject score:");
		float yourFPoint = Float.parseFloat(scan.nextLine());
		System.out.print("Input your second subject score:");
		float yourSPoint = Float.parseFloat(scan.nextLine());
		System.out.print("Input your third subject score:");
		float yourTPoint = Float.parseFloat(scan.nextLine());
		if (yourFPoint == 0 || yourSPoint == 0 || yourTPoint == 0) {
			System.out.println("You failed because you got 0");
			System. exit(0);
		}
		float yourPoint = yourFPoint + yourSPoint + yourTPoint;
		return yourPoint;
	}
	public static float area(Scanner scan) {
		float priorityPoint = 0;
		String priority_area;
		System.out.println("\tPriority area");
		System.out.println("A:"+area_A+"\tB:"+area_B+"\tC:"+area_C+"\tX:none");
		System.out.print("Input your priority area:");
	    priority_area = scan.nextLine();
		if (priority_area.equals("A")) {
			priorityPoint += area_A;
		}else if (priority_area.equals("B")) {
			priorityPoint += area_B;
		}else if (priority_area.equals("C")) {
			priorityPoint += area_C;
		}
		return priorityPoint;
	}
	public static float object(Scanner scan) {
		float priority_Opoint = 0;
		System.out.println("\tPriority object");
		System.out.println("1:"+object_1+"\t2:"+object_2+"\t3:"+object_3+"\t0:none");
		System.out.print("Input your priority object:");
		int priority_object = Integer.parseInt(scan.nextLine());
		if (priority_object == 1) {
			priority_Opoint += object_1;
		}else if (priority_object == 2) {
			priority_Opoint += object_2;
		}else if (priority_object == 3) {
			priority_Opoint += object_3;
		}
		return priority_Opoint;
	}
	public static float sumyourPoint(float yourPoint, float area, float object) {
		float sumyourPoint = yourPoint + area + object;
		return sumyourPoint;
	}
	public static void compare(float referencePoint, float sumyourPoint ) {
		if (referencePoint <= sumyourPoint) {
			System.out.println("Congrats,You passed!");
		}else {
			System.out.println("You failed!");
		}
		
	}
}
