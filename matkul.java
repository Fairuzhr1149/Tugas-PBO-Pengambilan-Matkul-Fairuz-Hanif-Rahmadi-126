package pengambilan;

import java.util.ArrayList;

public class matkul {

	private String nama;
	public dosen pengajar;
	private String jam;
	private int sks;
	public static ArrayList<Mahasigma> mahasiswa = new ArrayList();
	
	
	public matkul(String nama, dosen pengajar, String jam, int sks, ArrayList<Mahasigma> mahasiswa) {
		this.nama = nama;
		this.pengajar = pengajar;
		this.jam = jam;
		this.sks = sks;
		this.mahasiswa = mahasiswa;
	}
	
	
	
	
	
	ArrayList<matkul> contoh = new ArrayList();
	

	public String getmtkNama() {
        return nama;
    }
	
	
	public ArrayList<Mahasigma> getmhs(){
		return mahasiswa;
	}
	
	public void addMahasiswa(Mahasigma m) {
	    mahasiswa.add(m);
	}

	public void showMahasiswa() {
	    System.out.println("Mahasiswa yang mengambil " + nama + ":");
	    for (Mahasigma m : mahasiswa) {
	        System.out.println("- " + m.namamhs + " (" + m.nrp + ")");
	    }
	}
	

	
	
}
