import java.util.Scanner;

class Menu {
    Offerte offerte;
    Scanner scanner= new Scanner(System.in);
    public void printMenu(){
        System.out.println("\nWelcome bij Shipflex");
        System.out.println(" Met wat kan ik u helpen vandaag?\n 1. Ik wil een schip bouwen\n " +
                "2. Ik wil kijken welke onderdelen beschikbaar zijn " +
                "\n 3. Ik wil een nieuwe klant aanmaken" +
                "\n 4.Ik wil een nieuwe klanttype aanmaken  " +
                "\n 5.Sluiten");

    }
    public void essentieelOpties(){
        System.out.println("Oke laten wij beginnen met het bouwen van een schip\nWelke romp zou u willen? ");
        OnderdeelLijst.print_Alle_Rompen();
        System.out.println("Welke romp kies je: ");
        int optionRomp = scanner.nextInt();
        switch (optionRomp) {
            case 1:
                System.out.println("Voer in aantal: ");
                int rompAantal = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(0).setAantal(rompAantal);
                System.out.println(OnderdeelLijst.createOnderdelen().get(0).getAantal());


                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(0));
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int rompAantal2 = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(1).setAantal(rompAantal2);


                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(1));
                System.out.println("Succesfully added");
                break;

            case 3:
                System.out.println("Voer in aantal: ");
                int rompAantal3 = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(3).setAantal(rompAantal3);


                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(2));
                System.out.println("Succesfully added");
                break;

            case 4:
                System.out.println("Voer in aantal: ");
                int rompAantal4 = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(3).setAantal(rompAantal4);


                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(3));
                System.out.println("Succesfully added");
                break;

        }

        System.out.println("\nWelke motor zou u willen?");
        OnderdeelLijst.print_Alle_Engines();
        System.out.println("Welke motor kies je: ");
        int optionMotor = scanner.nextInt();
        switch (optionMotor) {
            case 1:
                System.out.println("Voer in aantal: ");
                int motorAantal = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(4).setAantal(motorAantal);


                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(4));
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int motorAantal2 = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(5).setAantal(motorAantal2);


                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(5));
                System.out.println("Succesfully added");
                break;

        }

        System.out.println("\nWelke roer zou u willen?");
        OnderdeelLijst.print_Alle_Roeren();
        System.out.println("Welke roer kies je: ");
        int optionRoer = scanner.nextInt();
        switch (optionRoer) {
            case 1:
                System.out.println("Voer in aantal: ");
                int roerAantal = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(6).setAantal(roerAantal);


                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(6));
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int roerAantal2 = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(6).setAantal(roerAantal2);


                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(7));
                System.out.println("Succesfully added");
                break;


        }

        System.out.println("\nWelke dek zou u willen?");
        OnderdeelLijst.print_Alle_Dekken();
        System.out.println("Welke dek kies je: ");
        int optionDek = scanner.nextInt();
        switch (optionDek) {
            case 1:
                System.out.println("Voer in aantal: ");
                int dekAantal = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(14).setAantal(dekAantal);

                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(14));
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int dekAantal2 = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(15).setAantal(dekAantal2);

                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(15));
                System.out.println("Succesfully added");
                break;

        }

        System.out.println("\nWelke elektrische systeem zou u willen?");
        OnderdeelLijst.print_Alle_ElektrischeSystemen();
        System.out.println("Welke elektrische systeem kies je: ");
        int optionElekSysteem = scanner.nextInt();
        switch (optionElekSysteem) {
            case 1:
                System.out.println("Voer in aantal: ");
                int elekAantal = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(14).setAantal(elekAantal);

                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(8));
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int elekAantal2 = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(14).setAantal(elekAantal2);

                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(9));
                System.out.println("Succesfully added");
                break;

            case 3:
                System.out.println("Voer in aantal: ");
                int elekAantal3 = scanner.nextInt();
                OnderdeelLijst.createOnderdelen().get(14).setAantal(elekAantal3);

                offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(10));
                System.out.println("Succesfully added");
                break;

        }
    }
    public void extraOpties(){
        System.out.println("Wil u nog wat extra opties? 1.Ja 2.Nee");
        int antwoord = scanner.nextInt();
        if (antwoord == 1) {
            int userInput = 0;
            while (userInput != 2) {
                System.out.println("Welke extra optie zou je willen?");
                OnderdeelLijst.print_Alle_Extraonderdelen();
                System.out.println("Welke extra optie1 kies je: ");
                int optieExtra = scanner.nextInt();

                switch (optieExtra) {
                    case 1:
                        System.out.println("Voer in aantal: ");
                        int extraAantal = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(16).setAantal(extraAantal);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(16));
                        System.out.println("Succesfully added");
                        break;

                    case 2:
                        System.out.println("Voer in aantal: ");
                        int extraAantal2 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(17).setAantal(extraAantal2);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(17));
                        System.out.println("Succesfully added");
                        break;

                    case 3:
                        System.out.println("Voer in aantal: ");
                        int extraAantal3 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(18).setAantal(extraAantal3);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(18));
                        System.out.println("Succesfully added");
                        break;

                    case 4:
                        System.out.println("Voer in aantal: ");
                        int extraAantal4 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(19).setAantal(extraAantal4);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(19));
                        System.out.println("Succesfully added");
                        break;

                    case 5:
                        System.out.println("Voer in aantal: ");
                        int extraAantal5 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(20).setAantal(extraAantal5);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(20));
                        System.out.println("Succesfully added");
                        break;

                    case 6:
                        System.out.println("Voer in aantal: ");
                        int extraAantal6 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(21).setAantal(extraAantal6);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(21));
                        System.out.println("Succesfully added");
                        break;

                    case 7:
                        System.out.println("Voer in aantal: ");
                        int extraAantal7 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(22).setAantal(extraAantal7);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(22));
                        System.out.println("Succesfully added");
                        break;

                    case 8:
                        System.out.println("Voer in aantal: ");
                        int extraAantal8 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(23).setAantal(extraAantal8);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(23));
                        System.out.println("Succesfully added");
                        break;

                    case 9:
                        System.out.println("Voer in aantal: ");
                        int extraAantal9 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(24).setAantal(extraAantal9);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(24));
                        System.out.println("Succesfully added");
                        break;

                    case 10:
                        System.out.println("Voer in aantal: ");
                        int extraAantal10 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(25).setAantal(extraAantal10);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(25));
                        System.out.println("Succesfully added");
                        break;

                    case 11:
                        System.out.println("Voer in aantal: ");
                        int extraAantal11 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(26).setAantal(extraAantal11);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(26));
                        System.out.println("Succesfully added");
                        break;

                    case 12:
                        System.out.println("Voer in aantal: ");
                        int extraAantal12 = scanner.nextInt();
                        OnderdeelLijst.createOnderdelen().get(27).setAantal(extraAantal12);

                        offerte.Onderdelen.add(OnderdeelLijst.createOnderdelen().get(27));
                        System.out.println("Succesfully added");
                        break;
                }
                System.out.println("Wil je nog een extra? 1.Ja 2.Nee");
                userInput = scanner.nextInt();
            }


        }
    }

}
