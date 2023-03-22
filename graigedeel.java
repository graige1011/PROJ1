class Offerte{
    int offertenr;
    Onderdeel onderdeel;
    String datum;
    String bedrijfsnaam;
    String adres;
    int telefoonnr;

    public Offerte(int offertenr, Onderdeel onderdeel, String datum, String bedrijfsnaam, String adres, int telefoonnr) {
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

    public Onderdeel getOnderdeel() {
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
public class graigedeel {
    public static void main(String[] args) {
        Offerte offerte1 =  new Offerte(001,onderdeel,"22-03-23","waterworks","andijlaan 21",0616505007);
    }
}
