import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {
        int kenarOne, kenarTwo, kenarThreeKare;
        double kenarThree;
        Scanner input = new Scanner(System.in);
        System.out.println("Kenar 1'in uzunluğu?");
        kenarOne = input.nextInt();
        System.out.println("Kenar 2^nin uzunluğu?");
        kenarTwo = input.nextInt();
        kenarThreeKare = (kenarOne*kenarOne)+(kenarTwo*kenarTwo);
        kenarThree = Math.sqrt(kenarThreeKare);
        System.out.println("Hiotenüs " + kenarThree);
    }
}
