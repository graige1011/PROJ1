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
                new Onderdeel("300PK Motor","description 1",Categorie.ESSENTIEEL,1,50.00,"ENGINE",1.00)
        );
    }
    public static void print_Alle_Onderdelen(){
        System.out.println("Hier is een lijst van al onze onderdelen die beschikbaar zijn:");


        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        // De css voor de tabel van onderdeellijst
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Categorie", "Aantal", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s %-15s\n", "-------------", "---------------", "-----------", "-----------", "-----------", "---------------", "---------------");

        // Print elke onderdeel en hun gegevens
        for (Onderdeel onderdeel : onderdelen) {
            System.out.printf("%-15s %-20s %-15s %-15d %-15.2f %-15s %-15.2f\n", onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getAantal(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting());
        }
    }
    public static void print_Alle_Rompen(){
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", "-------------", "---------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ROMP")) {
                System.out.printf("%-15s %-20s %-15s %-15.2f %-15s %-15.2f\n", onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting());
            }
        }
    }
    public static void print_Alle_Engines(){
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();

        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-15s %-20s %-15s %-15s %-15s %-15s\n", "-------------", "---------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("ENGINE")) {
                System.out.printf("%-15s %-20s %-15s %-15.2f %-15s %-15.2f\n", onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting());
            }
        }
    }

}
