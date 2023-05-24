import java.util.ArrayList;
import java.util.Scanner;

class Offerte{
    int offertenr;
    ArrayList<Onderdeel> Onderdelen;
    String datum;
    String bedrijfsnaam;
    String adres;
    int telefoonnr;
    double totaal;

    public Offerte(int offertenr, String datum, String bedrijfsnaam, String adres, int telefoonnr,double totaal) {
        this.offertenr = offertenr;
        this.datum = datum;
        this.bedrijfsnaam = bedrijfsnaam;
        this.adres = adres;
        this.telefoonnr = telefoonnr;
        this.totaal = totaal;
        this.Onderdelen = new ArrayList<Onderdeel>();
    }

    public int getOffertenr() {
        return offertenr;
    }


    public void setOffertenr(int offertenr) {
        this.offertenr = offertenr;
    }



    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getBedrijfsnaam() {
        return bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        this.bedrijfsnaam = bedrijfsnaam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getTelefoonnr() {
        return telefoonnr;
    }

    public void setTelefoonnr(int telefoonnr) {
        this.telefoonnr = telefoonnr;
    }


    public void offerteInfo(){
        System.out.println("Offerte Nr: "+ offertenr);
        System.out.println("Datum: "+ datum);
        System.out.println("Bedrijfsnaam: "+ bedrijfsnaam);
        System.out.println("Adres: "+ adres);
    }

    public static Offerte createNewOfferte() {
        Scanner input = new Scanner(System.in);
        System.out.println("Voer de offertenr in van de nieuwe offerte:");
        int offertenr = input.nextInt();
        input.nextLine();
        System.out.println("Voer de datum in van de nieuwe offerte:");
        String datum = input.nextLine();
        System.out.println("Voer het naam in van de nieuwe offerte:");
        String naam = input.nextLine();
        System.out.println("Voer het adres in van de nieuwe offerte:");
        String adres = input.nextLine();
        System.out.println("Voer het telefoonnummer in van de nieuwe offerte:");
        int telefoonnummer = input.nextInt();
        int totaal = 0;


        return new Offerte(offertenr,datum,naam,adres,telefoonnummer,totaal);
    }

}