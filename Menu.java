import java.util.List;
import java.util.Scanner;

class Menu {
    Offerte offerte;
    Scanner scanner= new Scanner(System.in);
    public void printMenu() {
        System.out.println("\nWelcome bij Shipflex");
        System.out.println("Met wat kan ik u helpen vandaag?");
        System.out.println("1. Ik wil een offerte maken");
        System.out.println("2. Ik wil alle offertes bekijken");
        System.out.println("3. Ik wil kijken welke onderdelen beschikbaar zijn");
        System.out.println("4. Ik wil een nieuwe klant aanmaken");
        System.out.println("5. Ik wil een nieuwe klanttype aanmaken");
        System.out.println("6. Sluiten");
    }

    public void essentieelOpties(){ // deze functie print alle essentiele opties
        System.out.println("Oke laten wij beginnen met het bouwen van een schip!\nWelke romp zou u willen? ");
        OnderdeelLijst.print_Alle_Rompen();
        System.out.println("Welke romp kies je:  ");
        int optionRomp = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<Onderdeel> rompen = OnderdeelLijst.getRompen(); // Retrieve the romp onderdelen

        if (optionRomp > 0 && optionRomp <= rompen.size()) {
            System.out.println("Voer in aantal: ");
            int rompAantal = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Onderdeel rompOnderdeel = rompen.get(optionRomp - 1);
            rompOnderdeel.setAantal(rompAantal);

            offerte.Onderdelen.add(rompOnderdeel);
            System.out.println("Successfully added");
        } else {
            System.out.println("Invalid romp selection. Please try again.");
        }




        System.out.println("\nWelke motor zou u willen?");
        OnderdeelLijst.print_Alle_Engines();
        System.out.println("Welke motor kies je: ");
        int optionMotor = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<Onderdeel> engines = OnderdeelLijst.getEngines(); // Retrieve the engine onderdelen

        if (optionMotor > 0 && optionMotor <= engines.size()) {
            System.out.println("Voer in aantal: ");
            int motorAantal = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Onderdeel motorOnderdeel = engines.get(optionMotor - 1);
            motorOnderdeel.setAantal(motorAantal);

            offerte.Onderdelen.add(motorOnderdeel);
            System.out.println("Successfully added");
        } else {
            System.out.println("Invalid motor selection. Please try again.");
        }




        System.out.println("\nWelke roer zou u willen?");
        OnderdeelLijst.print_Alle_Roeren();
        System.out.println("Welke roer kies je: ");
        int optionRoer = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<Onderdeel> roeren = OnderdeelLijst.getRoeren(); // Retrieve the roer onderdelen

        if (optionRoer > 0 && optionRoer <= roeren.size()) {
            System.out.println("Voer in aantal: ");
            int roerAantal = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Onderdeel roerOnderdeel = roeren.get(optionRoer - 1);
            roerOnderdeel.setAantal(roerAantal);

            offerte.Onderdelen.add(roerOnderdeel);
            System.out.println("Successfully added");
        } else {
            System.out.println("Invalid roer selection. Please try again.");
        }



        System.out.println("\nWelke dek zou u willen?");
        OnderdeelLijst.print_Alle_Dekken();
        System.out.println("Welke dek kies je: ");
        int optionDek = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<Onderdeel> dekken = OnderdeelLijst.getDekken(); // Retrieve the deck onderdelen

        if (optionDek > 0 && optionDek <= dekken.size()) {
            System.out.println("Voer in aantal: ");
            int dekAantal = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Onderdeel dekOnderdeel = dekken.get(optionDek - 1);
            dekOnderdeel.setAantal(dekAantal);

            offerte.Onderdelen.add(dekOnderdeel);
            System.out.println("Successfully added");
        } else {
            System.out.println("Invalid deck Selection. Please try again.");
        }


        System.out.println("\nWelke elektrische systeem zou u willen?");
        OnderdeelLijst.print_Alle_ElektrischeSystemen();
        System.out.println("Welke elektrische systeem kies je: ");
        int optionElekSysteem = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        List<Onderdeel> elektrischeSystemen = OnderdeelLijst.getElektrischeSystemen(); // Retrieve the elektrische systeem onderdelen

        if (optionElekSysteem > 0 && optionElekSysteem <= elektrischeSystemen.size()) {
            System.out.println("Voer in aantal: ");
            int elekAantal = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            Onderdeel elekSysteemOnderdeel = elektrischeSystemen.get(optionElekSysteem - 1);
            elekSysteemOnderdeel.setAantal(elekAantal);

            offerte.Onderdelen.add(elekSysteemOnderdeel);
            System.out.println("Successfully added");
        } else {
            System.out.println("Invalid elektrische systeem selection. Please try again.");
        }


    }
    public void extraOpties(){ //deze functie print alle extra opties
        System.out.println("Wil u nog wat extra opties?\n 1.Ja \n 2.Nee");
        int antwoord = scanner.nextInt();
        if (antwoord == 1) {
            int userInput = 0;
            while (userInput != 2) {
                System.out.println("Welke extra optie zou je willen?");
                OnderdeelLijst.print_Alle_Extraonderdelen();
                System.out.println("Welke extra optie kies je: ");
                int optieExtra = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                List<Onderdeel> extraOnderdelen = OnderdeelLijst.getExtraOnderdelen(); // Retrieve the extra onderdelen

                if (optieExtra > 0 && optieExtra <= extraOnderdelen.size()) {
                    System.out.println("Voer in aantal: ");
                    int extraAantal = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    Onderdeel extraOnderdeel = extraOnderdelen.get(optieExtra - 1);
                    extraOnderdeel.setAantal(extraAantal);

                    offerte.Onderdelen.add(extraOnderdeel);
                    System.out.println("Successfully added");
                } else {
                    System.out.println("Invalid extra optie selection. Please try again.");
                }
                System.out.println("Wil je nog een extra? 1.Ja 2.Nee");
            userInput = scanner.nextInt();


            }



        }
    }

}
