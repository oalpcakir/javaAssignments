import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double price, tax, kdv, taxed;
        tax = 1.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyat kaç");
        price = input.nextDouble();
        taxed = price*tax;
        kdv = price*0.18;
        System.out.println(kdv);
        System.out.println(taxed);
        }
}
