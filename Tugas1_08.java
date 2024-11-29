import java.util.Scanner;

public class Tugas1_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();

        System.out.println("Deret menggunakan rekursif:");
        deretDescendingRekursif(n);
        
        System.out.println("\nDeret menggunakan iteratif:");
        deretDescendingIteratif(n);
    }

    static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " "); 
        deretDescendingRekursif(n - 1); 
    }

    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " "); 
        }
    }
}
