package pengambilan;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahasigma {

	public String namamhs;
	public String nrp;
	private String passmhs;
	
	public Mahasigma(String namamhs, String nrp, String passmhs) {
		this.namamhs = namamhs;
		this.nrp = nrp;
		this.passmhs = passmhs;
	}
	
	public static ArrayList<Mahasigma> mhs = new ArrayList<>();
	ArrayList <matkul> jadwal = new ArrayList <matkul>();
	static Scanner scan = new Scanner(System.in);
	
	public static void logscrmhs() {
        System.out.println("1. login");
        System.out.println("2. sign up");
        int loginmhs = scan.nextInt();
        scan.nextLine(); 

        if (loginmhs == 1) {
            loginmhs();
        } else if (loginmhs == 2) {
            createmhs();
        }
    }

    public static void loginmhs() {
        System.out.print("username: ");
        String usermhs = scan.nextLine();

        for (int i = 0; i < mhs.size(); i++) {
            Mahasigma current = mhs.get(i);
            if (current.namamhs.equals(usermhs)) {
                System.out.print("password: ");
                String logpass = scan.nextLine();

                if (logpass.equals(current.passmhs)) {
                    System.out.println("login berhasil!");
                    mhsint.intermhs(i);
                } else {
                    System.out.println("password salah!");
                }
                return;
            }
        }
        System.out.println("username tidak ditemukan!");
    }

    public static void createmhs() {
        System.out.print("username baru: ");
        String newusermhs = scan.nextLine();

        for (Mahasigma d : mhs) {
            if (d.mhs.equals(newusermhs)) {
                System.out.println("username sudah ada!");
                return;
            }
        }

        System.out.print("password baru: ");
        String newpassmhs = scan.nextLine();

        System.out.print("nrp baru: ");
        String newnrp = scan.nextLine();

        mhs.add(new Mahasigma(newusermhs, newnrp, newpassmhs));
        System.out.println("akun berhasil dibuat!");
        
        loginmhs();
    }
    
    public static Mahasigma getmhs(int index) {
        return mhs.get(index);
    }
	
	
}
