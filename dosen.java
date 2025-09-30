import java.util.Scanner;
import java.util.ArrayList;

public class dosen  {
    public String namadosen;
    public String notelp;
    private String passdsn;

    public dosen(String namadosen, String notelp, String passdsn) {
        this.namadosen = namadosen;
        this.notelp = notelp;
        this.passdsn = passdsn;
    }

    public static ArrayList<dosen> dsn = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void generate() {
        dsn.add(new dosen("Pak_Ahmad", "8155519041", "dosen1"));
        dsn.add(new dosen("Pak_Budi", "8155519042", "dosen2"));
        dsn.add(new dosen("Pak_Cahyo", "8155519043", "dosen3"));
        dsn.add(new dosen("Bu_Dina", "8155519044", "dosen4"));
        dsn.add(new dosen("Bu_Endang", "8155519045", "dosen5"));
    }

    public static void logscrdsn() {
        System.out.println("1. login");
        System.out.println("2. sign up");
        int loginfo = sc.nextInt();
        sc.nextLine(); 

        if (loginfo == 1) {
            logindsn();
        } else if (loginfo == 2) {
            createdsn();
        }
    }

    public static void logindsn() {
        System.out.print("username: ");
        String userdsn = sc.nextLine();

        for (int i = 0; i < dsn.size(); i++) {
            dosen current = dsn.get(i);
            if (current.namadosen.equals(userdsn)) {
                System.out.print("password: ");
                String logpass = sc.nextLine();

                if (logpass.equals(current.passdsn)) {
                    System.out.println("login berhasil!");
                    dsnint.interdsn(i);
                } else {
                    System.out.println("password salah!");
                }
                return;
            }
        }
        System.out.println("username tidak ditemukan!");
    }

    public static void createdsn() {
        System.out.print("username baru: ");
        String newuserdsn = sc.nextLine();

        for (dosen d : dsn) {
            if (d.namadosen.equals(newuserdsn)) {
                System.out.println("username sudah ada!");
                return;
            }
        }

        System.out.print("password baru: ");
        String newpassdsn = sc.nextLine();

        System.out.print("nomor telp baru: ");
        String newtelpdsn = sc.nextLine();

        dsn.add(new dosen(newuserdsn, newtelpdsn, newpassdsn));
        System.out.println("akun berhasil dibuat!");
        
        logindsn();
    }

    public static dosen getdosen(int index) {
        return dsn.get(index);
    }

    public static ArrayList<dosen> getAllDosen() {
        return dsn;
    }
}
