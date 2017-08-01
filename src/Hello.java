import java.util.Scanner;

public class Hello {

    public static void main (String arges[]){
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println("Hello, " + line);
    }

}
