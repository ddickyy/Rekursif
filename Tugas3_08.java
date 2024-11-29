public class Tugas3_08 {

    public static void main(String[] args) {
        int bulan = 12;
        int totalPasangan = fibonacci(bulan);
        System.out.println("Total pasangan marmut pada akhir bulan ke-" + bulan + " adalah: " + totalPasangan);
    }

    static int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}