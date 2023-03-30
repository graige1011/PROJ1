import java.util.ArrayList;

class Offerte{
    int offertenr;
    ArrayList<Onderdeel> OnderdeelList;
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
        this.OnderdeelList = new ArrayList<Onderdeel>();
    }

    public int getOffertenr() {
        return offertenr;
    }

    public void setOffertenr(int offertenr) {
        this.offertenr = offertenr;
    }

//    public Onderdeel getOnderdeel() {
//        return onderdeel;
//    }

//    public void setOnderdeel(Onderdeel onderdeel) {
//        this.onderdeel = onderdeel;
//    }

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