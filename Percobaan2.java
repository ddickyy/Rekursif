import java.util.Scanner;
public class Percobaan2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        int hasil = hitungPangkat(bilangan, pangkat, true);
        System.out.println("= " + hasil);
    }

    static int hitungPangkat (int x, int y, boolean isPrint) {
        if (y==0) {
            if (isPrint) System.out.print("x1");
            return 1;
        } else {
            if (isPrint) {
                System.out.print(x);
                if (y>1) System.out.print("x");
            }
            return (x * hitungPangkat (x, y -1, isPrint));
        }
    }
}