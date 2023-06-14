import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mate, fiz, kim, bio, ing, tar;
        Scanner input = new Scanner(System.in);
        System.out.println("Mat Kaç");
        mate = input.nextInt();
        System.out.println("Fizik Kaç");
        fiz = input.nextInt();
        System.out.println("Kimya Kaç");
        kim = input.nextInt();
        System.out.println("Biyoloji Kaç");
        bio = input.nextInt();
        System.out.println("İngilizce Kaç");
        ing = input.nextInt();
        System.out.println("Tarih Kaç");
        tar = input.nextInt();
        System.out.println("Ortalamanız:");
        double ort = (mate + fiz + kim + bio + ing + tar)/6;
        System.out.println(ort);
    }
}