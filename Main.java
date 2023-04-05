import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] asciiArt = {
                " __  _      _          __  _             ",
                "/ _\\| |__  (_) _ __   / _|| |  ___ __  __",
                "\\ \\ | '_ \\ | || '_ \\ | |_ | | / _ \\\\ \\/ /",
                "_\\ \\| | | || || |_) ||  _|| ||  __/ >  < ",
                "\\__/|_| |_||_|| .__/ |_|  |_| \\___|/_/\\_\\",
                "              |_|                        "
        };

//        // Maak een lijst van gebruikers met verschillende gebruikersnamen, wachtwoorden en rollen
//        Gebruiker admin = new Gebruiker("admin", "admin123", "admin");
//        Gebruiker klant = new Gebruiker("klant", "klant123", "klant");
//        List<Gebruiker> gebruikersLijst = Arrays.asList(admin, klant);
//
//        // Vraag de gebruiker om hun gebruikersnaam en wachtwoord in te voeren
//        scanner = new Scanner(System.in);
//        System.out.println("Gebruikersnaam:");
//        String gebruikersnaam = scanner.nextLine();
//        System.out.println("Wachtwoord:");
//        String wachtwoord = scanner.nextLine();
//
//        // Controleer of de ingevoerde gebruikersnaam en wachtwoord overeenkomen met de gebruikers in de lijst
//        String rol = "";
//        for (Gebruiker gebruiker : gebruikersLijst) {
//            if (gebruiker.getGebruikersnaam().equals(gebruikersnaam) && gebruiker.getWachtwoord().equals(wachtwoord)) {
//                rol = gebruiker.getRol();
//                break;
//            }
//        }
//
//        // Gebruik de rol om te bepalen welke functionaliteit beschikbaar moet worden gesteld aan de gebruiker
//        switch (rol) {
//            case "admin":
//                // toon het beheerdersmenu
//                System.out.println("Welkom admin!");
//                // voeg hier uw code toe voor de beheerdersfunctionaliteit
//                break;
//            case "klant":
//                // toon het klantenmenu
//                System.out.println("Welkom klant!");
//                // voeg hier uw code toe voor de klantenfunctionaliteit
//                break;
//            default:
//                System.out.println("Ongeldige gebruikersnaam of wachtwoord");
//        }


        for (String line : asciiArt) {
            System.out.println(line);
        }
        System.out.println("\nWelcome bij Shipflex, ben jij 1.Klant - 2.Admin");
        System.out.println(" Met wat kan ik u helpen vandaag?\n 1. Ik wil een schip bouwen\n 2. Ik wil kijken welke onderdelen beschikbaar zijn\n 3. Sluiten\nVoer een optie 1-3 in ");

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Oke laten wij beginnen met het bouwen van een schip\n Welke romp zou u willen? ");
                OnderdeelLijst.print_Alle_Rompen();


                break;
            case 2:
                OnderdeelLijst.print_Alle_Onderdelen();
                break;
            case 3:
                System.out.println("");
                System.exit(0);
                break;
            default:
                System.out.println("Ongeldige optie");

        }
    }
}
//hier beneden de offerte lines maar ik ga beginnen met de case break voor main?
//Offerte offerte1 =  new Offerte(157,"22-03-23","waterworks","andijlaan 21",616505007,859.99);
//        Onderdeel roer = new Onderdeel("Roer", "description 1",Categorie.ESSENTIEEL, 1, 50.00,1.00);
//        Onderdeel mast = new Onderdeel("mast", "description 2", Categorie.ESSENTIEEL,1, 30.00,1.00);
//        Onderdeel engine = new Onderdeel("engine", "description 4",Categorie.ESSENTIEEL ,1, 20.00,1.00);
//        Onderdeel carborator = new Onderdeel("carborator", "description 4",Categorie.ESSENTIEEL ,1, 40.00,1.00);
//        offerte1.OnderdeelList.add(roer);
//        offerte1.OnderdeelList.add(mast);
//        offerte1.OnderdeelList.add(engine);
//        offerte1.OnderdeelList.add(carborator);
//
//        offerte1.offerteInfo();
//
//
//
//
//        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving","Categorie", "Aantal", "Stukprijs", " Totaal");
//        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
//        for (Onderdeel p : offerte1.OnderdeelList){
//            System.out.printf("%-15s %-20s %-10s %-15s %-15s\n",p.ProductNaam,p.ProductOmschrijving,p.categorie,p.ProductAantal,p.StukPrijs,p.MilieuKorting );
//        }