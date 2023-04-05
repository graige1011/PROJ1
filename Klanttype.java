import java.util.Scanner;
public class Klanttype {
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

    public static Klanttype createNewKlanttype() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wil nieuwe klanttype aanmaken? (Ja/Nee)");
        String antwoord = input.nextLine();
        if (antwoord.equalsIgnoreCase("Ja")) {
            System.out.println("Voer de naam in van de nieuwe klanttype:");
            String naam = input.nextLine();
            System.out.println("Voer de korting in van de nieuwe klanttype:");
            double korting = input.nextDouble();
            input.nextLine(); // consume the remaining newline character
            return new Klanttype(naam, korting);
        } else {
            return null;
        }
    }

    public Klanttype Overheid = new Klanttype("Overheid", 0.80);
    public Klanttype Bedrijf = new Klanttype("Bedrijf", 0.90);
    public Klanttype Particulier = new Klanttype("Particulier", 1.00);


}
