import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Offerte offerte = new Offerte(001,"12 dec","shipflex","laakweg 5",0616505054, 700);
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
        Menu menu = new Menu();
        menu.printMenu();
        int optie = scanner.nextInt();
        if(optie == 1 ){
            System.out.println("Oke laten wij beginnen met het bouwen van een schip\nWelke romp zou u willen? ");
            OnderdeelLijst.print_Alle_Rompen();
            System.out.println("Welke romp kies je: ");
            int optionRomp = scanner.nextInt();
            switch(optionRomp){
                case  1:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(0));
                    System.out.println("Succesfully added");
                        break;

                case  2:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(1));
                    System.out.println("Succesfully added");
                    break;

                case  3:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(2));
                    System.out.println("Succesfully added");
                    break;

                case  4:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(3));
                    System.out.println("Succesfully added");
                    break;

            }


            System.out.println("\nWelke motor zou u willen?");
            OnderdeelLijst.print_Alle_Engines();
            System.out.println("Welke motor kies je: ");
            int optionMotor = scanner.nextInt();
            switch(optionMotor){
                case  1:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(4));
                    System.out.println("Succesfully added");
                    break;

                case  2:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(5));
                    System.out.println("Succesfully added");
                    break;

            }

            System.out.println("\nWelke roer zou u willen?");
            OnderdeelLijst.print_Alle_Roeren();
            System.out.println("Welke roer kies je: ");
            int optionRoer = scanner.nextInt();
            switch(optionRoer){
                case  1:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(6));
                    System.out.println("Succesfully added");
                    break;

                case  2:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(7));
                    System.out.println("Succesfully added");
                    break;


            }

            System.out.println("\nWelke dek zou u willen?");
            OnderdeelLijst.print_Alle_Dekken();
            System.out.println("Welke dek kies je: ");
            int optionDek = scanner.nextInt();
            switch(optionDek){
                case  1:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(14));
                    System.out.println("Succesfully added");
                    break;

                case  2:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(15));
                    System.out.println("Succesfully added");
                    break;


            }

            System.out.println("\nWelke elektrische systeem zou u willen?");
            OnderdeelLijst.print_Alle_ElektrischeSystemen();
            System.out.println("Welke motor elektrische systeem kies je: ");
            int optionElekSysteem= scanner.nextInt();
            switch(optionElekSysteem){
                case  1:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(8));
                    System.out.println("Succesfully added");
                    break;

                case  2:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(9));
                    System.out.println("Succesfully added");
                    break;

                case  3:
                    offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(10));
                    System.out.println("Succesfully added");
                    break;

            }

            for (Onderdeel onderdeel : offerte.Onderdelen) {
                System.out.printf(" %-15s %-40s %-15s %-15.2f %-15s %-15s\n", onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getPrijs(), onderdeel.getSoortOnderdeel(), (1-onderdeel.getMilieuKorting())*100 + "%");
            }
            System.out.println("Wil u nog wat extra opties? 1.Ja 2.Nee");
            int antwoord;
            if(antwoord == 1){
                System.out.println("Welke extra opties zou je willen?");

            }
        }



        else if(optie == 2 ){
            OnderdeelLijst.print_Alle_Onderdelen();
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