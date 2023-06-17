import java.sql.SQLOutput;
import java.util.Scanner;
public class password {
    public static void  main(String[] args){
        String username, password, try1, try2;
        username = "user";
        password = "pass";
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz");
        try1 = input.nextLine();
        System.out.println("Şifre giriniz");
        try2 = input.nextLine();

        if (username.equals(try1) && password.equals(try2)) {
            System.out.println("Doğru girdiniz");
        } else {
            System.out.println("Hatalı giriş yaptınız");
        }
    }
}
