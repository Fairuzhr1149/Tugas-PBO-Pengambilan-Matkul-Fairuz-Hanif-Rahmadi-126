import java.util.Scanner;


public class dsnint  {

	public static void interdsn(int iddsn){
		
		boolean state = false;
		
		while(!state) {
		
		dosen d = dosen.getdosen(iddsn);

		
		System.out.println("Selamat datang," + dosen.getdosen(iddsn) );
	     System.out.println("1.tampilkan mata kuliah");
	     System.out.println("2.keluar");
	     
	     Scanner zoro = new Scanner(System.in);
			int intinfo = zoro.nextInt();

			if (intinfo == 1) {
		        for (matkul m : generatematkul.listmatkul) {
		            if (m.pengajar == d) {
		                System.out.println("Mata kuliah: " + m.getmtkNama());
		                m.showMahasiswa();
		            }
		        }
		    } else if(intinfo == 2) {
		    	state = true;
		    }
	     
	 }
	 
	}
	
}
