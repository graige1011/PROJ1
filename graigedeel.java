class Offerte{
    int offertenr;
    Onderdeel3 onderdeel;
    String datum;
    String bedrijfsnaam;
    String adres;
    int telefoonnr;

    public Offerte(int offertenr, Onderdeel3 onderdeel, String datum, String bedrijfsnaam, String adres, int telefoonnr) {
        this.offertenr = offertenr;
        this.onderdeel = onderdeel;
        this.datum = datum;
        this.bedrijfsnaam = bedrijfsnaam;
        this.adres = adres;
        this.telefoonnr = telefoonnr;
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

    public void setOnderdeel(Onderdeel onderdeel) {
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
    double totaal;

    public Onderdeel3(String naam, String omschrijving, int aantal, double stukprijs, double totaal){
        this.naam = naam;
        this.omschrijving = omschrijving;
        this.aantal = aantal;
        this.stukprijs = stukprijs;
        this.totaal = totaal;
    }
}
public class graigedeel {
    public static void main(String[] args) {
        Onderdeel3 roer = new Onderdeel2("Roer","Carbon fibre ",1,799.99,799.99);
        Offerte offerte1 =  new Offerte(001,Onderdeel3,"22-03-23","waterworks","andijlaan 21",0616505007);
        
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "Onderdeelnaam", "Omschrijving", "Aantal", "Stukprijs", " Totaal");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", "-------------", "---------------", "------", "-----------", "-----------");
        System.out.printf("%-15s %-20s %-10s %-15s %-15s\n", roer.naam, roer.omschrijving, roer.aantal, roer.stukprijs, roer.totaal);

    }
}
