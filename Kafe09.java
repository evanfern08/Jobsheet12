import java.util.Scanner;
public class Kafe09 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian! ");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan");
    }

    public static void main(String[] args) {
        // panggil menu
        String kodePromo = "DISKON30"; 
        Menu("Budi", true, kodePromo);

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis menu yang ingin dipesan: ");
        int jenisMenu = sc.nextInt();

        // total keseluruhan harus di luar loop supaya tidak di reset tiap iterasi
        int totalSemua = 0;

        for (int i = 0; i < jenisMenu; i++) {
            System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            //hitung total untuk pesanan ini
            int totalHarga = hitungTotalHarga06(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Total harga untuk pesanan ke-" + (i+1) + " adalah: Rp " + totalHarga);

            //total keseluruhan
            totalSemua += totalHarga;
        }

        System.out.println("\nTotal semua pesanan anda adalah: Rp " + totalSemua);

        sc.close();
    }

    public static int hitungTotalHarga06(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo != null && kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapat diskon 50%!");
            hargaTotal = hargaTotal / 2;
        } else if (kodePromo != null && kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapat diskon 30%!");
            hargaTotal = (int) (hargaTotal * 0.7);
        } else {
            System.out.println("Kode promo tidak valid");
        }

        return hargaTotal;
    }
}