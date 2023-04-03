import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
public class Main{
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


        for (String line : asciiArt) {
            System.out.println(line);
        }
        System.out.println("\nWelcome bij Shipflex, ben jij 1.Klant - 2.Admin");
        System.out.println(" Met wat kan ik u helpen vandaag?\n 1. Ik wil een schip bouwen\n 2. Ik wil kijken welke onderdelen beschikbaar zijn\n 3. Sluiten\nVoer een optie 1-3 in ");

        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Oke laten wij beginnen met het bouwen van een schip\n Welke romp zou u willen? ");

                List<Onderdeel> onderdelen = OnderdeelLijst.createOnderdelen();
                System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving","Categorie", "Aantal", "Stukprijs", "Totaal");
                System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", "-------------", "---------------", "-----------", "-----------", "-----------");

                for (Onderdeel onderdeel : onderdelen) {
                    if (onderdeel.getNaam().endsWith("Romp")) {
                        System.out.printf("%-15s %-20s %-15s %-15s %-15s\n", onderdeel.getNaam(), onderdeel.getOmschrijving(), onderdeel.getCategorie(), onderdeel.getAantal(), onderdeel.getPrijs());
                    }
                }

            break;
            case 2:
                break;
            case 3:
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