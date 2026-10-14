import java.util.Scanner;

public class budnyböyle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, toplam=0;
        do {
            System.out.print("Bir sayı giriniz : ");
            input = sc.nextInt(); 
            if (input%2 == 0) {
                toplam += input;
            }
        } while (input > 0);
        System.out.println("Girilen çift sayıların toplamı : " + toplam);    }
    
}

