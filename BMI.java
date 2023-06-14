import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
    double boy, kutle, bmi;
    Scanner input = new Scanner(System.in);
    System.out.println("Boyunuz kaç metre?");
    boy = input.nextDouble();
    System.out.println("Kilonuz kaç kg?");
    kutle = input.nextDouble();
    bmi = kutle/(boy*boy);
    System.out.println("Vücut kitle endeksiniz " + bmi);
    }
}