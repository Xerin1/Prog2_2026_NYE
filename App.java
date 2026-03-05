import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int szam = rand.nextInt(100) + 1; // 1-100 közötti véletlen szám
        Scanner scanner = new Scanner(System.in);

        System.out.println("Találgass egy számot 1 és 100 között!");

        while (true) {
            System.out.print("Tipp: ");
            int tipp = scanner.nextInt();

            if (tipp < szam) {
                System.out.println("Nagyobb!");
            } else if (tipp > szam) {
                System.out.println("Kisebb!");
            } else {
                System.out.println("Eltaláltad! A szám: " + szam);
                break;
            }
        }

        scanner.close();
    }
}
