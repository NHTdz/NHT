import java.util.Scanner;

public class DiemTb {

	public static void main(String[] args) {
		System.out.println("Điểm trung bình");
		Scanner nhap = new Scanner(System.in);
		System.out.print("Vui lòng nhập số thứ nhất:");
		String st1 = nhap.nextLine();
		System.out.print("Vui lòng nhập số thứ hai:");
		String st2 = nhap.nextLine();
		System.out.print("Vui lòng nhập số thứ ba:");
		String st3 = nhap.nextLine();
		System.out.print("Vui lòng nhập số thứ tư:");
		String st4 = nhap.nextLine();
		System.out.print("Vui lòng nhập số thứ năm:");
		String st5 = nhap.nextLine();
		int a1 = Integer.parseInt(st1);
		int a2 = Integer.parseInt(st2);
		int a3 = Integer.parseInt(st3);
		int a4 = Integer.parseInt(st4);
		int a5 = Integer.parseInt(st5);
		float tong = a1 + a2 + a3 + a4 + a5;
		System.out.println("Trung bình cộng 5 số vừa nhập là" + tong/5);
		
		
		}

}
