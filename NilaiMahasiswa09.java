import java.util.Scanner;

public class NilaiMahasiswa09 {

    // a. Fungsi isianArray → mengisi array dengan input user
    static void isianArray(int[] nilai, Scanner input) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
    }

    // b. Fungsi tampilArray → menampilkan seluruh isi array
    static void tampilArray(int[] nilai) {
        System.out.println("\nDaftar Nilai Mahasiswa:");
        for (int n : nilai) {
            System.out.println(n);
        }
    }

    // c. Fungsi hitTot → menghitung total nilai
    static int hitTot(int[] nilai) {
        int total = 0;
        for (int n : nilai) {
            total += n;
        }
        return total;
    }

    // d. Fungsi main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa (N): ");
        int N = input.nextInt();

        int[] nilaiMahasiswa = new int[N];

        // Memanggil fungsi-fungsi
        isianArray(nilaiMahasiswa, input);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("\nTotal nilai seluruh mahasiswa = " + totalNilai);

        input.close();
    }
}
