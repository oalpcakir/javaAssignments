import java.util.Scanner;
public class Taksimetre{
    public static void main(String[] args) {
        double km, tutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km gittin?");
        km = input.nextDouble();
        tutar = 10 + (km*2.2);
        if (tutar < 20) {
            System.out.println("20 TL tuttu.");
        } else {
            System.out.println(tutar + " TL tuttu.");
        }
    }
}

