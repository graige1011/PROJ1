import java.util.List;

public class OnderdeelLijst extends Onderdeel {


    public OnderdeelLijst(String ProductNaam, String ProductOmschrijving, Categorie categorie, int ProductAantal, double StukPrijs, String SoortOnderdeel, double MilieuKorting) {
        super(ProductNaam, ProductOmschrijving, categorie, ProductAantal, StukPrijs, SoortOnderdeel, MilieuKorting);
    }


    public static List<Onderdeel> createOnderdelen() {
        return List.of(
                new Onderdeel("HoutenRomp","Houten romp: klassiek, warm, en milieuvriendelijk.",Categorie.ESSENTIEEL,1,5000.00,"ROMP",0.80),
                new Onderdeel("AluminiumRomp","Aluminium romp is licht en sterk.",Categorie.ESSENTIEEL,1,7000.00,"ROMP",0),
                new Onderdeel("VezelglasRomp","Vezelglas romp: licht, sterk, en flexibel.",Categorie.ESSENTIEEL,1,10000.00,"ROMP",0),
                new Onderdeel("StalenRomp","Stalen romp: sterk, robuust, en duurzaam.",Categorie.ESSENTIEEL,1,29500.00,"ROMP",0),
                new Onderdeel("900PK Motor","900 pk boot motor: krachtig, duur, en high-end.",Categorie.ESSENTIEEL,1,80000.00,"ENGINE",0),
                new Onderdeel("300PK Motor","300 pk boot motor: gemiddeld, betaalbaar, en betrouwbaar.",Categorie.ESSENTIEEL,1,40000.00,"ENGINE",0.80),
                new Onderdeel("Mechanische Roer","Een mechanische roer met kabel",Categorie.ESSENTIEEL,1,2000.00,"ROER",0.80),
                new Onderdeel("Tandheugel Roer","Tandheugel roer: precies, betrouwbaar, en wendbaar.",Categorie.ESSENTIEEL,1,1000.00,"ROER",0),
                new Onderdeel("Basis hoofdstroomsyteem","Basis hoofdstroomsysteem: eenvoudig, minimale functies.",Categorie.ESSENTIEEL,1,700.00,"ELEKSYS",0),
                new Onderdeel("Gemiddeld hoofdstroomsyteem","Gemiddeld hoofdstroomsysteem: hogere capaciteit, extra functies.",Categorie.ESSENTIEEL,1,1500.00,"ELEKSYS",0),
                new Onderdeel("Geavanceerd hoofdstroomsyteem","Geavanceerd hoofdstroomsysteem: geïntegreerde monitoring, controle.",Categorie.ESSENTIEEL,1,4000.00,"ELEKSYS",0.80),
                new Onderdeel("Basis navigatiesysteem","Basis navigatiesysteem: eenvoudige functionaliteiten.",Categorie.ESSENTIEEL,1,500.00,"NAVI",0),
                new Onderdeel("Gemiddeld navigatiesysteem","Gemiddeld navigatiesysteem: geavanceerde functies, kaartplotter.",Categorie.ESSENTIEEL,1,2000.00,"NAVI",0),
                new Onderdeel("Geavanceerd navigatiesysteem","Geavanceerd navigatiesysteem: geïntegreerde kaartplotter, radar, automatische piloot.",Categorie.ESSENTIEEL,1,8000.00,"NAVI",0.80),
                new Onderdeel("Plastic jerrycan","lichtgewicht, goedkoop.",Categorie.EXTRA,1,50.00,"TANK",0),
                new Onderdeel("Stalen brandstoftank","stevig, duurzamer.",Categorie.EXTRA,1,100.00,"TANK",0),
                new Onderdeel("Aangepaste aluminium tank","op maat gemaakt, duur.",Categorie.EXTRA,1,500.00,"TANK",0.80),
                new Onderdeel("Basis interieur installatie","eenvoudig en functioneel.",Categorie.EXTRA,1,3000.00,"INTERIEUR",0),
                new Onderdeel("Gemiddelde interieur installatie","meer comfort en kwaliteit.",Categorie.EXTRA,1,10000.00,"INTERIEUR",0),
                new Onderdeel("Geavanceerde interieur installatie","op maat gemaakt, luxe.",Categorie.EXTRA,1,35000.00,"INTERIEUR",0.80),
                new Onderdeel("Fluke anker","lichtgewicht, budgetvriendelijk.",Categorie.EXTRA,1,100.00,"ANKER",0.80),
                new Onderdeel("Plow anker","allround, effectief.",Categorie.EXTRA,1,250.00,"ANKER",0),
                new Onderdeel("Anker met hoge grip","goede houvast, duur.",Categorie.EXTRA,1,1000.00,"ANKER",0.00),
                new Onderdeel("VHF-radio","basiscommunicatie, verplicht.",Categorie.EXTRA,1,250.00,"COMMUNICATIE",0.80),
                new Onderdeel("Satelliettelefoon","wereldwijde dekking, duur.",Categorie.EXTRA,1,1000.00,"COMMUNICATIE",0),
                new Onderdeel("Satellietcommunicatie","geavanceerd, realtime.",Categorie.EXTRA,1,10000.00,"COMMUNICATIE",0)







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
            if (onderdeel.getSoortOnderdeel().equals("ELEKSYS")) {
                System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1 - onderdeel.getMilieuKorting()) * 100 + "%");
                counter++;
            }
        }
    }
    public static void print_Alle_Navigatie(){ //functie voor het printen van alle rompen
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
        int counter = 1;

        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "---", "-------------", "----------------------------------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("NAVI")) {
                System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1-onderdeel.getMilieuKorting())*100 + "%");
                counter++;
            }
        }
    }
    public static void print_Alle_Tanks(){ //functie voor het printen van alle rompen
        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
        int counter = 1;

        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting");
        System.out.printf("%-4s %-15s %-40s %-15s %-15s %-15s %-15s\n", "---", "-------------", "----------------------------------------", "-----------", "-----------", "---------------", "---------------");

        for (Onderdeel onderdeel : onderdelen) {
            if (onderdeel.getSoortOnderdeel().equals("TANK")) {
                System.out.printf("%-4d %-15s %-40s %-15s %-15.2f %-15s %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1-onderdeel.getMilieuKorting())*100 + "%");
                counter++;
            }
        }
    }

    public void addOnderdeel(String name, String description, Categorie categorie, int amount, double price, String type, double milleukorting) { //functie voor het toevoegen van onderdelen als het nodig is
        Onderdeel onderdeel = new Onderdeel(name, description, categorie, amount, price, type, milleukorting);
        OnderdeelLijst.add(onderdeel);
    }
//addOnderdeel werkt nog niet mischien meneer vragen wat ik kan doen om het te fixen?


}
