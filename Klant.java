import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Klant {
    private String voorNaam;
    private String achterNaam;
    private String email;
    private Klanttype klanttype;

    public Klant(String voorNaam, String achterNaam, String email, Klanttype klanttype) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.email = email;
        this.klanttype = klanttype;
    }

    public Klant(String voorNaam, String achterNaam, String email) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.email = email;
        this.klanttype = null;
    }

    //Getters & Setters//
    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Klanttype getKlanttype() {
        return klanttype;
    }

    public void setKlanttype(Klanttype klanttype) {
        this.klanttype = klanttype;
    }
    public static Klant createNewKlant() {
        Scanner input = new Scanner(System.in);
        System.out.println("Voer de voornaam in van de nieuwe klant:");
        String voorNaam = input.nextLine();
        System.out.println("Voer de achternaam in van de nieuwe klant:");
        String achterNaam = input.nextLine();
        System.out.println("Voer het e-mailadres in van de nieuwe klant:");
        String email = input.nextLine();

//        // Laat de gebruiker kiezen uit beschikbare klanttypes
//        System.out.println("Beschikbare klanttypes:");
//        for (int i = 0; i < klanttypes.size(); i++) {
//            System.out.println((i+1) + ". " + klanttypes.get(i).getNaam());
//        }
//        System.out.print("Kies een klanttype: ");
//        int klanttypeIndex = input.nextInt() - 1;
//        input.nextLine(); // consume the remaining newline character

//        Klanttype klanttype = klanttypes.get(klanttypeIndex);
        return new Klant(voorNaam, achterNaam, email);
    }


}

