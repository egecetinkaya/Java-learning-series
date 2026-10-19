import java.util.Scanner;

public class finobocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int n = sc.nextInt();
        int a = 0, b = 1, toplam;
        System.out.print("Fibonacci serisi: ");
        for (int i = 1; i < n; i++) {
            System.out.print(a + " , ");
            toplam = a + b;
            a = b;
            b = toplam;
        }
    }
}