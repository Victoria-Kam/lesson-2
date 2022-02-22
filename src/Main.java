import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");

        name = scan.next();

        System.out.println("Hello " + name + "!");

    }
}
