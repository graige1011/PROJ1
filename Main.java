import java.util.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Offerte offerte = new Offerte(001, "12 dec", "shipflex", "laakweg 5", 0616505054, 700);
        Menu menu = new Menu();
        menu.offerte = offerte;
        ArrayList<Klant> klanten = new ArrayList<>();
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
        int userInput2 = 0;
        int optie = 0;
        while (optie != 5) {

            menu.printMenu();
            optie = scanner.nextInt();
            if (optie == 1) {
                menu.essentieelOpties();
                menu.extraOpties();
                int counter = 1;
                System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting", "aantal");
                System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------", "---------------");
                for (Onderdeel onderdeel : offerte.Onderdelen) {

                    System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15d\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting(), onderdeel.getAantal());
                    counter++;
                }
                System.out.println("Wil je terug naar de me menu? \n 1.Ja \n 2.Nee");
                userInput2 = scanner.nextInt();
                if (userInput2 == 1) {
                    menu.printMenu();
                    optie = scanner.nextInt();
                }
            } else if (optie == 2) {
                OnderdeelLijst.print_Alle_Onderdelen();
                System.out.println("\n\n\nWil jij iets doen met onderdeel?\n 1. Ja, ik wil onderdelen wijzigingen\n 2. Ja, ik wil een nieuwe onderdeel aanmaken\n 3. Nee, breng mij terug naar main menu ");
                userInput2 = scanner.nextInt();
                if (userInput2 == 1) {

                } else if (userInput2 == 2) {
                    List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
                    List<Onderdeel> onderdelennieuw = new ArrayList<Onderdeel>();
                    for (Onderdeel onderdeel : onderdelen) {
                        onderdelennieuw.add(onderdeel);
                    }


                    Onderdeel nieuweOnderdeel = OnderdeelLijst.maakNieuweOnderdeel();
                    onderdelennieuw.add(nieuweOnderdeel);
                    Scanner input = new Scanner(System.in);
                    int userInput3 = 0; // Initialize userInput2 to a default value
                    while (userInput3 != 3) { // Loopen tot user input 3 is == terug naar main menu
                        System.out.println("\nWat wil jij nog doen?\n 1. Nog meer nieuwe onderdelen maken\n 2. Nieuwe OnderdelenLijst bekijken\n 3. Breng mij terug naar main menu");
                        userInput3 = input.nextInt();
                        input.nextLine(); // Consume newline character

                        if (userInput3 == 1) {
                            Onderdeel nieuweOnderdeel1 = OnderdeelLijst.maakNieuweOnderdeel();
                            onderdelennieuw.add(nieuweOnderdeel1);
                        } else if (userInput3 == 2) {
                            OnderdeelLijst.print_Nieuwe_Onderdelen(onderdelennieuw);
                        } else if (userInput3 == 3) {
                            System.out.println("Bedankt voor het gebruiken van mij, fijne dag verder");
                            menu.printMenu();
                            optie = input.nextInt();
                        } else {
                            System.out.println("Ongeldige keuze, probeer opnieuw");
                        }
                    }
                } else if(userInput2 == 3){} }else if (optie == 3) {
                Klant nieuweKlant = Klant.createNewKlant();
                if (nieuweKlant != null) {
                    klanten.add(nieuweKlant);
                    System.out.println("Nieuwe klant succesvol aangemaakt.");
                } else {
                    System.out.println("Aanmaken van nieuwe klant geannuleerd.");
                }
                System.out.println("\n\nWil je verder nog iets doen met klanten?\n 1. Ja, ik wil alle klanten zien\n 2. Nee, breng mij terug naar het hoofdmenu ");
                userInput2 = scanner.nextInt();
                if (userInput2 == 1) {
                    System.out.println("Alle klanten:");
                    for (Klant klant : klanten) {
                        System.out.println(klant);
                    }
                } else if (userInput2 == 2) {
                    System.out.println("Terug naar het hoofdmenu.");
                    optie = 5;
                }

                } else if (optie == 4) {}
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
//          things to rememer: aantal in voeren en alles clearen na elke selectie, while loop dat blijft vragen of je meerder extra opties wil
//
//        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving","Categorie", "Aantal", "Stukprijs", " Totaal");
//        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
//        for (Onderdeel p : offerte1.OnderdeelList){
//            System.out.printf("%-15s %-20s %-10s %-15s %-15s\n",p.ProductNaam,p.ProductOmschrijving,p.categorie,p.ProductAantal,p.StukPrijs,p.MilieuKorting );
//        }