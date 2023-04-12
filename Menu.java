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
        System.out.println("Welke romp kies je:  ");
        int optionRomp = scanner.nextInt();
        switch (optionRomp) {
            case 1:
                System.out.println("Voer in aantal: ");
                int rompAantal1 = scanner.nextInt();
                Onderdeel rompOnderdeel1 = OnderdeelLijst.createOnderdelen().get(0);
                rompOnderdeel1.setAantal(rompAantal1);
                System.out.println(rompOnderdeel1.getAantal());
                offerte.Onderdelen.add(rompOnderdeel1);
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int rompAantal2 = scanner.nextInt();
                Onderdeel rompOnderdeel2 = OnderdeelLijst.createOnderdelen().get(1);
                rompOnderdeel2.setAantal(rompAantal2);
                System.out.println(rompOnderdeel2.getAantal());
                offerte.Onderdelen.add(rompOnderdeel2);
                System.out.println("Succesfully added");
                break;

            case 3:
                System.out.println("Voer in aantal: ");
                int rompAantal3 = scanner.nextInt();
                Onderdeel rompOnderdeel3 = OnderdeelLijst.createOnderdelen().get(2);
                rompOnderdeel3.setAantal(rompAantal3);
                System.out.println(rompOnderdeel3.getAantal());
                offerte.Onderdelen.add(rompOnderdeel3);
                System.out.println("Successfully added");
                break;

            case 4:
                System.out.println("Voer in aantal: ");
                int rompAantal4 = scanner.nextInt();
                Onderdeel rompOnderdeel4 = OnderdeelLijst.createOnderdelen().get(3);
                rompOnderdeel4.setAantal(rompAantal4);
                System.out.println(rompOnderdeel4.getAantal());
                offerte.Onderdelen.add(rompOnderdeel4);
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
                int motorAantal1 = scanner.nextInt();
                Onderdeel motorOnderdeel1 = OnderdeelLijst.createOnderdelen().get(4);
                motorOnderdeel1.setAantal(motorAantal1);
                System.out.println(motorOnderdeel1.getAantal());
                offerte.Onderdelen.add(motorOnderdeel1);
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int motorAantal2 = scanner.nextInt();
                Onderdeel motorOnderdeel2 = OnderdeelLijst.createOnderdelen().get(5);
                motorOnderdeel2.setAantal(motorAantal2);
                System.out.println(motorOnderdeel2.getAantal());
                offerte.Onderdelen.add(motorOnderdeel2);
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
                int roerAantal1 = scanner.nextInt();
                Onderdeel roerOnderdeel1 = OnderdeelLijst.createOnderdelen().get(6);
                roerOnderdeel1.setAantal(roerAantal1);
                System.out.println(roerOnderdeel1.getAantal());
                offerte.Onderdelen.add(roerOnderdeel1);
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int roerAantal2 = scanner.nextInt();
                Onderdeel roerOnderdeel2 = OnderdeelLijst.createOnderdelen().get(7);
                roerOnderdeel2.setAantal(roerAantal2);
                System.out.println(roerOnderdeel2.getAantal());
                offerte.Onderdelen.add(roerOnderdeel2);
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
                int dekAantal1 = scanner.nextInt();
                Onderdeel dekOnderdeel1 = OnderdeelLijst.createOnderdelen().get(14);
                dekOnderdeel1.setAantal(dekAantal1);
                System.out.println(dekOnderdeel1.getAantal());
                offerte.Onderdelen.add(dekOnderdeel1);
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int dekAantal2 = scanner.nextInt();
                Onderdeel dekOnderdeel2 = OnderdeelLijst.createOnderdelen().get(15);
                dekOnderdeel2.setAantal(dekAantal2);
                System.out.println(dekOnderdeel2.getAantal());
                offerte.Onderdelen.add(dekOnderdeel2);
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
                int elekAantal1 = scanner.nextInt();
                Onderdeel elekkOnderdeel1 = OnderdeelLijst.createOnderdelen().get(8);
                elekkOnderdeel1.setAantal(elekAantal1);
                System.out.println(elekkOnderdeel1.getAantal());
                offerte.Onderdelen.add(elekkOnderdeel1);
                System.out.println("Succesfully added");
                break;

            case 2:
                System.out.println("Voer in aantal: ");
                int elekAantal2 = scanner.nextInt();
                Onderdeel elekkOnderdeel2 = OnderdeelLijst.createOnderdelen().get(9);
                elekkOnderdeel2.setAantal(elekAantal2);
                System.out.println(elekkOnderdeel2.getAantal());
                offerte.Onderdelen.add(elekkOnderdeel2);
                System.out.println("Succesfully added");
                break;

            case 3:
                System.out.println("Voer in aantal: ");
                int elekAantal3 = scanner.nextInt();
                Onderdeel elekkOnderdeel3 = OnderdeelLijst.createOnderdelen().get(10);
                elekkOnderdeel3.setAantal(elekAantal3);
                System.out.println(elekkOnderdeel3.getAantal());
                offerte.Onderdelen.add(elekkOnderdeel3);
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
                        int extraAantal1 = scanner.nextInt();
                        Onderdeel extraOnderdeel1 = OnderdeelLijst.createOnderdelen().get(16);
                        extraOnderdeel1.setAantal(extraAantal1);
                        System.out.println(extraOnderdeel1.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel1);
                        System.out.println("Succesfully added");
                        break;

                    case 2:
                        System.out.println("Voer in aantal: ");
                        int extraAantal2 = scanner.nextInt();
                        Onderdeel extraOnderdeel2 = OnderdeelLijst.createOnderdelen().get(17);
                        extraOnderdeel2.setAantal(extraAantal2);
                        System.out.println(extraOnderdeel2.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel2);
                        System.out.println("Succesfully added");
                        break;

                    case 3:
                        System.out.println("Voer in aantal: ");
                        int extraAantal3 = scanner.nextInt();
                        Onderdeel extraOnderdeel3 = OnderdeelLijst.createOnderdelen().get(18);
                        extraOnderdeel3.setAantal(extraAantal3);
                        System.out.println(extraOnderdeel3.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel3);
                        System.out.println("Succesfully added");
                        break;

                    case 4:
                        System.out.println("Voer in aantal: ");
                        int extraAantal4 = scanner.nextInt();
                        Onderdeel extraOnderdeel4 = OnderdeelLijst.createOnderdelen().get(19);
                        extraOnderdeel4.setAantal(extraAantal4);
                        System.out.println(extraOnderdeel4.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel4);
                        System.out.println("Succesfully added");
                        break;

                    case 5:
                        System.out.println("Voer in aantal: ");
                        int extraAantal5 = scanner.nextInt();
                        Onderdeel extraOnderdeel5 = OnderdeelLijst.createOnderdelen().get(20);
                        extraOnderdeel5.setAantal(extraAantal5);
                        System.out.println(extraOnderdeel5.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel5);
                        System.out.println("Succesfully added");
                        break;

                    case 6:
                        System.out.println("Voer in aantal: ");
                        int extraAantal6 = scanner.nextInt();
                        Onderdeel extraOnderdeel6 = OnderdeelLijst.createOnderdelen().get(21);
                        extraOnderdeel6.setAantal(extraAantal6);
                        System.out.println(extraOnderdeel6.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel6);
                        System.out.println("Succesfully added");
                        break;

                    case 7:
                        System.out.println("Voer in aantal: ");
                        int extraAantal7 = scanner.nextInt();
                        Onderdeel extraOnderdeel7 = OnderdeelLijst.createOnderdelen().get(22);
                        extraOnderdeel7.setAantal(extraAantal7);
                        System.out.println(extraOnderdeel7.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel7);
                        System.out.println("Succesfully added");
                        break;

                    case 8:
                        System.out.println("Voer in aantal: ");
                        int extraAantal8 = scanner.nextInt();
                        Onderdeel extraOnderdeel8 = OnderdeelLijst.createOnderdelen().get(23);
                        extraOnderdeel8.setAantal(extraAantal8);
                        System.out.println(extraOnderdeel8.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel8);
                        System.out.println("Succesfully added");
                        break;

                    case 9:
                        System.out.println("Voer in aantal: ");
                        int extraAantal9 = scanner.nextInt();
                        Onderdeel extraOnderdeel9 = OnderdeelLijst.createOnderdelen().get(24);
                        extraOnderdeel9.setAantal(extraAantal9);
                        System.out.println(extraOnderdeel9.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel9);
                        System.out.println("Succesfully added");
                        break;

                    case 10:
                        System.out.println("Voer in aantal: ");
                        int extraAantal10 = scanner.nextInt();
                        Onderdeel extraOnderdeel10 = OnderdeelLijst.createOnderdelen().get(25);
                        extraOnderdeel10.setAantal(extraAantal10);
                        System.out.println(extraOnderdeel10.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel10);
                        System.out.println("Succesfully added");
                        break;

                    case 11:
                        System.out.println("Voer in aantal:  ");
                        int extraAantal11 = scanner.nextInt();
                        Onderdeel extraOnderdeel11 = OnderdeelLijst.createOnderdelen().get(26);
                        extraOnderdeel11.setAantal(extraAantal11);
                        System.out.println(extraOnderdeel11.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel11);
                        System.out.println("Succesfully added");
                        break;

                    case 12:
                        System.out.println("Voer in aantal: ");
                        int extraAantal12 = scanner.nextInt();
                        Onderdeel extraOnderdeel12 = OnderdeelLijst.createOnderdelen().get(27);
                        extraOnderdeel12.setAantal(extraAantal12);
                        System.out.println(extraOnderdeel12.getAantal());
                        offerte.Onderdelen.add(extraOnderdeel12);
                        System.out.println("Succesfully added");
                        break;
                }
                System.out.println("Wil je nog een extra? 1.Ja 2.Nee");
                userInput = scanner.nextInt();
            }


        }
    }

}
