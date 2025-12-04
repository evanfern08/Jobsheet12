import java.util.Scanner;
public class HitungBalok09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.println("Masukan Panjang");
        p=input.nextInt();

        System.out.println("Masukan Lebar");
        l=input.nextInt();

        System.out.println("Masukan Tinggi");
        t=input.nextInt();

        L = hitungLuas09(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = hitungVolume09(t, p, l);
        System.out.println("Volume balok adalah " + vol);
        input.close();
    }

    static int hitungLuas09(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume09(int tinggi, int a, int b){
        int volume = hitungLuas09(a, b) * tinggi;
        return volume;
    }
}