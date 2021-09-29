import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class xuly {
	static final int constant = 4;
	static final float dependent_constant = 1.6f;
	static final int level1 = 60;
	static final int level2 = 120;
	static final int level3 = 210;
	static final int level4 = 384;
	static final int level5 = 624;
	static final int level6 = 960;
	static final int about_level2 =level2 - level1;
	static final int about_level3 =level3 - level2;
	static final int about_level4 =level4 - level3;
	static final int about_level5 =level5 - level4;
	static final int about_level6 =level6 - level5;
	static final float tax_level1 = 5/100f;
	static final float tax_level2 = 10/100f;
	static final float tax_level3 = 15/100f;
	static final float tax_level4 = 20/100f;
	static final float tax_level5 = 25/100f;
	static final float tax_level6 = 30/100f;
	static final float tax_level7 = 35/100f;
	
	public xuly() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		name(scan);
		float income = Income(scan);
		int dependents = dependents(scan);
		float incometaxes = incomeTaxes(income, dependents);
		System.out.println("Your total taxable amount is(triệu đồng): " + incometaxes);
		float personal = personalIncometaxe(incometaxes);
		System.out.println("Your total personal income tax is(triệu đồng): "+ personal);
	}
	public static String name(Scanner scan) {
		System.out.print("Input your name:");
		String name = scan.nextLine();
		return name;
	}
	public static float Income(Scanner scan) {
		System.out.print("Input your personal income(triệu đồng): ");
		float income = Float.parseFloat(scan.nextLine());
		return income;
	}
	public static int dependents(Scanner scan) {
		System.out.print("Input the number of dependents: ");
		int dependents = Integer.parseInt(scan.nextLine());
		return dependents;
	}
	public static float incomeTaxes(float income,int dependents) {
		float incometaxes = income - constant - dependents* dependent_constant;
		return incometaxes;
	}
	public static float personalIncometaxe(float incometaxes) {
		float personal = 0;
		if (incometaxes < level1) {
			personal = incometaxes * tax_level1;
		}else if (incometaxes < level2) {
			personal = level1*tax_level1 + (incometaxes - level1)*tax_level2;  
		}else if (incometaxes < level3) {
			personal = level1*tax_level1 +about_level2*tax_level2 + (incometaxes - level2)*tax_level3; 
		}else if (incometaxes < level4) {
			personal = level1*tax_level1 +about_level2*tax_level2+ about_level3*tax_level3 + (incometaxes - level3)*tax_level4;
		}else if (incometaxes < level5) {
			personal = level1*tax_level1 +about_level2*tax_level2+ about_level3*tax_level3 +about_level4*tax_level4 + (incometaxes - level4)*tax_level5;
		}else if (incometaxes < level6) {
			personal = level1*tax_level1 +about_level2*tax_level2+ about_level3*tax_level3 +about_level4*tax_level4+ about_level5*tax_level5 + (incometaxes - level5)*tax_level6;
		}else if (incometaxes > level6) {
			personal = level1*tax_level1 +about_level2*tax_level2+ about_level3*tax_level3 +about_level4*tax_level4+ about_level5*tax_level5+ about_level6*tax_level6 + (incometaxes - level6)*tax_level7;
		}
		return personal;
	}
}
