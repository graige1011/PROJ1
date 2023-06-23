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
    public String getVoornaam() {
        return voorNaam;
    }

    public void setVoornaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchternaam() {
        return achterNaam;
    }

    public void setAchternaam(String achterNaam) {
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

        ArrayList<Klanttype> klanttypes = Klanttype.getKlanttypes();
        for (int i = 0; i < klanttypes.size(); i++) {
            System.out.println((i + 1) + ". " + klanttypes.get(i).getNaam());
        }
        int userInput = input.nextInt();
        input.nextLine(); // Consume the remaining newline character

        if (userInput >= 1 && userInput <= klanttypes.size()) {
            Klanttype selectedKlanttype = klanttypes.get(userInput - 1);
            return new Klant(voorNaam, achterNaam, email, selectedKlanttype);
        } else {
            System.out.println("Ongeldige invoer. Probeer opnieuw.");
            // handle invalid input
        }

        return null;
    }


    public static void bewerkKlant(ArrayList<Klant> klantenlijst ){
        Scanner input = new Scanner(System.in);
        System.out.println("Voer het indexnummer in van het onderdeel dat u wilt bewerken:");
        int index = input.nextInt();
        input.nextLine(); // consume newline character
        Klant klant = klantenlijst.get(index - 1);
        System.out.println("Voer de nieuwe voornaam in van de klant (huidige waarde: " + klant.getVoornaam() + "):");
        String nieuweVoornaam = input.nextLine();
        klant.setVoornaam(nieuweVoornaam);
        System.out.println("Voer de nieuwe achternaam in van de klant (huidige waarde: " + klant.getAchternaam() + "):");
        String nieuweAchternaam = input.nextLine();
        klant.setAchternaam(nieuweAchternaam);
        System.out.println("Voer de nieuwe email in van de klant (huidige waarde: " + klant.getEmail() + "):");
        String nieuweEmail = input.nextLine();
        klant.setEmail(nieuweEmail);
        System.out.println("Wat voor klanttype heeft de nieuwe klant?\n 1.Overheid \n 2.Bedrijf \n 3.Particulier ");
        int userInput = input.nextInt();
        if(userInput == 1) {
            klant.setKlanttype(Klanttype.Overheid);
        }
        else if(userInput ==2){
            klant.setKlanttype(Klanttype.Bedrijf);
        }
        else if (userInput == 3) {
            klant.setKlanttype(Klanttype.Particulier);
        }
    }
    public static ArrayList<Klant> createKlantenlijst() {
        ArrayList<Klant> klanten = new ArrayList<>();

        klanten.add(new Klant("John", "Doe", "john.doe@hotmail.com", Klanttype.Particulier));
        klanten.add(new Klant("Jane", "Smith", "jane.smith@outlook.com", Klanttype.Bedrijf));
        klanten.add(new Klant("Michael", "Brown", "michael.brown@student.hhs.nl", Klanttype.Particulier));
        klanten.add(new Klant("Sarah", "Johnson", "sarah.johnson@gmail.com", Klanttype.Bedrijf));
        klanten.add(new Klant("David", "Taylor", "david.taylor@yahoo.com", Klanttype.Particulier));
        klanten.add(new Klant("Olivia", "Anderson", "olivia.anderson@icloud.com", Klanttype.Particulier));
        klanten.add(new Klant("James", "Thomas", "james.thomas@protonmail.com", Klanttype.Bedrijf));
        klanten.add(new Klant("Emily", "Harris", "emily.harris@live.com", Klanttype.Particulier));
        klanten.add(new Klant("Daniel", "Walker", "daniel.walker@inbox.com", Klanttype.Bedrijf));
        klanten.add(new Klant("Sophia", "Clark", "sophia.clark@gmail.com", Klanttype.Particulier));

        return klanten;
    }
    public static void printAlleKlanten(ArrayList<Klant> klantenlijst) {
        System.out.println("Hier is een lijst van al onze klanten:");

        // CSS voor de tabel van klanten
        System.out.printf("%-4s %-15s %-15s %-35s %-15s\n", "Nr.", "Voornaam", "Achternaam", "Email", "Klanttype");
        System.out.printf("%-4s %-15s %-15s %-35s %-15s\n", "---", "---------------", "---------------", "-----------------------------------", "---------------");

        // Print elke klant en hun gegevens met een counter voor een nummer, zodat we overzichtelijk de klanten kunnen zien in de lijst
        int counter = 1;
        for (Klant klant : klantenlijst) {
            System.out.printf("%-4d %-15s %-15s %-35s %-15s\n", counter, klant.getVoornaam(), klant.getAchternaam(), klant.getEmail(), klant.getKlanttype().getNaam());
            counter++;
        }
    }
    @Override
    public String toString() {
        return "Voornaam: " + voorNaam +
                ", Achternaam: " + achterNaam +
                ", Email: " + email +
                ", Klanttype: " + (klanttype != null ? klanttype.getNaam() : "Geen klanttype");
    }

}



