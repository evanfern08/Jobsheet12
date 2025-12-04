import java.util.Scanner;

public class Kubus09 {

    // Fungsi menghitung volume kubus
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi menghitung luas permukaan kubus
    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int s = input.nextInt();

        int volume = hitungVolume(s);
        int luasPermukaan = hitungLuasPermukaan(s);

        System.out.println("Volume Kubus = " + volume);
        System.out.println("Luas Permukaan Kubus = " + luasPermukaan);

        input.close();
    }
}
