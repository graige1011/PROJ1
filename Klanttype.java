import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Klanttype {
    private static ArrayList<Klanttype> klanttypes = new ArrayList<>();
    private String naam;
    private double korting;

    public Klanttype(String naam, double korting) {
        this.naam = naam;
        this.korting = korting;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKorting() {
        return korting;
    }

    public void setKorting(double korting) {
        this.korting = korting;
    }

//    public static Klanttype createNewKlanttype() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Wil nieuwe klanttype aanmaken? (Ja/Nee)");
//        String antwoord = input.nextLine();
//        if (antwoord.equalsIgnoreCase("Ja")) {
//            System.out.println("Voer de naam in van de nieuwe klanttype:");
//            String naam = input.nextLine();
//            System.out.println("Voer de korting in van de nieuwe klanttype:");
//            double korting = input.nextDouble();
//            input.nextLine(); // consume the remaining newline character
//            return new Klanttype(naam, korting);
//        } else {
//            return null;
//        }
//    }

    public static Klanttype maakNieuweKlanttype() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wil nieuwe klanttype aanmaken? (Ja/Nee)");
        String antwoord = input.nextLine();
        if (antwoord.equalsIgnoreCase("Ja")) {
            System.out.println("Voer de naam in van de nieuwe klanttype:");
            String naam = input.nextLine();
            double korting = 0.0;
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Voer de korting in van de nieuwe klanttype:");
                try {
                    korting = input.nextDouble();
                    input.nextLine(); // consume the remaining newline character
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ongeldige invoer. Voer een geldig getal in.");
                    input.nextLine(); // clear the input buffer
                }
            }
            return new Klanttype(naam, korting);
        } else {
            return null;
        }
    }

    // Method to add a Klanttype object to the klanttypes ArrayList
    public static void voegKlanttypeToe(Klanttype klanttype) {
        klanttypes.add(klanttype);
    }

    // Method to get the klanttypes ArrayList
    public static ArrayList<Klanttype> getKlanttypes() {
        return klanttypes;
    }

    public static final Klanttype Overheid = new Klanttype("Overheid", 0.80);
    public static final Klanttype Bedrijf = new Klanttype("Bedrijf", 0.90);
    public static final Klanttype Particulier = new Klanttype("Particulier", 1.00);
    static {
        // Add predefined Klanttype objects to klanttypes ArrayList
        klanttypes.add(Overheid);
        klanttypes.add(Bedrijf);
        klanttypes.add(Particulier);
    }
    public static void toonKlanttypes() {
        System.out.println("Beschikbare klanttypes:");
        for (Klanttype klanttype : klanttypes) {
            System.out.println("Naam: " + klanttype.getNaam() + ", Korting: " + klanttype.getKorting());
        }
    }


}
