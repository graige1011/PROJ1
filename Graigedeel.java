import java.util.ArrayList;

class Offerte{
    int offertenr;
    Onderdeel3 onderdeel;
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
    }

    public int getOffertenr() {
        return offertenr;
    }

    public void setOffertenr(int offertenr) {
        this.offertenr = offertenr;
    }

    public Onderdeel3 getOnderdeel() {
        return onderdeel;
    }

    public void setOnderdeel(Onderdeel3 onderdeel) {
        this.onderdeel = onderdeel;
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
}
class Onderdeel3 {
    String naam;
    String omschrijving;
    int aantal;
    double stukprijs;
    double stuktotaal;

    public Onderdeel(String naam, String omschrijving, int aantal, double stukprijs, double stuktotaal){
        this.naam = naam;
        this.omschrijving = omschrijving;
        this.aantal = aantal;
        this.stukprijs = stukprijs;
        this.stuktotaal=stuktotaal;
    }
}
public class Graigedeel {
    ArrayList<Onderdeel> OnderdeelList = new ArrayList<Onderdeel>();
    Onderdeel roer = new Onderdeel("Roer", "description 1", 1, 50.00,1.00);
    Onderdeel mast = new Onderdeel("part2", "description 2", 1, 30.00,1.00);

        OnderdeelList.add(roer);
        OnderdeelList.add(mast);
    public static void main(String[] args) {
        Offerte offerte1 =  new Offerte(157,"22-03-23","waterworks","andijlaan 21",616505007,859.99);
        System.out.println("Offerte Nr: "+ offerte1.offertenr);
        System.out.println("");
        System.out.println("Datum: "+ offerte1.datum);
        System.out.println("");
        System.out.println("Bedrijfsnaam: "+ offerte1.bedrijfsnaam);
        System.out.println("");
        System.out.println("Adres: "+ offerte1.adres);
        System.out.println("");
        System.out.println("");



        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Aantal", "Stukprijs", " Totaal");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", OnderdeelList.roer.naam, OnderdeelList.roer.omschrijving, OnderdeelList.roer.aantal, OnderdeelList.roer.stukprijs, OnderdeelList.roer.stuktotaal);

    }
}
