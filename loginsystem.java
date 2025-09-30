package pengambilan;

import java.util.Scanner;

public class loginsystem {

	static boolean status;
	
	public static void login() {
		
		System.out.println("silahkan pilih status");
		System.out.println("1.Dosen");
		System.out.println("2.Mahasiswa");
	    Scanner stat = new Scanner(System.in);
	    int aaa = stat.nextInt();
		
		if(aaa == 1) {
			status = true;
		} else if(aaa == 2) {
			status = false;
		} else {
			System.out.println("invalid login");
		}
		
		if(status) {
			dosen.logscrdsn();
		} else if(!status) {
			Mahasigma.logscrmhs();
		}
		
		
		
	}
	
	
}
