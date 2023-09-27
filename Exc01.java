import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int angka = scanner.nextInt();

        long faktorial = 1;
        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
        scanner.close();
    }
}
