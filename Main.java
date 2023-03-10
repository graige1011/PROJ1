
import java.sql.SQLOutput;
import java.util.Scanner;
class Pizza{
    String naam;
    public Pizza(String naam){
        this.naam = naam;
    }
}
public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("BBC express");
        Scanner scanner = new Scanner(System.in);
        System.out.println(pizza1.naam);
        System.out.println("Voer uw naam in");
        String naam = scanner.nextLine();
        if(naam.equals("Graige") || naam.equals("Graige"))
        {
            System.out.println("Graige pretu please bai foi djaki");
        }
        if(naam.equals("Keanu")){
            System.out.println("Bai laba bo wok");
        }
        else {

            System.out.println("Welkom!");
        }

        System.out.println("Heyyy je bent mooi watsjenaam");
    }
}