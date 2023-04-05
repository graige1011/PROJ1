import java.util.List;

public class OnderdeelLijst extends Onderdeel {


    public OnderdeelLijst(String ProductNaam, String ProductOmschrijving, Categorie categorie, int ProductAantal, double StukPrijs, String SoortOnderdeel, double MilieuKorting) {
        super(ProductNaam, ProductOmschrijving, categorie, ProductAantal, StukPrijs, SoortOnderdeel, MilieuKorting);
    }


    public static List<Onderdeel> createOnderdelen() {
        return List.of(
                new Onderdeel("HoutenRomp","description 1",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00),
                new Onderdeel("AluminiumRomp","description 2",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00),
                new Onderdeel("FibreglasRomp","description 3",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00),
                new Onderdeel("StalenRomp","description 4",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00),
                new Onderdeel("900PK Motor","description 1",Categorie.ESSENTIEEL,1,50.00,"ENGINE",1.00),
                new Onderdeel("300PK Motor","description 1",Categorie.ESSENTIEEL,1,50.00,"ENGINE",1.00),
                new Onderdeel("Mechanische Roer","Een mechanische roer met kabel",Categorie.ESSENTIEEL,1,50.00,"ROER",1.00),
                new Onderdeel("Tandheugel Roer","description 4",Categorie.ESSENTIEEL,1,50.00,"ROMP",1.00)
        );
    }
    public static void print_Alle_Onderdelen() { //functie voor het printen van alle onderdelen
        System.out.println("Hier is een lijst van al onze onderdelen die beschikbaar zijn:");

        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel van onderdeellijst
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "---", "-------------", "----------------------------------------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens met counter voor een nummer
        int counter = 0;
        for (Onderdeel onderdeel : onderdelen) {
            System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1 - onderdeel.getMilieuKorting()) * 100 + "%");
            counter++;
        }
    }
    public static void print_Alle_Rompen(){ //functie voor het printen van alle rompen
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
        int counter = 1;

        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "---", "-------------", "----------------------------------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ROMP")) {
                System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1-onderdeel.getMilieuKorting())*100 + "%");
                counter++;
            }
        }
    }
    public static void print_Alle_Engines(){ //functie voor het printen van alle engines
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
        int counter = 1;

        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "---", "-------------", "----------------------------------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ENGINE")) {
                System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1-onderdeel.getMilieuKorting())*100 + "%");
                counter++;
            }
        }
    }
    public static void print_Alle_Roeren(){ //functie voor het printen van alle roers
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
        int counter = 1;

        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "---", "-------------", "----------------------------------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ROER")) {
                System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1-onderdeel.getMilieuKorting())*100 + "%");
                counter++;
            }
        }
    }
    public static void print_Alle_Dekken(){ //functie voor het printen van alle dekken
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
        int counter = 1;

        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "---", "-------------", "----------------------------------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("DEK")) {
                System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1-onderdeel.getMilieuKorting())*100 + "%");
                counter++;
            }
        }
    }
    public static void print_Alle_ElektrischeSystemen() { // functie voor het printen van alle elektrische systemen
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
        int counter = 1;

        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "---", "-------------", "----------------------------------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ROMP")) {
                System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1 - onderdeel.getMilieuKorting()) * 100 + "%");
                counter++;
            }
        }
    }

}
