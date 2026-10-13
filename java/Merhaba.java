import java.util.Scanner;

public class Merhaba {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = oku.nextInt();

        for (int i = 1; i <= n; i++) {          // satırlar
            for (int j = 1; j <= n; j++) {      // sütunlar
                System.out.print(j + "x" + i + "=" + (i * j) + "\t");
            }
            System.out.println();               // satır bitince alt satıra geç
        }
    }
}