import java.util.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Offerte offerte = new Offerte(1, "12 dec", "shipflex", "laakweg 5", 616505054, 700);
        Menu menu = new Menu();
        menu.offerte = offerte;
        ArrayList<Klant> klanten2 = new ArrayList<>();

         

        String[] asciiArt = {
                " __  _      _          __  _             ",
                "/ _\\| |__  (_) _ __   / _|| |  ___ __  __",
                "\\ \\ | '_ \\ | || '_ \\ | |_ | | / _ \\\\ \\/ /",
                "_\\ \\| | | || || |_) ||  _|| ||  __/ >  < ",
                "\\__/|_| |_||_|| .__/ |_|  |_| \\___|/_/\\_\\",
                "              |_|                        "
        };


//        }
        for (String line : asciiArt) {
            System.out.println(line);
        }
        int userInput2 = 0;
        int userInput7 = 0;
        int userInput3 = 0;
        int userInput4 = 0;
        int optie = 0;
        menu.printMenu();
        while (optie != 5) {

            optie = scanner.nextInt();
            if (optie == 1) {
                menu.essentieelOpties();
                menu.extraOpties();
                int counter = 1;
                double totaalPrijs = 0.0;
                double millieuKorting = 100;
                offerte.offerteInfo();
                menu.printHeader();
                for (Onderdeel onderdeel : offerte.Onderdelen) {
                    double totaalOnderdeel = onderdeel.getAantal() * onderdeel.getPrijs();
                    double gottenMilleuKorting = onderdeel.getMilieuKorting();
                    if(gottenMilleuKorting == 0){
                        millieuKorting = 1;
                    } else {
                        millieuKorting = (millieuKorting - gottenMilleuKorting) / 100;
                    }
                    System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15d %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting(), onderdeel.getAantal(),totaalOnderdeel);
                    counter++;
                    totaalPrijs += totaalOnderdeel * millieuKorting;
                }
                System.out.printf("\n\nTotaal bedrag voor alle onderdelen met milieu korting erbij: %.2f€", totaalPrijs);
                System.out.println("\nwat voor type klant ben jij? \n 1.Overheid \n 2.Bedrijf \n 3.Particulier");
                userInput2 = scanner.nextInt();
                String naamklant = "";
                double kortingklant = 0.00 ;
                if(userInput2 == 1){
                    kortingklant =Klanttype.getKortingForKlanttype("Overheid");
                    naamklant = "Overheid";
                } else if(userInput2 == 2){
                    kortingklant =Klanttype.getKortingForKlanttype("Bedrijf");
                    naamklant = "Bedrijf";
                } else if (userInput2 == 3) {
                    kortingklant =Klanttype.getKortingForKlanttype("Particulier");
                    naamklant = "Particulier";
                }
                System.out.printf("Totaal bedrag voor alle onderdelen met klanttype "+naamklant+": %.2f€",(kortingklant*totaalPrijs));
                System.out.println("\n\nWat wil je nu doen? \n 1.Terug naar main menu \n 2.Print alweer het offerte met overzichtelijke totaalbedragen\n");
                userInput7 = scanner.nextInt();
                if (userInput7 == 1) {
                    menu.printMenu();
                    optie = scanner.nextInt();
                } else {
                    counter = 1;
                    offerte.offerteInfo();
                    menu.printHeader();
                    for (Onderdeel onderdeel : offerte.Onderdelen) {
                        double totaalOnderdeel = onderdeel.getAantal() * onderdeel.getPrijs();
                        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15d %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting(), onderdeel.getAantal(),totaalOnderdeel);
                        counter++;
                    }
                    System.out.printf("\n\nTotaal bedrag voor alle onderdelen met milieu korting erbij: %.2f€", totaalPrijs);
                    System.out.printf("\nTotaal bedrag voor alle onderdelen met klanttype "+naamklant+" en met  milleukorting erbij: %.2f€",(kortingklant*totaalPrijs));
                    System.out.println("\n\nWat wil je nu doen? \n 1.Terug naar main menu \n 2.Sluit het programma");
                    userInput2 = scanner.nextInt();
                    if (userInput2 == 1) {
                        menu.printMenu();
                        optie = scanner.nextInt();} else {optie =5;}
                }
            }
            else if (optie == 2) {
                OnderdeelLijst.print_Alle_Onderdelen();
                System.out.println("\n\nWil jij iets doen met de onderdelenlijst?\n 1. Ja, ik wil onderdelen wijzigingen\n 2. Ja, ik wil een nieuwe onderdeel aanmaken\n 3. Nee, breng mij terug naar main menu ");
                userInput2 = scanner.nextInt();
                if (userInput2 == 1) {
                    List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
                    List<Onderdeel> onderdelennieuw = new ArrayList<Onderdeel>();
                    for (Onderdeel onderdeel : onderdelen) {
                        onderdelennieuw.add(onderdeel);
                    }
                    OnderdeelLijst.bewerkOnderdeel(onderdelennieuw);
                    Scanner input = new Scanner(System.in);
                    while (userInput3 != 3) { // Looping until user input 3 is == terug naar main menu
                        System.out.println("\nWat wil jij nog doen?\n 1. Nog meer onderdelen bijwerken\n 2. Nieuwe OnderdelenLijst bekijken\n 3. Breng mij terug naar main menu");
                        userInput3 = input.nextInt();
                        input.nextLine(); // Consume newline character

                        if (userInput3 == 1) {
                            OnderdeelLijst.bewerkOnderdeel(onderdelennieuw);
                        } else if (userInput3 == 2) {
                            OnderdeelLijst.print_Nieuwe_Onderdelen(onderdelennieuw);
                        } else if (userInput3 == 3) {
                            menu.printMenu();
                        } else {
                            System.out.println("Ongeldige keuze, probeer opnieuw");
                        }
                    }
                } else if (userInput2 == 2) {
                    List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
                    List<Onderdeel> onderdelennieuw = new ArrayList<Onderdeel>();
                    for (Onderdeel onderdeel : onderdelen) {
                        onderdelennieuw.add(onderdeel);
                    }

                    Onderdeel nieuweOnderdeel = OnderdeelLijst.maakNieuweOnderdeel();
                    onderdelennieuw.add(nieuweOnderdeel);
                    Scanner input = new Scanner(System.in);

                    while (userInput4 != 3) {

                        System.out.println("\nWat wil jij nog doen?\n 1. Nog meer nieuwe onderdelen maken\n 2. Nieuwe OnderdelenLijst bekijken\n 3. Breng mij terug naar main menu");
                        userInput4 = input.nextInt();
                        input.nextLine();

                        if (userInput4 == 1) {
                            Onderdeel nieuweOnderdeel1 = OnderdeelLijst.maakNieuweOnderdeel();
                            onderdelennieuw.add(nieuweOnderdeel1);
                        } else if (userInput4 == 2) {
                            OnderdeelLijst.print_Nieuwe_Onderdelen(onderdelennieuw);
                        } else if (userInput4 == 3) {
                            menu.printMenu();
                        } else {
                            System.out.println("Ongeldige keuze, probeer opnieuw");
                        }
                    }
                } else if(userInput2 == 3){
                    System.out.println("");
                    menu.printMenu();


                } }
            else if (optie == 3) {
                ArrayList<Klant> klantenlijst = Klant.createKlantenlijst();
                Klant.printAlleKlanten(klantenlijst);
                boolean exit = false;
                while (!exit) {
                    System.out.println("\nWil jij nog wat doen met klantengegevens?\n 1. Ja, ik wil klantgegevens bewerken");
                    System.out.println(" 2. Ja, ik wil nog een klant aanmaken");
                    System.out.println(" 3. Ja, ik wil het klantenlijst opnieuw zien");
                    System.out.println(" 4. Nee, breng mij terug naar het main menu");

                    try {
                        userInput2 = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character after reading integer input
                    } catch (InputMismatchException e) {
                        System.out.println("Ongeldige invoer. Voer een getal in.");
                        scanner.nextLine(); // Consume invalid input
                        continue;
                    }

                    switch (userInput2) {
                        case 1:
                            Klant.bewerkKlant(klantenlijst);
                            break;
                        case 2:
                            klantenlijst.add(Klant.createNewKlant());
                            break;
                        case 3:
                            Klant.printAlleKlanten(klantenlijst);
                            break;
                        case 4:
                            System.out.println("Terug naar het main menu.");
                            exit = true;
                            break;
                        default:
                            System.out.println("Ongeldige keuze. Kies een optie uit de menu.");
                            break;
                    }
                }
                menu.printMenu();
            }



            else if (optie == 4) {

                int userInput5 = 0;
                while(userInput5 != 2){
                    Klanttype.toonKlanttypes();
                    Klanttype nieuwKlanttype = Klanttype.maakNieuweKlanttype();
                    if (nieuwKlanttype != null) {

                        Klanttype.voegKlanttypeToe(nieuwKlanttype);
                        System.out.println("Nieuw klanttype aangemaakt: " + nieuwKlanttype.getNaam());
                        System.out.println("Korting: " + nieuwKlanttype.getKorting());
                        System.out.println("List of Klanttypes:");
                        for (Klanttype klanttype : Klanttype.getKlanttypes()) {
                            System.out.println("Naam: " + klanttype.getNaam());
                            System.out.println("Korting: " + klanttype.getKorting());
                            System.out.println("--------------------");
                        }
                    } else {
                        System.out.println("Geen nieuw klanttype aangemaakt.");
                    }
                    System.out.println("\n 1.Nog een klanttype aanmaken? \n 2.Terug naar menu");
                    userInput5 = scanner.nextInt();
                }


            }
        }
    }

}

