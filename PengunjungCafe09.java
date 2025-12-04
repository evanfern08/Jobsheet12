public class PengunjungCafe09 {
    public static void main(String[] args) {
        daftarPengunjung("Ali","Budi","Citra");
        daftarPengunjung( "Andi");
        daftarPengunjung("Doni","Eti","Fahmi","Galih");
    }

    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung: ");
        
    //menggunakan for-each Loop
    for (String nama : namaPengunjung) {
         System.out.println("-" + nama);
        }
    }
}
