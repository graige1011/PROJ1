import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnderdeelLijst extends Onderdeel {


    public OnderdeelLijst(String ProductNaam, String ProductOmschrijving, Categorie categorie, int ProductAantal, double StukPrijs, String SoortOnderdeel, int MilieuKorting) {
        super(ProductNaam, ProductOmschrijving, categorie, ProductAantal, StukPrijs, SoortOnderdeel, MilieuKorting);
    }


    public static ArrayList<Onderdeel> createOnderdelen() {
        ArrayList<Onderdeel> onderdelen = new ArrayList<>();

        onderdelen.add(new Onderdeel("HoutenRomp", "klassiek, warm, en milieuvriendelijk.", Categorie.ESSENTIEEL, 1, 5000.00, "ROMP", 20));
        onderdelen.add(new Onderdeel("AluminiumRomp", "licht en sterk.", Categorie.ESSENTIEEL, 1, 7000.00, "ROMP", 0));
        onderdelen.add(new Onderdeel("VezelglasRomp", "licht, sterk, en flexibel.", Categorie.ESSENTIEEL, 1, 10000.00, "ROMP", 0));
        onderdelen.add(new Onderdeel("StalenRomp", "sterk, robuust, en duurzaam.", Categorie.ESSENTIEEL, 1, 29500.00, "ROMP", 0));
        onderdelen.add(new Onderdeel("900PK Motor", "krachtig, duur, en high-end.", Categorie.ESSENTIEEL, 1, 80000.00, "ENGINE", 0));
        onderdelen.add(new Onderdeel("300PK Motor", "gemiddeld, betaalbaar, en betrouwbaar.", Categorie.ESSENTIEEL, 1, 40000.00, "ENGINE", 0));
        onderdelen.add(new Onderdeel("Mechanische Roer", "Een mechanische roer met kabel", Categorie.ESSENTIEEL, 1, 2000.00, "ROER", 0));
        onderdelen.add(new Onderdeel("Tandheugel Roer", "precies, betrouwbaar, en wendbaar.", Categorie.ESSENTIEEL, 1, 1000.00, "ROER", 0));
        onderdelen.add(new Onderdeel("Basis hoofdstroomsyteem", "eenvoudig, minimale functies.", Categorie.ESSENTIEEL, 1, 700.00, "ELEKSYS", 0));
        onderdelen.add(new Onderdeel("Gemiddeld hoofdstroomsyteem", "hogere capaciteit, extra functies.", Categorie.ESSENTIEEL, 1, 1500.00, "ELEKSYS", 0));
        onderdelen.add(new Onderdeel("Geavanceerd hoofdstroomsyteem", " geïntegreerde monitoring, controle.", Categorie.ESSENTIEEL, 1, 4000.00, "ELEKSYS", 20));
        onderdelen.add(new Onderdeel("Basis navigatiesysteem", "eenvoudige functionaliteiten.", Categorie.ESSENTIEEL, 1, 500.00, "NAVI", 0));
        onderdelen.add(new Onderdeel("Gemiddeld navigatiesysteem", "geavanceerde functies, kaartplotter.", Categorie.ESSENTIEEL, 1, 2000.00, "NAVI", 0));
        onderdelen.add(new Onderdeel("Geavanceerd navigatiesysteem", "geïntegreerde kaartplotter, radar, automatische piloot.", Categorie.ESSENTIEEL, 1, 8000.00, "NAVI", 20));
        onderdelen.add(new Onderdeel("Sturdy aluminium dek", "op maat gemaakt, duur.", Categorie.ESSENTIEEL, 1, 500.00, "DEK", 20));
        onderdelen.add(new Onderdeel("Sturdy houten dek", "op maat gemaakt, duur.", Categorie.ESSENTIEEL, 1, 500.00, "DEK", 20));
        onderdelen.add(new Onderdeel("Plastic jerrycan", "lichtgewicht, goedkoop.", Categorie.EXTRA, 1, 50.00, "TANK", 0));
        onderdelen.add(new Onderdeel("Stalen brandstoftank", "stevig, duurzamer.", Categorie.EXTRA, 1, 100.00, "TANK", 0));
        onderdelen.add(new Onderdeel("Aangepaste aluminium tank", "op maat gemaakt, duur.", Categorie.EXTRA, 1, 500.00, "TANK", 20));
        onderdelen.add(new Onderdeel("Basis interieur installatie", "eenvoudig en functioneel.", Categorie.EXTRA, 1, 3000.00, "INTERIEUR", 0));
        onderdelen.add(new Onderdeel("Gemiddelde interieur installatie", "meer comfort en kwaliteit.", Categorie.EXTRA, 1, 10000.00, "INTERIEUR", 0));
        onderdelen.add(new Onderdeel("Geavanceerde interieur installatie", "op maat gemaakt, luxe.", Categorie.EXTRA, 1, 35000.00, "INTERIEUR", 20));
        onderdelen.add(new Onderdeel("Fluke anker", "lichtgewicht, budgetvriendelijk.", Categorie.EXTRA, 1, 100.00, "ANKER", 20));
        onderdelen.add(new Onderdeel("Plow anker", "allround, effectief.", Categorie.EXTRA, 1, 250.00, "ANKER", 0));
        onderdelen.add(new Onderdeel("Anker met hoge grip", "goede houvast, duur.", Categorie.EXTRA, 1, 1000.00, "ANKER", 0));
        onderdelen.add(new Onderdeel("VHF-radio", "basiscommunicatie, verplicht.", Categorie.EXTRA, 1, 250.00, "COMMUNICATIE", 20));
        onderdelen.add(new Onderdeel("Satelliettelefoon", "wereldwijde dekking, duur.", Categorie.EXTRA, 1, 1000.00, "COMMUNICATIE", 0));
        onderdelen.add(new Onderdeel("Satellietcommunicatie", "geavanceerd, realtime.", Categorie.EXTRA, 1, 10000.00, "COMMUNICATIE", 0));

        return onderdelen;
    }

    public static void print_Alle_Onderdelen() {
        System.out.println("Hier is een lijst van al onze onderdelen die beschikbaar zijn:");

        List<Onderdeel> onderdelen = createOnderdelen();

        // De css voor de tabel van onderdelen
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "---------------", "---------------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nr, dan kunnen wij overzichtelijk zien welke locatie iets is in het List
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
            counter++;
        }
    }

    public static void print_Alle_Extraonderdelen() {
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel van Extraonderdeellijst
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getCategorie().equals(Categorie.EXTRA)) {
                System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
                counter++;
            }
        }
    }

    public static void print_Alle_Rompen() {
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer dat de klant kan kiezen
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ROMP")) {
                System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
                counter++;
            }
        }
    }

    public static void print_Alle_Engines() {
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer dat de klant kan kiezen
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ENGINE")) {
                System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
                counter++;
            }
        }
    }

    public static void print_Alle_Roeren() {
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer dat de klant kan kiezen
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ROER")) {
                System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
                counter++;
            }
        }
    }

    public static void print_Alle_Dekken() {
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer dat de klant kan kiezen
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("DEK")) {
                System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
                counter++;
            }
        }
    }

    public static void print_Alle_ElektrischeSystemen() { // functie voor het printen van alle elektrische systemen
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer dat de klant kan kiezen
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ELEKSYS")) {
                System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
                counter++;
            }
        }
    }

    public static void print_Alle_Navigatie() { //functie voor het printen van alle rompen
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer dat de klant kan kiezen
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("NAVI")) {
                System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
                counter++;
            }
        }
    }

    public static void print_Alle_Tanks() { //functie voor het printen van alle rompen
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer dat de klant kan kiezen
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("TANK")) {
                System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
                counter++;
            }
        }
    }
    public static Onderdeel maakNieuweOnderdeel() {
        Scanner input = new Scanner(System.in);
        System.out.println("Voer de naam in van de nieuwe onderdeel:");
        String naam = input.nextLine();
        System.out.println("Voer de omschrijving in van de nieuwe onderdeel (Max 35 characters):");
        String omschrijving = input.nextLine();
        System.out.println("Voer de categorie in van de nieuwe onderdeel (ESSENTIEEL of EXTRA):");
        String categorieString = input.nextLine();
        Categorie categorie;
        switch (categorieString) {
            case "ESSENTIEEL":
                categorie = Categorie.ESSENTIEEL;
                break;
            case "EXTRA":
                categorie = Categorie.EXTRA;
                break;
            default:
                System.out.println("Ongeldige categorie");
                return null; // return null in case of invalid category
        }
        System.out.println("Voer de hoeveelheid in van de nieuwe onderdeel (minimaal 1):");
        int aantal = input.nextInt();
        input.nextLine(); // consume newline character
        System.out.println("Voer de prijs in van de nieuwe onderdeel (met nummers achter de komma, bijv 0,00 aub):");
        double prijs = input.nextDouble();
        input.nextLine(); // consume newline character
        System.out.println("Voer de soort in van de nieuwe onderdeel (in hoofdletters aub):");
        String soort = input.nextLine();
        System.out.println("Voer de milieu korting in van de nieuwe onderdeel (in nummers, bijv 20 of 80):");
        int milieuKorting = input.nextInt();
        input.nextLine(); // consume newline character
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Aantal", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "------", "-----------", "---------------", "---------------");
        System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", 1, naam, omschrijving, categorieString, prijs, soort, milieuKorting + "%");

        System.out.println("Hier is uw nieuwe onderdeel, is alles correct? (ja/nee)");
        String correct = input.nextLine();
        if (correct.equalsIgnoreCase("ja")) {
            return new Onderdeel(naam, omschrijving, categorie, aantal, prijs, soort, milieuKorting);
        } else {
            System.out.println("Data collection cancelled");
            return null;
        }
    }
    public static void bewerkOnderdeel(List<Onderdeel> onderdelen) {
        Scanner input = new Scanner(System.in);
        System.out.println("Voer het indexnummer in van het onderdeel dat u wilt bewerken:");
        int index = input.nextInt();
        input.nextLine(); // consume newline character
        if (index < 1 || index > onderdelen.size()) {
            System.out.println("Ongeldige index");
            return;
        }
        Onderdeel onderdeel = onderdelen.get(index - 1);
        System.out.println("Voer de nieuwe naam in van het onderdeel (huidige waarde: " + onderdeel.getNaam() + "):");
        String nieuweNaam = input.nextLine();
        onderdeel.setNaam(nieuweNaam);
        System.out.println("Voer de nieuwe omschrijving in van het onderdeel (huidige waarde: " + onderdeel.getOmschrijving() + "):");
        String nieuweOmschrijving = input.nextLine();
        onderdeel.setOmschrijving(nieuweOmschrijving);
        System.out.println("Voer de nieuwe categorie in van het onderdeel (huidige waarde: " + onderdeel.getCategorie() + "):");
        String nieuweCategorieString = input.nextLine();
        Categorie nieuweCategorie;
        switch (nieuweCategorieString) {
            case "ESSENTIEEL":
                nieuweCategorie = Categorie.ESSENTIEEL;
                break;
            case "EXTRA":
                nieuweCategorie = Categorie.EXTRA;
                break;
            default:
                System.out.println("Ongeldige categorie");
                return;
        }
        onderdeel.setCategorie(nieuweCategorie);
        System.out.println("Voer de nieuwe hoeveelheid in van het onderdeel (huidige waarde: " + onderdeel.getAantal() + "):");
        int nieuweAantal = input.nextInt();
        onderdeel.setAantal(nieuweAantal);
        input.nextLine(); // consume newline character
        System.out.println("Voer de nieuwe prijs in van het onderdeel (huidige waarde: " + onderdeel.getPrijs() + "):");
        double nieuwePrijs = input.nextDouble();
        onderdeel.setStukPrijs(nieuwePrijs);
        input.nextLine(); // consume newline character
        System.out.println("Voer de nieuwe soort in van het onderdeel (huidige waarde: " + onderdeel.getSoortOnderdeel() + "):");
        String nieuweSoort = input.nextLine();
        onderdeel.setSoortOnderdeel(nieuweSoort);
        System.out.println("Voer de nieuwe milieu korting in van het onderdeel (huidige waarde: " + onderdeel.getMilieuKorting() + "):");
        int nieuweMilieuKorting = input.nextInt();
        onderdeel.setMilieuKorting(nieuweMilieuKorting);
        input.nextLine(); // consume newline character

        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Aantal", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "------", "-----------", "---------------", "---------------");
        System.out.printf("%-4d %-35s %-60s %-15s %-15d %-15.2f %-15s %-15s\n", 1, nieuweNaam, nieuweOmschrijving, nieuweCategorie, nieuweAantal, nieuwePrijs, nieuweSoort, nieuweMilieuKorting + "%");

        System.out.println("Hier is uw nieuwe onderdeel, is alles correct? (ja/nee)");
        String antwoord = input.nextLine();
        if (antwoord.equalsIgnoreCase("ja")) {
            // The user confirmed that the updated part is correct
            // You can perform any additional actions or validations here
        } else if (antwoord.equalsIgnoreCase("nee")) {
            // The user indicated that the updated part is not correct
            // You can handle this case as per your application's requirements
        } else {
            // Invalid input, handle accordingly
            //
        }

    }
    public static void print_Nieuwe_Onderdelen(List<Onderdeel> onderdelen) {
        System.out.println("Hier is een lijst van al onze onderdelen die beschikbaar zijn:");
        // De css voor de tabel van onderdelen
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "---------------", "---------------", "---------------", "---------------");
        // Print elke onderdeel en hun gegevens met counter voor een nr, dan kunnen wij overzichtelijk zien welke locatie iets is in het List
        int counter = 1;
        for (Onderdeel onderdeel : onderdelen) {
            System.out.printf("%-4d %-35s %-60s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting() + "%");
            counter++;
        }
    }
}
