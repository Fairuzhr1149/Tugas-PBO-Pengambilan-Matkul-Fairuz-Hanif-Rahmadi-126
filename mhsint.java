import java.util.Scanner;

public class mhsint {

    public static void intermhs(int idmhs){
        Mahasigma current = Mahasigma.getmhs(idmhs);

        boolean state2 = false;
        Scanner zoro = new Scanner(System.in);

        while(!state2) {
            System.out.println("Selamat datang, " + current);
            System.out.println("1. tampilkan mata kuliah yang sudah diambil");
            System.out.println("2. pilih mata kuliah baru");
            System.out.println("3. keluar");

            int intinfo = zoro.nextInt();

            if (intinfo == 1) {
                for (matkul m : current.jadwal) {
                    System.out.println("- " + m.getmtkNama() + " (Dosen: " + m.pengajar.namadosen + ")");
                }
            } else if (intinfo == 2) {
                System.out.println("Pilih mata kuliah:");
                for (int i = 0; i < generatematkul.listmatkul.size(); i++) {
                    System.out.println((i + 1) + ". " + generatematkul.listmatkul.get(i).getmtkNama());
                }
                int pilih = zoro.nextInt();
                if (pilih > 0 && pilih <= generatematkul.listmatkul.size()) {
                    matkul dipilih = generatematkul.listmatkul.get(pilih - 1);
                    current.jadwal.add(dipilih);
                    dipilih.addMahasiswa(current);
                    System.out.println("Matkul berhasil diambil!");
                }
            } else if (intinfo == 3) {
                state2 = true;
            }
        }
    }
}
