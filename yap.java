public class yap {
    public static void main(String[] args) {
        int[] A = {4,8,3,1,18,9,21};

        int toplam = 0;
        for (int i = 0; i < A.length; i++) {
            toplam += A[i];
        }
        System.out.println("Toplam: " + toplam);
        int  ortalama = toplam / A.length;
        System.out.println("Ortalama: " + ortalama);
    }
}