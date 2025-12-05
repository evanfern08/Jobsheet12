import java.util.Scanner;

public class RekapPenjualanCafe09 {

    // Fungsi untuk input data penjualan
    static void inputData(int[][] data, String[] menu, Scanner sc) {
        System.out.println("\n=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan tabel
    static void tampilTabel(int[][] data, String[] menu) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.print("Menu\t\t");
        for (int h = 1; h <= data[0].length; h++) {
            System.out.print("H" + h + "\t");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t"); // biar rapi
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Fungsi mencari menu penjualan tertinggi
    static void menuPenjualanTertinggi(int[][] data, String[] menu) {
        int maxTotal = -1;
        String menuMax = "";

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                menuMax = menu[i];
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menuMax + " (Total: " + maxTotal + ")");
    }

    // Fungsi menampilkan rata-rata tiap menu
    static void rataRataPerMenu(int[][] data, String[] menu) {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = (double) total / data[i].length;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    // ========================= MAIN ===============================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); // membersihkan newline

        String[] menu = new String[jumlahMenu];

        System.out.println("Masukkan nama menu:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.print("\nMasukkan jumlah hari penjualan: ");
        int jumlahHari = sc.nextInt();

        int[][] data = new int[jumlahMenu][jumlahHari];

        // Memanggil semua fungsi
        inputData(data, menu, sc);
        tampilTabel(data, menu);
        menuPenjualanTertinggi(data, menu);
        rataRataPerMenu(data, menu);

        sc.close();
    }
}
