package pengambilan;

import java.util.Scanner;
import java.util.ArrayList;

public class mhsint {
	
	private static ArrayList<matkul> matkulDiambil = new ArrayList<>();

		public static void intermhs(int idmhs){
			
			boolean state2 = false;
			
			while(!state2) {
			System.out.println("Selamat datang," + Mahasigma.getmhs(idmhs) );
		     System.out.println("1.tampilkan mata kuliah");
		     System.out.println("2.pilih mata kuliah");
		     System.out.println("3.keluar");
		     
		     Scanner zoro = new Scanner(System.in);
				int intinfo = zoro.nextInt();

				if (intinfo == 1) {
			        for (matkul m : matkulDiambil) {
			            System.out.println("- " + m.getmtkNama() + " (Dosen: " + m.getmhs() + ")");
			        }
			    } else if (intinfo == 2) {
			        System.out.println("Pilih mata kuliah:");
			        for (int i = 0; i < generatematkul.listmatkul.size(); i++) {
			            System.out.println((i + 1) + ". " + generatematkul.listmatkul.get(i).getmtkNama());
			            
			        }
			        int pilih = zoro.nextInt();
	                if (pilih > 0 && pilih <= generatematkul.listmatkul.size()) {
	                	
	                    matkul dipilih = generatematkul.listmatkul.get(pilih - 1);

	                    matkulDiambil.add(dipilih);

	                    dipilih.addMahasiswa(Mahasigma.getmhs(idmhs));
			            System.out.println("Matkul berhasil diambil!");
			            
			        }
			    } else if(intinfo == 3) {
			    	state2 = true;
			    }
		 }
		 
		}
		
	}


