import java.util.Scanner;

public class USDtoVND {

	public USDtoVND() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Đổi tiền");
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui lòng nhập số USD quy đổi:");
		int USD = Integer.parseInt(scan.nextLine());
		int VND = (USD * 23500);
		System.out.print("Số tiền quy đổi là:" + VND);
		

	}

}
