
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Voer uw naam in");
        String naam = scanner.nextLine();
        if(naam.equals("Graige") || naam.equals("graige"))
        {
            System.out.println("Graige pretu please bai foi djaki");
        }
        else {
            System.out.println("Welkom!");
        }


    }
}