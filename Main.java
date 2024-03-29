import java.util.*;

import java.util.Scanner;
public class Main {
    public static List<Onderdeel> onderdelennieuw = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        ArrayList<Klant> klanten = new ArrayList<>();
        ArrayList<Offerte> offertes = new ArrayList<>();

        List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
        for (Onderdeel onderdeel : onderdelen) {
            onderdelennieuw.add(onderdeel);
        }

        offertes.add(new Offerte(1, "2023-05-18", "Test Offerte", "Address", 123456789, 1000.0));

        int userInput2 = 0;
        int userInput7 = 0;
        int optie = 0;
        while (optie != 6) {
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
            menu.printMenu();
            optie = scanner.nextInt();
            if (optie == 1) {

                Offerte offerte = Offerte.createNewOfferte(); //graige hier e ta traha un offerte + onderdelen nobo pero e no ta hinke den e onderdelen pa mi por output esei nn si mi output optie 2 den main menu. si bo no a cop check app/bell mi
                offertes.add(offerte);
                menu.offerte = offerte;
                menu.essentieelOpties();
                menu.extraOpties();
                int counter = 1;
                double totaalPrijs = 0.0;
                double millieuKorting = 100;
                offerte.offerteInfo();
                System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting", "Aantal", "Totaal");
                System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------", "---------------", "---------------");

                for (Onderdeel onderdeel : offerte.Onderdelen) {
                    double totaalOnderdeel = onderdeel.getAantal() * onderdeel.getPrijs();
                    double gottenMilleuKorting = onderdeel.getMilieuKorting();
                    if (gottenMilleuKorting == 0) {
                        millieuKorting = 1;
                    } else {
                        millieuKorting = (millieuKorting - gottenMilleuKorting) / 100;
                    }
                    System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15d %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting(), onderdeel.getAantal(), totaalOnderdeel);
                    counter++;
                    //totaalprijs berekenen met korting
                    totaalPrijs += totaalOnderdeel * millieuKorting;
                }
                System.out.printf("\n\nTotaal bedrag voor alle onderdelen met milieu korting erbij: %.2f€\n", totaalPrijs);
                Klanttype.toonKlanttypes();
                System.out.println("\nWat voor type klant ben jij?");
                ArrayList<Klanttype> klanttypes = Klanttype.getKlanttypes();
                for (int i = 0; i < klanttypes.size(); i++) {
                    System.out.println((i + 1) + ". " + klanttypes.get(i).getNaam());
                }
                userInput2 = scanner.nextInt();
                String naamklant = "";
                double kortingklant = 0.00;
                if (userInput2 >= 1 && userInput2 <= klanttypes.size()) {
                    Klanttype selectedKlanttype = klanttypes.get(userInput2 - 1);
                    kortingklant = selectedKlanttype.getKorting();
                    naamklant = selectedKlanttype.getNaam();
                    System.out.println("Je hebt gekozen voor: " + naamklant);
                } else {
                    System.out.println("Ongeldige invoer. Probeer opnieuw.");
                    // handle invalid input
                }
                System.out.printf("Totaal bedrag voor alle onderdelen met klanttype " + naamklant + ": %.2f€", (kortingklant * totaalPrijs));
                System.out.println("\n\nWat wil je nu doen? \n 1.Terug naar main menu \n 2.Print alweer het offerte met overzichtelijke totaalbedragen\n");
                userInput7 = scanner.nextInt();
                if (userInput7 == 1) {
                    optie = 2;
                } else {
                    counter = 1;
                    offerte.offerteInfo();
                    System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting", "Aantal", "Totaal");
                    System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------", "---------------", "---------------");
                    for (Onderdeel onderdeel : offerte.Onderdelen) {
                        double totaalOnderdeel = onderdeel.getAantal() * onderdeel.getPrijs();
                        System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15d %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting(), onderdeel.getAantal(), totaalOnderdeel);
                        counter++;
                    }
                    System.out.printf("\n\nTotaal bedrag voor alle onderdelen met milieu korting erbij: %.2f€", totaalPrijs);
                    System.out.printf("\nTotaal bedrag voor alle onderdelen met klanttype " + naamklant + "en milleukorting: %.2f€", (kortingklant * totaalPrijs));
                    //hier beneden een vervolg voor als je doorwilt gaan met het programma gebruiken of als je het programma wilt sluiten
                    System.out.println("\n\nWat wil je nu doen? \n 1.Terug naar main menu \n 2.Sluit het programma");
                    userInput2 = scanner.nextInt();
                    if (userInput2 == 1) {
                        optie = 2;
                    } else {
                        optie = 6;
                    }
                }
            }
            else if (optie == 2){
                System.out.println("Hier een lijst van alle offertes die in dit sessie gemaakt zijn\n");
                ArrayList<String> names = new ArrayList<>();
                for (Offerte offerte : offertes) {
                    System.out.println(offerte.getOffertenr() + ". " + offerte.getBedrijfsnaam());
                }
                userInput7 = 0; // Initialize userInput7 with any value other than 2
                while (userInput7 != 2) {
                    System.out.println("\nWat wil jij verder iets doen met deze offertes?\n 1. Ik wil ze bekijken \n 2. Nee terug naar main menu");
                    userInput7 = scanner.nextInt();

                    if (userInput7 == 1) {
                        System.out.print("Voer het offertenr van de offerte in die je wilt bekijken: ");
                        int offerteNumber = scanner.nextInt();
                        Offerte selectedOfferte = null;

                        for (Offerte offerte : offertes) {
                            if (offerte.getOffertenr() == offerteNumber) {
                                selectedOfferte = offerte;
                                offerte.offerteInfo();
                                //Ik kan nieuwe offertes tonen met hun bijbehoorende onderdelen.
                                int counter = 1;
                                double millieuKorting = 100;
                                double totaalPrijs = 0;
                                System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s %-15s\n", "Nr.", "Onderdeelnaam", "Omschrijving", "Categorie", "Stukprijs", "Soort onderdeel", "Milieu korting", "Aantal", "Totaal");
                                System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15s %-15s\n", "---", "-----------------------------------", "------------------------------------------------------------", "-----------", "-----------", "---------------", "---------------", "---------------", "---------------");
                                for (Onderdeel onderdeel : offerte.Onderdelen) {
                                    double totaalOnderdeel = onderdeel.getAantal() * onderdeel.getPrijs();
                                    double gottenMilleuKorting = onderdeel.getMilieuKorting();
                                    if (gottenMilleuKorting == 0) {
                                        millieuKorting = 1;
                                    } else {
                                        millieuKorting = (millieuKorting - gottenMilleuKorting) / 100;
                                    }
                                    System.out.printf("%-4s %-35s %-60s %-15s %-15s %-15s %-15s %-15d %-15s\n", counter, onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), onderdeel.getMilieuKorting(), onderdeel.getAantal(), totaalOnderdeel);
                                    counter++;
                                    totaalPrijs = totaalPrijs + totaalOnderdeel;


                                }
                                System.out.printf("\n\nTotaal bedrag voor alle onderdelen met milieu korting erbij: %.2f€\n", totaalPrijs);
                                // loop breken eenmaal de offerte gevonden is
                                break;
                            }

                        }
                    } else if (userInput7 == 2) {
                        optie = 2;
                    }
                }
            }
            else if (optie == 3) {

                OnderdeelLijst.print_Nieuwe_Onderdelen(onderdelennieuw);
                System.out.println("\n\nWil jij iets doen met de onderdelenlijst?\n 1. Ja, ik wil onderdelen wijzigen\n 2. Ja, ik wil een nieuw onderdeel aanmaken\n 3. Nee, breng mij terug naar het hoofdmenu");
                userInput2 = scanner.nextInt();
                if (userInput2 == 1) {

                    OnderdeelLijst.bewerkOnderdeel(onderdelennieuw);
                    Scanner input = new Scanner(System.in);
                    int userInput3 = 0; // Initialize userInput3 to a default value
                    while (userInput3 != 3) { // Looping until user input 3 is "terug naar het hoofdmenu"
                        System.out.println("\nWat wil jij nog doen?\n 1. Nog meer onderdelen bijwerken\n 2. Nieuwe onderdelenlijst bekijken\n 3. Breng mij terug naar het hoofdmenu");
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


                    Onderdeel nieuweOnderdeel = OnderdeelLijst.maakNieuweOnderdeel();
                    onderdelennieuw.add(nieuweOnderdeel);
                    Scanner input = new Scanner(System.in);
                    int userInput3 = 0; // Initialize userInput3 to a default value
                    while (userInput3 != 3) { // Looping until user input 3 is "terug naar het hoofdmenu"
                        System.out.println("\nWat wil jij nog doen?\n 1. Nog meer nieuwe onderdelen maken\n 2. Nieuwe onderdelenlijst bekijken\n 3. Breng mij terug naar het hoofdmenu");
                        userInput3 = input.nextInt();
                        input.nextLine(); // Consume newline character

                        if (userInput3 == 1) {
                            Onderdeel nieuweOnderdeel1 = OnderdeelLijst.maakNieuweOnderdeel();
                            onderdelennieuw.add(nieuweOnderdeel1);
                        } else if (userInput3 == 2) {
                            OnderdeelLijst.print_Nieuwe_Onderdelen(onderdelennieuw);
                        } else if (userInput3 == 3) {
                            userInput3 = 3;
                        } else {
                            System.out.println("Ongeldige keuze, probeer opnieuw");
                        }
                    }
                } else if (userInput2 == 3) {
                    System.out.println("");
                    menu.printMenu();
                }
            }
            else if (optie == 4) {
                Klant nieuweKlant = Klant.createNewKlant();
                if (nieuweKlant != null) {
                    klanten.add(nieuweKlant);
                    System.out.println("Nieuwe klant succesvol aangemaakt.");
                } else {
                    System.out.println("Aanmaken van nieuwe klant geannuleerd.");
                }
                System.out.println("\n\nWil je verder nog iets doen met klanten?\n 1. Ja, ik wil alle klanten zien\n 2. Nee, breng mij terug naar het main menu ");
                userInput2 = scanner.nextInt();
                if (userInput2 == 1) {
                    System.out.println("Alle klanten:");
                    for (Klant klant : klanten) {
                        System.out.println(klant);
                    }
                } else if (userInput2 == 2) {
                    System.out.println("Terug naar het main menu.");
                    menu.printMenu();
                }

            }
            else if (optie == 5) {

                int userInput5 = 0;
                while (userInput5 != 2) {
                    Klanttype.toonKlanttypes();
                    Klanttype nieuwKlanttype = Klanttype.maakNieuweKlanttype();
                    if (nieuwKlanttype != null) {
                        // Do something with the newly created Klanttype object
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

