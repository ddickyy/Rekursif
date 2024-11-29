import java.util.Scanner;
public class Tugas2_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();

       int hasil = penjumlahan(bilangan);

       System.out.println("Hasil penjumlahan 1-" + bilangan + ": " +hasil);
    }
    static int penjumlahan (int f) {
        if (f == 1) {
            return (1);
        }  else {
            return (f + penjumlahan(f-1));
        }
    }
}