import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        int n1, n2, islem;
        double n3 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        n1 = input.nextInt();
        System.out.println("Bir sayı daha giriniz");
        n2 = input.nextInt();
        System.out.println("Hangi işlem. Toplama için 1, Çıkarma için 2, Çarpma için , Bölme için 4 giriniz");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                n3 = n1+n2;
                break;
            case 2:
                n3 = n1 - n2;
                break;
            case 3:
                n3 = n1*n2;
                break;
            case 4:
                if (n2==0) {
                    System.out.println("Bir sayı sıfıra bölünemez");
                    break;
                }
                n3=n1/n2;
                break;
            default:
                System.out.println("anlamadım");
                break;


        }
        System.out.println("Sonucunuz " + n3);
    }
}
