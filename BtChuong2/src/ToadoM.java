import java.util.Scanner;

public class ToadoM {

	public ToadoM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Xác đinh điểm M trong hay ngoài đường tròn");
		Scanner vao = new Scanner(System.in);
		System.out.print("Nhập hoành độ tâm C(x) :");
		int xo = Integer.parseInt(vao.nextLine());
		System.out.print("Nhập tung độ tâm C(y) :");
		int yo = Integer.parseInt(vao.nextLine());
		System.out.print("Nhập bán kính C(r) :");
		int r = Integer.parseInt(vao.nextLine());
		System.out.print("Nhập hoành độ điểm M(x) :");
		int x = Integer.parseInt(vao.nextLine());
		System.out.print("Nhập tung độ điểm M(y) :");
		int y = Integer.parseInt(vao.nextLine());
		int OM = (xo + x)*(xo + x) + (yo +y)*(yo +y);
		if ( OM < r*r ) {
			System.out.println("Điểm M nằm trong đường tròn C");
		} else if (OM == r*r) {
			System.out.println("Điểm M nằm trên đường tròn C");
		} else if (OM> r*r) {
			System.out.println("Điểm M nằm ngoài đường tròn C");
		}

	}

}
