import java.util.ArrayList;

public class generatematkul {
		
		public static ArrayList<matkul> listmatkul = new ArrayList<matkul>();
		
		
		 public static void generate() {
		        listmatkul.add(new matkul("Algoritma", dosen.getdosen(0), "Senin 08.00", 3, new ArrayList<>()));
		        listmatkul.add(new matkul("Struktur Data", dosen.getdosen(1), "Selasa 10.00", 3, new ArrayList<>()));
		        listmatkul.add(new matkul("Basis Data", dosen.getdosen(2), "Rabu 13.00", 3, new ArrayList<>()));
		    }
		
	}
	
	

