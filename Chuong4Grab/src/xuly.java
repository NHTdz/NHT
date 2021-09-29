import java.util.Scanner;
public class xuly {
	//C: Grabcar, S: Grabsuv, B: Grabblack
	static final int C_1KM = 8000;
	static final int S_1KM = 9000;
	static final int B_1KM = 10000;
	static final int C_1to19= 7500;
	static final int S_1to19 = 8500;
	static final int B_1to19 = 9500;
	static final int C_19Upper = 7000;
	static final int S_19Upper = 8000;
	static final int B_19Upper = 9000;
	static final int C_Wait = 2000;
	static final int S_Wait = 3000;
	static final int B_Wait = 3500;
	public xuly() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int chooseGrab= chooseGrab(scan);
		float soKm = inputKm(scan);
		int waitingTime = inputWaitingtime(scan);
		float total =  total_Payment(soKm,chooseGrab,waitingTime);
		System.out.println(total);

	}
	public static int inputWaitingtime(Scanner scan) {
		System.out.println("Input the waiting time:");
		int waitingTime = Integer.parseInt(scan.nextLine());
		return waitingTime;
	}
	public static float inputKm(Scanner scan) {
	System.out.println("Input the numbers of km traveled:");
	float soKm = Float.parseFloat(scan.nextLine());
	return soKm;
	}
	public static int chooseGrab(Scanner scan) {
		int loai;
		System.out.println("What kind of grab do you choose?: ");
		System.out.println("1. Grab Car ");
		System.out.println("2. Grab SUV ");
		System.out.println("3. Grab Black ");
		loai = Integer.parseInt(scan.nextLine());
		return loai;
	}
	public static float bill_1KM_lowwer(int chooseGrab) {
		float Tien;
		if (chooseGrab == 1) {
			Tien = C_1KM;	
		}else if (chooseGrab == 2) {
			Tien = S_1KM;
		}else {
			Tien = B_1KM;
		}
		return Tien;
	}
	public static float bill_1to19Km(int chooseGrab, float soKm) {
		float Tien;
		if (chooseGrab == 1) {
			Tien = C_1KM + (soKm - 1)*C_1to19;	
		}else if (chooseGrab == 2) {
			Tien = S_1KM + (soKm - 1)*S_1to19;
		}else {
			Tien = B_1KM + (soKm - 1)*B_1to19;
		}
		return Tien;
	}
	public static float bill_19Km_upper(int chooseGrab, float soKm) {
		float Tien;
		if (chooseGrab == 1) {
			Tien = C_1KM + 18*C_1to19 + (soKm - 19)*C_19Upper;	
		}else if (chooseGrab == 2) {
			Tien = S_1KM + 18*S_1to19 + (soKm - 19)*S_19Upper;
		}else {
			Tien = B_1KM + 18*B_1to19 + (soKm - 19)*B_19Upper;
		}
		return Tien;
	}
	public static float bill_Wait(int chooseGrab, int waitingTime) {
		float Tien = 0;
		if (waitingTime >=3) {
			int N_waitingTime = Math.round((waitingTime*1.0f)/3);
			if (chooseGrab == 1) {
				Tien = N_waitingTime* C_Wait;
			}else if (chooseGrab == 2) {
				Tien = N_waitingTime* S_Wait;
			}else {
				Tien = N_waitingTime*B_Wait;
			}
		}
		return Tien;
	

	}
	public static float total_Payment(float soKm, int chooseGrab, int waitingTime) {
		float total= 0;
		if (soKm <=1) {
			total = bill_1KM_lowwer(chooseGrab) +  bill_Wait(chooseGrab,waitingTime);	
		}else if (soKm >1 && soKm <=19) {
			total = bill_1to19Km(chooseGrab, soKm) + bill_Wait(chooseGrab, waitingTime);
		}else if (soKm >19) {
			total = bill_19Km_upper(chooseGrab, soKm) + bill_Wait(chooseGrab, waitingTime);
		}
		return total;
	}
}
