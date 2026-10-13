import java.util.Scanner;

public class yap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi1, sayi2, secim;
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = sc.nextInt();
        System.out.print("\nİkinci sayıyı giriniz: ");
        sayi2 = sc.nextInt();
        System.out.print("\nNe yapmak istiyorsunuz? (1-Toplama, 2-Cıkarma, 3-Çarpma, 4-Bölme): ");
        secim = sc.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplam: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Fark: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpım: " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölüm: " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Geçersiz seçim.");
    }
}
}