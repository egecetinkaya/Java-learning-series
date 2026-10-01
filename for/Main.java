public class Main {
    public static void main(String[] args) {
        for(int i=2; i<10; i+=2) {
            System.out.println(i);
        }
        System.out.println("döngü bitti");

        int i=2;
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("while döngüsü bitti");
        i = 2;
        do{
            System.out.println(i);
            i+=2;
        }while(i<10);
        System.out.println("do-while döngüsü bitti");
    }
}