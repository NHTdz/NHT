import java.util.Scanner;

public class Trongcay {

	public Trongcay() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Trồng cây xanh");
		final float Pi = 3.14f;
		Scanner nhap = new Scanner(System.in);
		System.out.print("Chiều dài sân:");
		int CD = Integer.parseInt(nhap.nextLine());
		System.out.print("Chiều rộng sân:");
		int CR = Integer.parseInt(nhap.nextLine());
		System.out.print("Không gian cần thiết giữa 2 cây:");
		int space = Integer.parseInt(nhap.nextLine());
		int count1 = (CD - space/2)/ space +1;
		int count2 = (CR - space/2)/ space +1;
		int tong = count1*count2;
		System.out.println("Tổng số cây trồng được là:" + tong);
		float sTancay = tong * (space/2 )*(space/2 )* Pi;
		System.out.print("Không gian sé chiếm khi cây phát triển đầy đủ là:" + sTancay);
		
		
		

	}

}
