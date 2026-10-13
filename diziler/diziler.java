public class diziler {
    public static void main(String[] args) {
        double[] dizi = {1.2, 2.3, 3.4, 4.5, 5.6};
        double toplam = 0;
        double max = dizi[0];

        for(double number : dizi){
            if (max < number) {
                max = number;
            }
            toplam += number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + toplam);
        System.out.println("Maksimum: " + max);
    }
}